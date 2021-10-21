package mate.service;

import java.util.Optional;
import mate.exception.AuthenticationException;
import mate.lib.Inject;
import mate.lib.Service;
import mate.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driverByLogin = driverService.findByLogin(login);
        if (!driverByLogin.orElseThrow(() ->
                        new AuthenticationException("login or password are incorrect"))
                .getPassword().equals(password)) {
            logger.error("Username or password is incorrect with username: " + login);
            throw new AuthenticationException("login or password are incorrect");
        }
        return driverByLogin.get();
    }
}
