package com.property.controller;

import com.property.comm.Const;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/save")
public class SaveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        int pid = Integer.parseInt(request.getParameter("pid"));
        String title = request.getParameter("title");
        int spread = Integer.parseInt(request.getParameter("spread"));
        String url = request.getParameter("url");
        String icon = request.getParameter("icon");
        int available = Integer.parseInt(request.getParameter("available"));

        Sys sys = new Sys(id,pid,title,spread,url,icon,available);
        ISysService sysService = (ISysService) ServiceFactory.getInstance(Const.SYS);
        String msg = sysService.save(sys);
        if(Const.SUCCESS.equals(msg)){
            request.getRequestDispatcher("/findAll").forward(request,response);
        }else{
            response.sendRedirect(request.getContextPath()+"/error.jsp");
        }
    }
}
