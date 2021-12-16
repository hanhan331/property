package com.qf.controller;

import com.qf.comm.Const;
import com.qf.dao.entity.User;
import com.qf.service.factory.ServiceFactory;
import com.qf.service.iservice.IUserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("text1");
        String password = request.getParameter("password");
        IUserService userService = (IUserService) ServiceFactory.getInstance(Const.USER);
        User user = userService.login(username, password);
        HttpSession session = request.getSession();
        if (user != null) {
            session.setAttribute(Const.CURRENT_USER, user);
            request.getRequestDispatcher("/WEB-INF/views/success_login.jsp").forward(request, response);
        } else {

            response.sendRedirect(request.getContextPath() + "/error.jsp");
        }
    }
}
