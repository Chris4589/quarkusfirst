package org.acme.model;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;

@MongoEntity(collection = "Personas")
public class Person extends PanacheMongoEntity {
    
    public String name;
    public String lastname;
    public Integer age;
    public String location;

    public Person(){}

    public Person(String name, String lastname, Integer age, String location) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.location = location;
    }
}
