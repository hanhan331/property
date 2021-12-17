package com.property.controller;

import com.mysql.jdbc.StringUtils;
import com.property.comm.Const;
import com.property.controller.vo.SysVO;
import com.property.dao.entity.Sys;
import com.property.service.factory.ServiceFactory;
import com.property.service.iservice.ISysService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet(urlPatterns = "/query")
public class QueryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer pid = Integer.parseInt(request.getParameter("pid"));

        Integer available = Integer.parseInt(request.getParameter("available"));

        String title = request.getParameter("title");


        SysVO vo = new SysVO(pid,available,title);
        ISysService sysService = (ISysService) ServiceFactory.getInstance(Const.SYS);
        List<Sys> syss = sysService.findByDynamicSQL(vo);
        if(syss!=null&&syss.size()>0){
            request.setAttribute("sys", syss);
            request.getRequestDispatcher("/WEB-INF/views/sysAll.jsp").forward(request, response);


        }else{

            response.sendRedirect(request.getContextPath()+"/error.jsp");
        }

    }


}
