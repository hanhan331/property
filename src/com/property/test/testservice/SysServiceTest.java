package com.property.test.testservice;

import com.property.comm.Const;
import com.property.controller.vo.SysVO;
import com.property.dao.entity.Sys;
import com.property.service.factory.ServiceFactory;
import com.property.service.iservice.ISysService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SysServiceTest {
    ISysService sysService;
    @Before
    public void setUp(){
        sysService = (ISysService) ServiceFactory.getInstance(Const.SYS);
    }

    @Test
    public void update() {
        Sys sys = new Sys(16,10,"人也管理",9,"1032387","ksd",8);
        System.out.println(sysService.update(sys));

    }

    @Test
    public void findByDynamicSQL() {
        SysVO vo = new SysVO(1,2,"p");
        final List<Sys> b = sysService.findByDynamicSQL(vo);

        b.forEach(System.out::println);
    }
}