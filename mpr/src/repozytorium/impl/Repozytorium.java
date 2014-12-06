package repozytorium.impl;

import java.sql.*;
import java.util.*;

import repozytorium.impl.*;
import repozytorium.IRepozytorium;
import serwis.encja;

public abstract class Repozytorium <TEncja extends encja> implements IRepozytorium<TEncja>
{
	
	protected Connection connection;
	protected PreparedStatement selectByID;
	protected PreparedStatement insert;
	protected PreparedStatement delete;
	protected PreparedStatement update;
	protected PreparedStatement selectAll;
	protected IEncjaBuilder<TEncja> builder;
	
	protected String selectByIDSql=
			"SELECT * FROM "
			+ getTableName()
			+ " WHERE id=?";
			protected String deleteSql=
			"DELETE FROM "
			+ getTableName()
			+ " WHERE id=?";
			protected String selectAllSql=
			"SELECT * FROM " + getTableName();
			
			protected Repozytorium(Connection connection,
					IEncjaBuilder<TEncja> builder)
			{
				this.builder=builder;
				this.connection = connection;
				try {
					selectByID=connection.prepareStatement(selectByIDSql);
					insert = connection.prepareStatement(getInsertQuery());
					delete = connection.prepareStatement(deleteSql);
					update = connection.prepareStatement(getUpdateQuery());
					selectAll = connection.prepareStatement(selectAllSql);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			@Override
			public void zapisz(TEncja encja) {

				try {
					setUpInsertQuery(encja);
					insert.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			@Override
			public void modyfikuj(TEncja encja) {

				try {
					setUpUpdateQuery(encja);
					update.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			@Override
			public void usun(TEncja encja) {

				try {
					delete.setInt(1, encja.getId());
					delete.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}

			@Override
			public TEncja get(int id) {

				try {
					selectByID.setInt(1, id);
					ResultSet rs = selectByID.executeQuery();
					while(rs.next())
					{
						return builder.build(rs);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				return null;
			}



			@Override
			public List<TEncja> getall() {

				List<TEncja> result = new ArrayList<TEncja>();
				
				try {
					ResultSet rs= selectAll.executeQuery();
					while(rs.next())
					{
						result.add(builder.build(rs));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				return result;
			}
			
			protected abstract void setUpUpdateQuery(TEncja entity) throws SQLException;
			protected abstract void setUpInsertQuery(TEncja entity) throws SQLException;
			protected abstract String getTableName();
			protected abstract String getUpdateQuery();
			protected abstract String getInsertQuery();
}
