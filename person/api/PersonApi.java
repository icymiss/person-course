package com.example.lab_b03_re_redo.person.api;

import com.example.lab_b03_re_redo.person.PersonService;
import com.example.lab_b03_re_redo.person.data.PersonRequestData;
import com.example.lab_b03_re_redo.person.data.PersonResponseData;
import com.example.lab_b03_re_redo.person.dto.PersonRequestDto;
import com.example.lab_b03_re_redo.person.dto.PersonResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/person")
public class PersonApi {
    private final PersonService personService;
    @Autowired

    public PersonApi(PersonService personService){this.personService=personService;
    }

    @PostMapping("/create")
    public PersonResponseDto createPerson(@RequestBody PersonRequestDto createPersonDto){
        PersonRequestData createPersonData = new PersonRequestData(createPersonDto);
       PersonResponseData createdPersonData = personService.createPerson(createPersonData);
       PersonResponseDto createdPersonDto = new PersonResponseDto(createdPersonData);
       return createdPersonDto;
    }

    @GetMapping("/all")
    public List<PersonResponseDto> getAllPersonApi(){
        List<PersonResponseDto> getAllPersonDtoList = new ArrayList<>();

        for(PersonResponseData personResponseData : personService.getAllPerson()){
          PersonResponseDto getAllPersonDto = new PersonResponseDto(personResponseData);
          getAllPersonDtoList.add(getAllPersonDto);
        }
        return getAllPersonDtoList;
    }

    @GetMapping("/{hkid}")
    public PersonResponseDto getPersonByHkid(@PathVariable String hkid){
       PersonResponseData findPersonById =  personService.getPersonByHkid(hkid);
      PersonResponseDto findPersonByIdDto= new PersonResponseDto(findPersonById);
      return findPersonByIdDto;
    }

    @PutMapping("/{hkid}")
    public PersonResponseDto updatePersonByHkid(@PathVariable String hkid,
                                                @RequestBody PersonRequestDto updatePerson){
      PersonRequestData updatePersonData =  new PersonRequestData(updatePerson);

        PersonResponseData updatedPersonData= personService.updatePersonByHkid(updatePersonData);

        return new PersonResponseDto(updatedPersonData);
    }

//    @DeleteMapping("/delete/{hkid}")
//    public PersonResponseDto deletePersonByHkid(@PathVariable String hkid){
//
//                PersonResponseData deletedPerson =personService.deletePersonByHkid(hkid);
//                return new PersonResponseDto(deletedPerson);
//
//    }
}
