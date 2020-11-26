package edu.nf.userdemo.dao;

import edu.nf.userdemo.entity.Users;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户信息
     * @return
     */
    List<Users> listuser();

    /**
     * 添加用户信息
     * @param users
     */
    void save(Users users);
}
