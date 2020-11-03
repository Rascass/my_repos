package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Age;
import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import javax.naming.InvalidNameException;
import java.sql.Date;
import java.util.Objects;

public class Employee extends Person{

    private Position position;
    private double salary;
    private Date startWork;

    public Employee() {
    }

    public Employee(PersonInfo personInfo) {
        super(personInfo);
    }

    public Employee(PersonInfo personInfo, Position position, double salary) throws InvalidNameException {
        this.setPosition(position);
        this.setSalary(salary);
    }

    public Employee(PersonInfo personInfo, Position position, double salary, Date startWork) {
        super(personInfo);
        this.position = position;
        this.salary = salary;
        this.startWork = startWork;
    }

    public Employee(String firstName, String secondName, String lastName, Date birthday, Gender gender, Position position, double salary,
                    Date startWork) throws InvalidNameException {
        super(firstName, secondName, lastName, birthday, gender);
        this.position = position;
        this.salary = salary;
        this.startWork = startWork;
    }

    public Position getPosition() {
        return position;
    }

    public int getExperience() {
        return Age.getAge(this.startWork);
    }

    public Employee setPosition(Position position) {
        this.position = position;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException();
        }
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                position == employee.position &&
                Objects.equals(startWork, employee.startWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, salary, startWork);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personInfo=" + getPersonInfo() +
                ", position=" + position +
                ", salary=" + salary +
                ", startWork=" + startWork +
                '}';
    }
}
