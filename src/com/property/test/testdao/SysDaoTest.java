package com.property.test.testdao;

import com.property.dao.entity.Sys;
import com.property.dao.impl.SysDao;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.*;

public class SysDaoTest {
    SysDao sysDao;
    @Before
    public void setUp(){
          sysDao = new SysDao();
    }
    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }

    @org.junit.Test
    public void update() {
    }

    @Test
    public void findByName() {
    }

    @org.junit.Test
    public void findById() {
    }

    @org.junit.Test
    public void findByDynamicSQL() {
    }

    @org.junit.Test
    public void findAll() throws Exception{
        final List<Sys> all = sysDao.findAll();
        all.forEach(System.out::println);
    }
}