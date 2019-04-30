package Deployment.Validation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sth.json.JSON;
import sth.system.annotations.Group;
import sth.system.annotations.Stories;
import sth.system.annotations.TestDescription;
import sth.utils.Randomizer;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import Deployment.Validation.IPVSCapabilities;
import Deployment.Validation.IPVSBaseTest;



@Group("IPVSCapabilities")
public class IPVSCapabilitiesTest extends IPVSBaseTest {

	@Inject
    protected IPVSProperties props;
	
	@Test
	@TestDescription("Testing Charter Account IPVS Capabilities call Integration into STH /api/smarttv/user/capabilities - STHCapabilitiesCheck-Charter")
	public void ipvscapabilitiescallCHTR() {
		JSON response = execute().path()
								 .client("1.1.1.1")
								 .query("customerGuid", "44201648")
								 .query("mso", "CHARTER")
								 .query("requestId", "capabilitiesscheck")
								 .query("cacheByPass", "true")
								 .getJson();
		System.out.println(response);

	}
}
