package com.example;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Profile("queue")
public class QueueController {

	//Queue q = new Queue();
	
	//LinkedList<> 
	
	@RequestMapping("/queue")
	public String qq(){
		return "queue";
	}
	@RequestMapping("/stack")
	public String ss() throws Exception{
		//return "queue";
		throw new Exception();
	}
	
	@RequestMapping(path = "/", method=RequestMethod.POST)
	public String add(){
		
		
		return "queue";
	}
}