package com.adidas.city.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.adidas.city.entity.City;
import com.adidas.city.service.RouteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RefreshScope
@RestController
public class RouteController {

	private final RouteService<City> routeService;

	@Autowired
	public RouteController(RouteService<City> routeService) {
		this.routeService = routeService;
	}

	@HystrixCommand(fallbackMethod="fallback")
	@GetMapping("/findShortRoute/{source}/{destination}")
	@CrossOrigin(origins="*")
	public List<City> findme(@PathVariable String source, @PathVariable String destination) {
		return routeService.findShortest(source, destination);
	}
}
