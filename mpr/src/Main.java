import java.sql.*;
import java.util.*;

import repozytorium.impl.*;
import repozytorium.*;
import serwis.*;


public class Main
{

	public static void main(String[] args)
	{
		String url = "jdbc:hsqldb:hsql://localhost/workdb";
		klient jnowak = new klient();
		jnowak.setImie("Jan");
		jnowak.setNazwisko("Nowak");
		jnowak.setKontobankowe("12123412341234123412341234");
		
	try 
	{
			
		Connection connection = DriverManager.getConnection(url);
		
		String createTableSql = 
				"CREATE TABLE klient("
				+ "id int,"
				+ "imie VARCHAR(20),"
				+ "nazwisko VARCHAR(20),"
				+ "konto VARCHAR(26)"
				+ ")";
		Statement createTable = connection.createStatement();
		createTable.executeUpdate(createTableSql);
		
		
		IRepozytorium<klient> klient = new KlientRepozytorium(connection, new KlientBuilder());
		klient.zapisz(jnowak);
		List<klient> klienciFromDb= klient.getall();
		
		for(klient klientFromDb: klienciFromDb)
			System.out.println(klientFromDb.getId()+" "+klientFromDb.getImie()+" "+klientFromDb.getNazwisko()+" "+klientFromDb.getKontobankowe());
		
		//klient k = klient.get(2);
		//k.setNazwisko("1qaz2wsx");
		//klient.modyfikuj(k);
		//klient.usun(klienciFromDb.get(0));
		
		for(klient userFromDb: klient.getall())
			System.out.println(userFromDb.getId()+" "+userFromDb.getImie()+" "+userFromDb.getNazwisko()+" "+userFromDb.getKontobankowe());
		
		
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	System.out.println("koniec");
		
		IRepozytoriumKatalog katalog = new dummyRepozytoriumKatalog();
		
		
	}

}
