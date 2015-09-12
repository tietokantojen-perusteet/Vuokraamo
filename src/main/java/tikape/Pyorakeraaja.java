/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikape;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Pyorakeraaja implements Collector<Pyora> {

    @Override
    public Pyora collect(ResultSet rs) throws SQLException {
        return new Pyora(rs.getString("rekisterinumero"), rs.getString("merkki"));
    }

}
