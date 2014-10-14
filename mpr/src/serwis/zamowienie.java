package serwis;

import java.util.*;

public class zamowienie extends encja
{
	private float kwota;
	private String dataprzyjecia;
	private String datawykonania;
	private List<sprzet> sprzet;


	public zamowienie()
	{
		sprzet = new ArrayList<sprzet>();

	}

	public float getKwota()
	{
		return kwota;
	}

	public void setKwota(float kwota)
	{
		this.kwota = kwota;
	}

	public String getDataprzyjecia()
	{
		return dataprzyjecia;
	}
	public void setDataprzyjecia(String dataprzyjecia)
	{
		this.dataprzyjecia = dataprzyjecia;
	}

	public String getDatawykonania()
	{
		return datawykonania;
	}

	public void setDatawykonania(String datawykonania)
	{
		this.datawykonania = datawykonania;
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
