package ChessDB.ChessDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;


    public Game getById(int id){
        Game game = gameRepository.findById(id).orElse(null);
        return game;
    }

    public boolean deleteById(int id){
        Game gameToDelete = gameRepository.findById(id).orElse(null);

        if(gameToDelete == null){
            return false;
        }

        gameRepository.delete(gameToDelete);
        return true;

    }


    public boolean updateById( int id, Game game){

        Game gameToUpdate = gameRepository.findById(id).orElse(null);

        if(gameToUpdate == null){
            return false;
        }

        gameToUpdate.setFen(game.getFen());
        gameToUpdate.setTitle(game.getTitle());

        gameRepository.save(gameToUpdate);
        return true;


    }
}
