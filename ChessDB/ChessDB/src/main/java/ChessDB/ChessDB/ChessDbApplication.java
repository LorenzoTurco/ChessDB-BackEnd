package ChessDB.ChessDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ChessDbApplication {

	public static void main(String[] args)

	{
		SpringApplication.run(ChessDbApplication.class, args);
	}

}
