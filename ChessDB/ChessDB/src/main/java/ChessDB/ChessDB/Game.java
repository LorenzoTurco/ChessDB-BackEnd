package ChessDB.ChessDB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId; //connects the 2 tables
    private String title;
    private String fen;
    private Timestamp dateCreated;

    public Game(){
        this.dateCreated = new Timestamp(new Date().getTime());
    };


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFen() {
        return fen;
    }

    public void setFen(String fen) {
        this.fen = fen;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }
}
