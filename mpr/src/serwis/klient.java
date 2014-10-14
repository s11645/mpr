package serwis;

import java.util.*;

public class klient extends encja
{
private String imie;
private String nazwisko;
private String kontobankowe;
private List<zamowienie> zamowienia;

public klient()
{
	zamowienia = new ArrayList<zamowienie>();
}

public String getImie()
{
	return imie;
}

public void setImie(String imie)
{
	this.imie = imie;
}

public String getNazwisko()
{
	return nazwisko;
}

public void setNazwisko(String nazwisko)
{
	this.nazwisko = nazwisko;
}

public String getKontobankowe()
{
	return kontobankowe;
}

public void setKontobankowe(String kontobankowe)
{
	this.kontobankowe = kontobankowe;
}

}
