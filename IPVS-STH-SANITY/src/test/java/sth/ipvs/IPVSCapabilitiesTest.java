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

import sth.ipvs.IPVSCapabilities;
import sth.ipvs.IPVSBaseTest;


@Group("IPVSCapabilities")
public class IPVSCapabilitiesTest extends IPVSBaseTest {

	@Test
	@TestDescription("Testing Charter Account IPVS Capabilities call Integration into STH /api/smarttv/user/capabilities - STHCapabilitiesCheck-Charter")
	public void ipvscapabilitiescallCHTR() {
		JSON response = execute().path()
								 .piauthentication()
								 .query("customerGuid", "51585793")
								 .query("ip", "1.1.1.1")
								 .query("mso", "CHARTER")
								 .query("requestId", "STHCapabilitiesCheck-Charter")
								 .getJson();
		System.out.println(response);
	}
	
	@Test
	@TestDescription("Testing TWCs Account IPVS Capabilities call Integration into STH /api/smarttv/user/capabilities - STHCapabilitiesCheck-TWC")
	public void ipvscapabilitiescallTWC() {
		JSON response = execute().piauthentication()
								 .query("customerGuid", "E4EDB341-C62E-E826-7D49-8514CCAB93E9")
								 .query("ip", "1.1.1.1")
								 .query("mso", "TWC")
								 .query("requestId", "STHCapabilitiesCheck-TWC")
								 .path()
								 .getJson();
		System.out.println(response);
	}
}
