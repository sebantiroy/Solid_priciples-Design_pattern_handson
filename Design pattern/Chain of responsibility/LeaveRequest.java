package ChainOfResponsibility;

public class LeaveRequest {
	private int leavedays;
	private String employee;
	public int getLeavedays() {
		return leavedays;
	}
	public void setLeavedays(int leavedays) {
		this.leavedays = leavedays;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	
   public LeaveRequest(int leavedays, String employee) {
		super();
		this.leavedays = leavedays;
		this.employee = employee;
	}
public LeaveRequest() {
	// TODO Auto-generated constructor stub
}

}
