package com.task.homework10;

public class User {
    private  final String name;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
    }

    public String getName() {
        return name;
    }
    public static class UserBuilder{
        private String name;



        public UserBuilder withName(String name) {
            this.name = name;
             return this;
        }
        User build(){
            return new User(this);
        }
    }
}
