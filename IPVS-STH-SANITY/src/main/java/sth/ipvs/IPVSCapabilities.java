package sth.ipvs;

import sth.http.client.Request;
import sth.json.JSON;
import sth.uri.URI;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;


public class IPVSCapabilities extends CustomRequest {

	@Override
	protected String baseUrl() {
		return props.ipvsBaseUrl();
	}
	
    @Inject
    public void setup() {
    	request.setPath(props.capabilitiesPath());
        request.header("customer-guid", "51585793");
        request.header("x-mso", "CHARTER");
        request.header("device-id", "065BCB19-DB76-4D55-8793-A6E9C186B76F");
        request.header("cacheByPass", "true");
        request.header("request-id", "eclipse");
        request.header("x-pi-forwarded-for", "1.1.1.1");
    }

    public Request getRequest() {
        return request;
    }
    
    public IPVSCapabilities customerGuid(String customerGuid) {
        request.header("customer-guid", customerGuid);
        return this;
    }
    
    public IPVSCapabilities mso(String mso) {
        request.header("x-mso", mso);
        return this;
    }

    public IPVSCapabilities devid(String id) {
        request.header("device-id", id);
        return this;
    }
    
    public IPVSCapabilities reqid(String id) {
        request.header("request-id", id);
        return this;
    }
    
    public IPVSCapabilities cacheflag(String id) {
        request.header("cacheByPass", id);
        return this;
    }
    
    public IPVSCapabilities path() {
    	request.path("/api/smarttv/user/capabilities/v3");
    	return this;
    }
    
    public IPVSCapabilities client(String id) {
    	request.header("x-pi-forwarded-for", id);
		return this;
    }
    
    public IPVSCapabilities piauthentication() {
    	request.header("Authorization", "Basic c3BwX3N5dF9hdXRvbWF0aW9uOldAIWgkc3d1MmVRZURBcQ==");
    	return this;
    }
    
    public IPVSCapabilities query(String key, Object value) {
        request.query(key, value);
        return this;
    }
}
