package cn.cgh.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.cgh.dao.AccountDao;
import cn.cgh.entity.Account;

@Service
public class AccountService {

	@Autowired
	@Qualifier("accountDao")
	AccountDao accountDao;

	
	public int addAccount(Account account){
		
		return accountDao.addAccount(account);
	}
	
	
	public int deleteAccountById(Integer id){
		
		return accountDao.deleteAccountById(id);
	}
	
	
	public int updateAccount(Account account){
		
		return accountDao.updateAccount(account);
	}

}
