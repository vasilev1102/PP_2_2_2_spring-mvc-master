package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCarsList(int count);
}
