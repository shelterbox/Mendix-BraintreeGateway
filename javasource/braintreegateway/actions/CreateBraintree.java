// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package braintreegateway.actions;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import braintreegateway.actions.tools.Payment;

/**
 * Will initialise the Braintree gateway.
 * 
 * With your supplied API crendentials, you can make subsequent calls to Braintree as 'you'.
 * 
 * More on the process here:
 * https://developers.braintreepayments.com/start/hello-server/java
 */
public class CreateBraintree extends CustomJavaAction<java.lang.Void>
{
	private braintreegateway.proxies.Enum_Environment BraintreeEnvironment;
	private java.lang.String BraintreeMerchantID;
	private java.lang.String BraintreePublicKey;
	private java.lang.String BraintreePrivateKey;

	public CreateBraintree(IContext context, java.lang.String BraintreeEnvironment, java.lang.String BraintreeMerchantID, java.lang.String BraintreePublicKey, java.lang.String BraintreePrivateKey)
	{
		super(context);
		this.BraintreeEnvironment = BraintreeEnvironment == null ? null : braintreegateway.proxies.Enum_Environment.valueOf(BraintreeEnvironment);
		this.BraintreeMerchantID = BraintreeMerchantID;
		this.BraintreePublicKey = BraintreePublicKey;
		this.BraintreePrivateKey = BraintreePrivateKey;
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		// BEGIN USER CODE
		Payment.gateway = new BraintreeGateway(
				Environment.parseEnvironment(this.BraintreeEnvironment.name()),
				this.BraintreeMerchantID,
				this.BraintreePublicKey,
				this.BraintreePrivateKey);
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "CreateBraintree";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
