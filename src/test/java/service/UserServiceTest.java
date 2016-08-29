package service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ediwin.edicom.com.IedmSecurityToken;

public class UserServiceTest {
	
	@Test
	public void testuseraccess(){
		String username = "TESTB";
		String password = "TESTB";
		String domain = "TESTB";
		
		UserService userService = new UserService();
		
		IedmSecurityToken securityToken = ((IedmSecurityToken) userService.userAccess(username, password, domain).readEntity(IedmSecurityToken.class));
		
		assertTrue("Group == ASPEDITEST", securityToken.getGroup().equals("ASPEDITEST"));
		assertTrue("Domain == TESTB", securityToken.getDomain().equals("TESTB"));
		assertTrue("User == TESTB", securityToken.getUser().equals("TESTB"));
		assertTrue("Password == TESTB", securityToken.getPassword().equals("TESTB"));
		assertTrue("Ediwinini == null", securityToken.getEdiwinini() == null);
		assertTrue("Type == null", securityToken.getType() == null);
		assertTrue("Token != null ", securityToken.getToken() != null);
		
		
	}

}
