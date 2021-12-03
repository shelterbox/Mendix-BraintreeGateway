// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testing.proxies;

public class Address
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject addressMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Testing.Address";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Postcode("Postcode"),
		Address("Address"),
		Town("Town"),
		Address_Person("Testing.Address_Person"),
		Address_Country("Testing.Address_Country");

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

	public Address(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Testing.Address"));
	}

	protected Address(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject addressMendixObject)
	{
		if (addressMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Testing.Address", addressMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Testing.Address");

		this.addressMendixObject = addressMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Address.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static testing.proxies.Address initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testing.proxies.Address.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testing.proxies.Address initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testing.proxies.Address(context, mendixObject);
	}

	public static testing.proxies.Address load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testing.proxies.Address.initialize(context, mendixObject);
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
	 * @return value of Postcode
	 */
	public final java.lang.String getPostcode()
	{
		return getPostcode(getContext());
	}

	/**
	 * @param context
	 * @return value of Postcode
	 */
	public final java.lang.String getPostcode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Postcode.toString());
	}

	/**
	 * Set value of Postcode
	 * @param postcode
	 */
	public final void setPostcode(java.lang.String postcode)
	{
		setPostcode(getContext(), postcode);
	}

	/**
	 * Set value of Postcode
	 * @param context
	 * @param postcode
	 */
	public final void setPostcode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String postcode)
	{
		getMendixObject().setValue(context, MemberNames.Postcode.toString(), postcode);
	}

	/**
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of Town
	 */
	public final java.lang.String getTown()
	{
		return getTown(getContext());
	}

	/**
	 * @param context
	 * @return value of Town
	 */
	public final java.lang.String getTown(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Town.toString());
	}

	/**
	 * Set value of Town
	 * @param town
	 */
	public final void setTown(java.lang.String town)
	{
		setTown(getContext(), town);
	}

	/**
	 * Set value of Town
	 * @param context
	 * @param town
	 */
	public final void setTown(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String town)
	{
		getMendixObject().setValue(context, MemberNames.Town.toString(), town);
	}

	/**
	 * @return value of Address_Person
	 */
	public final testing.proxies.Person getAddress_Person() throws com.mendix.core.CoreException
	{
		return getAddress_Person(getContext());
	}

	/**
	 * @param context
	 * @return value of Address_Person
	 */
	public final testing.proxies.Person getAddress_Person(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testing.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Address_Person.toString());
		if (identifier != null)
			result = testing.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Address_Person
	 * @param address_person
	 */
	public final void setAddress_Person(testing.proxies.Person address_person)
	{
		setAddress_Person(getContext(), address_person);
	}

	/**
	 * Set value of Address_Person
	 * @param context
	 * @param address_person
	 */
	public final void setAddress_Person(com.mendix.systemwideinterfaces.core.IContext context, testing.proxies.Person address_person)
	{
		if (address_person == null)
			getMendixObject().setValue(context, MemberNames.Address_Person.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Address_Person.toString(), address_person.getMendixObject().getId());
	}

	/**
	 * @return value of Address_Country
	 */
	public final testing.proxies.Country getAddress_Country() throws com.mendix.core.CoreException
	{
		return getAddress_Country(getContext());
	}

	/**
	 * @param context
	 * @return value of Address_Country
	 */
	public final testing.proxies.Country getAddress_Country(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testing.proxies.Country result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Address_Country.toString());
		if (identifier != null)
			result = testing.proxies.Country.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Address_Country
	 * @param address_country
	 */
	public final void setAddress_Country(testing.proxies.Country address_country)
	{
		setAddress_Country(getContext(), address_country);
	}

	/**
	 * Set value of Address_Country
	 * @param context
	 * @param address_country
	 */
	public final void setAddress_Country(com.mendix.systemwideinterfaces.core.IContext context, testing.proxies.Country address_country)
	{
		if (address_country == null)
			getMendixObject().setValue(context, MemberNames.Address_Country.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Address_Country.toString(), address_country.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return addressMendixObject;
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
			final testing.proxies.Address that = (testing.proxies.Address) obj;
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
		return "Testing.Address";
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
