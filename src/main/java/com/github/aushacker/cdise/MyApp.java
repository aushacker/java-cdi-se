package com.github.aushacker.cdise;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.inject.Inject;

public class MyApp {

    public static void main(String[] args) {

//    @Inject
//    User user;

        SeContainerInitializer containerInit = SeContainerInitializer.newInstance();
        SeContainer container = containerInit.initialize();
        System.out.println("Hello world!");
    }

}

