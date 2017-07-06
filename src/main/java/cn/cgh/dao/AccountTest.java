package cn.cgh.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.cgh.entity.Account;

public class AccountTest {

	@Test
	public void testAddAccount() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		AccountDao accountDao = ss.getMapper(AccountDao.class);
		Account account = new Account();
		account.setBalance(1000D);
		account.setEqulty(800D);
		account.setFreeMagin(500D);
		account.setUserId(1);
		System.out.println(accountDao.addAccount(account));
		ss.commit();
		ss.close();
	}
	
	@Test
	public void testDeleteAccountById() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		AccountDao accountDao = ss.getMapper(AccountDao.class);
		System.out.println(accountDao.deleteAccountById(3));
		ss.commit();
		ss.close();
	}


	@Test
	public void testUpdateAccount() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		AccountDao accountDao = ss.getMapper(AccountDao.class);
		Account account = new Account();
		account.setBalance(1000D);
		account.setEqulty(100D);
		account.setFreeMagin(100D);
		account.setUserId(1);
		account.setAccountId(1);
		System.out.println(accountDao.updateAccount(account));
		ss.commit();
		ss.close();
	}
	

	
/*	public static void main(String[] args) throws IOException {
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		System.out.println(sf);
		System.out.println(sf.getClass());
		SqlSession ss = sf.openSession();
		System.out.println(ss);
		UserDao userDao = ss.getMapper(UserDao.class);
		User user = new User();
		user.setUsername("z1");
		user.setSignal("1,2,3");
		user.setPlatform("thinkforex live 01");
		user.setIsOnline(1);
		user.setAllowedFollow(1);
		userDao.addUser(user);
		ss.commit();
		ss.close();
	}*/
	
}
