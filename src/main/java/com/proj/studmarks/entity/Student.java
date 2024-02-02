package com.proj.studmarks.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "marks")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roll_number")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "maths")
    private Float maths;
    @Column(name = "science")
    private Float science;
    @Column(name = "social")
    private Float social;
    @Column(name = "english")
    private Float english;
    @Column(name = "second_lang")
    private Float second_lang;

    public Student() {

    }

    public Student(Long id, String name, String gender, Float maths, Float science, Float social, Float english, Float second_lang) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.maths = maths;
        this.science = science;
        this.social = social;
        this.english = english;
        this.second_lang = second_lang;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Float getMaths() {
        return maths;
    }

    public void setMaths(Float maths) {
        this.maths = maths;
    }

    public Float getScience() {
        return science;
    }

    public void setScience(Float science) {
        this.science = science;
    }

    public Float getSocial() {
        return social;
    }

    public void setSocial(Float social) {
        this.social = social;
    }

    public Float getEnglish() {
        return english;
    }

    public void setEnglish(Float english) {
        this.english = english;
    }

    public Float getSecond_lang() {
        return second_lang;
    }

    public void setSecond_lang(Float second_lang) {
        this.second_lang = second_lang;
    }
}
