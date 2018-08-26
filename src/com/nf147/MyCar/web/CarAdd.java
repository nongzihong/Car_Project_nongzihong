package com.nf147.MyCar.web;
import com.nf147.MyCar.dao.CarBusinessDao;
import com.nf147.MyCar.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/Car/add")
public class CarAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        float price=Float.parseFloat(req.getParameter("price"));
        String color=req.getParameter("color");
        String manufacturer=req.getParameter("manufacturer");
        Car car=new Car(id,name,price,color,manufacturer);
        CarBusinessDao dao=new CarBusinessDao();
        dao.add(car);
        resp.sendRedirect("/car");
    }
}
