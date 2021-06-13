# Binance Smart Chain Developer Java API
Java wrapper around https://bscscan.com/apis

The Binance Smart Chain Developer APIs are provided as a community service and without warranty, so please use what you need and no more. We support both GET/POST requests and there is a rate limit of 5 calls per sec/IP.


## How To

### Auth
- Param - String: APIKEY
```java
/* Recommend setting environment variable for BSC api key. */
BscAuth.setApiKey(System.getenv("APIKEY"));
```
 ## Tokens
 ### Total Supply Given a Contract Address
 - Param - String: Contract Address
 - returns String
 ```java
 JarBsc.api.tokens().getTotalSupply("0xb24434065fddcdd2f4b31d8cbd6f146119b37ee1");
 ```
 

