package com.example.lab_b03_re_redo.person.serviceImpl;

import com.example.lab_b03_re_redo.person.PersonRepository;
import com.example.lab_b03_re_redo.person.PersonService;
import com.example.lab_b03_re_redo.person.data.PersonRequestData;
import com.example.lab_b03_re_redo.person.data.PersonResponseData;
import com.example.lab_b03_re_redo.person.entity.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository=personRepository;
    }

    public PersonResponseData createPerson(PersonRequestData createPersonData){
        PersonEntity createPersonEntity = new PersonEntity(createPersonData);
        personRepository.save(createPersonEntity);
        PersonResponseData createdPersonData =new PersonResponseData(createPersonEntity);
        return createdPersonData;
    }

    public List<PersonResponseData> getAllPerson(){
        List<PersonResponseData> getAllPersonDataList = new ArrayList<>();

        for (PersonEntity personEntity : personRepository.findAll()) {
            PersonResponseData getAllPersonData = new PersonResponseData(personEntity);  //？今次完全沒有在PersonResponseData提，唔知得唔得呢？
            getAllPersonDataList.add(getAllPersonData);
        }
        return getAllPersonDataList;
    }

    public PersonResponseData updatePersonByHkid(PersonRequestData updatePersonData){
        //這裏先用method getPersonEntityByhkid 從repository 找相對的資料
       PersonEntity personEntity = getPersonEntityByHkid(updatePersonData.getHkid());  //透過method攞既data, 俾個名

       personEntity.setFirstName(updatePersonData.getFirstName());
       personEntity.setLastName(updatePersonData.getLastName());

       personRepository.save(personEntity);

       PersonResponseData updatedPersonData = new PersonResponseData(personEntity);

       return updatedPersonData;
        }

//    public PersonResponseData deletePersonByHkid(String hkid) {
//        PersonEntity personFound = personRepository.findByHkid(hkid);
//        if (personFound == null) {
//            return null;
//        }
//            personRepository.deleteByHkid(hkid);
//            return new PersonResponseData(personFound);
//        }






//Lab_B03只用request param 和 personRepository.deleteByHkid(hkid)做到。  ：）


//        deletePersonEntity =getPersonEntityByHkid(deletePersonData.getHkid());
//
//
//                personRepository.delete(deletePersonEntity);
//        PersonResponseData deletedPersonData = new PersonResponseData(deletePerson);
//        return deletedPersonData;
  //  }


    public PersonEntity getPersonEntityByHkid(String hkid){
       PersonEntity foundPerson = personRepository.findByHkid(hkid);
       if(foundPerson == null){
           return null;
       }return foundPerson;

    }

    public PersonResponseData getPersonByHkid(String hkid){

        //findByHkid 這method在personRepository要寫，若要return 的object是personEntity, 要寫明。因為default 的是optional
      PersonEntity personFound = personRepository.findByHkid(hkid);

      if(personFound == null){
          return null;
      }else{
     PersonResponseData findPersonById = new PersonResponseData(personFound);
     return findPersonById;
      }

    }

}


