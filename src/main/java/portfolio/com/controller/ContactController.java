package portfolio.com.controller;


import org.springframework.web.bind.annotation.*;
import portfolio.com.entity.Contact;
import portfolio.com.repository.ContactRepository;

@RestController
@CrossOrigin
public class ContactController {

    private ContactRepository repository;

    ContactController(ContactRepository repository){
        this.repository=repository;
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
