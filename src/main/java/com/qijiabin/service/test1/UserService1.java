package com.qijiabin.service.test1;

import com.qijiabin.dao.test1.UserDao1;
import com.qijiabin.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService1 {
	@Autowired
	private UserDao1 userDao1;

	@Transactional(transactionManager = "test1TransactionManager")
	public int insertUser(String name, Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		int result = userDao1.insert(user);
		return result;
	}

}