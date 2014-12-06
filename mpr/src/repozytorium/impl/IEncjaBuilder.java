package repozytorium.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import serwis.encja;

public interface IEncjaBuilder<TEncja extends encja>
{
	
	public TEncja build(ResultSet rs) throws SQLException;
	
}
