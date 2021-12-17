package com.property.dao.idao;

import com.property.controller.vo.SysVO;
import com.property.dao.entity.Sys;

import java.sql.SQLException;
import java.util.List;

public interface ISysDao {
    int save (Sys sys) throws Exception;
    int delete (Sys sys) throws Exception;
    int update (Sys sys) throws Exception;
    List<Sys> findByName(String title) throws Exception;
    Sys findById(Integer id) throws Exception;
    List<Sys> findByDynamicSQL(SysVO sysV) throws Exception;
    List<Sys> findAll() throws Exception;
    List<Sys> findByPage(int begin,int size) throws Exception;
    int totalCount() throws SQLException;
}
