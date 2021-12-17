package com.property.dao.idao;

import com.property.dao.entity.User;

public interface IUserDao {
    User login(String username, String password)throws Exception;
}
