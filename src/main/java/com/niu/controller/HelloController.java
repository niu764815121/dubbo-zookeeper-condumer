package com.niu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niu.service.HelloService;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="hello")
	public String hello(String name,Model model) {
		String sayHello = helloService.sayHello(name);
		model.addAttribute("hello", sayHello);
		return "main";
	}
	
	@RequestMapping(value="first")
	public String mainFirst(){
		return "main";
	}
}
