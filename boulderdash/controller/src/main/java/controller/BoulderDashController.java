/**
 * @author pierre
 * <H1> BoulderDashController</H1>
 *	use to do some things between view and model
 */
public class BoulderDashController implements IOrderPerformer{
	private BoulderDash.view.IViewSystem boulderDash.view.IViewSystem;
	private BoulderDash.model.IBoulderDashModel boulderDash.model.IBoulderDashModel;
	 
	  // [...]
	 /**
	  * use to create agregation from IViewsystem
	  * @return IViewSystem
	  */
	  public BoulderDash.view.IViewSystem getBoulderDash.view.IViewSystem() {
	    return boulderDash.view.IViewSystem;
	  }
	  
	  /**
	   * use to create agregation from IBoulderDashModel
	   * @return IBoulderDashModel
	   */
	  public BoulderDash.model.IBoulderDashModel getBoulderDash.model.IBoulderDashModel() {
		    return boulderDash.model.IBoulderDashModel;
		  }
	  	/**
		  * @param  BoulderDashModel
		  */
	public void BoulderDashController(IBoulderDashModel BoulderDashModel){
		
	}
	/**
	  * @param userOrder
	  */ 
	public void orderPerform(UserOrder userOrder){
		
	}
	/**
	  * @param viewsystem
	  */ 
	public void setViewSystem(IViewSystem viewSystem){
		
	}
	
}
