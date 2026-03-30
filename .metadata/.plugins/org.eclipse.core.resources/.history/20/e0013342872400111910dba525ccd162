package ar.edu.unlp.info.oo2.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users;
    
    public UserRepository() {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
        if (existUser(user.getScreenName())){
            throw new IllegalArgumentException("Ya existe el usuario " + user.getScreenName());
        }
        this.users.add(user);
    }

    public void removeUser(String screenName) {
        this.users.removeIf(u -> u.getScreenName().equals(screenName));
    }

    public List<User> getUsers() {
        return new ArrayList<User>(this.users);
        // es correcto:
        // return Collections.unmodifiableList(users);
    }

    private boolean existUser(String screenName) {
        return users.stream().anyMatch(u -> u.getScreenName().equals(screenName));
    }


}
