package com.racoon_brothers.employee.racoon_brothers_employee.data.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table( name = "employee")
public class EmployeeTb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name =  "id")
    private Integer id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "sex")
    private Character sex;

    @ManyToOne
    @JoinColumn(name = "typeRole" , referencedColumnName = "id")
    private RoleTb typeRole;

    @ManyToOne
    @JoinColumn(name = "typeContract" , referencedColumnName = "id")
    private ContractTb typeContract;

}
