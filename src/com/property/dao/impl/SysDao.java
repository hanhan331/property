package com.property.dao.impl;

import com.property.controller.vo.SysVO;
import com.property.dao.entity.Sys;
import com.property.dao.idao.ISysDao;
import com.property.dao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SysDao implements ISysDao {

    @Override
    public int save(Sys sys) throws Exception {
        final Connection con = DBUtil.getConnection();
        String sql = "insert into sys_menu(id,pid,title,spread,url,icon,available) values(?,?,?,?,?,?,?) ";
        final PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,sys.getId());
        ps.setInt(2,sys.getPid());
        ps.setString(3,sys.getTitle());
        ps.setInt(4,sys.getSpread());
        ps.setString(5,sys.getUrl());
        ps.setString(6,sys.getIcon());
        ps.setInt(7,sys.getAvailable());
        final int i = ps.executeUpdate();
        DBUtil.close(null,ps,con);
        return i;
    }

    @Override
    public int delete(Sys sys) throws Exception {
        final Connection con = DBUtil.getConnection();
        String sql = "delete from sys_menu where id=?";
        final PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,sys.getId());
        final int i = ps.executeUpdate();
        DBUtil.close(null,ps,con);
        return i;
    }

    @Override
    public int update(Sys sys) throws Exception {
        final Connection con = DBUtil.getConnection();
        String sql = "update sys_menu set pid=?,title=?,spread=?,url=?,icon=?,available=? where id=?";
        final PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,sys.getPid());
        ps.setString(2,sys.getTitle());
        ps.setInt(3,sys.getSpread());
        ps.setString(4,sys.getUrl());
        ps.setString(5,sys.getIcon());
        ps.setInt(6,sys.getAvailable());
        ps.setInt(7,sys.getId());

        final int i = ps.executeUpdate();
        DBUtil.close(null,ps,con);
        return i;
    }

    @Override
    public List<Sys> findByName(String title) throws Exception {
        final Connection con = DBUtil.getConnection();
        String sql = "select id,pid,title,spread,url,icon,available from sys_menu where title like concat('%',?,'%')";
        final PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,title);
        final ResultSet rs = ps.executeQuery();
        List<Sys> syss = new ArrayList<>();
        if(rs.next()){
            Sys sys = new Sys(rs.getInt(1),rs.getInt(2),rs.getString(3),
                    rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7));
                    syss.add(sys);
        }
        DBUtil.close(rs,ps,con);

        return syss;
    }

    @Override
    public Sys findById(Integer id) throws Exception {
        final Connection con = DBUtil.getConnection();
        String sql = "select id,pid,title,spread,url,icon,available from sys_menu where id=?";
        final PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        final ResultSet rs = ps.executeQuery();
        Sys sys = null;
        if(rs.next()){
             sys = new Sys(rs.getInt(1),rs.getInt(2),rs.getString(3),
                    rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7));

        }
        return sys;
    }

    @Override
    public List<Sys> findByDynamicSQL(SysVO sysV) throws Exception {
        Connection con = DBUtil.getConnection();
        StringBuilder sql = new StringBuilder();


        sql.append("select id,pid,title,spread,url,icon,available from sys_menu where 1=1");

        if (sysV.getPid()!=null){
            sql.append(" and pid=? ");
        }
        if(sysV.getTitle()!=null){
            sql.append(" and title like concat('%',?,'%') ");
        }

        if (sysV.getAvailable()!=null){
            sql.append(" and available=? ");
        }
        System.out.println(sql);
        PreparedStatement ps = con.prepareStatement(sql.toString());
        int i = 0;

        if(sysV.getPid() != null ){
            i++;
            ps.setInt(i,sysV.getPid());
        }
        if(sysV.getTitle() != null ){
            i++;
            ps.setString(i,sysV.getTitle());
        }

        if(sysV.getAvailable() != null ){
            i++;
            ps.setInt(i,sysV.getAvailable());
        }

        List<Sys> syss=new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
           Sys sys = new Sys(rs.getInt(1),rs.getInt(2),rs.getString(3),
                    rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7));

            syss.add(sys);
        }
        DBUtil.close(rs, ps, con);
        return syss;

    }

    @Override
    public List<Sys> findAll() throws Exception {
        final Connection con = DBUtil.getConnection();
        String sql = "select * from sys_menu ";
        final PreparedStatement ps = con.prepareStatement(sql);
        List<Sys> syss = new ArrayList<>();
        final ResultSet rs = ps.executeQuery();
        while (rs.next()){

            Sys sys = new Sys(rs.getInt(1),rs.getInt(2),rs.getString(3),
                    rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7));
            syss.add(sys);
        }
        return syss;
    }

    @Override
    public List<Sys> findByPage(int begin, int size) throws Exception {
        Connection con = DBUtil.getConnection();
        String sql = "select id,pid,title,spread,url,icon,available from sys_menu limit ?,?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,begin);
        ps.setInt(2,size);
        ResultSet rs = ps.executeQuery();
        List<Sys> syss = new ArrayList<>();
        while(rs.next()){
            Sys sys = new Sys(rs.getInt(1),rs.getInt(2),rs.getString(3),
                    rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7));
            syss.add(sys);
        }
        return syss;
    }

    @Override
    public int totalCount() throws SQLException {
            final Connection con = DBUtil.getConnection();
            String sql = "select count(id) from sys_menu ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            if(rs.next()){
                count = rs.getInt(1);
            }
            return count;
    }
}
