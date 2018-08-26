package com.nf147.MyCar.dao;
import com.nf147.MyCar.entity.Car;
import java.util.ArrayList;
import java.util.List;

//实现接口
public class CarBusinessDao implements CarDAO {

    private static List<Car> Cars = new ArrayList();

    static {
        Car car1 = new Car(1, "宝马X5", 530000f, "白色", "上海制造");
        Car car2 = new Car(2, "奔驰S级", 800000f, "红色", "深圳制造");
        Car car3 = new Car(3, "本田CRV", 120000, "蓝色", "广州制造");
        Car car4 = new Car(4, "雪佛兰", 70000f, "银白色", "上海制造");
        Car car5 = new Car(5, "卡罗拉", 160000f, "白色", "上海制造");
        Cars.add(car1);
        Cars.add(car2);
        Cars.add(car3);
        Cars.add(car4);
        Cars.add(car5);
    }

    @Override
    public List<Car> listAll() {
        return Cars;
    }

    @Override
    public Car getCarById(int id) {
        for (Car car: Cars){
            if(car.getId()==id){
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getCarByName(String name) {
    ArrayList<Car>cars=new ArrayList<>();

        for (Car car1: Cars){
            String realName=car1.getName().toLowerCase();
            if (realName.contains(name.toLowerCase())){
                cars.add(car1);
            }
        }
        return cars;
    }

    @Override
    public boolean update(Car car1) {
        for (Car car: Cars){
            if (car.getId()==car1.getId()){
                car.setName(car1.getName());
                car.setPrice(car1.getPrice());
                car.setColor(car1.getColor());
                car.setManufacturer(car1.getManufacturer());
                return  true;
            }
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        for (Car car: Cars){
            if (car.getId()==id){
                return Cars.remove(car);
            }
        }
        return false;
    }

    @Override
    public Car add(Car car) {
        if (Cars.add(car)){
            return car;
        }
        return null;
    }
}
