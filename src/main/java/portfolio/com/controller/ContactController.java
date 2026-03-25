package portfolio.com.controller;


import org.springframework.web.bind.annotation.*;
import portfolio.com.entity.Contact;
import portfolio.com.repository.ContactRepository;

import java.util.List;

@RestController
@CrossOrigin(origins ="https://velvety-lokum-04c5de.netlify.app/")
public class ContactController {

    private ContactRepository repository;

    ContactController(ContactRepository repository){
        this.repository=repository;
    }

    @GetMapping("/contact")
    public List<Contact> getAllMessages() {
        return repository.findAll();
    }

    @GetMapping("/")
    public String home() {
        return "App is running!";
    }

    @PostMapping("/contact")
    public Contact saveMessage(@RequestBody Contact contact) {

        return repository.save(contact);
    }
}
