package ChessDB.ChessDB;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ChessDbController {
    @Autowired
    private ChessDbService chessDbService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        chessDbService.saveUser(user);
        return "New user is added";
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = chessDbService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
}
