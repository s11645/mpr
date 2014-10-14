package repozytorium;

import java.util.List;

import serwis.*;

public interface ISprzetRepozytorium extends IRepozytorium<sprzet>
{
	public List<sprzet> withrodzajnaprawy(rodzajnaprawy rn);
	public List<sprzet> withrodzajnaprawy(String nazwa);
	public List<sprzet> withrodzajnaprawy(float koszt);
}
