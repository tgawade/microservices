package com.morningstar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morningstar.service.NewsService;

@RestController
public class GetNewsController {
	
	@Autowired
	private NewsService newsService;
	@GetMapping("/api/news")
	public String getNews() {
		return newsService.getNewsFromTOI();
	}
	
	
}
