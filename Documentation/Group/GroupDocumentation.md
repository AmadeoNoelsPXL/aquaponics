# Week 1 




# Week 2

## 14/11

### IOT Integration task :

We are getting the RFID Reader wemos d1 flashed. The Wemos d1 that will be used for the RFID scanner is flashed however we tried to research on how to send data of what the RFID reader is receiving via MQTT.  Still didn’t work but because our RFID reader is actual damaged in a matter we do not understand, and we tested with another teams RFID reader and the program actual works. The lecturer tried to re soldered er the RFID reader, but it failed, and the RFID reader does not work. We are now trying to connect the relay to a female wemos but the wemos was incorrectly soldered so we are using a different one. We are now getting the relay and lock to work.  We have configured the relay to function with the lock so that we could send mqtt messages from node red and receive them on the programmed wemos d1 mini with the topic Relay_Shield/Lock/set as shown in the screen shot with the node red flow which is referenced in the images folder , the image is RelayNodeRed.

What would happen when we flip the switch in node red it would send an on signal to the topic and then the lock would respond by either locking or unlocking.
 
Here is our setup.cpp file for the lock of the image referenced is called SetupimageRelay.

We are building the rest of the integration with the traffic light and the rfid senor works and are able to send data via MQTT and be able to build logic to have the lights of the traffic light switch on based on certain conditions such as turning the light red for access denied and turning green for having the right key card.  We wired the traffic light incorrectly by putting the red into ground instead of D2. However regardless the red light constantly remained on  but we are rewiring the traffic light hardware to a female wemos. We plugged the wire meant for green into the yellow pin. We got the traffic light working and there will be images to display how the works. We are now re integrating the lock and relay and we are testing using previous complied logic. We used the wrong pin output for the logic and now it works. Our topic now was incorrect. So, we had to use D1 instead of D2 since the data line in the relay is connected to D1. 

We now trying to now integrate the buzzer and we have to use another wemos and are flashing using the PI for the initial. We are looking into the documentation. When access is granted, the buzzer does make a sound. So Lastly we have the flow that made the program function as best as it.

Refer to all the images for the hardware as Integration[number]Hardware and for the node red flow as noderedintegrationnode3 in the images folder.
 
 
# Week 3

## 24/11

### Tutorial : Create Root-CA, Endcertificate, Use these Certificates to secure the communication between mqttbroker and the mosquitto_sub/pub task : 

IWe installed XCA which is a certificate management software and was instructed to make a root certificate and a client and server certificate. We along with our groupmates explored the architecture/system of how certificates work. 


We are also learning how to actually create the certificate within our local linux subsystems and not via the raspberry pi for tutorial purposes.


We are creating a certificate which will be a root CA certificate and defining its basic characteristics


We are always generating a new key for each certificate we make. 


More definition we are giving to the Root CA


Summary of the details of my root CA

Now we are going to create to end certificates for web application purposes.

This is my MQTT Server Certificate Summary 
 
MQTT Client Certificate Summary 
 
We are show two scenarios with an httpserver and the interactions with the certificates.
We are exporting the root CA using the PEM format 
We are also exporting the end entity certificate (Server and Client) but we a different method which is the pem chain which has all certificates upto the root. 
 
We also need to export the keys to unlock the certificates.
We export with encryption because then it is password encrypted.
 
We are configure the mqtt broker to work , server with the certificates but the lectuere is busy with that.

### Project Implementation:

We also did part of the project implementation with some assistance such as wiring the two esp8266’s with the temperature and scale.
 

Also, We worked as a  team to get node red running and have the mqtt topics configured as shown in the node red screen shot. We had to make use of the IOTEmpower framework as we had no framework of our own.
 
Also, along my team we flashed the two esp’s with code that would have us read the temperature , humidity and weight of the scale and pass that to node-red as shown in the setup.cpp files shown below.

  
Lastly After the flashing and after receiving data we were able to pass data using these topics and having the program running and then having a temporary node-red UI as a stand in for front end display the data. I just quickly put that together since there was not enough time to fill flesh out the system.


