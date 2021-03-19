package ChainOfResponsibility;

public class Supervisor extends IleaveRequestHandler{
	public void SetnextHandler(IleaveRequestHandler nexthandler)
    {
      this.nexthandler = nexthandler;
    }

	@Override
	public void HandleRequest(LeaveRequest lr) {
		// TODO Auto-generated method stub
		int days=lr.getLeavedays();
		String name=lr.getEmployee();
		if(days>=6 && days<10)
		{
			System.out.println(name+", Your request Approved by Supervisor ");
		}
		else if (nexthandler != null)
	      {
			nexthandler.HandleRequest(lr);;
	      }
		
	}

}
