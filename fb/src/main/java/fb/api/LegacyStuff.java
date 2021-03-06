package fb.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fb.db.DB;
import fb.db.DB.DBException;
@Path("")
public class LegacyStuff {
	/**
	 * Gets a legacy episode by its legacy id
	 * 
	 * @param id
	 *            id of episode (1-7-4-...-3)
	 * @return redirect to HTML episode
	 */
	@GET
	@Path("legacy/{oldId}")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacy(@PathParam("oldId") String oldId) {
		String newId;
		try {
			newId = DB.getLegacyId(oldId);
		} catch (DBException e) {
			return Response.ok("Not found: " + oldId).build();
		}
		System.out.println("0Redirecting to" + GetStuff.createURI("/fb"));
		return Response.seeOther(GetStuff.createURI("/fb/get/" + newId)).build();
	}
	
	@GET
	@Path("legacy/the-forum/{oldId}")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacy1(@PathParam("oldId") String oldId) {
		if (oldId.trim().toLowerCase().compareTo("root") == 0) return Response.seeOther(GetStuff.createURI("/fb/get/1")).build();
		return legacy(oldId);
	}
	
	@GET 
	@Path("legacy/you-are-what-you-wish/{oldId}")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacy2(@PathParam("oldId") String oldId) {
		if (oldId.trim().toLowerCase().compareTo("root") == 0) return Response.seeOther(GetStuff.createURI("/fb/get/2")).build();
		return legacy(oldId);
	}
	
	@GET
	@Path("legacy/altered-fates/{oldId}")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacy3(@PathParam("oldId") String oldId) {
		if (oldId.trim().toLowerCase().compareTo("root") == 0) return Response.seeOther(GetStuff.createURI("/fb/get/3")).build();
		return legacy(oldId);
	}
	
	@GET
	@Path("legacy/the-future-of-gaming/{oldId}")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacy4(@PathParam("oldId") String oldId) {
		if (oldId.trim().toLowerCase().compareTo("root") == 0) return Response.seeOther(GetStuff.createURI("/fb/get/4")).build();
		return legacy(oldId);
	}
	
	@GET
	@Path("legacy/cgi-bin/fbstorypage.pl")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacy5(@QueryParam("page") String oldId) {
		return legacy(oldId);
	}
	
	@GET
	@Path("legacy/{anything}/{oldId}")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacyCatchAll(@PathParam("oldId") String oldId, @PathParam("anything") String anything) {
		System.out.println("1Redirecting to" + GetStuff.createURI("/fb"));
		if (oldId.trim().toLowerCase().compareTo("root") == 0) return Response.seeOther(GetStuff.createURI("/fb")).build();
		return legacy(oldId);
	}
	
	@GET
	@Path("legacy/{anything}/{anything2}/{oldId}")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacyCatchAll(@PathParam("oldId") String oldId, @PathParam("anything") String anything, @PathParam("anything2") String anything2) {
		System.out.println("2Redirecting to" + GetStuff.createURI("/fb"));
		if (oldId.trim().toLowerCase().compareTo("root") == 0) return Response.seeOther(GetStuff.createURI("/fb")).build();
		return legacy(oldId);
	}
	
	@GET
	@Path("legacy/{anything}/{anything2}/{anything3}/{oldId}")
	@Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
	public Response legacyCatchAll(@PathParam("oldId") String oldId, @PathParam("anything") String anything, @PathParam("anything3") String anything3, @PathParam("anything2") String anything2) {
		System.out.println("3Redirecting to" + GetStuff.createURI("/fb"));
		if (oldId.trim().toLowerCase().compareTo("root") == 0) return Response.seeOther(GetStuff.createURI("/fb")).build();
		return legacy(oldId);
	}
	
}
