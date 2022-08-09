package ru.babin.employeemadager.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String jobTitle;
    @Getter
    @Setter
    private String phone;
    @Getter
    @Setter
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    @Getter
    @Setter
    private String employeeCode;
}
