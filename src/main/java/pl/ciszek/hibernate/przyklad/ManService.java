package pl.ciszek.hibernate.przyklad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ManService {

    private ManRepository manRepository;
    private Connection connection;

    @Autowired
    public ManService(ManRepository manRepository) {
        this.manRepository = manRepository;
    }

    public Man createMan(AddManDto addManDto){
        Man man = new Man(addManDto.getMan_name(), addManDto.getMan_surname(), addManDto.getMan_age());
        man = manRepository.save(man);
        return man;
    }

}
