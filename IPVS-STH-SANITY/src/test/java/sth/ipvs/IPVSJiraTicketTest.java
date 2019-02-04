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

@Group("IPVSJiraTicket")
public class IPVSJiraTicketTest extends IPVSBaseTest {
	@Inject
    protected IPVSProperties props;
	
	@Test
	@TestDescription("SVIPVS-657 - PLM error handling /api/smarttv/bookmarks/v2 with invalid accountIdentifier")
	public void SVIPVS657() {
		int response = executeSmartv().piauthentication()
					.bookmarkspath()				
					.query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
					.query("accountId", props.twcaccountid())
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
					.query("requestId", "SVIPVS-657")
					.getJson();

		System.out.println(response);
	} 

}


