package com.qf.dao.impl;

import com.qf.dao.entity.User;
import com.qf.dao.idao.IUserDao;
import com.qf.dao.until.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao implements IUserDao {
    @Override
    public User login(String username, String password) throws Exception {
        Connection con= DBUtils.getConnection();
        String sql="select id,username,password,pri from tuser where username=? and password=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getInt(4));
        }
        return user;
    }
}
