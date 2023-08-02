package speedygo.dao;

import java.util.Optional;
import speedygo.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
