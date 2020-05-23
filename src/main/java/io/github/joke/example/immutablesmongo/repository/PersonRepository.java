package io.github.joke.example.immutablesmongo.repository;

import io.github.joke.example.immutablesmongo.repository.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PersonRepository extends MongoRepository<Person, UUID> {
}
