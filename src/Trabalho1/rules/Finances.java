package Trabalho1.rules;

import Trabalho1.data.Category;
import Trabalho1.data.Spent;
import Trabalho1.data.User;

import java.util.*;

public class Finances {
	private Map<User, List<Spent>> users = new HashMap<>();
	private User logged;

	public boolean newUser(User user) {
		if (users.get(user) == null) {
			List<Spent> spents = new ArrayList<>();
			users.put(user, spents);
			return true;
		}
		return false;
	}

	// https://www.baeldung.com/java-password-hashing
	public boolean login(String login, String password) {
		for (User user : users.keySet()) {
			if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
				logged = user;
				return true;
			}
		}
		return false;
	}

	public void logoff() {
		logged = new User();
	}

	public boolean isUserLogged() {
		return logged != null;
	}

	public boolean newSpent(Spent spent) {
		if (isUserLogged()) {
			users.get(logged).add(spent);
			return true;
		}
		return false;
	}

	public boolean deleteSpent(int index) {
		if (isUserLogged()) {
			users.get(logged).remove(index);
			return true;
		}
		return false;
	}

	public List<Spent> listSpent() {
		return users.get(logged);
	}

	public List<Spent> listSpent(int month) {
		if (isUserLogged()) {
			List<Spent> list = new ArrayList<>();
			for (Spent spent : users.get(logged)) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(spent.getDate().getTime());
				if ((calendar.get(Calendar.MONTH) + 1) == month) {
					list.add(spent);
				}
			}
			return list;
		}
		return null;
	}

	public List<Spent> listSpent(Category category) {
		if (isUserLogged()) {
			List<Spent> list = new ArrayList<>();
			for (Spent spent : users.get(logged)) {
				if (spent.getCategory().equals(category)) {
					list.add(spent);
				}
			}
			return list;
		}
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
