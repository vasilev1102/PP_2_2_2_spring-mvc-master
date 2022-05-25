package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static  List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("LADA1",1,"GREEN1"));
        carList.add(new Car("LADA2",2,"GREEN2"));
        carList.add(new Car("LADA3",3,"GREEN3"));
        carList.add(new Car("LADA4",4,"GREEN4"));
        carList.add(new Car("LADA5",5,"GREEN5"));
    }
    @Override
    public List<Car> getCarsList(int count) {
        if(count == 0){
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
