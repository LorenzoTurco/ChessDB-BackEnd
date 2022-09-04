package ChessDB.ChessDB;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;

    @PostMapping("/addTitle")
    public String add(@RequestBody Title title){
        titleRepository.save(title);
        return "New title added";
    }

    @GetMapping("/getTitles")
    public ResponseEntity<List<Title>> getTitles() {
        List<Title> titles = titleRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(titles);
    }
}
