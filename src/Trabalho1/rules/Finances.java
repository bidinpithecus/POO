package Trabalho1.rules;

import Trabalho1.data.Category;
import Trabalho1.data.Spent;
import Trabalho1.data.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Calendar;

public class Finances {
    private Map<User, List<Spent>> users = new HashMap<>();

    public boolean newUser(User user) {
        return true;
    }

    // https://www.baeldung.com/java-password-hashing
    public boolean login(String login, String password) {
        return true;
    }

    public boolean newSpent(Spent spent) {
        return true;
    }

    public boolean deleteSpent(String id) {
        return true;
    }

    public List<Spent> listSpent(int month) {
        return null;
    }

    public List<Spent> listSpent(Category category) {
        return null;
    }

    // By string, change either the name or description
    public boolean editSpent(String id, int property, String content) {
        return true;
    }

    public boolean editSpent(String id, Calendar date) {
        return true;
    }

    public boolean editSpent(String id, float value) {
        return true;
    }

    public boolean editSpent(String id, Category category) {
        return true;
    }

}
