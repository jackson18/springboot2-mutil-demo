package com.qijiabin.dao.test1;

import com.qijiabin.entity.User;

import java.util.List;

/**
 * ========================================================
 * 日 期：2018/8/18 22:44
 * 作 者：jackson
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
public interface UserDao1 {

    int insert(User record);

    List<User> selectUsers();

}
