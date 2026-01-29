package org.gevernova.messagingapp.controller;


import org.gevernova.messagingapp.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }


    @GetMapping("/hello/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }


    @GetMapping("/hello/param/{name}")
    public String helloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/hello/post")
    public String helloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " +
                user.getLastName() + " from BridgeLabz";
    }


    @PutMapping("/hello/put/{firstName}")
    public String helloPut(
            @PathVariable String firstName,
            @RequestParam String lastName) {

        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
