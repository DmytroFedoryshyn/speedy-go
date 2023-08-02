package speedygo.service;

import speedygo.exception.AuthenticationException;
import speedygo.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
