package com.codinghub.ViewToCon;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewToController 
{
	@RequestMapping("/log")
	public String loginform()
	{
		return "Home";
	}
//	@RequestMapping(path="/login",method=RequestMethod.GET)
//	public String login(HttpServletRequest request,Model model)
//	{
//		String userName=request.getParameter("userName");
//		String password=request.getParameter("password");
//		model.addAttribute("userName",userName);
//		model.addAttribute("password",password);
//		return "Hello";
//	}
	@RequestMapping("/meth")
	public String m1(@RequestParam(name="userName",required = true) String userName,
					 @RequestParam(name="password",required = false) String password,Model model)
	{
		User user=new User();
		user.setUserName("userName");
		user.setPassword("password");
		model.addAttribute("user", user);
		return "Home";
	}
	
}
