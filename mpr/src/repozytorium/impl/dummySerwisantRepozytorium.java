package repozytorium.impl;

import java.util.*;

import repozytorium.*;
import serwis.*;

public class dummySerwisantRepozytorium implements IRepozytorium<serwisant>
{
	private dummydb db;

	public dummySerwisantRepozytorium(dummydb db) 
	{
		super();
		this.db = db;
	}

	@Override
	public void zapisz(serwisant encja) 
	{
		db.serwisanci.add(encja);
	}

	@Override
	public void modyfikuj(serwisant encja) 
	{
		
	}

	@Override
	public void usun(serwisant encja) 
	{
		db.serwisanci.remove(encja);
	}

	@Override
	public serwisant get(int id) 
	{
		for(serwisant k: db.serwisanci)
			if(k.getId()==id)
				return k;
		return null;
	}

	@Override
	public List<serwisant> getall() 
	{
		return db.serwisanci;
	}
	
}
