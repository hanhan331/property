package com.qf.dao.factory;

import com.qf.dao.idao.IUserDao;
import com.qf.dao.impl.UserDao;

public class DaoFactory {
    public static Object getInstance(String str) {
        switch (str){
            case "USER":
                return new UserDao();
            default:return null;
        }
    }
}
