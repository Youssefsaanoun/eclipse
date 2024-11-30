package com.project.java2;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.models.Etudiant;

import serviseImplementation.EtudiantServisesImplementation;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/Etudiant")
public class MyResource {
	private final EtudiantServisesImplementation etudiantServisesImplementation;
	 public MyResource(EtudiantServisesImplementation etudiantServisesImplementation) {
	        this.etudiantServisesImplementation = etudiantServisesImplementation;
	    }

  
@GET
@Produces(MediaType.TEXT_PLAIN)

    public List<Etudiant> getAllEtudaints() {
	return etudiantServisesImplementation.GetAllEtudiant();
    }
@POST
@Produces(MediaType.APPLICATION_JSON)


	public void postEtudiant(Etudiant etu) {
	etudiantServisesImplementation.AddEtudiant(etu);
}
}
