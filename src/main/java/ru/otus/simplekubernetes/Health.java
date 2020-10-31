package ru.otus.simplekubernetes;

import lombok.Value;

@Value
public class Health {

    private static final String HEALTH_OK = "OK";

    String status;

    public Health() {
        this.status = HEALTH_OK;
    }
}
