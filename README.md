# foodaround-telegram-bot

## Setup SSL certificate:
##

1- Use lets encrypt

2- Create certificate for no software on the right operating system

3- Once the files are generated (usually uner /etc/letsencrypt) we need a keystore.js file. To create that file:

 3-1 Create a PKCS12 file containing full chain and private key
       
       openssl pkcs12 -export -in fullchain.pem -inkey privkey.pem -out pkcs.p12 -name NAME
       
   3-2 Convert PKCS12 to Keystore
       
       The STORE_PASS is the password which was entered in step 2) as a password for the pkcs12 file.
       
       keytool -importkeystore -deststorepass PASSWORD_STORE -destkeypass PASSWORD_KEYPASS -destkeystore keystore.jks -srckeystore pkcs.p12 -srcstoretype PKCS12 -srcstorepass STORE_PASS -alias NAME
       
4- Refer to this file in config.yml 
5- Start the service using the finished config.yml file.    
