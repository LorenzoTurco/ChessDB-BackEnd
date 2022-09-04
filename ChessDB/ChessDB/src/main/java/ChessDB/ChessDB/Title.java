package ChessDB.ChessDB;

import javax.persistence.*;

@Entity
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int titleId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId; //connects the 2 tables
    private String title;

    public Title(){};

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}
