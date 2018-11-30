package com.adidas.city.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adidas.city.entity.City;


@FeignClient(name = "city-details")
public interface RouteService<E> {
  
	@RequestMapping(name="/{source}/{destination}", method = RequestMethod.GET)
	public List<City> findShortest(@PathVariable(value = "source") String source,
			@PathVariable(value = "destination") String destination);
}
