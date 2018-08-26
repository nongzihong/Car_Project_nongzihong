package com.nf147.MyCar.web;

import com.nf147.MyCar.dao.CarBusinessDao;
import com.nf147.MyCar.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/Car/q")
public class CarQuery extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name = req.getParameter("name");
        CarBusinessDao dao = new CarBusinessDao();
        List<Car> cars = dao.getCarByName(name);
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/jsp/Car_list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
