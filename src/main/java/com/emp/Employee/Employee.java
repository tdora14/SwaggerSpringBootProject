package com.emp.Employee;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
@Table(name = "Employee")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the employee, generated automatically")
    private Long Eid;

    @Schema(description = "Full name of the employee")
    private String Ename;

    @Schema(description = "Monthly salary of the employee in USD")
    private double Esalary;

    @Schema(description = "Department where the employee is currently assigned")
    private String Edept;

    // Constructors
    public Employee() {}
    
    public Employee(String ename, double esalary, String edept) {
        this.Ename = ename;
        this.Esalary = esalary;
        this.Edept = edept;
    }

    // Getters and Setters
    public Long getEid() { return Eid; }

    public void setEid(Long eid) { this.Eid = eid; }

    public String getEname() { return Ename; }

    public void setEname(String ename) { this.Ename = ename; }

    public double getEsalary() { return Esalary; }

    public void setEsalary(double esalary) { this.Esalary = esalary; }

    public String getEdept() { return Edept; }

    public void setEdept(String edept) { this.Edept = edept; }
}
