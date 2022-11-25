package org.seppna;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//!создали точку входа
public class SpringMain {
    public static void main(String[] args) {
        //! 1
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        // 6. можем здесь получить обект somePerson
        Person person1=context.getBean("somePerson",Person.class);
        //или   Person person1=context.getBean("person",Person.class); - если не указывали имя в Person
        // 7. здесь получаем этот же обект somePerson (т.к. он Singlton)
        Person person2=context.getBean("somePerson",Person.class);
        //или  Person person2=context.getBean("Person",Person.class);
        //person1.setFirstName("Ivan");
        //печать объекта
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("person2 == person1: " + (person2 == person1));

        // 19.
        RussianPassport passport=context.getBean("russianPassport",RussianPassport.class);
        System.out.println(passport.getCountry());


        context.close();
    }
}
