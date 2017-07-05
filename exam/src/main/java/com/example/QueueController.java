package com.example;


import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//queue랑 stack 관련한 포트를 다르게 지정하고 할수 있어요 run configuration 에서 new 한다음에 server.port 지정해주시면되세요
@RestController
@Profile("queue")
public class QueueController {

	//Queue q = new Queue();
	
	//LinkedList<> 두개 자료형으로 문제를 풀수 있어요 
	
	
	//queue 관련한 자료구조 알고리즘 넣으시면 되세요
	@RequestMapping(path = "/queue", method = RequestMethod.GET)
	public String qq(){
		System.out.println("test");
		return "queue1111";
	}
	
	//stack 쪽 url 막는 exception 처리입니다.
	@RequestMapping("/stack")
	public String ss() throws Exception{
		//return "queue";
		throw new Exception();
	}
	
	
	//add 관련한 url 넣으시면 되세요 
	@RequestMapping(path = "/", method=RequestMethod.POST)
	public String add(){
		
		
		return "queue";
	}
	
}