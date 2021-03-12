package braintreegateway.actions.tools;

import com.braintreegateway.*;

public class Payment {
	public static BraintreeGateway gateway;
	
	public static String generateClientToken() {
		return Payment.gateway.clientToken().generate();
	}
	
	public static String generateClientToken(String customerID) {
		ClientTokenRequest clientTokenRequest = new ClientTokenRequest().customerId(customerID);
		return Payment.gateway.clientToken().generate(clientTokenRequest);
	}
}
