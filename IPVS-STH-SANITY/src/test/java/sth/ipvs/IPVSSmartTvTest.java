package sth.ipvs;

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

import sth.ipvs.IPVSSmartTv;
import sth.ipvs.IPVSBaseTest;


@Group("IPVSSmartTv")
public class IPVSSmartTvTest extends IPVSBaseTest {
	
	@Test
	@TestDescription("Testing CHTR Account IPVS Parental Control api Integration into STH /api/smarttv/parentalcontrol STHParentalControl-Charter")
	public void parentalcontrolcallCHTR() {
		JSON response = executeSmartv().piauthentication()
					.parentalcontrolpath()
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHParentalControl-Charter")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Parental Control api Integration into STH /api/smarttv/parentalcontrol STHParentalControl-TWC")
	public void parentalcontrolcallTWC() {
		JSON response = executeSmartv().piauthentication()
					.parentalcontrolpath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHParentalControl-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS location api Integration into STH ")
	public void locationapiCHTR() {
		JSON response = executeSmartv()
					.locationpath().piauthentication()
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHLocation-Charter")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS location api Integration into STH ")
	public void locationapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.locationpath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHLocation-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS BookMarks api Integration into STH /api/smarttv/bookmarks/v2 STHBookMark-Charter")
	public void bookmarksapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.bookmarkspath()
					.query("cdvrEnabled", true)
					.query("deviceOutOfHome", false)
					.query("displayOutOfHomeOnly", false)
					.query("tvodRent", false)
					.query("tvodWatch", false)
					.query("watchLive", false)
					.query("watchOnDemand", false)
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHBookMark-Charter")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS BookMarks api Integration into STH /api/smarttv/bookmarks/v2 STHBookMark-TWC")
	public void bookmarksapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.bookmarkspath()
					.query("cdvrEnabled", true)
					.query("deviceOutOfHome", false)
					.query("displayOutOfHomeOnly", false)
					.query("tvodRent", true)
					.query("tvodWatch", true)
					.query("watchLive", true)
					.query("watchOnDemand", true)				
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHBookMark-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS WatchList api Integration into STH  /api/smarttv/watchList/v1 STHWatchList-Charter ")
	public void watchListapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.watchlistpath()
					.query("cdvrEnabled", true)
					.query("deviceOutOfHome", false)
					.query("displayOutOfHomeOnly", false)
					.query("tvodRent", false)
					.query("tvodWatch", false)
					.query("watchLive", false)
					.query("watchOnDemand", false)					
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHWatchList-Charter")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS WatchList api Integration into STH /api/smarttv/watchList/v1 STHWatchList-TWC")
	public void watchListapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.watchlistpath()
					.query("cdvrEnabled", true)
					.query("deviceOutOfHome", false)
					.query("displayOutOfHomeOnly", false)
					.query("tvodRent", true)
					.query("tvodWatch", true)
					.query("watchLive", true)
					.query("watchOnDemand", true)
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHWatchList-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS FavoritesChannel api Integration into STH /api/smarttv/favorites/channels/v1 STHFavorites-Charter")
	public void favoritesChannelapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.favoritesChannelpath()				
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHFavorites-Charter")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS FavoritesChannel api Integration into STH STH /api/smarttv/favorites/channels/v1 STHFavorites-TWC")
	public void favoritesChannelapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.favoritesChannelpath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHFavorites-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Channels api Integration into STH /api/smarttv/channels/v2 STHChannels-TWC")
	public void ChannelsapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.Channelspath()
					.query("onlineOnly", false)
					.query("onlineOnly", false)
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHChannels-TWC")
					.getJson();
		/*System.out.println(response);*/
	}

	@Test
	@TestDescription("Testing CHTR Account IPVS Channels api Integration into STH /api/smarttv/channels/v2 STHChannels-Charter")
	public void ChannelsapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.Channelspath()
					.query("onlineOnly", false)
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHChannels-Charter")
					.getJson();
		/*System.out.println(response);*/
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS ParentalBlockedChannels api Integration into STH /api/smarttv/parentalcontrol/v1/blockedchannels STHParentalBlocked-Charter")
	public void parentalBlockedChannelsapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.parentalblockedChannelspath()
					.query("includeUnentitled", true)
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHParentalBlocked-Charter")
					.getJson();
		/*System.out.println(response);*/
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS ParentalBlockedChannels api Integration into STH /api/smarttv/parentalcontrol/v1/blockedchannels STHParentalBlocked-TWC")
	public void parentalBlockedChannelsapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.parentalblockedChannelspath()
					.query("includeUnentitled", true)
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHParentalBlocked-TWC")
					.getJson();
		/*System.out.println(response);*/
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS guideGrid api Integration into STH /api/smarttv/guide/v2/twctv/grid STHguideGrid-Charter")
	public void guidegridapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.guidegridpath()
					.query("dayOffset", "0")
					.query("hourOffset", "11")
					.query("entitlementIds", props().entitlementIds())
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHguideGrid-Charter")
					.getJson();
		System.out.println(response);
	}

	@Test
	@TestDescription("Testing TWC Account IPVS guideGrid api Integration into STH /api/smarttv/guide/v2/twctv/grid STHguideGrid-TWC")
	public void guidegridapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.guidegridpath()
					.query("dayOffset", "0")
					.query("hourOffset", "11")
					.query("entitlementIds", props().twcentitlementIds())
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHguideGrid-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS Lineup api Integration into STH /api/smarttv/lineup/v1 STHLineup-CHARTER")
	public void lineupapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.lineuppath()
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHLineup-CHARTER")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Lineup api Integration into STH /api/smarttv/lineup/v1 STHLineup-TWC")
	public void linuepapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.lineuppath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHLineup-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS fips api Integration into STH /api/eas/v1/storecustomerfips STHFIPS-Charter")
	public void fipsapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.fipspath()
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHLineup-Charter")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS fips api Integration into STH /api/eas/v1/storecustomerfips STHFIPS-TWC")
	public void fipsapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.fipspath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHFips-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS adobe session api Integration into STH api/smarttv/adobe/session STHAdobeSession-TWC")
	public void adobesessionTWC() {
		JSON response = executeSmartv().piauthentication()
					.adobesessionpath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHAdobeSession-TWC")
					.getJson();
		System.out.println(response);
	}	
	
	@Test
	@TestDescription("Testing CHTR Account IPVS adobe session api Integration into STH api/smarttv/adobe/session STHAdobeSession-Charter")
	public void adobesessionCHTR() {
		JSON response = executeSmartv().piauthentication()
					.adobesessionpath()
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHAdobeSession-Charter")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS ParentalRating api Integration into STH /api/smarttv/parentalcontrol/v1/ratings STHParentalRatings-Charter")
	public void parentalratingsapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.ratingspath()
					.query("customerGuid", "44188798")
					.query("ip", "1.1.1.1")
					.query("mso", "CHARTER")
					.query("requestId", "STHParentalRating-Charter")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS ParentalRating api Integration into STH /api/smarttv/parentalcontrol/v1/ratings STHParentalRatings-TWC")
	public void parentalratingapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.ratingspath()
					.query("includeUnentitled", true)
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "STHParentalRating-TWC")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS CDVR get recordings api Integration into STH kumodvr/api/cdvr/v1/users/<ownerid>/recordings STHGetRecordings-Charter")
	public void cdvrgetrecordingsapiCHTR() {
		JSON response = executeSmartv().piauthentication()
					.getrecordingschtr()
					.query("customerGuid", "44188798")
					.query("mso", "CHARTER")
					.query("requestId", "STHGetRecordings-Charter")
					.getJson();
		/*System.out.println(response);*/
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS CDVR get recordings api Integration into STH kumodvr/api/cdvr/v1/users/<ownerid>/recordings STHGetRecordings-TWC")
	public void cdvrgetrecordingsapiTWC() {
		JSON response = executeSmartv().piauthentication()
					.getrecordingstwc()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("requestId", "STHGetRecordings-TWC")
					.getJson();
		/*System.out.println(response);*/
	}
}
