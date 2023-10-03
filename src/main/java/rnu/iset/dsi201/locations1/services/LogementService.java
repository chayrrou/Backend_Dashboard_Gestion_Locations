package rnu.iset.dsi201.locations1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rnu.iset.dsi201.locations1.entities.Logement;
import rnu.iset.dsi201.locations1.repositories.LogementRepository;

@Service
public class LogementService {

	@Autowired
	LogementRepository logement;
	
	public Logement createLogement(Logement l) {
		return logement.save(l);
	}
	

	public Logement updateLogement(Logement l,Long id) {
		l.setId(id);
		logement.save(l);
		return l;
	}

	
	
	public boolean deleteLogement(int id) {
		logement.deleteById(id);
		return true;
	}
	
	public List<Logement> getAllLogement() {
		return  logement.findAll();
	}
}
