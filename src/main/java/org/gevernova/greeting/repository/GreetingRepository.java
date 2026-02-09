package org.gevernova.greeting.repository;


import org.gevernova.greeting.model.Greeting;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GreetingRepository {

    private final Map<Long, Greeting> store = new HashMap<>();
    private long counter = 1;

    public Greeting save(String message) {
        Greeting g = new Greeting(counter++, message);
        store.put(g.getId(), g);
        return g;
    }

    public Greeting findById(long id) {
        return store.get(id);
    }

    public List<Greeting> findAll() {
        return new ArrayList<>(store.values());
    }

    public Greeting update(long id, String message) {
        Greeting g = store.get(id);
        if (g != null) {
            g.setMessage(message);
        }
        return g;
    }

    public void delete(long id) {
        store.remove(id);
    }
}

