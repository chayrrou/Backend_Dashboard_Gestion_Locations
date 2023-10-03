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

import rnu.iset.dsi201.locations1.entities.Habitant;
import rnu.iset.dsi201.locations1.services.HabitantService;


@CrossOrigin(origins= "*")
@RestController
@RequestMapping("habitant")
public class HabitantController {

	@Autowired
	private HabitantService service;
	
	/*@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Word :)";
	}*/
	
	@PostMapping("createHabitant")
	public Habitant createHabitant(@RequestBody Habitant habitant) {
		return service.createHabitant(habitant);
	}
	//afficheAllHabitant
	@GetMapping("") 
	  List<Habitant> afficheAllHabitant(){ 
		  return service.getAllHabitant(); 
	}
	
	@GetMapping("afficheHabitant/{id}") 
	 public Habitant afficheHabitant(@PathVariable int id){ 
		  return service.getHbaitant(id);
	}
	
	 @PutMapping("modifieHabitant/{id}")
	  Habitant replaceHabitant(@RequestBody Habitant newHabitant, @PathVariable Long id) {
		 newHabitant.setId(id);
		  return service.updateHabitant(newHabitant, id);
	 }
	
	@DeleteMapping("deleteHabitant/{id}")
	  void deleteHabitant(@PathVariable int id) {
		  service.deleteHabitant(id);
	  }
}
