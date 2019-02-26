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
import sth.ipvs.IPVSCapabilities;
import sth.ipvs.IPVSBaseTest;

@Group("IPVSJiraTicket")
public class IPVSJiraTicketTest extends IPVSBaseTest {

	@Test
	@TestDescription("SVIPVS-657 - PLM error handling /api/smarttv/bookmarks/v2 with invalid accountIdentifier")
	public void SVIPVS657() {
		int response = executeSmartv().piauthentication()
					.bookmarkspath()				
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("accountId", "nyc.8035:8035810010099517")
					.query("ip", "1.1.1.1")
					.query("mso", "TWC")
					.query("requestId", "SVIPVS-657")
					.getError();
		System.out.println(response);
		if (response != 400) {
			throw new RuntimeException("error getting expected error response" + ":\n" + response);
		}
		
	} 
	
	@Test
	@TestDescription("SVIPVS-547 - JWT Token support for TWC Market /auth/jwt/token")
	public void SVIPVS547() {
		JSON response = executeSmartv().jwtauthentication()
					.getJWTtoken()				
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("requestId", "SVIPVS-547")
					.getJson();

		System.out.println(response);
	} 

	@Test
	@TestDescription("SVIPVS-579 - OTT Capabilities Check /api/smarttv/user/capabilities")
	public void SVIPVS579OTTdisabled() {
		JSON response = execute().path()
				 .piauthentication()
				 .query("customerGuid", "44188798")
				 .query("ip", "1.1.1.1")
				 .query("mso", "CHARTER")
				 .query("requestId", "STHCapabilitiesCheck-Charter")
				 .getJson();
		
		JSON test = response.get("overthetop");
		/*Object result = test.get("authorized");*/
		if (test == null) {
			throw new RuntimeException("error getting expected error response" + ":\n" + response);
		}
		Object result = test.get("authorized");
		if (result == "true") {
			throw new RuntimeException("error getting expected error response" + ":\n" + response);
		}
		/*System.out.println();*/
	}
	
	@Test
	@TestDescription("SVIPVS-579 - OTT Capabilities Check /api/smarttv/user/capabilities")
	public void SVIPVS579OTTenabled() {
		JSON response = execute().path()
				 .piauthentication()
				 .query("customerGuid", "44201648")
				 .query("ip", "1.1.1.1")
				 .query("mso", "CHARTER")
				 .query("requestId", "STHCapabilitiesCheck-Charter")
				 .getJson();
		
		JSON test = response.get("overthetop");
		/*Object result = test.get("authorized");*/
		if (test == null) {
			throw new RuntimeException("error getting expected error response" + ":\n" + response);
		}
		Object result = test.get("authorized");
		if (result == "true") {
			throw new RuntimeException("error getting expected error response" + ":\n" + response);
		}
		/*System.out.println();*/
	}
	
}




