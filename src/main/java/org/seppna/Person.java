package org.seppna;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("somePerson")  // 5.1 хотим получить сразу этот объект(bean) c именем somePerson -всегда один
//@Component // id бина будет person,если не указываем конкретно имя!
@Scope("singleton")       // 5.2 у нас будет единственный объект данного класса.
//@Scope("prototype")       // 8. если хотим получать с каждым запросом еще объект(bean) Person - множество
// Scope singleton - у нас будет единственный объект данного класса.
// Scope prototype - каждый раз при вызове метода getBean создается новый объект.
public class Person {
    @Value("${person.firstName}") // + @Scope("singleton") - 11. инициализация полей из файла properties
    private String firstName;
    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.age}")
    private int age;


    // 17. создали здесь passport - теперь у нас есть Person, который зависит от Passport
    @Autowired // 21. сканирует в пакете все классы и ищет какой bean можно внедрить
    public Passport passport; //но это интерфейс-поэтому надо сделать реальную реализацию bean - см. 18.- например росс.паспорт

    // 20. создали (прав кнопк)
    public Passport getPassport() {
        return passport;
    }


    // 21.Вызывается сразу после создания бина (добавляем в каждый класс)
    @PostConstruct
    private void init() {
        System.out.println("Init person");
    }

    // 22.Вызывается перед удалением бина  (добавляем в каждый класс)
    @PreDestroy
    private void destroy() {
        System.out.println("Destroy person");
    }

    @Override // 4.
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }



        public String getFirstName() {
        return(firstName);
    }

    @Value("${person.lastName}") // 12. можно и здесь вставить
    public void setFirstName(String name) {
        this.firstName=name;
    }
}
