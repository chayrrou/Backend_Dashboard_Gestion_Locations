package rnu.iset.dsi201.locations1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rnu.iset.dsi201.locations1.entities.Logement;
import rnu.iset.dsi201.locations1.services.LogementService;


@CrossOrigin(origins= "*")
@RestController
@RequestMapping("logement")
public class LogementController {

	@Autowired
	private LogementService service;
	
	@PostMapping("createLogement")
	public Logement createHabitant(@RequestBody Logement logement) {
		return service.createLogement(logement);
	}
	
	@GetMapping("afficheLogement") 
	  List<Logement> all(){ 
		  return service.getAllLogement(); 
	}
	
	 @PutMapping("modifieLogement/{id}")
	  Logement replaceLogement(@RequestBody Logement newLogement, @PathVariable Long id) {
		 	newLogement.setId(id);
		  return service.updateLogement(newLogement, id);
	 }
	
	@DeleteMapping("deleteLogement/{id}")
	  void deleteLogement(@PathVariable int id) {
		  service.deleteLogement(id);
	  }
}
