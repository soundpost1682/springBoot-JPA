package com.example.demo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class HW2 {
    private Integer age;
    private String name;

    public void plus_one_year() {
        this.age = this.age + 1;
    }

    public void set_age(Integer ag) {
        this.age = ag;


    var a = new HW2();
    a.setName("evy");
    a.setAge(60);
    a.set_age(20);
    a.plus_one_year();
    System.out.println(a.getAge());
}
}