package com.github.aushacker.cdise;

import java.util.Set;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.inject.Inject;

public class MyApp {

    @Inject
    private User user;

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer
            .newInstance()
            .addPackages(User.class)
            .disableDiscovery()
            .initialize())
        {
            BeanManager bm = container.getBeanManager();
            Set<Bean<?>> userBeans = bm.getBeans(User.class);

            for (Bean<?> b : userBeans) {
                System.out.println(b.getBeanClass().getName());
            }
        }
    }

}

