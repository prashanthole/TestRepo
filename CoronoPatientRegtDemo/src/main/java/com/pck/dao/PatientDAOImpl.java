package com.pck.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.pck.eo.Patient_DetailsEO;

public class PatientDAOImpl implements IPatientDAO {
	private static final String PATIENT_INSERT_QUERY="INSERT INTO PATIENT_DETAILS VALUES (PATIENT_ID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";
	private DataSource ds;
	
	PatientDAOImpl(DataSource ds)
	{
		this.ds=ds;
	}

	@Override
	public int insert(Patient_DetailsEO eo) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try
		{
			con=ds.getConnection();
			ps=con.prepareStatement(PATIENT_INSERT_QUERY);
			ps.setString(1, eo.getPatient_name());
			ps.setString(2, eo.getPatient_addrs());
			ps.setString(3, eo.getPatient_mob_no());
			ps.setInt(4, eo.getDays_of_hospitalized());
			ps.setFloat(5, eo.getBill_per_day());
			ps.setFloat(6, eo.getTotal_bill_amt());
			ps.setFloat(7, eo.getDiscount_amt());
			ps.setFloat(8, eo.getNet_bill_amt());
			count=ps.executeUpdate();
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
		finally {
			try
			{
			if(ps!=null)
				ps.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
				throw se;
			}
			try
			{
			if(con!=null)
				con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
				throw se;
			}
		}
		
		return count;
	}

}
