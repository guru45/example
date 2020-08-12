package com.guru.Stsproject;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	@Autowired 
	AppService service1;
	
	@GetMapping("/")
	
	public String Show(){
		return ("Hello World");
	}
	
	@GetMapping("/list")
	
	public Map<String,Integer> showMap(){
		return (service1.showmap());
	}
	
	@RequestMapping(value="/delete/{Key}" , produces="application/json" )
	
	public Map<String,Integer> deleteMap(@PathVariable("Key") String Key)
	{
		return (service1.deleteMap(Key));
	}
	
	@RequestMapping(value="/list/{Key}/{value}")
	
	public Map<String,Integer> postMap(@PathVariable("Key") String Key,@PathVariable("value") Integer value){	
		
		return(service1.putMap(Key, value));
	}
	
	@RequestMapping("/search/{Key}")
	
	public Map<String,Integer> searchMap(@PathVariable("Key") String Key){
		
		return (service1.searchMap(Key));
	}
	

	
}
