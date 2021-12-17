package com.property.service.impl;

import com.property.comm.Const;
import com.property.comm.PageInfo;
import com.property.controller.vo.SysVO;
import com.property.dao.entity.Sys;
import com.property.dao.factory.DaoFactory;
import com.property.dao.idao.ISysDao;
import com.property.service.iservice.ISysService;

import java.util.ArrayList;
import java.util.List;

public class SysService implements ISysService {
   ISysDao sysDao;
    public SysService(){
        sysDao = (ISysDao) DaoFactory.getInstance(Const.SYS);
    }
    @Override
    public String save(Sys sys) {
     String msg = Const.ERROR;
        try {
            int flag = sysDao.save(sys);
            if(flag == 1){
                msg = Const.SUCCESS;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public String delete(Sys sys) {
        String msg = Const.ERROR;
        try {
            int flag = sysDao.delete(sys);
            if(flag == 1){
                msg = Const.SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;

    }

    @Override
    public String update(Sys sys) {
        String msg = Const.ERROR;
        try {
            int flag = sysDao.update(sys);
            if(flag == 1){
                msg = Const.SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public List<Sys> findByTitle(String title) {

        List<Sys> bTit = new ArrayList<>();
        try {
            bTit =sysDao.findByName(title);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bTit;
    }

    @Override
    public Sys findById(Integer id) {
        Sys bId= null;
        try {
            bId = sysDao.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bId;
    }

    @Override
    public List<Sys> findByPage(PageInfo pageInfo) {
        List<Sys> syss = null;
        //将总记录数放入pageInfo
        try {
            int count = sysDao.totalCount();
            pageInfo.setTotalRows(count);
            syss = sysDao.findByPage(pageInfo.getStartRow(),pageInfo.getSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return syss;
    }

    @Override
    public List<Sys> findByDynamicSQL(SysVO sysV) {
        List<Sys> bDSQL = new ArrayList<>();
        try {
            bDSQL = sysDao.findByDynamicSQL(sysV);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bDSQL;
    }

    @Override
    public List<Sys> findAll() {
        List<Sys> all = new ArrayList<>();
        try {
            all = sysDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
}
