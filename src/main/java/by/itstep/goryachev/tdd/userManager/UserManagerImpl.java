package by.itstep.goryachev.tdd.userManager;



import java.util.ArrayList;
import java.util.List;

public class UserManagerImpl implements UserManager{
    List <User> userList = new ArrayList<User>();

    @Override
    public void addUser(String firstname, String lastname, int age, String sex) {
        User user = new User (firstname, lastname, age, sex);
        if (!userList.contains(user)){
            userList.add(user);
        }
        new User(firstname,lastname,age,sex);
    }
}
