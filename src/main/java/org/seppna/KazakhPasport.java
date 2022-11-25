package org.seppna;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// 15. создали на основе интерфейса конкретную реализацию bean
public class KazakhPasport implements Passport{

    // 21.Вызывается сразу после создания бина (добавляем в каждый класс)
    @PostConstruct
    private void init() {
        System.out.println("Init Kazakh");
    }

    // 22.Вызывается перед удалением бина  (добавляем в каждый класс)
    @PreDestroy
    private void destroy() {
        System.out.println("Destroy Kazakh");
    }

    @Override
    public String getCountry(){
        return "Kazakh Federation";
    }
}
