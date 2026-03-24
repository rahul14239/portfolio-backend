package portfolio.com.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.com.entity.Contact;
import portfolio.com.repository.ContactRepository;

@RestController
@CrossOrigin
public class ContactController {

    private ContactRepository repository;

    ContactController(ContactRepository repository){
        this.repository=repository;
    }

    @PostMapping("/contact")
    public Contact saveMessage(@RequestBody Contact contact) {

        return repository.save(contact);
    }
}
