package org.seppna;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration                                     // 2. Аннотация, которая говорит что данный класс является конфигурацией
@ComponentScan("org.seppna")                       // 3. Пакет, в котором спринг будет искать бины
@PropertySource("classpath:person.properties")     // 10. Файл в папке resources, отвечающий за конфиг каких-то полей
public class SpringConfig {
    //Можем здесь внедрить зависимости другие



}
