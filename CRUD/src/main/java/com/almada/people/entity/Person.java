package com.almada.people.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_people")
@NoArgsConstructor // Construtor
@Getter /* Lombok */
@Setter /* Lombok */
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE) // Api não pode mudar o valor do ID, soemnte o banco de dados
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Builder
    public Person(String name, String cpf, Integer age) { //Construtor personalizado
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

}
