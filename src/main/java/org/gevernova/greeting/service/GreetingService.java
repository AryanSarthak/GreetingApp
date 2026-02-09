package org.gevernova.greeting.service;


import org.gevernova.greeting.model.Greeting;
import java.util.List;

public interface GreetingService {
    String getGreeting(String firstName, String lastName);
    Greeting saveGreeting(String message);
    Greeting getGreetingById(long id);
    List<Greeting> getAllGreetings();
    Greeting updateGreeting(long id, String message);
    void deleteGreeting(long id);
}

