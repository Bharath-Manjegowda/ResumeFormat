package org.webscrollers.bharath.ResumeFormat.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.webscrollers.bharath.ResumeFormat.model.User;
import org.webscrollers.bharath.ResumeFormat.service.ResumeService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("resumeController")
public class ResumeController {

	ResumeService rs = null;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @POST
	@Path("/addUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User addUserDetails(User user) {
    	rs = new ResumeService();
		try{
			rs.addUser(user);			        
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		return user;
    }	
}
