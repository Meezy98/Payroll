package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "employee_generator")
    @SequenceGenerator(name = "employee_generator", sequenceName = "employee_seq")
    private int employeeId;

    @Column(nullable = false)
    public String firstName;

    @Column(nullable = false)
    public String lastName;

    @OneToOne(cascade = CascadeType.MERGE)
    @Column(nullable = false)
    public int roleId;

    @OneToOne(cascade = CascadeType.MERGE)
    @Column(nullable = false)
    public int departmentId;

    @Column(unique = true)
    public String email;

    @Column(unique = true)
    public int phoneNumber;

    @Column(nullable = false)
    private int salary;

    @Column(nullable = false)
    public Date hiredDate;

}
