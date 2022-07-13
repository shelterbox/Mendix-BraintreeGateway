// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testing.proxies;

public class Person
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject personMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Testing.Person";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FirstName("FirstName"),
		LastName("LastName"),
		EmailAddress("EmailAddress"),
		PhoneNumber("PhoneNumber"),
		Company("Company"),
		Postcode("Postcode"),
		AddressLine1("AddressLine1"),
		AddressLine2("AddressLine2"),
		AddressLine3("AddressLine3"),
		Town("Town"),
		Person_Country("Testing.Person_Country");

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

	public Person(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Testing.Person"));
	}

	protected Person(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject personMendixObject)
	{
		if (personMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Testing.Person", personMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Testing.Person");

		this.personMendixObject = personMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Person.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static testing.proxies.Person initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testing.proxies.Person.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testing.proxies.Person initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testing.proxies.Person(context, mendixObject);
	}

	public static testing.proxies.Person load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testing.proxies.Person.initialize(context, mendixObject);
	}

	public static java.util.List<testing.proxies.Person> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testing.proxies.Person> result = new java.util.ArrayList<testing.proxies.Person>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Testing.Person" + xpathConstraint))
			result.add(testing.proxies.Person.initialize(context, obj));
		return result;
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
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress()
	{
		return getEmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmailAddress.toString());
	}

	/**
	 * Set value of EmailAddress
	 * @param emailaddress
	 */
	public final void setEmailAddress(java.lang.String emailaddress)
	{
		setEmailAddress(getContext(), emailaddress);
	}

	/**
	 * Set value of EmailAddress
	 * @param context
	 * @param emailaddress
	 */
	public final void setEmailAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emailaddress)
	{
		getMendixObject().setValue(context, MemberNames.EmailAddress.toString(), emailaddress);
	}

	/**
	 * @return value of PhoneNumber
	 */
	public final java.lang.String getPhoneNumber()
	{
		return getPhoneNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of PhoneNumber
	 */
	public final java.lang.String getPhoneNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PhoneNumber.toString());
	}

	/**
	 * Set value of PhoneNumber
	 * @param phonenumber
	 */
	public final void setPhoneNumber(java.lang.String phonenumber)
	{
		setPhoneNumber(getContext(), phonenumber);
	}

	/**
	 * Set value of PhoneNumber
	 * @param context
	 * @param phonenumber
	 */
	public final void setPhoneNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phonenumber)
	{
		getMendixObject().setValue(context, MemberNames.PhoneNumber.toString(), phonenumber);
	}

	/**
	 * @return value of Company
	 */
	public final java.lang.String getCompany()
	{
		return getCompany(getContext());
	}

	/**
	 * @param context
	 * @return value of Company
	 */
	public final java.lang.String getCompany(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Company.toString());
	}

	/**
	 * Set value of Company
	 * @param company
	 */
	public final void setCompany(java.lang.String company)
	{
		setCompany(getContext(), company);
	}

	/**
	 * Set value of Company
	 * @param context
	 * @param company
	 */
	public final void setCompany(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String company)
	{
		getMendixObject().setValue(context, MemberNames.Company.toString(), company);
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
	 * @return value of AddressLine1
	 */
	public final java.lang.String getAddressLine1()
	{
		return getAddressLine1(getContext());
	}

	/**
	 * @param context
	 * @return value of AddressLine1
	 */
	public final java.lang.String getAddressLine1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AddressLine1.toString());
	}

	/**
	 * Set value of AddressLine1
	 * @param addressline1
	 */
	public final void setAddressLine1(java.lang.String addressline1)
	{
		setAddressLine1(getContext(), addressline1);
	}

	/**
	 * Set value of AddressLine1
	 * @param context
	 * @param addressline1
	 */
	public final void setAddressLine1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String addressline1)
	{
		getMendixObject().setValue(context, MemberNames.AddressLine1.toString(), addressline1);
	}

	/**
	 * @return value of AddressLine2
	 */
	public final java.lang.String getAddressLine2()
	{
		return getAddressLine2(getContext());
	}

	/**
	 * @param context
	 * @return value of AddressLine2
	 */
	public final java.lang.String getAddressLine2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AddressLine2.toString());
	}

	/**
	 * Set value of AddressLine2
	 * @param addressline2
	 */
	public final void setAddressLine2(java.lang.String addressline2)
	{
		setAddressLine2(getContext(), addressline2);
	}

	/**
	 * Set value of AddressLine2
	 * @param context
	 * @param addressline2
	 */
	public final void setAddressLine2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String addressline2)
	{
		getMendixObject().setValue(context, MemberNames.AddressLine2.toString(), addressline2);
	}

	/**
	 * @return value of AddressLine3
	 */
	public final java.lang.String getAddressLine3()
	{
		return getAddressLine3(getContext());
	}

	/**
	 * @param context
	 * @return value of AddressLine3
	 */
	public final java.lang.String getAddressLine3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AddressLine3.toString());
	}

	/**
	 * Set value of AddressLine3
	 * @param addressline3
	 */
	public final void setAddressLine3(java.lang.String addressline3)
	{
		setAddressLine3(getContext(), addressline3);
	}

	/**
	 * Set value of AddressLine3
	 * @param context
	 * @param addressline3
	 */
	public final void setAddressLine3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String addressline3)
	{
		getMendixObject().setValue(context, MemberNames.AddressLine3.toString(), addressline3);
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
	 * @return value of Person_Country
	 */
	public final testing.proxies.Country getPerson_Country() throws com.mendix.core.CoreException
	{
		return getPerson_Country(getContext());
	}

	/**
	 * @param context
	 * @return value of Person_Country
	 */
	public final testing.proxies.Country getPerson_Country(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testing.proxies.Country result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Person_Country.toString());
		if (identifier != null)
			result = testing.proxies.Country.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Person_Country
	 * @param person_country
	 */
	public final void setPerson_Country(testing.proxies.Country person_country)
	{
		setPerson_Country(getContext(), person_country);
	}

	/**
	 * Set value of Person_Country
	 * @param context
	 * @param person_country
	 */
	public final void setPerson_Country(com.mendix.systemwideinterfaces.core.IContext context, testing.proxies.Country person_country)
	{
		if (person_country == null)
			getMendixObject().setValue(context, MemberNames.Person_Country.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Person_Country.toString(), person_country.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return personMendixObject;
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
			final testing.proxies.Person that = (testing.proxies.Person) obj;
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
		return "Testing.Person";
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
