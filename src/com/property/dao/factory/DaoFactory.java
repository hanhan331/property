package com.property.dao.factory;

import com.property.dao.impl.SysDao;
import com.property.dao.impl.UserDao;

public class DaoFactory {
    public static Object getInstance(String name){
        switch (name){
            case"SYS":
                return new SysDao();
            case "USER":
                return new UserDao();
            default:
                return null;
        }
    }
}
