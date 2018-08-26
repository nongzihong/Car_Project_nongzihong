package com.nf147.MyCar.web;

import com.nf147.MyCar.dao.CarBusinessDao;
import com.nf147.MyCar.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/Car/update")
public class CarUpdate extends HttpServlet {
    CarBusinessDao dao = new CarBusinessDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Car cars = dao.getCarById(id);
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/jsp/Car_update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));
        String color = req.getParameter("color");
        String manufacturer = req.getParameter("manufacturer");
        Car car=new Car(id,name,price,color,manufacturer);
        dao.update(car);
        resp.sendRedirect("/Car/Det?id="+id);
    }
}
