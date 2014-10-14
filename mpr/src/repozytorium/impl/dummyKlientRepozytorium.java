package repozytorium.impl;

import java.util.*;

import serwis.*;
import repozytorium.*;

public class dummyKlientRepozytorium implements IKlientRepozytorium
{

	private dummydb db;

	public dummyKlientRepozytorium(dummydb db)
	{
		super();
		this.db = db;
	}

	@Override
	public void zapisz(klient encja)
	{
		db.klienci.add(encja);
	}

	@Override
	public void modyfikuj(klient encja)
	{

	}

	@Override
	public void usun(klient encja)
	{
		db.klienci.remove(encja);
	}

	@Override
	public klient get(int id)
	{
		for(klient k: db.klienci)
			if(k.getId()==id)
				return k;
		return null;
	}

	@Override
	public List<klient> getall()
	{
		return db.klienci;
	}

	/*@Override
	public List<klient> withzamowienie(zamowienie zam)
	{
		return withzamowienie(zam.getId());
	}*/

}
