package com.rookie.test;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rookie.pojo.Door;

public class JsonTest {

	@Test
	public void showJson() throws JsonProcessingException {
		Door door = new Door();
		door.setDoorName("永和大王");
		door.setTel("0315-1234567");
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(door);
		
		System.out.println(json);
	}
	
}
