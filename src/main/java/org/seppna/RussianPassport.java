package org.seppna;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// 14. создали на основе интерфейса конкретную реализацию bean
// 18. + @Component - тогда будет вставляться русс паспорт
@Component //id бина будет russianPassport - рождается от RussianPassport
public class RussianPassport implements Passport{

    // 21.Вызывается сразу после создания бина (добавляем в каждый класс)
    @PostConstruct
    private void init() {
        System.out.println("Init Russion");
    }

    // 22.Вызывается перед удалением бина  (добавляем в каждый класс)
    @PreDestroy
    private void destroy() {
        System.out.println("Destroy Russion");
    }


    @Override
    public String getCountry(){
        return "Russion Federation";
    }
}
