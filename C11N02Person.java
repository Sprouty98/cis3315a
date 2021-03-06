/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.time.LocalDate;

/**
 *
 * @author Dan Sprout
 */
public class C11N02Person {

    private String name;
    private String address;
    private String phone;
    private String email;

    public C11N02Person() {
    }

    public C11N02Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "C11N2Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + '}';
    }

}
                // This is the Studet Class

class Student extends C11N02Person {
//set final (makes it a constant) and your instance variable

    final String status;
//constructor

    public Student(String status) {
        this.status = status;
    }
}

                                    //This is the Employee class..
class Employee extends C11N02Person {

    private String office;
    private double salary;
    private LocalDate hireDate; //This LocalDate is a Java method for pulling your system's date.

    public Employee() {
        super();
    }

    public Employee(String office, double salary, LocalDate hireDate, String name, String address, String phone, String email) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" + "office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + '}';
    }

}
                        //This is the subclass of Employee
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {
    }

    public Faculty(String officeHours, String rank, String office, double salary, LocalDate hireDate, String name, String address, String phone, String email) {
        super(office, salary, hireDate, name, address, phone, email);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public String toString() {
        return "Faculty " + getName();
    }
    
    

}
class Staff extends Employee{
    private String title;

    public Staff() {
    }

    public Staff(String title, String office, double salary, LocalDate hireDate, String name, String address, String phone, String email) {
        super(office, salary, hireDate, name, address, phone, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff " + getName();
    }
    
}

class C11N2Test{
    public static void main(String[] args) {
        C11N02Person p1 = new C11N02Person("Joe", "123 Main", "123-4567", "test@ex.com");
        System.out.println("p1 = " + p1);
    }
}
