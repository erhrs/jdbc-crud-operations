package jdbc_assignment_states_crud_operations.controller;

import java.util.List;
import java.util.Scanner;

import jdbc_assignment_states_crud_operations.dto.States;
import jdbc_assignment_states_crud_operations.service.StatesService;

public class StatesController {

	public static void main(String[] args) {
		States states = new States();
		StatesService statesservice = new StatesService();
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			System.out.println("Enter the task to perform \n1. insert data \n2. delete state by id \n3. Enter id to display state \n4. Display All");
			int ch = sc.nextInt();
		switch (ch) {
		case 1:{
			System.out.println("Enter id");
			int id = sc.nextInt();
			states.setStateId(id);
			
			System.out.println("Enter State name");
			String name = sc.next();
			states.setStateName(name);
			
			System.out.println("Enter the Capital");
			String capital = sc.next();
			states.setStateCapital(capital);
			
			System.out.println("Enter the Districts");
			int district = sc.nextInt();
			states.setStateDistricts(district);
			
			statesservice.insertQueryService(states);
			
		};
		break;
		case 2:{
			System.out.println("Enter stateId to delete");
			int id = sc.nextInt();
			statesservice.deleteStateService(id);
		};
		break;
		
		case 3:{
			System.out.println("Enter id to display");
			int id = sc.nextInt();
			statesservice.getStatesByIdServices(id);
			
		};
		break;
		case 4:{
			List<States> states1 = statesservice.displayAllStatesService();
			for (States states2 : states1) {
//				System.out.println("State id = "+states2.getStateId());
//				System.out.println("State name = "+states2.getStateName());
//				System.out.println("State Capital = "+states2.getStateCapital());
//				System.out.println("States districts = "+states2.getStateDistricts());
				System.out.println(states2);
			}
		}
		}
		
	}
	}
	

}
