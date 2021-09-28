// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package braintreegateway.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the BraintreeGateway module

	/**
	* Select from the following options (all in lower case):
	* sandbox
	* production
	* qa
	* development
	*/
	public static java.lang.String getBraintreeEnvironment()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("BraintreeGateway.BraintreeEnvironment");
	}

	public static java.lang.String getBraintreeMerchantID()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("BraintreeGateway.BraintreeMerchantID");
	}

	public static java.lang.String getBraintreePrivateKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("BraintreeGateway.BraintreePrivateKey");
	}

	public static java.lang.String getBraintreePublicKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("BraintreeGateway.BraintreePublicKey");
	}
}