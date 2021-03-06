// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package braintreegateway.proxies;

public class ThreeDSecureInfo
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject threeDSecureInfoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BraintreeGateway.ThreeDSecureInfo";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LiabilityShifted("LiabilityShifted"),
		LiabilityShiftPossible("LiabilityShiftPossible"),
		Enrolled("Enrolled"),
		Status("Status"),
		Cavv("Cavv"),
		Xid("Xid"),
		ThreeDSecureVersion("ThreeDSecureVersion"),
		DsTransactionId("DsTransactionId"),
		Eciflag("Eciflag"),
		ThreeDSecureInfo_Transaction("BraintreeGateway.ThreeDSecureInfo_Transaction");

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

	public ThreeDSecureInfo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BraintreeGateway.ThreeDSecureInfo"));
	}

	protected ThreeDSecureInfo(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject threeDSecureInfoMendixObject)
	{
		if (threeDSecureInfoMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BraintreeGateway.ThreeDSecureInfo", threeDSecureInfoMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BraintreeGateway.ThreeDSecureInfo");

		this.threeDSecureInfoMendixObject = threeDSecureInfoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ThreeDSecureInfo.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static braintreegateway.proxies.ThreeDSecureInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return braintreegateway.proxies.ThreeDSecureInfo.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static braintreegateway.proxies.ThreeDSecureInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new braintreegateway.proxies.ThreeDSecureInfo(context, mendixObject);
	}

	public static braintreegateway.proxies.ThreeDSecureInfo load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return braintreegateway.proxies.ThreeDSecureInfo.initialize(context, mendixObject);
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
	 * @return value of LiabilityShifted
	 */
	public final java.lang.Boolean getLiabilityShifted()
	{
		return getLiabilityShifted(getContext());
	}

	/**
	 * @param context
	 * @return value of LiabilityShifted
	 */
	public final java.lang.Boolean getLiabilityShifted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.LiabilityShifted.toString());
	}

	/**
	 * Set value of LiabilityShifted
	 * @param liabilityshifted
	 */
	public final void setLiabilityShifted(java.lang.Boolean liabilityshifted)
	{
		setLiabilityShifted(getContext(), liabilityshifted);
	}

	/**
	 * Set value of LiabilityShifted
	 * @param context
	 * @param liabilityshifted
	 */
	public final void setLiabilityShifted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean liabilityshifted)
	{
		getMendixObject().setValue(context, MemberNames.LiabilityShifted.toString(), liabilityshifted);
	}

	/**
	 * @return value of LiabilityShiftPossible
	 */
	public final java.lang.Boolean getLiabilityShiftPossible()
	{
		return getLiabilityShiftPossible(getContext());
	}

	/**
	 * @param context
	 * @return value of LiabilityShiftPossible
	 */
	public final java.lang.Boolean getLiabilityShiftPossible(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.LiabilityShiftPossible.toString());
	}

	/**
	 * Set value of LiabilityShiftPossible
	 * @param liabilityshiftpossible
	 */
	public final void setLiabilityShiftPossible(java.lang.Boolean liabilityshiftpossible)
	{
		setLiabilityShiftPossible(getContext(), liabilityshiftpossible);
	}

	/**
	 * Set value of LiabilityShiftPossible
	 * @param context
	 * @param liabilityshiftpossible
	 */
	public final void setLiabilityShiftPossible(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean liabilityshiftpossible)
	{
		getMendixObject().setValue(context, MemberNames.LiabilityShiftPossible.toString(), liabilityshiftpossible);
	}

	/**
	 * @return value of Enrolled
	 */
	public final java.lang.String getEnrolled()
	{
		return getEnrolled(getContext());
	}

	/**
	 * @param context
	 * @return value of Enrolled
	 */
	public final java.lang.String getEnrolled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Enrolled.toString());
	}

	/**
	 * Set value of Enrolled
	 * @param enrolled
	 */
	public final void setEnrolled(java.lang.String enrolled)
	{
		setEnrolled(getContext(), enrolled);
	}

	/**
	 * Set value of Enrolled
	 * @param context
	 * @param enrolled
	 */
	public final void setEnrolled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String enrolled)
	{
		getMendixObject().setValue(context, MemberNames.Enrolled.toString(), enrolled);
	}

	/**
	 * @return value of Status
	 */
	public final java.lang.String getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final java.lang.String getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Status.toString());
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(java.lang.String status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String status)
	{
		getMendixObject().setValue(context, MemberNames.Status.toString(), status);
	}

	/**
	 * @return value of Cavv
	 */
	public final java.lang.String getCavv()
	{
		return getCavv(getContext());
	}

	/**
	 * @param context
	 * @return value of Cavv
	 */
	public final java.lang.String getCavv(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Cavv.toString());
	}

	/**
	 * Set value of Cavv
	 * @param cavv
	 */
	public final void setCavv(java.lang.String cavv)
	{
		setCavv(getContext(), cavv);
	}

	/**
	 * Set value of Cavv
	 * @param context
	 * @param cavv
	 */
	public final void setCavv(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cavv)
	{
		getMendixObject().setValue(context, MemberNames.Cavv.toString(), cavv);
	}

	/**
	 * @return value of Xid
	 */
	public final java.lang.String getXid()
	{
		return getXid(getContext());
	}

	/**
	 * @param context
	 * @return value of Xid
	 */
	public final java.lang.String getXid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Xid.toString());
	}

	/**
	 * Set value of Xid
	 * @param xid
	 */
	public final void setXid(java.lang.String xid)
	{
		setXid(getContext(), xid);
	}

	/**
	 * Set value of Xid
	 * @param context
	 * @param xid
	 */
	public final void setXid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xid)
	{
		getMendixObject().setValue(context, MemberNames.Xid.toString(), xid);
	}

	/**
	 * @return value of ThreeDSecureVersion
	 */
	public final java.lang.String getThreeDSecureVersion()
	{
		return getThreeDSecureVersion(getContext());
	}

	/**
	 * @param context
	 * @return value of ThreeDSecureVersion
	 */
	public final java.lang.String getThreeDSecureVersion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ThreeDSecureVersion.toString());
	}

	/**
	 * Set value of ThreeDSecureVersion
	 * @param threedsecureversion
	 */
	public final void setThreeDSecureVersion(java.lang.String threedsecureversion)
	{
		setThreeDSecureVersion(getContext(), threedsecureversion);
	}

	/**
	 * Set value of ThreeDSecureVersion
	 * @param context
	 * @param threedsecureversion
	 */
	public final void setThreeDSecureVersion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String threedsecureversion)
	{
		getMendixObject().setValue(context, MemberNames.ThreeDSecureVersion.toString(), threedsecureversion);
	}

	/**
	 * @return value of DsTransactionId
	 */
	public final java.lang.String getDsTransactionId()
	{
		return getDsTransactionId(getContext());
	}

	/**
	 * @param context
	 * @return value of DsTransactionId
	 */
	public final java.lang.String getDsTransactionId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DsTransactionId.toString());
	}

	/**
	 * Set value of DsTransactionId
	 * @param dstransactionid
	 */
	public final void setDsTransactionId(java.lang.String dstransactionid)
	{
		setDsTransactionId(getContext(), dstransactionid);
	}

	/**
	 * Set value of DsTransactionId
	 * @param context
	 * @param dstransactionid
	 */
	public final void setDsTransactionId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dstransactionid)
	{
		getMendixObject().setValue(context, MemberNames.DsTransactionId.toString(), dstransactionid);
	}

	/**
	 * @return value of Eciflag
	 */
	public final java.lang.String getEciflag()
	{
		return getEciflag(getContext());
	}

	/**
	 * @param context
	 * @return value of Eciflag
	 */
	public final java.lang.String getEciflag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Eciflag.toString());
	}

	/**
	 * Set value of Eciflag
	 * @param eciflag
	 */
	public final void setEciflag(java.lang.String eciflag)
	{
		setEciflag(getContext(), eciflag);
	}

	/**
	 * Set value of Eciflag
	 * @param context
	 * @param eciflag
	 */
	public final void setEciflag(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String eciflag)
	{
		getMendixObject().setValue(context, MemberNames.Eciflag.toString(), eciflag);
	}

	/**
	 * @return value of ThreeDSecureInfo_Transaction
	 */
	public final braintreegateway.proxies.Transaction getThreeDSecureInfo_Transaction() throws com.mendix.core.CoreException
	{
		return getThreeDSecureInfo_Transaction(getContext());
	}

	/**
	 * @param context
	 * @return value of ThreeDSecureInfo_Transaction
	 */
	public final braintreegateway.proxies.Transaction getThreeDSecureInfo_Transaction(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		braintreegateway.proxies.Transaction result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ThreeDSecureInfo_Transaction.toString());
		if (identifier != null)
			result = braintreegateway.proxies.Transaction.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ThreeDSecureInfo_Transaction
	 * @param threedsecureinfo_transaction
	 */
	public final void setThreeDSecureInfo_Transaction(braintreegateway.proxies.Transaction threedsecureinfo_transaction)
	{
		setThreeDSecureInfo_Transaction(getContext(), threedsecureinfo_transaction);
	}

	/**
	 * Set value of ThreeDSecureInfo_Transaction
	 * @param context
	 * @param threedsecureinfo_transaction
	 */
	public final void setThreeDSecureInfo_Transaction(com.mendix.systemwideinterfaces.core.IContext context, braintreegateway.proxies.Transaction threedsecureinfo_transaction)
	{
		if (threedsecureinfo_transaction == null)
			getMendixObject().setValue(context, MemberNames.ThreeDSecureInfo_Transaction.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ThreeDSecureInfo_Transaction.toString(), threedsecureinfo_transaction.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return threeDSecureInfoMendixObject;
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
			final braintreegateway.proxies.ThreeDSecureInfo that = (braintreegateway.proxies.ThreeDSecureInfo) obj;
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
		return "BraintreeGateway.ThreeDSecureInfo";
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
