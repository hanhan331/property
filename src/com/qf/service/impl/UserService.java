package com.qf.service.impl;

import com.qf.comm.Const;
import com.qf.dao.entity.User;
import com.qf.dao.factory.DaoFactory;
import com.qf.dao.idao.IUserDao;
import com.qf.service.iservice.IUserService;

public class UserService implements IUserService {
    private IUserDao userDao;

    public UserService() {
        userDao= (IUserDao) DaoFactory.getInstance(Const.USER);
    }

    @Override
    public User login(String username, String password) {
        User user=null;
        try {
            user=userDao.login(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
