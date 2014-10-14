package serwis;

public class rodzajnaprawy extends encja
{
	private String nazwa;
	private String czasnaprawy;
	private float koszt;

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

}
