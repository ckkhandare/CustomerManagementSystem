package base;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String email;
    private String password;
    private CustomerType custType;
    private double regAmount;
    private LocalDate RegistrationDate;

    public Customer(String name, String email, String password, CustomerType custType, double regAmount,
                    LocalDate registrationDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.custType = custType;
        this.regAmount = regAmount;
        RegistrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", password='" + password + '\''
                + ", custType=" + custType + ", regAmount=" + regAmount + ", RegistrationDate=" + RegistrationDate
                + "}\n";
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerType getCustType() {
        return custType;
    }

    public double getRegAmount() {
        return regAmount;
    }

    public LocalDate getRegistrationDate() {
        return RegistrationDate;
    }

}
//2.Create a customer management application along with validations.
//2.1 Customer class
//state --name,email,password,custType(String),reg amount(double)
//Add constructor n toString.

