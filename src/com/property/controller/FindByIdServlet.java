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

@WebServlet(urlPatterns = "/findById")
public class FindByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //findById--> update
        int id = Integer.parseInt(request.getParameter("id"));
        ISysService sysService = (ISysService) ServiceFactory.getInstance(Const.SYS);
        Sys sys = sysService.findById(id);
        if(sys != null){
            request.setAttribute("sys",sys);
            request.getRequestDispatcher("WEB-INF/views/updata.jsp").forward(request,response);


        }else{
            response.sendRedirect(request.getContextPath()+"/error.jsp");
        }

    }
}
