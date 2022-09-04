package ChessDB.ChessDB;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user;

    @OneToMany(mappedBy = "userId")
    private List<Fen> fen;

    @OneToMany(mappedBy = "userId")
    private List<Fen> title;

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
