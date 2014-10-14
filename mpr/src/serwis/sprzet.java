package serwis;

import java.util.*;

public class sprzet extends encja
{
	private String producent;
	private String model;
	private String typ;

	private List<rodzajnaprawy> naprawy;

	public sprzet()
	{
		naprawy = new ArrayList<rodzajnaprawy>();
	}

	public String getProducent()
	{
		return producent;
	}

	public void setProducent(String producent)
	{
		this.producent = producent;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getTyp()
	{
		return typ;
	}

	public void setTyp(String typ)
	{
		this.typ = typ;
	}

}
