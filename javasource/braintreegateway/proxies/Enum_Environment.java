// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package braintreegateway.proxies;

public enum Enum_Environment
{
	production(new java.lang.String[][] { new java.lang.String[] { "en_US", "" }, new java.lang.String[] { "en_GB", "production" } }),
	sandbox(new java.lang.String[][] { new java.lang.String[] { "en_US", "" }, new java.lang.String[] { "en_GB", "sandbox" } }),
	development(new java.lang.String[][] { new java.lang.String[] { "en_US", "" }, new java.lang.String[] { "en_GB", "development" } }),
	qa(new java.lang.String[][] { new java.lang.String[] { "en_US", "" }, new java.lang.String[] { "en_GB", "qa" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_Environment(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_GB");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_GB");
	}
}
