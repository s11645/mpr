package repozytorium.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import serwis.encja;
import serwis.klient;

public class KlientBuilder implements IEncjaBuilder{

	@Override
	public encja build(ResultSet rs) throws SQLException {
		klient Klient = new klient();
		Klient.setImie(rs.getString("imie"));
		Klient.setNazwisko(rs.getString("nazwisko"));
		Klient.setKontobankowe(rs.getString("konto"));
		Klient.setId(rs.getInt("id"));
		return Klient;
	}

}
