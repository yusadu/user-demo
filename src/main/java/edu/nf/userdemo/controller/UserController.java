package edu.nf.userdemo.controller;

import edu.nf.userdemo.entity.Users;
import edu.nf.userdemo.service.UserService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

import java.util.List;

/**
 * @author 洒度
 * @date 2020/11/26
 */
public class UserController {
    @WebRequest("/list_user")
    public View listUser(){
        UserService service=new UserService();
        List<Users> list= service.listUser();
        return new JsonView(list);
    }

    @WebRequest("/add")
    public View addUser(Users u){
        try {
            UserService service=new UserService();
            service.insertUser(u);
            return new JsonView("添加成功！");
        }catch (RuntimeException e){
            return  new JsonView("添加失败！");
        }
    }
}
