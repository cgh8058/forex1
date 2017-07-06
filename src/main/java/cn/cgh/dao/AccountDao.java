package cn.cgh.dao;

import org.apache.ibatis.annotations.Param;

import cn.cgh.entity.Account;


public interface AccountDao {

	//增加一个账户信息
	public int addAccount(Account account);
	
	//删除一个账户信息
	public int deleteAccountById(@Param("id")Integer id);
	
	//更新一个账户的信息
	public int updateAccount(Account account);
	
	//通过用户ID获取账户信息
	public Account getAccountByUserId(@Param("userId")Integer user);
		

}
