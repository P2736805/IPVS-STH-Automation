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

import Deployment.Validation.IPVSSmartTv;
import Deployment.Validation.IPVSBaseTest;


@Group("IPVSSmartTv")
public class IPVSSmartTvTest extends IPVSBaseTest {
	
	@Test
	@TestDescription("Testing CHTR Account IPVS ParentalControl api Integration into STH /api/smarttv/parentalcontrol/v1 STHParentalControl-Charter")
	public void parentalcontrolcallCHTR() {
		JSON response = executeSmartv().parentalcontrolpath()
				    .client("1.1.1.1")
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("requestId", "parentalcontrolcheck")
					.query("cacheByPass", "true")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS BookMarks api Integration into STH /api/smarttv/bookmarks/v2 STHBookMark-Charter")
	public void bookmarksapiCHTR() {
		JSON response = executeSmartv().client("1.1.1.1")
					.bookmarkspath()
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("requestId", "bookmarkscheck")
					.query("cacheByPass", "true")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS WatchList api Integration into STH  /api/smarttv/watchList/v1 STHWatchList-Charter ")
	public void watchListapiCHTR() {
		JSON response = executeSmartv().client("1.1.1.1")
					.watchlistpath()					
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "watchlistcheck")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS FavoritesChannel api Integration into STH /api/smarttv/favorites/channels/v1 STHFavorites-Charter")
	public void favoritesChannelapiCHTR() {
		JSON response = executeSmartv().client("1.1.1.1")
					.favoritesChannelpath()				
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "favoritescheck")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS ParentalRating api Integration into STH /api/smarttv/parentalcontrol/v1/ratings STHParentalRatings-Charter")
	public void parentalratingsapiCHTR() {
		JSON response = executeSmartv().client("1.1.1.1")
					.ratingspath()
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "parentalratingcheck")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-Charter")
	public void saintentitlementinfo() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "saintentitlementinfo")
					.query("req", "Entitlements")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-Charter")
	public void saintpreferencesinfo() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "saintpreferencesinfo")
					.query("req", "Preferences")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-Charter")
	public void saintlineupinfo() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "saintlineupinfo")
					.query("req", "MarketLineup")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-Charter")
	public void saintmetadatainfo() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "saintmetadatainfo")
					.query("req", "Metadata")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-Charter")
	public void saintdevicesinfo() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "saintdevicesinfo")
					.query("req", "Devices")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing CHTR Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-Charter")
	public void saintcustomerinfo() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "44201648")
					.query("mso", "CHARTER")
					.query("cacheByPass", "true")
					.query("requestId", "saintcustomerinfo")
					.query("req", "Customer")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS ParentalControl api Integration into STH /api/smarttv/parentalcontrol/v1 STHParentalControl-TWC")
	public void parentalcontrolcallTWC() {
		JSON response = executeSmartv().parentalcontrolpath()
				    .client("1.1.1.1")
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("requestId", "parentalcontrolcheck")
					.query("cacheByPass", "true")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS BookMarks api Integration into STH /api/smarttv/bookmarks/v2 STHBookMark-TWC")
	public void bookmarksapiTWC() {
		JSON response = executeSmartv().client("1.1.1.1")
					.bookmarkspath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("requestId", "bookmarkscheck")
					.query("cacheByPass", "true")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS WatchList api Integration into STH  /api/smarttv/watchList/v1 STHWatchList-TWC ")
	public void watchListapiTWC() {
		JSON response = executeSmartv().client("1.1.1.1")
					.watchlistpath()					
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "watchlistcheck")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS FavoritesChannel api Integration into STH /api/smarttv/favorites/channels/v1 STHFavorites-TWC")
	public void favoritesChannelapiTWC() {
		JSON response = executeSmartv().client("1.1.1.1")
					.favoritesChannelpath()				
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "favoritescheck")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS ParentalRating api Integration into STH /api/smarttv/parentalcontrol/v1/ratings STHParentalRatings-TWC")
	public void parentalratingsapiTWC() {
		JSON response = executeSmartv().client("1.1.1.1")
					.ratingspath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "parentalratingcheck")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-TWC")
	public void saintentitlementinfotwc() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "saintentitlementinfo")
					.query("req", "Entitlements")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-TWC")
	public void saintpreferencesinfotwc() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "saintpreferencesinfo")
					.query("req", "Preferences")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-TWC")
	public void saintlineupinfotwc() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "saintlineupinfo")
					.query("req", "MarketLineup")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-TWC")
	public void saintmetadatainfotwc() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "saintmetadatainfo")
					.query("req", "Metadata")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-TWC")
	public void saintdevicesinfotwc() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "saintdevicesinfo")
					.query("req", "Devices")
					.getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWC Account IPVS Saint Info api Integration into STH /saint/api/customer STHParentalRatings-TWC")
	public void saintcustomerinfotwc() {
		JSON response = executeSmartv().client("1.1.1.1")
					.saintinfopath()
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("mso", "TWC")
					.query("cacheByPass", "true")
					.query("requestId", "saintcustomerinfo")
					.query("req", "Customer")
					.getJson();
		System.out.println(response);
	}
	
}
