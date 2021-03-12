package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(braintreegateway.actions.GenerateClientToken.class);
    registrator.registerUserAction(braintreegateway.actions.Initialise.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
