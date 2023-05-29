package jdbc_assignment_states_crud_operations.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc_assignment_states_crud_operations.connection.StatesConnection;
import jdbc_assignment_states_crud_operations.dto.States;

public class StatesDao {
	StatesConnection statesconnection = new StatesConnection();
	States states = new States();
	Connection con = statesconnection.getConnection();
	public void insertQuery(States states) {
		try {
			Statement stmt = con.createStatement();
			String insertQuery = "insert into states value("+states.getStateId()+",'"+states.getStateName()+"','"+states.getStateCapital()+"',"+states.getStateDistricts()+")";
			
			stmt.execute(insertQuery);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteById(int id){
		try {
			Statement stmt = con.createStatement();
			String deleteQuery = "delete from states where stateid="+id;
			stmt.executeUpdate(deleteQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public int getStateById(int id) {
		try {
			Statement st = con.createStatement();
			String selectQuery = "select * from states where stateid ="+id;
			ResultSet rs = st.executeQuery(selectQuery);
			
			while(rs.next()) {
				States states = new States();
				states.setStateId(rs.getInt(1));
				states.setStateName(rs.getString(2));
				states.setStateCapital(rs.getString(3));
				states.setStateDistricts(rs.getInt(4));
				
				System.out.println(states);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	public List<States> displayAll() {
		try {
			Statement st = con.createStatement();
			String displayAll = "Select * from states";
			ResultSet rs = st.executeQuery(displayAll);
			List<States> states = new ArrayList<States>();
			while(rs.next()) {
				// details flow= rs(ResultSet) -> states1(States) -> states (ArrayList)
				States states1 = new States();
				states1.setStateId(rs.getInt(1));
				states1.setStateName(rs.getString(2));
				states1.setStateCapital(rs.getString(3));
				states1.setStateDistricts(rs.getInt(4));
				
				states.add(states1);
				
			}
			return states;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;	
	}

}
