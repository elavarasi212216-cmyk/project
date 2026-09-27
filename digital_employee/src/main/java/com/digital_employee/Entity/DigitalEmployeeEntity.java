package com.digital_employee.Entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name="digital_employee_entity")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DigitalEmployeeEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String userEmail;
    private String password;
    private String phone;
    
}
