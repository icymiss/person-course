package com.example.lab_b03_re_redo.person.entity;

import com.example.lab_b03_re_redo.course.entity.CourseEntity;
import com.example.lab_b03_re_redo.person.data.PersonRequestData;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Person")
public class PersonEntity {
    @Id
    private String hkid;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "teacher")
    private List<CourseEntity> courseTeaching;   //因為courses 是many，有List<>

    @ManyToMany(mappedBy = "students")
    private List<CourseEntity> courses;



   public PersonEntity(){

   }

    public PersonEntity(PersonRequestData createPersonData){
        this.hkid=createPersonData.getHkid();
        this.firstName=createPersonData.getFirstName();
        this.lastName= createPersonData.getLastName();
    }



    public String getHkid() {
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
