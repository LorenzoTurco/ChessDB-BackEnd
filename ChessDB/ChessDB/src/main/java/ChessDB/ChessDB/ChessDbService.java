package ChessDB.ChessDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChessDbService {

    @Autowired
    private ChessDbRepository userRepository;

    public User saveUser(User user) {

        return userRepository.save(user);
    }


    public List<User> getAll() {
        List<User> users = userRepository.findAll();
        return users;
    }
}