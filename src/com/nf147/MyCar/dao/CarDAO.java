package com.nf147.MyCar.dao;

import com.nf147.MyCar.entity.Car;

import java.util.List;

//接口
public interface CarDAO {
    List<Car> listAll();//查询所有的信息
    Car getCarById(int id);//显示手机参数
    List<Car> getCarByName(String name);//根据名字查询
    boolean update (Car phone);//修改
    boolean delete (int id);//删除
    Car add (Car phone);//添加
}
