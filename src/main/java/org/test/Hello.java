package org.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Hello {
    private static final Logger log = LoggerFactory.getLogger(Hello.class);

    private String name;
    private String message;

    public void createMessage() {
        log.info("Name submitted.");
        message = "Hello, " + name + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }
}