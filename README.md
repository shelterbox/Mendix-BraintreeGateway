# Mendix-BraintreeGateway 💳
This module is used to intergrate Braintree into Mendix. It requires the [Mendix-BraintreeDropIn](https://github.com/shelterbox/Mendix-BraintreeDropIn) pluggable widget.

 - [How to setup](#how-to-setup-)
 - [Useful links](#useful-links-)

## How to setup 🔧
### Server
1. Fill out the API constants:
     - Environment > ``BraintreeEnvironment``
     - Merchant ID > ``BraintreeMerchantID``
     - Private key > ``BraintreePrivateKey``
     - Public key > ``BraintreePublicKey``
2. Add the ``AS_CreateBraintree`` microflow action to application startup. This will initialise the API connection.
3. Use the ``SUB_CreateClient`` microflow to create a client instance. You can optionally pass a ``CustomerID`` to display vaulted payment methods for that customer.
4. Finally use the ``SUB_CreateTransaction`` microflow to create a transaction. Pass the client data and billing address.

### Client
1. Create a page with ``Client`` entity as the dataview.
2. Drop the Drop-in widget into the dataview.
3. Configure the widget properties.

## Useful links 🔗
 - [Getting started](https://developers.braintreepayments.com/start/overview)
 - [Drop In: Create options](https://braintree.github.io/braintree-web-drop-in/docs/current/module-braintree-web-drop-in.html#.create)
