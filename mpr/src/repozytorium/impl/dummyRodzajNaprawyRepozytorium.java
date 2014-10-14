package repozytorium.impl;

import java.util.*;

import repozytorium.*;
import serwis.*;

public class dummyRodzajNaprawyRepozytorium implements IRepozytorium<rodzajnaprawy>
{
	private dummydb db;

	public dummyRodzajNaprawyRepozytorium(dummydb db) 
	{
		super();
		this.db = db;
	}

	@Override
	public void zapisz(rodzajnaprawy encja) 
	{
		db.naprawy.add(encja);
	}

	@Override
	public void modyfikuj(rodzajnaprawy encja) 
	{
		
	}

	@Override
	public void usun(rodzajnaprawy encja) 
	{
		db.naprawy.remove(encja);
	}

	@Override
	public rodzajnaprawy get(int id) 
	{
		for(rodzajnaprawy k: db.naprawy)
			if(k.getId()==id)
				return k;
		return null;
	}

	@Override
	public List<rodzajnaprawy> getall() 
	{
		return db.naprawy;
	}
	
}
