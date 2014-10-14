package repozytorium;

import java.util.List;

import serwis.*;

public interface IKlientRepozytorium extends IRepozytorium<klient>
{
	public List<klient> withzamowienie(zamowienie zam);
}
