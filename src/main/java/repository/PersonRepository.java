package repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.acme.model.Person;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import org.bson.types.ObjectId;

@ApplicationScoped
public class PersonRepository implements PanacheMongoRepository<Person> {
    public List<Person> getAll(){
        List<Person> allPersons = Person.listAll();
        return allPersons;
    }

    public Person getById(String id){
        ObjectId personId = new ObjectId(id);
        return Person.findById(personId);
    }

    public Long totalPerson(){
        return Person.count();
    }
    public boolean deleteById(String id){
        ObjectId personId = new ObjectId(id);
        boolean deleted = Person.deleteById(personId);
        return deleted;
    }

    public Person createPerson(Person person) {
        person.persist();
        return person;
    }
}
