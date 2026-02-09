package org.gevernova.greeting.controller;


import org.gevernova.greeting.model.Greeting;
import org.gevernova.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService service;

    //Return JSON for GET
    @GetMapping
    public String hello() {
        return "Hello World";
    }

    //  Using Service Layer
    @GetMapping("/service")
    public String helloService() {
        return service.getGreeting(null, null);
    }

    // Greeting with names
    @GetMapping("/user")
    public String greetingUser(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        return service.getGreeting(firstName, lastName);
    }

    //  Save greeting
    @PostMapping
    public Greeting saveGreeting(
            @RequestParam String message) {

        return service.saveGreeting(message);
    }

    // Find greeting by ID
    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable long id) {
        return service.getGreetingById(id);
    }

    // List all greetings
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return service.getAllGreetings();
    }

    // Edit greeting
    @PutMapping("/{id}")
    public Greeting updateGreeting(
            @PathVariable long id,
            @RequestParam String message) {

        return service.updateGreeting(id, message);
    }

    //  Delete greeting
    @DeleteMapping("/{id}")
    public String deleteGreeting(@PathVariable long id) {
        service.deleteGreeting(id);
        return "Greeting deleted";
    }
}

