package edu.nf.userdemo.service;

import edu.nf.userdemo.dao.UserDao;
import edu.nf.userdemo.dao.impl.UserDaoImpl;
import edu.nf.userdemo.entity.Users;

import java.util.List;

/**
 * @author 洒度
 * @date 2020/11/26
 */
public class UserService {

    public List<Users> listUser(){
        Users u=new Users();
        UserDao dao=new UserDaoImpl();
        List<Users> list=dao.listuser();
        return list;
    }

    public void insertUser(Users u){
        UserDao dao=new UserDaoImpl();
        dao.save(u);
    }
}
