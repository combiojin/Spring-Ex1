package com.kb.org;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FreeBoardController {

	@RequestMapping(value = "/a.do", method = RequestMethod.GET)
	public  String doA() {
		
		FreeBoardController fbc = new FreeBoardController();
		Class cl = FreeBoardController.class;
		Method[] methods = cl.getDeclaredMethods();
		for( Method m : cl.getDeclaredMethods()) {
			System.out.println("m = " + m);
		}
		Annotation[] anota = cl.getAnnotations();
		for(Annotation anno : anota) {
			System.out.println("anno = " +anno);
		}
		
		return "a";
	}
	
	@RequestMapping(value = "freeboardindex.do")
	public String freeboardIndex() {
		
		return "freeboard/index";
	}
}
