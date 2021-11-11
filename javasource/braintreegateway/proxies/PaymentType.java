// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package braintreegateway.proxies;

public class PaymentType extends braintreegateway.proxies.GenericPayment
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BraintreeGateway.PaymentType";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CardType("CardType"),
		ExpirationMonth("ExpirationMonth"),
		ExpirationYear("ExpirationYear"),
		Debit("Debit"),
		IssuingBank("IssuingBank"),
		Bin("Bin"),
		Prepaid("Prepaid"),
		Last4("Last4"),
		Payroll("Payroll"),
		CountryOfIssuance("CountryOfIssuance"),
		Healthcare("Healthcare"),
		Commercial("Commercial"),
		DurbinRegulated("DurbinRegulated"),
		ProductId("ProductId"),
		Token("Token"),
		ImageUrl("ImageUrl");

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

	public PaymentType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BraintreeGateway.PaymentType"));
	}

	protected PaymentType(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject paymentTypeMendixObject)
	{
		super(context, paymentTypeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("BraintreeGateway.PaymentType", paymentTypeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BraintreeGateway.PaymentType");
	}

	/**
	 * @deprecated Use 'PaymentType.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static braintreegateway.proxies.PaymentType initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return braintreegateway.proxies.PaymentType.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static braintreegateway.proxies.PaymentType initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("BraintreeGateway.AndroidPayDetails", mendixObject.getType()))
			return braintreegateway.proxies.AndroidPayDetails.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("BraintreeGateway.ApplePayDetails", mendixObject.getType()))
			return braintreegateway.proxies.ApplePayDetails.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("BraintreeGateway.CreditCard", mendixObject.getType()))
			return braintreegateway.proxies.CreditCard.initialize(context, mendixObject);

		return new braintreegateway.proxies.PaymentType(context, mendixObject);
	}

	public static braintreegateway.proxies.PaymentType load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return braintreegateway.proxies.PaymentType.initialize(context, mendixObject);
	}

	/**
	 * @return value of CardType
	 */
	public final java.lang.String getCardType()
	{
		return getCardType(getContext());
	}

	/**
	 * @param context
	 * @return value of CardType
	 */
	public final java.lang.String getCardType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CardType.toString());
	}

	/**
	 * Set value of CardType
	 * @param cardtype
	 */
	public final void setCardType(java.lang.String cardtype)
	{
		setCardType(getContext(), cardtype);
	}

	/**
	 * Set value of CardType
	 * @param context
	 * @param cardtype
	 */
	public final void setCardType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cardtype)
	{
		getMendixObject().setValue(context, MemberNames.CardType.toString(), cardtype);
	}

	/**
	 * @return value of ExpirationMonth
	 */
	public final java.lang.String getExpirationMonth()
	{
		return getExpirationMonth(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpirationMonth
	 */
	public final java.lang.String getExpirationMonth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ExpirationMonth.toString());
	}

	/**
	 * Set value of ExpirationMonth
	 * @param expirationmonth
	 */
	public final void setExpirationMonth(java.lang.String expirationmonth)
	{
		setExpirationMonth(getContext(), expirationmonth);
	}

	/**
	 * Set value of ExpirationMonth
	 * @param context
	 * @param expirationmonth
	 */
	public final void setExpirationMonth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String expirationmonth)
	{
		getMendixObject().setValue(context, MemberNames.ExpirationMonth.toString(), expirationmonth);
	}

	/**
	 * @return value of ExpirationYear
	 */
	public final java.lang.String getExpirationYear()
	{
		return getExpirationYear(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpirationYear
	 */
	public final java.lang.String getExpirationYear(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ExpirationYear.toString());
	}

	/**
	 * Set value of ExpirationYear
	 * @param expirationyear
	 */
	public final void setExpirationYear(java.lang.String expirationyear)
	{
		setExpirationYear(getContext(), expirationyear);
	}

	/**
	 * Set value of ExpirationYear
	 * @param context
	 * @param expirationyear
	 */
	public final void setExpirationYear(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String expirationyear)
	{
		getMendixObject().setValue(context, MemberNames.ExpirationYear.toString(), expirationyear);
	}

	/**
	 * @return value of Debit
	 */
	public final java.lang.String getDebit()
	{
		return getDebit(getContext());
	}

	/**
	 * @param context
	 * @return value of Debit
	 */
	public final java.lang.String getDebit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Debit.toString());
	}

	/**
	 * Set value of Debit
	 * @param debit
	 */
	public final void setDebit(java.lang.String debit)
	{
		setDebit(getContext(), debit);
	}

	/**
	 * Set value of Debit
	 * @param context
	 * @param debit
	 */
	public final void setDebit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String debit)
	{
		getMendixObject().setValue(context, MemberNames.Debit.toString(), debit);
	}

	/**
	 * @return value of IssuingBank
	 */
	public final java.lang.String getIssuingBank()
	{
		return getIssuingBank(getContext());
	}

	/**
	 * @param context
	 * @return value of IssuingBank
	 */
	public final java.lang.String getIssuingBank(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IssuingBank.toString());
	}

	/**
	 * Set value of IssuingBank
	 * @param issuingbank
	 */
	public final void setIssuingBank(java.lang.String issuingbank)
	{
		setIssuingBank(getContext(), issuingbank);
	}

	/**
	 * Set value of IssuingBank
	 * @param context
	 * @param issuingbank
	 */
	public final void setIssuingBank(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String issuingbank)
	{
		getMendixObject().setValue(context, MemberNames.IssuingBank.toString(), issuingbank);
	}

	/**
	 * @return value of Bin
	 */
	public final java.lang.String getBin()
	{
		return getBin(getContext());
	}

	/**
	 * @param context
	 * @return value of Bin
	 */
	public final java.lang.String getBin(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Bin.toString());
	}

	/**
	 * Set value of Bin
	 * @param bin
	 */
	public final void setBin(java.lang.String bin)
	{
		setBin(getContext(), bin);
	}

	/**
	 * Set value of Bin
	 * @param context
	 * @param bin
	 */
	public final void setBin(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bin)
	{
		getMendixObject().setValue(context, MemberNames.Bin.toString(), bin);
	}

	/**
	 * @return value of Prepaid
	 */
	public final java.lang.String getPrepaid()
	{
		return getPrepaid(getContext());
	}

	/**
	 * @param context
	 * @return value of Prepaid
	 */
	public final java.lang.String getPrepaid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Prepaid.toString());
	}

	/**
	 * Set value of Prepaid
	 * @param prepaid
	 */
	public final void setPrepaid(java.lang.String prepaid)
	{
		setPrepaid(getContext(), prepaid);
	}

	/**
	 * Set value of Prepaid
	 * @param context
	 * @param prepaid
	 */
	public final void setPrepaid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String prepaid)
	{
		getMendixObject().setValue(context, MemberNames.Prepaid.toString(), prepaid);
	}

	/**
	 * @return value of Last4
	 */
	public final java.lang.String getLast4()
	{
		return getLast4(getContext());
	}

	/**
	 * @param context
	 * @return value of Last4
	 */
	public final java.lang.String getLast4(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Last4.toString());
	}

	/**
	 * Set value of Last4
	 * @param last4
	 */
	public final void setLast4(java.lang.String last4)
	{
		setLast4(getContext(), last4);
	}

	/**
	 * Set value of Last4
	 * @param context
	 * @param last4
	 */
	public final void setLast4(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String last4)
	{
		getMendixObject().setValue(context, MemberNames.Last4.toString(), last4);
	}

	/**
	 * @return value of Payroll
	 */
	public final java.lang.String getPayroll()
	{
		return getPayroll(getContext());
	}

	/**
	 * @param context
	 * @return value of Payroll
	 */
	public final java.lang.String getPayroll(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Payroll.toString());
	}

	/**
	 * Set value of Payroll
	 * @param payroll
	 */
	public final void setPayroll(java.lang.String payroll)
	{
		setPayroll(getContext(), payroll);
	}

	/**
	 * Set value of Payroll
	 * @param context
	 * @param payroll
	 */
	public final void setPayroll(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String payroll)
	{
		getMendixObject().setValue(context, MemberNames.Payroll.toString(), payroll);
	}

	/**
	 * @return value of CountryOfIssuance
	 */
	public final java.lang.String getCountryOfIssuance()
	{
		return getCountryOfIssuance(getContext());
	}

	/**
	 * @param context
	 * @return value of CountryOfIssuance
	 */
	public final java.lang.String getCountryOfIssuance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CountryOfIssuance.toString());
	}

	/**
	 * Set value of CountryOfIssuance
	 * @param countryofissuance
	 */
	public final void setCountryOfIssuance(java.lang.String countryofissuance)
	{
		setCountryOfIssuance(getContext(), countryofissuance);
	}

	/**
	 * Set value of CountryOfIssuance
	 * @param context
	 * @param countryofissuance
	 */
	public final void setCountryOfIssuance(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String countryofissuance)
	{
		getMendixObject().setValue(context, MemberNames.CountryOfIssuance.toString(), countryofissuance);
	}

	/**
	 * @return value of Healthcare
	 */
	public final java.lang.String getHealthcare()
	{
		return getHealthcare(getContext());
	}

	/**
	 * @param context
	 * @return value of Healthcare
	 */
	public final java.lang.String getHealthcare(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Healthcare.toString());
	}

	/**
	 * Set value of Healthcare
	 * @param healthcare
	 */
	public final void setHealthcare(java.lang.String healthcare)
	{
		setHealthcare(getContext(), healthcare);
	}

	/**
	 * Set value of Healthcare
	 * @param context
	 * @param healthcare
	 */
	public final void setHealthcare(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String healthcare)
	{
		getMendixObject().setValue(context, MemberNames.Healthcare.toString(), healthcare);
	}

	/**
	 * @return value of Commercial
	 */
	public final java.lang.String getCommercial()
	{
		return getCommercial(getContext());
	}

	/**
	 * @param context
	 * @return value of Commercial
	 */
	public final java.lang.String getCommercial(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Commercial.toString());
	}

	/**
	 * Set value of Commercial
	 * @param commercial
	 */
	public final void setCommercial(java.lang.String commercial)
	{
		setCommercial(getContext(), commercial);
	}

	/**
	 * Set value of Commercial
	 * @param context
	 * @param commercial
	 */
	public final void setCommercial(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String commercial)
	{
		getMendixObject().setValue(context, MemberNames.Commercial.toString(), commercial);
	}

	/**
	 * @return value of DurbinRegulated
	 */
	public final java.lang.String getDurbinRegulated()
	{
		return getDurbinRegulated(getContext());
	}

	/**
	 * @param context
	 * @return value of DurbinRegulated
	 */
	public final java.lang.String getDurbinRegulated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DurbinRegulated.toString());
	}

	/**
	 * Set value of DurbinRegulated
	 * @param durbinregulated
	 */
	public final void setDurbinRegulated(java.lang.String durbinregulated)
	{
		setDurbinRegulated(getContext(), durbinregulated);
	}

	/**
	 * Set value of DurbinRegulated
	 * @param context
	 * @param durbinregulated
	 */
	public final void setDurbinRegulated(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String durbinregulated)
	{
		getMendixObject().setValue(context, MemberNames.DurbinRegulated.toString(), durbinregulated);
	}

	/**
	 * @return value of ProductId
	 */
	public final java.lang.String getProductId()
	{
		return getProductId(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductId
	 */
	public final java.lang.String getProductId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProductId.toString());
	}

	/**
	 * Set value of ProductId
	 * @param productid
	 */
	public final void setProductId(java.lang.String productid)
	{
		setProductId(getContext(), productid);
	}

	/**
	 * Set value of ProductId
	 * @param context
	 * @param productid
	 */
	public final void setProductId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String productid)
	{
		getMendixObject().setValue(context, MemberNames.ProductId.toString(), productid);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final braintreegateway.proxies.PaymentType that = (braintreegateway.proxies.PaymentType) obj;
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
		return "BraintreeGateway.PaymentType";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
