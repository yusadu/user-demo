package edu.nf.userdemo.test;

import edu.nf.userdemo.dao.UserDao;
import edu.nf.userdemo.dao.impl.UserDaoImpl;
import edu.nf.userdemo.entity.Users;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 洒度
 * @date 2020/11/26
 */
public class UserDaoTest {
    @Test
    public void testListUser(){
        UserDao dao=new UserDaoImpl();
        List<Users> list=dao.listuser();
        list.forEach(users ->
                System.out.println("编号："+users.getUid()+"\n"
                +"姓名："+users.getUname()+"\n"
                +"地址："+users.getAddress()+"\n"
                +"年龄："+users.getAge()+"\n")
        );
    }

    @Test
    public void testSave(){
        UserDao dao=new UserDaoImpl();
        Users u=new Users();
        u.setUname("张三");
        u.setAddress("湖南");
        u.setAge(18);
        dao.save(u);
    }
}
