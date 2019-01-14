package sth.ipvs;

import sth.configuration.ConfigurationFacade;

import javax.inject.Inject;

public class IPVSProperties {

    @Inject
    private ConfigurationFacade conf;

    public String environment() {
        return conf.get("environment");
    }
    
    public String ipvsBaseUrl() {
		return conf.get("engnew.ipvs.baseUrl");
    }
    
    public String saintBaseUrl() {
		return conf.get("engnew.saint.baseUrl");
    }
    
    public String troveBaseUrl() {
		return conf.get("engnew.trove.baseUrl");
    }
    
    public String rdvrBaseUrl() {
		return conf.get("engnew.rdvr.baseUrl");
    }

    public String buyflowBaseUrl() {
		return conf.get("engnew.buyflow.baseUrl");
    }
    
    public String adobeBaseUrl() {
		return conf.get("engnew.adobepass.baseUrl");
    }

    public String bhnBaseUrl() {
		return conf.get("engnew.bhn.baseUrl");
    }
    
    public String capabilitiesPath() {
    	return conf.get("engnew.capabilities.path");
    }
    
    public String parentalcontrolPath() {
    	return conf.get("engnew.parentalcontrol.path");
    }
    
    public String locationPath() {
    	return conf.get("engnew.location.path");
    }
    
    public String bookmarksPath() {
    	return conf.get("engnew.bookmarks.path");
    }   
    
    public String watchlistPath() {
    	return conf.get("engnew.watchlist.path");
    }
    
    public String favoritesPath() {
    	return conf.get("engnew.favorites.path");
    }
    
    public String channelsPath() {
    	return conf.get("engnew.channels.path");
    }
    
    public String blockedchannelsPath() {
    	return conf.get("engnew.blockedchannels.path");
    }
    
    public String guidegridPath() {
    	return conf.get("engnew.guidegrid.path");
    }
    
    public String entitlementIds() {
    	return conf.get("engnew.entitlement.id");
    }
    
    public String twcentitlementIds() {
    	return conf.get("engnew.twcentitlement.id");
    }
    
    public String lineupPath() {
    	return conf.get("engnew.lineup.path");
    }
    
    public String fipsPath() {
    	return conf.get("engnew.fips.path");
    }
    
    public String reportUrl() {
        return conf.get("httpResults.reportUrl");
    }

    public String sessionUrl() {
    	return conf.get("engnew.adobesession.path");
    }

    public String ratingUrl() {
    	return conf.get("engnew.rating.path");
    }
    
    public String cdvrUrlCHTR() {
    	return conf.get("ownerid.charter");
    }
    
    public String cdvrUrlTWC() {
    	return conf.get("ownerid.twc");
    }
}

