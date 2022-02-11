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
	public static boolean aS_CreateBraintree(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("BraintreeGateway.AS_CreateBraintree").withParams(params).execute(context);
	}
	public static braintreegateway.proxies.Enum_Environment dS_Braintree_Environment(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.lang.String result = (java.lang.String) Core.microflowCall("BraintreeGateway.DS_Braintree_Environment").withParams(params).execute(context);
		return result == null ? null : braintreegateway.proxies.Enum_Environment.valueOf(result);
	}
	public static braintreegateway.proxies.Client sUB_CreateClient(IContext context, java.lang.String _optionalCustomerID, java.math.BigDecimal _amount, java.lang.String _currencyCode, java.lang.String _countryCode)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OptionalCustomerID", _optionalCustomerID);
		params.put("Amount", _amount);
		params.put("CurrencyCode", _currencyCode);
		params.put("CountryCode", _countryCode);
		IMendixObject result = (IMendixObject)Core.microflowCall("BraintreeGateway.SUB_CreateClient").withParams(params).execute(context);
		return result == null ? null : braintreegateway.proxies.Client.initialize(context, result);
	}
	public static braintreegateway.proxies.Transaction sUB_CreateTransaction(IContext context, braintreegateway.proxies.Client _client, java.lang.String _firstName, java.lang.String _lastName, java.lang.String _countryCodeAlpha3, java.lang.String _countryName, java.lang.String _streetAddress, java.lang.String _postalCode, java.lang.String _countryCodeAlpha2, java.lang.String _phoneNumber, java.lang.String _extendedAddress, java.lang.String _locality, java.lang.String _region)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Client", _client == null ? null : _client.getMendixObject());
		params.put("FirstName", _firstName);
		params.put("LastName", _lastName);
		params.put("CountryCodeAlpha3", _countryCodeAlpha3);
		params.put("CountryName", _countryName);
		params.put("StreetAddress", _streetAddress);
		params.put("PostalCode", _postalCode);
		params.put("CountryCodeAlpha2", _countryCodeAlpha2);
		params.put("PhoneNumber", _phoneNumber);
		params.put("ExtendedAddress", _extendedAddress);
		params.put("Locality", _locality);
		params.put("Region", _region);
		IMendixObject result = (IMendixObject)Core.microflowCall("BraintreeGateway.SUB_CreateTransaction").withParams(params).execute(context);
		return result == null ? null : braintreegateway.proxies.Transaction.initialize(context, result);
	}
	public static braintreegateway.proxies.Transaction sUB_FindTransaction(IContext context, java.lang.String _transactionId)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TransactionId", _transactionId);
		IMendixObject result = (IMendixObject)Core.microflowCall("BraintreeGateway.SUB_FindTransaction").withParams(params).execute(context);
		return result == null ? null : braintreegateway.proxies.Transaction.initialize(context, result);
	}
}