package sth.ipvs;

import org.testng.TestException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import sth.configuration.ConfBuilder;
import sth.configuration.ConfigurationFacade;
import sth.http.client.JavaNetRequestExecutor;
import sth.http.client.RequestExecutor;
import sth.json.JSON;
import sth.system.AutomationTest;
import sth.system.annotations.Product;
import sth.system.reporter.HTTPReporter;
import sth.system.reporter.LoggingReporter;
import sth.system.reporter.TestReporter;
import sth.xml.XML;

import java.io.File;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

@Product("IPVS-Demo")
public class IPVSBaseTest extends AutomationTest {
	public static final Consumer<IPVSCapabilities> EMPTY_CONSUMER = x -> {};
	
    protected ConfigurationFacade conf;
    protected String version;
    private static TestReporter http;
    private static TestReporter logging;

    //When enabled via cmd line arg, results will be sent to HTTP Reporter
    public static boolean httpResultsEnabled = false;

    @BeforeSuite(alwaysRun = true)
    public void initializeIPVS() {
        if (!nurse().hasProvider(ConfigurationFacade.class)) {
            if (conf == null) {
                File file = findFile("ipvs-test.conf");
                conf = ConfBuilder.start()
                        .systemProperties()
                        .groovy(file)
                        .enableCaching()
                        .enableEnvironment()
                        .enableMacros()
                        .finish();
            }
            nurse().setSingleton(ConfigurationFacade.class, conf);
            nurse().setSingleton(RequestExecutor.class, new JavaNetRequestExecutor());
            initializeReporter();
        }
    }

    private void initializeReporter() {
        log.debug("Initialize reporters");
        String reporterUrl = props().reportUrl();
        if (null == reporterUrl) {
            throw new TestException("Cannot obtain HTTP reporter endpoint");
        }

        logging = new LoggingReporter();
        log.debug("Done initializing Logging reporter");

        if (null == System.getProperty("httpResults")) {
            log.info("Test results will be sent to STDOUT but NOT to HTTP reporter");
        } else if (System.getProperty("httpResults").trim().equalsIgnoreCase("true")) {
            httpResultsEnabled = true;
        } else {
            log.error("Value for cmd line argument \'httpResults\' has to be either true or TRUE for test " +
                "results to be sent to HTTP reporter besides STDOUT");
        }

        if (httpResultsEnabled) {
            http = new HTTPReporter(reporterUrl);
            log.info("Done initializing HTTP reporter with reporting endpoint = " + reporterUrl);
        }
    }

    @BeforeMethod(alwaysRun = true)
    public void testStartup() {
        String env = props().environment();
        if (env == null || env.isEmpty()) {
            throw new TestException("the environment has not been set; use '-Denvironment=...' from the command line, or set 'environment: ...' in the configuration file");
        }
        result().setProductVersion("demo-0.0.1");
        result().setPlatform(props().environment());

        //Send test results to both logging and http servers
        if (httpResultsEnabled) {
            if (http != null) {
                setReporter(logging.andThen(http));
            } else {
                log.error("Setting to force-send test results to HTTP reporter is present but HTTP reporter " +
                    "is not initialized with the endpoint. Check http reporter initialization.");
            }
        }
	}
    
    public IPVSProperties props() {
        return getBean(IPVSProperties.class);
    }
    
    public IPVSCapabilities execute() {
    	return getBean(IPVSCapabilities.class);
    }
    
    public IPVSSmartTv executeSmartv() {
    	return getBean(IPVSSmartTv.class);
    }
}
