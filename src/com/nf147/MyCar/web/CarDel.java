package com.nf147.MyCar.web;

import com.nf147.MyCar.dao.CarBusinessDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/Car/del")
public class CarDel extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        CarBusinessDao dao=new CarBusinessDao();
        dao.delete(id);
        resp.sendRedirect("/car");

    }
}
