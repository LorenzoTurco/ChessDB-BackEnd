package ChessDB.ChessDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @PostMapping("/addGame")
    public String add(@RequestBody Game game){
        gameRepository.save(game);
        return "New user is added";
    }


    @GetMapping("/getGames")
    public ResponseEntity<List<Game>> getTitles() {
        List<Game> games = gameRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(games);
    }
}
