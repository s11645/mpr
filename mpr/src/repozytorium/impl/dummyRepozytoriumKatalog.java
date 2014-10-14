package repozytorium.impl;

import serwis.*;
import repozytorium.*;


public class dummyRepozytoriumKatalog implements IRepozytoriumKatalog
{
	private dummydb db = new dummydb();
	
	@Override
	public IKlientRepozytorium getKlient() 
	{
		return new dummyKlientRepozytorium(db);
	}

	@Override
	public ISprzetRepozytorium getSprzet() 
	{
		return new dummySprzetRepozytorium(db);
	}

	@Override
	public IZamowienieRepozytorium getZamowienie() 
	{
		return new dummyZamowienieRepozytorium(db);
	}

	@Override
	public IRepozytorium<serwisant> getSerwisant() 
	{
		return new dummySerwisantRepozytorium(db);
	}

	@Override
	public IRepozytorium<rodzajnaprawy> getNaprawa() 
	{
		return new dummyRodzajNaprawyRepozytorium(db);
	}
	
	
}
