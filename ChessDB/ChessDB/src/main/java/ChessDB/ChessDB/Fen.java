package ChessDB.ChessDB;

import javax.persistence.*;

@Entity
public class Fen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fenId; //primary key of each FEN

    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId; //connects the 2 tables
    private String fen;

    public Fen(){}

    public String getFen() {
        return fen;
    }

    public void setFen(String fen) {
        this.fen = fen;
    }
}
