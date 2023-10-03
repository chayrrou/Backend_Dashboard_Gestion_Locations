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
import rnu.iset.dsi201.locations1.entities.Proprietaire;
import rnu.iset.dsi201.locations1.services.ProprietaireService;


@CrossOrigin(origins= "*")
@RestController
@RequestMapping("proprietaire")
public class ProprietaireController {

	@Autowired
	private ProprietaireService service;
	
	/*@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Word :)";
	}*/
	
	@PostMapping("createProprietaire")
	public Proprietaire createProprietaire(@RequestBody Proprietaire proprietaire) {
		return service.createProprietaire(proprietaire);
	}
	
	@GetMapping("") 
	  List<Proprietaire> all(){ 
		  return service.getAllProprietaire(); 
	}
	
	

	@GetMapping("afficheProprietaire/{id}") 
	 public Proprietaire affiche(@PathVariable int id){ 
		  return service.getProprietaire(id);
	}
	
	 @PutMapping("modifieProprietaire/{id}")
	 Proprietaire replaceProprietaire(@RequestBody Proprietaire newProprietaire, @PathVariable Long id) {
		 newProprietaire.setId(id);
		  return service.updateProprietaire(newProprietaire, id);
	 }
	
	@DeleteMapping("deleteProprietaire/{id}")
	  void deleteProprietaire(@PathVariable int id) {
		  service.deleteProprietaire(id);
	  }
}
