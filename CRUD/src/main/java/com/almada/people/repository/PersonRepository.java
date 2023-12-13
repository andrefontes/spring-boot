package com.almada.people.repository;

import com.almada.people.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> { //Respons�vel pela persist�ncia. Liga com o banco de dados

}
