package speedygo.service;

import java.util.Optional;
import speedygo.exception.AuthenticationException;
import speedygo.lib.Inject;
import speedygo.lib.Service;
import speedygo.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driverOptional = driverService.findByLogin(login);

        if (driverOptional.isEmpty() || !driverOptional.get().getPassword().equals(password)) {
            throw new AuthenticationException("Username or password was incorrect");
        }

        return driverOptional.get();
    }
}
