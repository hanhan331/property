package com.property.controller;

import com.alibaba.fastjson.JSON;
import com.mysql.jdbc.StringUtils;
import com.property.comm.CodeMsg;
import com.property.comm.Const;
import com.property.comm.PageInfo;
import com.property.comm.Res;
import com.property.dao.entity.Sys;
import com.property.service.factory.ServiceFactory;
import com.property.service.iservice.ISysService;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/findAll")
public class FindAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ISysService service = (ISysService) ServiceFactory.getInstance(Const.SYS);
//        List<Sys> sys = service.findAll();
//        request.setAttribute("sys",sys);
//        request.getRequestDispatcher("/WEB-INF/views/sysAll.jsp").forward(request,response);
          doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String spage = request.getParameter("page");
        String ssize = request.getParameter("size");
        int page = StringUtils.isNullOrEmpty(spage) ? 1 : Integer.parseInt(spage);
        int size = StringUtils.isNullOrEmpty(ssize)?Const.PAGE_DEFAULT_SIZE:Integer.parseInt(ssize);
        PageInfo pageInfo = new PageInfo(page,size);
        ISysService sysService = (ISysService) ServiceFactory.getInstance(Const.SYS);
        List<Sys> syss = sysService.findByPage(pageInfo);
        request.setAttribute("page",pageInfo);
        request.setAttribute("sys",syss);
        request.getRequestDispatcher("/WEB-INF/views/sysAll.jsp").forward(request,response);



    }
}
