package com.task2;

public class User implements  Comparable<User>{
    //public static  final Comparable<User> MAIN_COMPARABLE=(user1, user2)-> user1.age-user2.age;
    public String name;
    public String surname;
    public int age;

    @Override
    public int compareTo(User o) {
        return this.age-o.age;
    }
    final class Utillity{
        private Utillity() {
        }
    }
}
