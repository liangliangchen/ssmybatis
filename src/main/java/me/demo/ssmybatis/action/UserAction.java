package me.demo.ssmybatis.action;

import java.util.List;

import me.demo.ssmybatis.model.User;
import me.demo.ssmybatis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserAction {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/getAllUser.action", method=RequestMethod.GET)
	public String getAllUser() {
		List<User> results = userService.getAllUser();
		return "users";
	}
	

}
