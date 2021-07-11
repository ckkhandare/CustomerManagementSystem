package utils;

import ExceptionHandling.CustomExceptions;
import base.Customer;
import base.CustomerType;
import java.time.LocalDate;
import java.util.HashMap;

public class ValidationRules {
    public static void LoginValidation(String username, String password, HashMap<String, Customer> map)
            throws Exception {
        for (Customer v : map.values()) {
            if (v.getEmail().equals(username))
                if (v.getPassword().equals(password)) {
                    System.out.println("Login Successful");
                    System.out.println(map.get(username));
                } else {
                    throw new CustomExceptions("Login failed");
                }
        }
    }

    public static void Changepassword(String username, String password1, String password2,
                                      HashMap<String, Customer> map) throws Exception {
        for (Customer p : map.values()) {
            if (p.getEmail().equals(username))
                if (p.getPassword().equals(password1)) {
                    p.setPassword(password2);
                } else {
                    throw new CustomExceptions("Invalid details entered");
                }
        }
    }

    public static void unsubscribe(String username, HashMap<String, Customer> map) throws Exception {
        if (map.containsKey(username)) {
            map.remove(username);
        } else {
            throw new CustomExceptions("Invalid email");
        }
    }

    public static LocalDate date(String regdate) throws Exception {
        LocalDate date = LocalDate.parse(regdate);
        if (date.isBefore(LocalDate.now())) {
            return date;
        } else {
            throw new CustomExceptions("Invalid date");
        }
    }

    public static CustomerType Ctype(String type) throws Exception {
        try {
            CustomerType Type = CustomerType.valueOf(type.toUpperCase());
            return Type;
        } catch (Exception e) {
            throw new CustomExceptions("Invalid Customer type");
        }

    }

    public static double regamt(double amount) throws Exception {

        if (amount > 5000 && amount < 50000) {
            return amount;
        } else {
            throw new CustomExceptions("Amount must be between 5000 to 50000");
        }
    }

    public static String email(String mail) throws Exception {
        if (mail.contains("@") && mail.endsWith(".com")) {
            return mail;
        } else {
            throw new CustomExceptions("Invalid email");

        }
    }
}

