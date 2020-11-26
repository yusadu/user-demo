package edu.nf.userdemo.dao.impl;

import edu.nf.userdemo.dao.UserDao;
import edu.nf.userdemo.entity.Users;
import edu.nf.userdemo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public List<Users> listuser() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listuser();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void save(Users user) {
        try (SqlSession sqlSession=MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).save(user);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
