package com.example.lab_b03_re_redo.person.dto;

import com.example.lab_b03_re_redo.person.data.PersonResponseData;

public class PersonResponseDto {
    private String hkid;
    private String firstName;
    private String lastName;

    public PersonResponseDto(PersonResponseData createdPersonData){
        this.hkid= createdPersonData.getHkid();
        this.firstName= createdPersonData.getFirstName();
        this.lastName= createdPersonData.getLastName();
    }
    public String getHkid(){
        return hkid;
    }

    public void setHkid(String hkid){
        this.hkid=hkid;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
}
