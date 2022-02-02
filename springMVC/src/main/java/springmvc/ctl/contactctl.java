package springmvc.ctl;

import java.awt.Dialog.ModalExclusionType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.user;
import springmvc.service.userservice;

@Controller
public class contactctl {
	
	@Autowired
	private userservice uss;
	
	
	
	
	/*@RequestMapping("/home")
	public String home(){
	System.out.println("running");
	return "index";
	}
	
	@RequestMapping("/service")
	public String service(){
		System.out.println("running service methodto..");
		return "client";	
		
	}
	
	@RequestMapping("/help")
	public String help(){
		System.out.println("running help methodto..");
		return "firm";
		
	}*/
	
	
	
	
	
	
	@RequestMapping("/contact")
	public String showform(){
		return "contact";
	}
	
	
	/*using @request param to get fileds data one by one from view*/
	
	
	/*@RequestMapping(path="/processform" , method=RequestMethod.POST)
	
	public String showform(@RequestParam("email") String mail , @RequestParam("password") String pass , Model model){
		System.out.println("contact is running...out");
		
		System.out.println(mail);
		System.out.println(pass);
		model.addAttribute("email",mail );
		model.addAttribute("password", pass);
		return "success";
		
		
	}*/
	
	
	
	/* by using @model attribute getting all fileds data from view */
	
		
   @RequestMapping(path="/processform" , method=RequestMethod.POST)
	
	public String showformm(@ModelAttribute("user") user us , Model model){
		System.out.println(us);
		
		this.uss.createuser(us);
		
		return "success";
		
		
	} 
	
	
	
	/*for general concept*/
	
	/*@RequestMapping("/glance")
	public String glance(Model model){
		
		model.addAttribute("email", "yashpanday2000@gmail.com");
		
		model.addAttribute("password", "Yash@2000");
		
		
		return "success";
		
	}*/
	
	
	
	
	
	
	
	
	
	
	

}
