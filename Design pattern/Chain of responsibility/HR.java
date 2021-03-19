package ChainOfResponsibility;

public class HR extends IleaveRequestHandler{
	
	public void SetnextHandler(IleaveRequestHandler nexthandler)
    {
      this.nexthandler = nexthandler;
    }

	@Override
	public void HandleRequest(LeaveRequest lr) {
		// TODO Auto-generated method stub
		int days=lr.getLeavedays();
		String name=lr.getEmployee();
		if(days>=1 && days<=5)
		{
			System.out.println(name+", Your request Approved by hr");
		}
		else if (nexthandler != null)
	      {
			nexthandler.HandleRequest(lr);;
	      }
		
	}

}
