package com.property.service.iservice;

import com.property.comm.PageInfo;
import com.property.controller.vo.SysVO;
import com.property.dao.entity.Sys;

import java.util.List;

public interface ISysService {
    String save (Sys sys);
    String delete (Sys sys);
    String update (Sys sys);
    List<Sys> findByTitle(String title);
    Sys findById(Integer id);
    List<Sys> findByPage(PageInfo pageInfo);
    List<Sys> findByDynamicSQL(SysVO sysV);
    List<Sys> findAll();

}
