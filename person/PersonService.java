package com.example.lab_b03_re_redo.person;

import com.example.lab_b03_re_redo.person.data.PersonRequestData;
import com.example.lab_b03_re_redo.person.data.PersonResponseData;

import java.util.List;

public interface PersonService {
    PersonResponseData createPerson(PersonRequestData createPersonData);
    List<PersonResponseData> getAllPerson();
    PersonResponseData getPersonByHkid(String hkid); //這裏是回應personService 裏 getPersonByHkid的method
    PersonResponseData updatePersonByHkid(PersonRequestData updatePersonData);
  //  PersonResponseData deletePersonByHkid(String hkid);
}
