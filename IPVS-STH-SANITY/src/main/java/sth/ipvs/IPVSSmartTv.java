package sth.ipvs;

import sth.http.client.Request;
import sth.json.JSON;
import sth.uri.URI;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;


public class IPVSSmartTv extends CustomRequest {

	@Override
	protected String baseUrl() {
		return props.ipvsBaseUrl();
	}
	
    @Inject
    public void setup() {
    	request.setPath(props.parentalcontrolPath());
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
    
    public IPVSSmartTv customerGuid(String customerGuid) {
        request.header("customer-guid", customerGuid);
        return this;
    }
    
    public IPVSSmartTv mso(String mso) {
        request.header("x-mso", mso);
        return this;
    }

    public IPVSSmartTv devid(String id) {
        request.header("device-id", id);
        return this;
    }
    
    public IPVSSmartTv reqid(String id) {
        request.header("request-id", id);
        return this;
    }
    
    public IPVSSmartTv cacheflag(String id) {
        request.header("cacheByPass", id);
        return this;
    }
    
    public IPVSSmartTv parentalcontrolpath() {
    	request.path("ipvs/api/smarttv/parentalcontrol/v1");
    	return this;
    }
    
    public IPVSSmartTv locationpath() {
    	request.path("api/smarttv/location/v1");
    	return this;
    }
    
    public IPVSSmartTv bookmarkspath() {
    	request.path("ipvs/api/smarttv/bookmarks/v2");
    	return this;
    }
    
    public IPVSSmartTv watchlistpath() {
    	request.path("ipvs/api/smarttv/watchList/v1");
    	return this;
    }
   
    public IPVSSmartTv favoritesChannelpath() {
    	request.path("ipvs/api/smarttv/favorites/channels/v1");
    	return this;
    }
    
    public IPVSSmartTv Channelspath() {
    	request.path("ipvs/api/smarttv/channels/v2");
    	return this;
    }
    
    public IPVSSmartTv parentalblockedChannelspath() {
    	request.path("ipvs/api/smarttv/parentalcontrol/v1/blockedchannels");
    	return this;
    }
    
    public IPVSSmartTv guidegridpath() {
    	request.path("ipvs/api/smarttv/guide/v2/twctv/grid");
    	return this;
    }
    
    public IPVSSmartTv client(String id) {
    	request.header("x-pi-forwarded-for", id);
		return this;
    }
    
    public IPVSSmartTv query(String key, Object value) {
        request.query(key, value);
        return this;
    }
    
    public IPVSSmartTv piauthentication() {
    	request.header("Authorization", "Basic c3BwX3N5dF9hdXRvbWF0aW9uOldAIWgkc3d1MmVRZURBcQ==");
    	return this;
    }
    
    public IPVSSmartTv jwtauthentication() {
    	request.header("Authorization", "Basic a2JyYXplbGw6TUxHNHkycEZVWmxPZU13dmxkaTRlZnJKNA==");
    	return this;
    }
    public IPVSSmartTv lineuppath() {
    	request.path("ipvs/api/smarttv/lineup/v1");
    	return this;
    } 
    
    public IPVSSmartTv fipspath() {
    	request.path("ipvs/api/eas/v1/storecustomerfips");
    	return this;
    }
    
    public IPVSSmartTv adobesessionpath() {
    	request.path("ipvs/api/smarttv/adobe/session");
    	return this;
    } 
    
    public IPVSSmartTv ratingspath() {
    	request.path("ipvs/api/smarttv/parentalcontrol/v1/ratings");
    	return this;
    }
    
    public IPVSSmartTv getrecordingschtr() {
    	request.path("ipvs/api/smarttv/cdvr/v1/programs");
    	return this;
    }
    
    public IPVSSmartTv getrecordingstwc() {
    	request.path("ipvs/api/smarttv/cdvr/v1/programs");
    	return this;
    }
   
    public IPVSSmartTv getJWTtoken() {
    	request.path("auth/jwt/token");
    	return this;
    }

}
