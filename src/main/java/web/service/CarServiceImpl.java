package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getCarsList(int count) {
        return carDao.getCarsList(count);
    }
}
