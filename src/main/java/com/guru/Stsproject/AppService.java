package com.guru.Stsproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

@Service
public class AppService {
	
	static Map<String,Integer> list = new HashMap<String,Integer>();
	
	static{
		list.put("Guru", 1);
		list.put("Arun", 2);
		list.put("Aravind", 3);	
	}
	
	public Map<String,Integer> showmap(){
		return list;
	}
	
	public Map<String,Integer> deleteMap(String key){	
		list.remove(key);	
		return list;
		
	}
	
	public Map<String,Integer> putMap(String Key ,Integer value){
		list.put(Key, value);
		return list;
	}
	
	
	public Map<String,Integer> searchMap(String userKey ){
		 
		for(Entry<String, Integer> list1:list.entrySet()){
			if(list1.getKey().equals(userKey)){
			
				String key = list1.getKey();
				Integer value= list1.getValue();
				Map<String,Integer> list2 = new HashMap<String,Integer>();
				list2.put(key, value);
			return  list2;
	
			}
		}
		return null;
	}
	

}
