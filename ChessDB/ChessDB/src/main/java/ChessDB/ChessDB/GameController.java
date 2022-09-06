package ChessDB.ChessDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

@CrossOrigin
@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameService greetingService;

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

    @DeleteMapping("/deleteGame/{id}")
    public ResponseEntity deleteGreeting(@PathVariable String id) {

        boolean isDeleted = greetingService.deleteById(parseInt(id));

        if (!isDeleted) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Couldn't find a greeting to delete with that id");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Greeting deleted successfully");
    }
}
