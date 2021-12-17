package com.property.service.impl;

import com.property.comm.Const;
import com.property.dao.factory.DaoFactory;
import com.property.dao.entity.User;
import com.property.dao.idao.IUserDao;
import com.property.service.iservice.IUserService;

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
