/**
 * @author pierre
 * <H1> BoulderDashController</H1>
 *	use to do some things between view and model
 */
public class BoulderDashController implements IOrderPerformer{
	private BoulderDash.view.IViewSystem boulderDash.view.IViewSystem;
	private BoulderDash.model.IBoulderDashModel boulderDash.model.IBoulderDashModel;
	 
	  // [...]
	 
	  public BoulderDash.view.IViewSystem getBoulderDash.view.IViewSystem() {
	    return boulderDash.view.IViewSystem;
	  }
	  
	  public BoulderDash.model.IBoulderDashModel getBoulderDash.model.IBoulderDashModel() {
		    return boulderDash.model.IBoulderDashModel;
		  }
	  
	public void BoulderDashController(IBoulderDashModel BoulderDashModel){
		
	}
	
	public void orderPerform(UserOrder userOrder){
		
	}
	public void setViewSystem(IViewSystem viewSystem){
		
	}
	
}
