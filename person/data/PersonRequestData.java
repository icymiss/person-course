package com.example.lab_b03_re_redo.person.data;

import com.example.lab_b03_re_redo.person.dto.PersonRequestDto;

public class PersonRequestData {
    private String hkid;
    private String firstName;
    private String lastName;

    public PersonRequestData(PersonRequestDto createPersonDto){
        this.hkid=createPersonDto.getHkid();
        this.firstName= createPersonDto.getFirstName();
        this.lastName= createPersonDto.getLastName();
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
