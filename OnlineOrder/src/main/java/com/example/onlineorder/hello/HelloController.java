package com.example.onlineorder.hello;

import net.datafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping("/hello")
    public Person sayHello(@RequestParam(required = false) String name) {
        if(name == null) {
            name = "Qi";
        }
        Faker faker = new Faker();
        //String name = faker.name().fullName();
        String company = faker.company().name();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String bookTitle = faker.book().title();
        String bookAuthor = faker.book().author();


        return new Person(name, company, new Address(street, city, state, "USA"), new Book(bookTitle, bookAuthor));
    }
}




