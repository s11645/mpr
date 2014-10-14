package repozytorium;

import serwis.*;

public interface IRepozytoriumKatalog
{
	public IKlientRepozytorium getKlient();
	public ISprzetRepozytorium getSprzet();
	public IZamowienieRepozytorium getZamowienie();
	public IRepozytorium<serwisant> getSerwisant();
	public IRepozytorium<rodzajnaprawy> getNaprawa();
}
