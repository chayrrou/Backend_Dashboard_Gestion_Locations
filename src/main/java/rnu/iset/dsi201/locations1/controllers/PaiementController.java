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

import rnu.iset.dsi201.locations1.entities.Paiement;
import rnu.iset.dsi201.locations1.services.PaiementService;


@CrossOrigin(origins= "*")
@RestController
@RequestMapping("paiement")
public class PaiementController {

	@Autowired
	private PaiementService service;
	
	@PostMapping("createPaiement")
	public Paiement createPaiement(@RequestBody Paiement paiement) {
		return service.createPaiement(paiement);
	}
	
	@GetMapping("affichePaiement") 
	  List<Paiement> all(){ 
		  return service.getAllPaiement(); 
	}
	
	 @PutMapping("modifiePaiement/{id}")
	 Paiement replacePaiement(@RequestBody Paiement newPaiement, @PathVariable Long id) {
		 newPaiement.setId(id);
		  return service.updatePaiement(newPaiement, id);
	 }
	
	@DeleteMapping("deletePaiement/{id}")
	  void deletePaiement(@PathVariable int id) {
		  service.deletePaiement(id);
	  }

}
