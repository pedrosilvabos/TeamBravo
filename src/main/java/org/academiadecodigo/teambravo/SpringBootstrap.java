package org.academiadecodigo.teambravo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class SpringBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    /**
     * An {@link ApplicationListener} implementation that is notified on each {@link ContextRefreshedEvent}
     */


    /**
     * Prints the application active profiles
     *
     * @see ApplicationListener#onApplicationEvent(ApplicationEvent)
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        System.getProperties().setProperty("spring.profiles.active", "prod");

        String[] profiles = event.getApplicationContext().getEnvironment().getActiveProfiles();

        System.out.println("#### Active Profiles: ####");
        for (String profile : profiles) {
            System.out.println("=> " + profile);
        }
    }
}


