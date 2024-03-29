package speedygo.service;

import java.util.Optional;
import speedygo.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
