package com.tourism.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tourism.model.Tourism;
import com.tourism.service.TourismService;

@Controller

public class TourismController {
	private TourismService tourismService;
	@Autowired
	public TourismController(TourismService tourismService) {
		super();
		this.tourismService = tourismService;
	}
	@ResponseBody
	@PostMapping(path = "/tourism",produces = "application/json")
	public Tourism createTourism(@RequestBody Tourism t) {
		
		return tourismService.createTourism(t);
	}
	@GetMapping(path = "/tourism/{tourId}",produces = "application/json")
	@ResponseBody
	public Tourism getTourismByTourId(@PathVariable("tourId") int tId) {
	
		Tourism tour=tourismService.getTourismByTourId(tId);
		return tour;
	}
	@GetMapping(path="/tourism", produces = {"application/json"})
	@ResponseBody
	public List<Tourism> getAllTourism(){
		
		List<Tourism> list=tourismService.getAllTourism();
		return list;
	}
	@DeleteMapping(path = "/tourism/{tourId}")
	@ResponseBody
	public List<Tourism> deleteTourismByTourId(@PathVariable("tourId") int tId) {
		
		tourismService.deleteTourismByTourId(tId);
		return getAllTourism();
	}
	
}
