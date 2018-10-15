package org.cap.dao;

import org.cap.dto.Account;
import org.cap.dto.Customer;


//Added new comment
public interface AccountDao {
	
	public boolean createAccount(Account account);
	
	public Account findAccountById(int accountNo);
	
   

}
