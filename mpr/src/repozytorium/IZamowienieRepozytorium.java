package repozytorium;

import java.util.List;

import serwis.*;

public interface IZamowienieRepozytorium extends IRepozytorium<zamowienie>
{
	public List<zamowienie> withklient(klient kl);
	public List<zamowienie> withklient(String klientnazwisko);
	public List<zamowienie> withklient(int klientID);
}
