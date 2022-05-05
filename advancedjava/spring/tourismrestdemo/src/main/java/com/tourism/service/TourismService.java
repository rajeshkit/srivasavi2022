package com.tourism.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourism.model.Tourism;
import com.tourism.repository.TourismRepoistory;
@Service
public class TourismService {
	
	private TourismRepoistory tourismRepo;
	@Autowired
	public void setTourismRepo(TourismRepoistory tourismRepo) {
		this.tourismRepo = tourismRepo;
	}
	
	
	public Tourism createTourism(Tourism t) {
		;
		return tourismRepo.createToursim(t);
	}

	public List<Tourism> getAllTourism() {
		
		List<Tourism> list=tourismRepo.getAllTourism();
		return list;
	}

	public Tourism getTourismByTourId(int tId) {
	
		Tourism tour=tourismRepo.getTourismByTourId(tId);
		// TODO Auto-generated method stub
		return tour;
	}

	public void deleteTourismByTourId(int tId) {
		
		tourismRepo.deleteTourismByTourId(tId);
	}

	
}
