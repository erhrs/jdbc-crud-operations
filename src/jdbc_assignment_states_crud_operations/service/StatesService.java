package jdbc_assignment_states_crud_operations.service;

import java.util.List;

import jdbc_assignment_states_crud_operations.dao.StatesDao;
import jdbc_assignment_states_crud_operations.dto.States;

public class StatesService {
	StatesDao statesdao = new StatesDao();
	public void insertQueryService(States states){
		statesdao.insertQuery(states);
		
	}
	
	public void deleteStateService(int id) {
		if(statesdao.getStateById(id)!=0) {
			statesdao.deleteById(id);
		}
		else {
			System.err.println("Bugger enter a vaild id");
		}
	}
	
	public int getStatesByIdServices(int id) {
		if(statesdao.getStateById(id)!=0) {
			return statesdao.getStateById(id);
		}
		
		return 0;
		
	}
	public List<States> displayAllStatesService() {
	   return statesdao.displayAll();
	}

}
