package jdbc_assignment_states_crud_operations.dto;

public class States {
	private int stateId;
	private String stateName;
	private String stateCapital;
	private int stateDistricts;
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCapital() {
		return stateCapital;
	}
	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}
	public int getStateDistricts() {
		return stateDistricts;
	}
	public void setStateDistricts(int stateDistricts) {
		this.stateDistricts = stateDistricts;
	}
	@Override
	public String toString() {
		return "States [stateId=" + stateId + ", stateName=" + stateName + ", stateCapital=" + stateCapital
				+ ", stateDistricts=" + stateDistricts + "]";
	}
	
	

}
