package com.qf.service.factory;

import com.qf.service.impl.UserService;
import com.qf.service.iservice.IUserService;

public class ServiceFactory {

    public static Object getInstance(String str) {
        switch (str){
            case "USER":
                return new UserService();
            default:return null;
        }
    }
}
