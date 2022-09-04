package ChessDB.ChessDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class FenController {
        @Autowired
        private FenRepository fenRepository;

        @PostMapping("/addFen")
        public String add(@RequestBody Fen fen){
           fenRepository.save(fen);
           return "New user is added";
        }

        @GetMapping("/getFens")
        public ResponseEntity<List<Fen>> getUsers() {
            List<Fen> fens = fenRepository.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(fens);
        }
}
