package org.example;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@Builder
@ToString
public class Employee {
    private Long employeeId;
    private String employeeName;
    private Float salary;

}
