package serwis;

import java.util.*;

public class rodzajnaprawy extends encja
{
	private String nazwa;
	private String czasnaprawy;
	private float koszt;
	private List<sprzet> sprzet;

	public String getNazwa()
	{
		return nazwa;
	}

	public void setNazwa(String nazwa)
	{
		this.nazwa = nazwa;
	}

	public String getCzasnaprawy()
	{
		return czasnaprawy;
	}

	public void setCzasnaprawy(String czasnaprawy)
	{
		this.czasnaprawy = czasnaprawy;
	}

	public float getKoszt()
	{
		return koszt;
	}

	public void setKoszt(float koszt)
	{
		this.koszt = koszt;
	}

	public List<sprzet> getSprzet() 
	{
		return sprzet;
	}

	public void setSprzet(List<sprzet> sprzet) 
	{
		this.sprzet = sprzet;
	}

}
