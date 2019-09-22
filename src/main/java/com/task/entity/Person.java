package com.task.entity;

import java.time.LocalDate;

public class Person {
    private final int id;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final LocalDate birthday;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }



    Person(PersonBuilder personBuilder){
        this.id=personBuilder.id;
        this.name=personBuilder.name;
        this.surname=personBuilder.surname;
        this.patronymic=personBuilder.patronymic;
        this.birthday=personBuilder.birthday;
    }

    public Person(Person person) {
        this.id=person.id;
        this.name=person.name;
        this.surname=person.surname;
        this.patronymic=person.patronymic;
        this.birthday=person.birthday;;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public static class PersonBuilder{
        private  int id;
        private  String name;
        private  String surname;
        private  String patronymic;
        private  LocalDate birthday;

        public PersonBuilder withId(int id) {
            if (id<0){
                throw new IllegalArgumentException("Id<0");
            }
            this.id = id;
            return this;
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder withPatronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }

        public PersonBuilder withBirthday(LocalDate birthday) {
            if(birthday.getYear()<1920||birthday.getYear()>LocalDate.now().getYear()){
                throw new IllegalArgumentException("Year must be in range 1920 to 2019");
            }
            this.birthday = birthday;
            return this;
        }

        public Person build(){
           return new Person(this);
        }
    }
}
