package repozytorium;

import java.util.List;

public interface IRepozytorium<TEncja>
{
	public void zapisz(TEncja encja);
	public void modyfikuj(TEncja encja);
	public void usun(TEncja encja);
	public TEncja get(int id);
	public List<TEncja> getall();
}
