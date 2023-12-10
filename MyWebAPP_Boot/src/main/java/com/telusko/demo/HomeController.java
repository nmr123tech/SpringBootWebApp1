package com.telusko.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	/*  @RequestMapping("home")
	public String home(HttpServletRequest req, HttpServletResponse res) { // Method 1
    	HttpSession session =req.getSession();
    	String name=req.getParameter("name");
    	System.out.println("hi"+name);
        session.setAttribute("name", name);
		return"home"; 
		} **/
	
/*	@RequestMapping("home")
	public String home(@RequestParam("name") String Myname, HttpSession session) { // Method 2
    	System.out.println("hi"+Myname);
        session.setAttribute("name", Myname); // Model
		return"home"; //view
		 }  **/
	
/*	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String Myname) {
		
		ModelAndView mv=new ModelAndView();
    	System.out.println("hi"+Myname);
        mv.addObject("name",Myname); // Model
        mv.setViewName("home"); //JSP View
		return mv; //view
		 } **/
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv=new ModelAndView();
		
        mv.addObject("obj",alien); // Model
        
        mv.setViewName("home"); //JSP View
        
		return mv; //view
		 }
}
