package com.nf147.MyCar.web;
import com.nf147.MyCar.dao.CarBusinessDao;
import com.nf147.MyCar.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CarList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarBusinessDao dao=new CarBusinessDao();
        List<Car> cars=dao.listAll();
       req.setAttribute("cars",cars);
       req.getRequestDispatcher("/jsp/Car_list.jsp").forward(req,resp);
    }
}
