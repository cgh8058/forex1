package cn.cgh.web;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cgh.entity.Manager;
import cn.cgh.service.ManagerService;

@Controller
public class ManagerController {

	@Autowired
	@Qualifier("managerService")
	ManagerService managerService;
	
	@RequestMapping("/addMan.do")
	public String saveManager(Manager manager){
		System.out.println(manager);
		if(managerService.addManager(manager) == 1){
			return "redirect:/pagedMan.do?currPage=1&pageSize=7";
		}
		return "defeated";
	} 
	
	@RequestMapping("/deleteMan.do")
	public String deleteManager(Integer id){
		if(managerService.deleteManagerById(id) == 1){
			return "redirect:/pagedMan.do?currPage=1&pageSize=7";
		}
		return "defeated";
	}
	
	@RequestMapping("/updateMan")
	public String updateManager(Manager manager){
		
		if(managerService.updateManager(manager) == 1){
			return "success";
		}
		return "defeated";
	}
	
	@RequestMapping("/getMan.do")
	public void getManagerByName(String username,PrintWriter out){
		
		if(managerService.getManagerByName(username) != null){
			out.print("1");
		}else{
			out.print("0");
		}
	}
	
	@RequestMapping("/loginManVerify.do")
	public void login(String username,String password,PrintWriter out){
		Manager man;
		if((man = managerService.getManagerByName(username)) != null){
			if(man.getPassword().equals(password)){
				out.print("1");
			}else{
				out.print("0");
			}
		}else{
			out.print("0");
		}		
	}
	@RequestMapping("/loginMan.do")
	public String login(String username,String password,PrintWriter out,HttpSession session){
		Manager man;
		System.out.println(username+password);
		if((man = managerService.getManagerByName(username)) != null){
			if(man.getPassword().equals(password)){
				session.setAttribute("manager", man);
				return "index.jsp";
			}
		}
		return "signin.jsp";
	}
	
	
	
	@RequestMapping("/pagedMan.do")
	public String getManagersByPage(int currPage,int pageSize,Model model){
		
		List manList;
		Integer pageCount;
		if((manList = managerService.getManagersByPage(currPage, pageSize)) != null){
			pageCount=(int) Math.ceil(((double)managerService.getCount())/7);
			System.out.println("------------------------------------"+pageCount);
			model.addAttribute("pageCount",pageCount);
			model.addAttribute("currPage",currPage);
			model.addAttribute("l",manList);
			return "user-list.jsp";
		}
		return "index.jsp";
	}
	
/*	@RequestMapping("/countMan")
	public String getCount(){
		
		Integer count;
		if((count=managerService.getCount()) != null){
			System.out.println(count);
			return "success";
		}
		return "defeated";
	}*/
}
