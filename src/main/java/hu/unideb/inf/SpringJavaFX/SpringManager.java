package hu.unideb.inf.SpringJavaFX;

import hu.unideb.inf.SpringJavaFX.frontend.Manager;
import hu.unideb.inf.SpringJavaFX.model.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringManager implements Manager {

    private ConfigurableApplicationContext ctx;

    @Override
    public void start() {
        ctx = SpringApplication.run(SpringJavaFxApplication.class);
    }

    @Override
    public void stop() {
        ctx.close();
    }

    @Override
    public String getPersonName() {
        PersonRepository repo =
                (PersonRepository) ctx.getBean(PersonRepository.class);
        return repo.findByName("Anna").get(0).getName();
    }
}
