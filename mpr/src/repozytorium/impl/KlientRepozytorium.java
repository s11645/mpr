package repozytorium.impl;

import java.sql.*;


import repozytorium.*;
import serwis.*;

public class KlientRepozytorium extends Repozytorium<klient>
{
	protected String insertSql=
			"INSERT INTO klient(imie,nazwisko,konto)"
			+ "VALUES(?,?,?)";
	
	protected String updateSql=
			"UPDATE klient SET (imie,nazwisko,konto)=(?,?,?) WHERE id=?";
	
	
	
public KlientRepozytorium(Connection connection, IEncjaBuilder<klient> builder)
{
	super(connection, builder);
}
		
	

@Override
protected String getTableName()
{
	return "klienci";
}
	
	
@Override

protected String getUpdateQuery()
{
	return updateSql;
}

@Override

protected String getInsertQuery()
{
	return insertSql;
}

@Override
protected void setUpInsertQuery(klient encja) throws SQLException
{
	insert.setString(1, encja.getImie());
	insert.setString(2, encja.getNazwisko());
	insert.setString(3, encja.getKontobankowe());
}

@Override
protected void setUpUpdateQuery(klient encja) throws SQLException
{
	update.setString(1, encja.getImie());
	update.setString(2, encja.getNazwisko());
	update.setString(3, encja.getKontobankowe());
	update.setInt(4, encja.getId());
	
}
	
	
}
