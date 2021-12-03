// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package braintreegateway.actions;

import com.braintreegateway.Transaction;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import braintreegateway.actions.tools.Payment;

/**
 * Will find a transaction by ID.
 * 
 * More on how it works here:
 * https://developer.paypal.com/braintree/docs/reference/request/transaction/find
 */
public class FindTransaction extends CustomJavaAction<java.lang.String>
{
	private java.lang.String _ID;

	public FindTransaction(IContext context, java.lang.String _ID)
	{
		super(context);
		this._ID = _ID;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		// Find the transaction
		Transaction transaction = Payment.gateway.transaction().find(this._ID);
		
		// Return value as transaction JSON	
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(transaction);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "FindTransaction";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
