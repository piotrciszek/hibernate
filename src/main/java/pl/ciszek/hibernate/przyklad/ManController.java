package pl.ciszek.hibernate.przyklad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ManController {

    /*@Autowired
    ManRepo manRepo;*/
    private ManService manService;

    public ManController(ManService manService) {
        this.manService = manService;
    }

    @PostMapping("/addManPostman")
    public ResponseEntity<Man> addMan(@RequestBody AddManDto addManDto){
        Man createMan = manService.createMan(addManDto);
        return ResponseEntity.ok(createMan);
    }


    /*@PostMapping("/addMan")
    public void addMan(){

        Man man1 = new Man();
        man1.setName("Adam");
        man1.setSurname("Bakowski");
        man1.setAge(30);
        manRepo.save(man1);
    }*/
}
