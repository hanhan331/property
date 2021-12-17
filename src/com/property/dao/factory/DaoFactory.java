package com.property.dao.factory;

import com.property.dao.impl.SysDao;

public class DaoFactory {
    public static Object getInstance(String name){
        switch (name){
            case"SYS":
                return new SysDao();
            default:
                return null;
        }
    }
}
