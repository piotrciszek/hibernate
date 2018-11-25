package pl.ciszek.hibernate.przyklad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRepo {

    @Autowired
    ManRepo manRepo;

    @GetMapping("/addMan")
    public void addMan(){

        Man man1 = new Man();
        man1.setName("Adam");
        man1.setSurname("Bakowski");
        man1.setAge(30);
        manRepo.save(man1);
    }
}
