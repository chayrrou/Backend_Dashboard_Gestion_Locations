package rnu.iset.dsi201.locations1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rnu.iset.dsi201.locations1.entities.Habitant;
import rnu.iset.dsi201.locations1.repositories.HabitantRepository;

@Service
public class HabitantService {
	
	@Autowired
	 HabitantRepository habitant;
	
	public Habitant createHabitant(Habitant h) {
		return habitant.save(h);
	}
	
	public Habitant updateHabitant(Habitant h,Long id) {
		h.setId(id);
		habitant.save(h);
		return h;
	}

	
	
	public boolean deleteHabitant(int id) {
		habitant.deleteById(id);
		return true;
	}
	
	public Habitant getHbaitant(int id){
		Optional<Habitant> h=habitant.findById(id);
			return h.get();
	}
	
	public List<Habitant> getAllHabitant() {
		return  habitant.findAll();
	}
}
