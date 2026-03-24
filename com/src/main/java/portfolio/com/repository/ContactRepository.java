package portfolio.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import portfolio.com.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
