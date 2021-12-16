package com.qf.dao.idao;

import com.qf.dao.entity.User;

public interface IUserDao {
    User login(String username, String password)throws Exception;
}
