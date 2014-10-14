package repozytorium.impl;

import java.util.*;

import repozytorium.*;
import serwis.*;

public class dummySprzetRepozytorium implements ISprzetRepozytorium
{
	dummydb db;

	public dummySprzetRepozytorium(dummydb db) 
	{
		super();
		this.db = db;
	}

	@Override
	public void zapisz(sprzet encja) 
	{
		db.sprzet.add(encja);
	}

	@Override
	public void modyfikuj(sprzet encja) 
	{
		
	}

	@Override
	public void usun(sprzet encja) 
	{
		db.sprzet.remove(encja);
	}

	@Override
	public sprzet get(int id) 
	{
		for(sprzet z: db.sprzet)
			if(z.getId()==id)
				return z;
		return null;
	}

	@Override
	public List<sprzet> getall() 
	{
		return db.sprzet;
	}

	@Override
	public List<sprzet> withrodzajnaprawy(rodzajnaprawy rn) 
	{
		return withrodzajnaprawy(rn.getId());
	} 	

	@Override
	public List<sprzet> withrodzajnaprawy(String nazwa) 
	{
		for(rodzajnaprawy r:db.naprawy)
			if(r.getNazwa().equals(nazwa))
				return r.getSprzet();
		return new ArrayList<sprzet>();
	}

	@Override
	public List<sprzet> withrodzajnaprawy(float koszt) 
	{
		for(rodzajnaprawy z: db.naprawy)
			if(z.getKoszt() == koszt)
				return z.getSprzet();
		return null;
	}
	
	
}
