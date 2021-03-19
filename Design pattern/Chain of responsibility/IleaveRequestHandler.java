package ChainOfResponsibility;

public abstract class IleaveRequestHandler {
	protected IleaveRequestHandler nexthandler;
	public void SetnextHandler(IleaveRequestHandler nexthandler)
    {
      this.nexthandler = nexthandler;
    }
	public abstract void HandleRequest(LeaveRequest lr);
}
