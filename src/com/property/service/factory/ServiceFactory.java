package com.property.service.factory;

import com.property.service.impl.SysService;
import com.property.service.impl.UserService;

public class ServiceFactory {
    public static Object getInstance(String name) {
        switch (name) {
            case "SYS":
                return new SysService();
            case "USER":
                return new UserService();
            default:
                return null;
        }
    }

}
