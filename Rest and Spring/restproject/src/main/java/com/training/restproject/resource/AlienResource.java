package com.training.restproject.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.training.restproject.application.Alien;
import com.training.restproject.application.AlienRepository;

@Path("aliens")
public class AlienResource {

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Alien> getAliens() throws SQLException {		
		return AlienRepository.getRepoInstance().getAliens();
	}
	
	@POST
	@Path("newalien")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void addAlien ( Alien __alienObject ) throws SQLException {		
		AlienRepository.getRepoInstance().createAlien(__alienObject);
	}
	
	@PUT
	@Path("updatealien")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void updateAlien ( Alien __alienObject ) throws SQLException {	
		AlienRepository repoObj = AlienRepository.getRepoInstance();
		if( repoObj.getAlien(__alienObject.getAlienid()).getAlienid() == 0 )
			repoObj.createAlien(__alienObject);
		else
			repoObj.updateAlien(__alienObject);
	}
	
	@DELETE
	@Path("deletealien/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void deleteAlien ( @PathParam("id") int id ) throws SQLException {	
		AlienRepository.getRepoInstance().deleteAlien(id);
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Alien getAlien(@PathParam("id") int id) throws SQLException {
		return AlienRepository.getRepoInstance().getAlien(id);
	}
}
