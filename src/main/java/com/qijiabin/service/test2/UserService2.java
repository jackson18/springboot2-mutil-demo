package com.qijiabin.service.test2;

import com.qijiabin.dao.test2.UserDao2;
import com.qijiabin.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService2 {
	@Autowired
	private UserDao2 userDao2;

	@Transactional(transactionManager = "test2TransactionManager")
	public int insertUser(String name, Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		int result = userDao2.insert(user);
		return result;
	}

}