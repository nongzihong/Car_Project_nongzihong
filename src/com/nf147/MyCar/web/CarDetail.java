package com.nf147.MyCar.web;

import com.nf147.MyCar.dao.CarBusinessDao;
import com.nf147.MyCar.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/Car/Det")
public class CarDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarBusinessDao dao = new CarBusinessDao();
        int id = Integer.parseInt(req.getParameter("id"));
        Car cars = dao.getCarById(id);
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/jsp/Car_Detail.jsp").forward(req, resp);
    }
}
