package cn.cgh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import cn.cgh.entity.Account;
import cn.cgh.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	@Qualifier("accountService")
	AccountService accountService;

	public String addAccount(Account account){
		
		if(accountService.addAccount(account) == 1){
			return "success";
		}
		return "defeated";
	}

	public String deleteAccountById(Integer id){
		
		if(accountService.deleteAccountById(id) == 1){
			return "success";
		}
		return "defeated";
	}
	
	public String updateAccount(Account account){
		
		if(accountService.updateAccount(account) == 1){
			return "success";
		}
		return "defeated";
	}
}
