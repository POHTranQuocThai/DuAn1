/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Quoc Thai - CE181618
 */
public class UserDAO {

    List<User> ls = new ArrayList<>();

    public UserDAO() {
        ls.add(new User("Admin", "12345", true));
        ls.add(new User("user", "12345", true));
    }

    public boolean checkLogin(String username, String pass) {
        for (User u : ls) {
            if (u.getUsername().equals(username) && u.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;

    }
}
