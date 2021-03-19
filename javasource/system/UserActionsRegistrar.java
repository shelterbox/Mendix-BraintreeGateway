package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(braintreegateway.actions.CreateBraintree.class);
    registrator.registerUserAction(braintreegateway.actions.CreateTransactionRequest.class);
    registrator.registerUserAction(braintreegateway.actions.GenerateClientToken.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
