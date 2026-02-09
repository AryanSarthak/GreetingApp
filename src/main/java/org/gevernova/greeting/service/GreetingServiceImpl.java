package org.gevernova.greeting.service;


import org.gevernova.greeting.model.Greeting;
import org.gevernova.greeting.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingRepository repository;

    @Override
    public String getGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null)
            return "Hello " + firstName + " " + lastName;
        if (firstName != null)
            return "Hello " + firstName;
        if (lastName != null)
            return "Hello " + lastName;
        return "Hello World";
    }

    @Override
    public Greeting saveGreeting(String message) {
        return repository.save(message);
    }

    @Override
    public Greeting getGreetingById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Greeting> getAllGreetings() {
        return repository.findAll();
    }

    @Override
    public Greeting updateGreeting(long id, String message) {
        return repository.update(id, message);
    }

    @Override
    public void deleteGreeting(long id) {
        repository.delete(id);
    }
}

