package com.example.lab_b03_re_redo.person;

import com.example.lab_b03_re_redo.person.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity,String> {
    PersonEntity findByHkid(String hkid); //這裏是回應personService 裏 getPersonByHkid 入面，personRepository裏的method
    PersonEntity deleteByHkid(String hkid);

}
