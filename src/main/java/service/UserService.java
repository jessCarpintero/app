package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import ediwin.edicom.com.IedmSecurityToken;

@Path("/userservice/")
@Produces("application/json")
public class UserService {
	
	@GET
    @Path("/useraccess")
    @Produces("application/json")
    public Response userAccess(@QueryParam("username") String username, @QueryParam("password") String password ,@QueryParam("domain") String domain) {
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());

		WebClient client = WebClient
		    .create("https://webpre.sedeb2b.com/EdiwinES/services/mobile", providers);
		  
		Response response = client.accept("application/json").type("application/json")
		    .path("registerSession").query("group","ASPEDITEST").query("domain", domain).query("user", username).query("password", password)
		    .query("ediwinini","EDIWIN_ASPTEST.INI").get(Response.class);
		
		return response;		      
    }

}
