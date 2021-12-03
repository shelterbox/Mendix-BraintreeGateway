// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testing.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Testing module
	public static void aCT_3_ConfirmTransaction(IContext context, braintreegateway.proxies.Client _client, testing.proxies.Person _person)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Client", _client == null ? null : _client.getMendixObject());
		params.put("Person", _person == null ? null : _person.getMendixObject());
		Core.microflowCall("Testing.ACT_3_ConfirmTransaction").withParams(params).execute(context);
	}
	public static void aCT_4_FindTransaction(IContext context, testing.proxies.TransactionSearch _transactionSearch)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TransactionSearch", _transactionSearch == null ? null : _transactionSearch.getMendixObject());
		Core.microflowCall("Testing.ACT_4_FindTransaction").withParams(params).execute(context);
	}
	public static boolean afterStartup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("Testing.AfterStartup").withParams(params).execute(context);
	}
	public static boolean aS_1_CreateBraintree(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("Testing.AS_1_CreateBraintree").withParams(params).execute(context);
	}
	public static void aS_Country_Import(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Testing.AS_Country_Import").withParams(params).execute(context);
	}
	public static braintreegateway.proxies.Client dS_2_CapturePaymentDetails(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Testing.DS_2_CapturePaymentDetails").withParams(params).execute(context);
		return result == null ? null : braintreegateway.proxies.Client.initialize(context, result);
	}
	public static testing.proxies.Address dS_Address(IContext context, testing.proxies.Person _person)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Person", _person == null ? null : _person.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Testing.DS_Address").withParams(params).execute(context);
		return result == null ? null : testing.proxies.Address.initialize(context, result);
	}
	public static testing.proxies.Email dS_Email(IContext context, testing.proxies.Person _person)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Person", _person == null ? null : _person.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Testing.DS_Email").withParams(params).execute(context);
		return result == null ? null : testing.proxies.Email.initialize(context, result);
	}
	public static testing.proxies.Person dS_Person(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Testing.DS_Person").withParams(params).execute(context);
		return result == null ? null : testing.proxies.Person.initialize(context, result);
	}
	public static testing.proxies.Phone dS_Phone(IContext context, testing.proxies.Person _person)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Person", _person == null ? null : _person.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Testing.DS_Phone").withParams(params).execute(context);
		return result == null ? null : testing.proxies.Phone.initialize(context, result);
	}
}