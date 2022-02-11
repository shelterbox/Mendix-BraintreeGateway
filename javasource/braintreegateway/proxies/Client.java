// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package braintreegateway.proxies;

public class Client
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject clientMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BraintreeGateway.Client";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Token("Token"),
		Nonce("Nonce"),
		DeviceData("DeviceData"),
		Amount("Amount"),
		CurrencyCode("CurrencyCode"),
		CountryCode("CountryCode"),
		Client_Payment("BraintreeGateway.Client_Payment");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Client(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BraintreeGateway.Client"));
	}

	protected Client(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject clientMendixObject)
	{
		if (clientMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BraintreeGateway.Client", clientMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BraintreeGateway.Client");

		this.clientMendixObject = clientMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Client.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static braintreegateway.proxies.Client initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return braintreegateway.proxies.Client.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static braintreegateway.proxies.Client initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new braintreegateway.proxies.Client(context, mendixObject);
	}

	public static braintreegateway.proxies.Client load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return braintreegateway.proxies.Client.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Token
	 */
	public final java.lang.String getToken()
	{
		return getToken(getContext());
	}

	/**
	 * @param context
	 * @return value of Token
	 */
	public final java.lang.String getToken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Token.toString());
	}

	/**
	 * Set value of Token
	 * @param token
	 */
	public final void setToken(java.lang.String token)
	{
		setToken(getContext(), token);
	}

	/**
	 * Set value of Token
	 * @param context
	 * @param token
	 */
	public final void setToken(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String token)
	{
		getMendixObject().setValue(context, MemberNames.Token.toString(), token);
	}

	/**
	 * @return value of Nonce
	 */
	public final java.lang.String getNonce()
	{
		return getNonce(getContext());
	}

	/**
	 * @param context
	 * @return value of Nonce
	 */
	public final java.lang.String getNonce(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Nonce.toString());
	}

	/**
	 * Set value of Nonce
	 * @param nonce
	 */
	public final void setNonce(java.lang.String nonce)
	{
		setNonce(getContext(), nonce);
	}

	/**
	 * Set value of Nonce
	 * @param context
	 * @param nonce
	 */
	public final void setNonce(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nonce)
	{
		getMendixObject().setValue(context, MemberNames.Nonce.toString(), nonce);
	}

	/**
	 * @return value of DeviceData
	 */
	public final java.lang.String getDeviceData()
	{
		return getDeviceData(getContext());
	}

	/**
	 * @param context
	 * @return value of DeviceData
	 */
	public final java.lang.String getDeviceData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DeviceData.toString());
	}

	/**
	 * Set value of DeviceData
	 * @param devicedata
	 */
	public final void setDeviceData(java.lang.String devicedata)
	{
		setDeviceData(getContext(), devicedata);
	}

	/**
	 * Set value of DeviceData
	 * @param context
	 * @param devicedata
	 */
	public final void setDeviceData(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String devicedata)
	{
		getMendixObject().setValue(context, MemberNames.DeviceData.toString(), devicedata);
	}

	/**
	 * @return value of Amount
	 */
	public final java.math.BigDecimal getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.math.BigDecimal getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.math.BigDecimal amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of CurrencyCode
	 */
	public final java.lang.String getCurrencyCode()
	{
		return getCurrencyCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrencyCode
	 */
	public final java.lang.String getCurrencyCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CurrencyCode.toString());
	}

	/**
	 * Set value of CurrencyCode
	 * @param currencycode
	 */
	public final void setCurrencyCode(java.lang.String currencycode)
	{
		setCurrencyCode(getContext(), currencycode);
	}

	/**
	 * Set value of CurrencyCode
	 * @param context
	 * @param currencycode
	 */
	public final void setCurrencyCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String currencycode)
	{
		getMendixObject().setValue(context, MemberNames.CurrencyCode.toString(), currencycode);
	}

	/**
	 * @return value of CountryCode
	 */
	public final java.lang.String getCountryCode()
	{
		return getCountryCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CountryCode
	 */
	public final java.lang.String getCountryCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CountryCode.toString());
	}

	/**
	 * Set value of CountryCode
	 * @param countrycode
	 */
	public final void setCountryCode(java.lang.String countrycode)
	{
		setCountryCode(getContext(), countrycode);
	}

	/**
	 * Set value of CountryCode
	 * @param context
	 * @param countrycode
	 */
	public final void setCountryCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String countrycode)
	{
		getMendixObject().setValue(context, MemberNames.CountryCode.toString(), countrycode);
	}

	/**
	 * @return value of Client_Payment
	 */
	public final testing.proxies.Payment getClient_Payment() throws com.mendix.core.CoreException
	{
		return getClient_Payment(getContext());
	}

	/**
	 * @param context
	 * @return value of Client_Payment
	 */
	public final testing.proxies.Payment getClient_Payment(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testing.proxies.Payment result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Client_Payment.toString());
		if (identifier != null)
			result = testing.proxies.Payment.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Client_Payment
	 * @param client_payment
	 */
	public final void setClient_Payment(testing.proxies.Payment client_payment)
	{
		setClient_Payment(getContext(), client_payment);
	}

	/**
	 * Set value of Client_Payment
	 * @param context
	 * @param client_payment
	 */
	public final void setClient_Payment(com.mendix.systemwideinterfaces.core.IContext context, testing.proxies.Payment client_payment)
	{
		if (client_payment == null)
			getMendixObject().setValue(context, MemberNames.Client_Payment.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Client_Payment.toString(), client_payment.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return clientMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final braintreegateway.proxies.Client that = (braintreegateway.proxies.Client) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "BraintreeGateway.Client";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
