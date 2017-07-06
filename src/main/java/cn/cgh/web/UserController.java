package cn.cgh.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.cgh.entity.User;
import cn.cgh.service.UserService;

@Controller
public class UserController {

	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	@RequestMapping(value="/addUser")
	public String addUser(User user){
		
		if(userService.addUser(user) == 1){
			return "success";
		}
		return "defeated";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUserById(Integer id){
		
		if(userService.deleteUserById(id) == 1){
			return "success";
		}
		return "defeated";
	}
	
	
	@RequestMapping("/updateUser")
	public String updateUser(User user){
		if(userService.updateUser(user) == 1){
			return "success";
		}
	return "defeated";
	}

	@RequestMapping("/getUser")
	public String getUserById(Integer id){
		
		if(userService.getUserById(id) != null){
			return "success";
		}
		return "defeated";
	}

	
	@RequestMapping("/getPaged")
	public String getUsersByPage(int currPage,int pageSize){
		
		if(userService.getUsersByPage(currPage, pageSize) != null){
			return "success";
		}
		return "defeated";
	}
	
	@RequestMapping("/countUser")
	public String getCount(){
		
		if(userService.getCount() != null){
			
			return "success";
		}
		return "defeated";
	}
}
