# Mendix-BraintreeGateway 💳
This module is used to intergrate Braintree into Mendix. It requires the [Mendix-BraintreeDropIn](https://github.com/shelterbox/Mendix-BraintreeDropIn) pluggable widget.

 - [How to setup](#how-to-setup-)
 - [Useful links](#useful-links-)

## How to setup 🔧
1. You need to initialise the connection to Braintree with the 'CreateBraintree' Java action. Fill out your Merchant ID, public key and private key as well as the environment you want to run on. Run this action when your Mendix application starts.
2. Use the 'SUB_CreateClient' microflow to create a client instance. You can optionally pass a customer ID to use an existing payment method for a returning customer.
3. Finally use the 'SUB_CreateTransaction' microflow to create a transaction. Pass the amount and billing address.

## Useful links 🔗
 - [Getting started](https://developers.braintreepayments.com/start/overview)
 - [Drop In: Create options](https://braintree.github.io/braintree-web-drop-in/docs/current/module-braintree-web-drop-in.html#.create)
