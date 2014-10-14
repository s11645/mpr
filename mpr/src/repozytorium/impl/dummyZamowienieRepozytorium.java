package repozytorium.impl;

import java.util.*;

import repozytorium.*;
import serwis.*;

public class dummyZamowienieRepozytorium implements IZamowienieRepozytorium
{
	private dummydb db;

	public dummyZamowienieRepozytorium(dummydb db) {
		super();
		this.db = db;
	}

	@Override
	public void zapisz(zamowienie encja) 
	{
		db.zamowienia.add(encja);
	}

	@Override
	public void modyfikuj(zamowienie encja) 
	{
		
	}

	@Override
	public void usun(zamowienie encja) 
	{
		db.zamowienia.remove(encja);
	}

	@Override
	public zamowienie get(int id) 
	{
		for(zamowienie z: db.zamowienia)
			if(z.getId()==id)
				return z;
		return null;
	}

	@Override
	public List<zamowienie> getall() 
	{
		return db.zamowienia;
	}

	@Override
	public List<zamowienie> withklient(klient kl) 
	{
		return withklient(kl.getId());
	}

	@Override
	public List<zamowienie> withklient(String klientnazwisko) 
	{
		for(klient r:db.klienci)
			if(r.getNazwisko().equals(klientnazwisko))
				return r.getZamowienia();
		return new ArrayList<zamowienie>();
	}

	@Override
	public List<zamowienie> withklient(int klientID) 
	{
		for(klient r:db.klienci)
			if(r.getId() == klientID)
				return r.getZamowienia();
		return new ArrayList<zamowienie>();
	}
	
	
}
