package com.qf.service.iservice;

import com.qf.dao.entity.User;

public interface IUserService {
    User login(String username, String password);
}
