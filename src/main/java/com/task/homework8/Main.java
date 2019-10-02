package com.task.homework8;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Reflection ex = new Reflection();
        // Change private modifier to public
        Field id = ex.getClass().getDeclaredField("id");
        id.setAccessible(true);
        // Remove final modifier
        deleteModifiersFinal(id);
        // Get and set field value
        Integer old_value = (Integer) id.get(ex);
        id.set(ex, 20);
        Integer new_value = (Integer) id.get(ex);
        // OUTPUT
        System.out.println("ex1:\n" + old_value + "\n" + new_value);
        System.out.println(ex.getId());
        Reflection ex2 = new Reflection();
        Field f2 = ex2.getClass().getDeclaredField("id");
        f2.setAccessible(true);
        // Get and set field value
        Integer old_value_2 = (Integer) f2.get(ex2);
        System.out.println("ex2:\n" + old_value_2);


        changeStaticField();
        changeStaticFinalField() ;
    }

    private static void changeStaticField() throws NoSuchFieldException, IllegalAccessException {

        Field name = Reflection.class.getDeclaredField("name");
        name.setAccessible(true);
        String find = (String) name.get(null);
        System.out.println("oldStaticFinal " + find);
        name.set(null, "Vania");
        System.out.println(new Reflection().getStaticField());


    }

    private static void changeStaticFinalField() throws NoSuchFieldException, IllegalAccessException {
        Reflection finalEx = new Reflection();
        Field age = Reflection.class.getDeclaredField("age");
        age.setAccessible(true);
        deleteModifiersFinal(age);
        Integer oldAge = (Integer) age.get(finalEx);
        age.set(finalEx,100);
        Integer newAge= (Integer) age.get(finalEx);
        System.out.println("old"+oldAge+"\n"+"new"+newAge);
        System.out.println(Reflection.age);


    }

    private static void deleteModifiersFinal(Field age) throws NoSuchFieldException, IllegalAccessException {
        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(age, age.getModifiers() & ~Modifier.FINAL);
    }

}
