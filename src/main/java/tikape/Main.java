package tikape;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Database database = new Database("org.sqlite.JDBC", "jdbc:sqlite:vuokraamo.db");
        database.setDebugMode(true);

        database.update("INSERT INTO Pyora (rekisterinumero, merkki) VALUES ('AKU-313', 'Belchfire Runabout')");

        List<Pyora> pyorat = database.queryAndCollect("SELECT * FROM Pyora", new Pyorakeraaja());

        for (Pyora pyora : pyorat) {
            System.out.println(pyora.getMerkki());
        }
    }
}
