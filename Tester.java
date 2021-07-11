package tester;

import base.Customer;
import utils.ValidationRules;
import java.util.HashMap;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            HashMap<String, Customer> map = new HashMap<>();
            boolean exist = false;
            while (!exist) {
                System.out.println(
                        "Enter your Choice\n1)Register New Customer\n2)Customer Login\n3)Change Password\n4)Un-Subscribe Customer\n5)Everyones details\n0)Exit");
                switch (sc.next()) {
                    case "1":
                        System.out.println("Enter email, name , password , customerType , amount , regdate");
                        String email = ValidationRules.email(sc.next());
                        map.put(email, new Customer(sc.next(), email, sc.next(), ValidationRules.Ctype(sc.next()),
                                ValidationRules.regamt(sc.nextDouble()), ValidationRules.date(sc.next())));
                        System.out.println(map.get(email));
                        break;
                    case "2":
                        System.out.println("Enter Email and password");

                        ValidationRules.LoginValidation(sc.next(), sc.next(), map);
                        break;
                    case "3":
                        System.out.println("Enter email old password and new password");
                        ValidationRules.Changepassword(sc.next(), sc.next(), sc.next(), map);
                        break;
                    case "4":
                        System.out.println("Enter email to un-subscribe");

                        ValidationRules.unsubscribe(sc.next(), map);
                        break;
                    case "5":
                        System.out.println(map.toString());
                        break;

                    case "0":
                        System.out.println("Thankyou!!");
                        exist = true;
                        break;
                    default:
                        System.out.println("Please enter valid option");
                        break;
                }
                sc.nextLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
