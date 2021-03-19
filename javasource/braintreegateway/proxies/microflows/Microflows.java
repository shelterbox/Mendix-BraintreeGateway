// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package braintreegateway.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the BraintreeGateway module
	public static braintreegateway.proxies.Client sUB_CreateClient(IContext context, java.lang.String _optionalCustomerID, java.math.BigDecimal _amount)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OptionalCustomerID", _optionalCustomerID);
		params.put("Amount", _amount);
		IMendixObject result = (IMendixObject)Core.microflowCall("BraintreeGateway.SUB_CreateClient").withParams(params).execute(context);
		return result == null ? null : braintreegateway.proxies.Client.initialize(context, result);
	}
	public static java.lang.String sUB_CreateTransaction(IContext context, braintreegateway.proxies.Client _client, java.lang.String _firstName, java.lang.String _lastName, java.lang.String _countryCodeAlpha3, java.lang.String _countryName, java.lang.String _streetAddress, java.lang.String _postalCode)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Client", _client == null ? null : _client.getMendixObject());
		params.put("FirstName", _firstName);
		params.put("LastName", _lastName);
		params.put("CountryCodeAlpha3", _countryCodeAlpha3);
		params.put("CountryName", _countryName);
		params.put("StreetAddress", _streetAddress);
		params.put("PostalCode", _postalCode);
		return (java.lang.String) Core.microflowCall("BraintreeGateway.SUB_CreateTransaction").withParams(params).execute(context);
	}
}