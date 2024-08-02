import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    AuthenticationService() {
        users = new ArrayList<>();
    }
    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String username, String password) {
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username)) {
                return null;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }
    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    public User logIn(String username, String password) {
        User loginUser = new User(username, password);
        for (User user : users) {
            if (user == loginUser) {
                return loginUser;
            }
        }
        return null;
    }
}