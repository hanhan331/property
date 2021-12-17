package com.property.service.iservice;

import com.property.dao.entity.User;

public interface IUserService {
    User login(String username, String password);
}
