package speedygo.dao;

import java.util.List;
import speedygo.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
