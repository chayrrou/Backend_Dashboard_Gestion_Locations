package rnu.iset.dsi201.locations1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rnu.iset.dsi201.locations1.entities.Paiement;
import rnu.iset.dsi201.locations1.repositories.PaiementRepository;

@Service
public class PaiementService {

	@Autowired
	 PaiementRepository paiement;
	
	public Paiement createPaiement(Paiement pa) {
		return paiement.save(pa);
	}
	
	public Paiement updatePaiement(Paiement pa,Long id) {
		pa.setId(id);
		paiement.save(pa);
		return pa;
	}

	
	
	public boolean deletePaiement(int id) {
		paiement.deleteById(id);
		return true;
	}
	
	public List<Paiement> getAllPaiement() {
		return  paiement.findAll();
	}
}
