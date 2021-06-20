package com.prash.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prash.bo.CountriesBO;

@Repository("countriesDAO")
public class ICountriesDAOImpl implements IContriesDAO 
{
    private static final String GET_COUNTIES_BY_ID="SELECT COUNTRY_ID,COUNTRY_NAME FROM hr.countries WHERE COUNTRY_ID IN";
    
    @Autowired
    private DataSource ds;  
    
	@Override
	public List<CountriesBO> getContriesById(String id) throws Exception {
		// TODO Auto-generated method stub
		List<CountriesBO> listBO=null;
		try(Connection con=ds.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(GET_COUNTIES_BY_ID+id))
		{
			listBO= new ArrayList();
			CountriesBO bo=null;
			while(rs.next())
			{
				bo=new CountriesBO();
				bo.setCountryId(rs.getString(1));
				bo.setCountryName(rs.getString(2));
				
				listBO.add(bo);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		return listBO;
	}

}
