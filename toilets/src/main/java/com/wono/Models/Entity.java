package com.wono.Models;

import java.util.UUID;

public abstract class Entity {
    private String id;

    /**
     * This function returns the id of the current object
     * 
     * @return The id of the object.
     */
    public String getId() {
        return this.id;
    }

    public Entity() {
        this.id = UUID.randomUUID().toString();
    }
}
