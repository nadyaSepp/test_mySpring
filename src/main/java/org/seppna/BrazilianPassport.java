package org.seppna;

// 16. создали на основе интерфейса конкретную реализацию bean

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BrazilianPassport implements Passport{
    // 21.Вызывается сразу после создания бина (добавляем в каждый класс)
    @PostConstruct
    private void init() {
        System.out.println("Init Brazilian");
    }

    // 22.Вызывается перед удалением бина  (добавляем в каждый класс)
    @PreDestroy
    private void destroy() {
        System.out.println("Destroy Brazilian");
    }

    @Override
    public String getCountry() {
        return "Brazilian Passport";
    }
}
