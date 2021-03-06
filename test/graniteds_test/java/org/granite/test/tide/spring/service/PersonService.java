package org.granite.test.tide.spring.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.granite.test.tide.spring.entity.Person;
import org.granite.tide.data.DataEnabled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@DataEnabled(topic="testTopic")
public class PersonService {
	
	@PersistenceContext
	EntityManager entityManager;
    
    public void create(String lastName) {
        Person person = new Person();
        person.initIdUid(12, null);
        person.setLastName(lastName);
        entityManager.persist(person);
    }
}
