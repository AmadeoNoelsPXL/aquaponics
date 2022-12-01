Week 1 




Week 2

14/11

IOT Integration task :

We are getting the RFID Reader wemos d1 flashed. The Wemos d1 that will be used for the RFID scanner is flashed however we tried to research on how to send data of what the RFID reader is receiving via MQTT.  Still didn’t work but because our RFID reader is actual damaged in a matter we do not understand, and we tested with another teams RFID reader and the program actual works. The lecturer tried to re soldered er the RFID reader, but it failed, and the RFID reader does not work. We are now trying to connect the relay to a female wemos but the wemos was incorrectly soldered so we are using a different one. We are now getting the relay and lock to work.  We have configured the relay to function with the lock so that we could send mqtt messages from node red and receive them on the programmed wemos d1 mini with the topic Relay_Shield/Lock/set as shown in the screen shot with the node red flow which is referenced in the images folder , the image is RelayNodeRed.

What would happen when we flip the switch in node red it would send an on signal to the topic and then the lock would respond by either locking or unlocking.
 
Here is our setup.cpp file for the lock of the image referenced is called SetupimageRelay.

We are building the rest of the integration with the traffic light and the rfid senor works and are able to send data via MQTT and be able to build logic to have the lights of the traffic light switch on based on certain conditions such as turning the light red for access denied and turning green for having the right key card.  We wired the traffic light incorrectly by putting the red into ground instead of D2. However regardless the red light constantly remained on  but we are rewiring the traffic light hardware to a female wemos. We plugged the wire meant for green into the yellow pin. We got the traffic light working and there will be images to display how the works. We are now re integrating the lock and relay and we are testing using previous complied logic. We used the wrong pin output for the logic and now it works. Our topic now was incorrect. So, we had to use D1 instead of D2 since the data line in the relay is connected to D1. 

We now trying to now integrate the buzzer and we have to use another wemos and are flashing using the PI for the initial. We are looking into the documentation. When access is granted, the buzzer does make a sound. So Lastly we have the flow that made the program function as best as it.

Refer to all the images for the hardware as Integration[number]Hardware and for the node red flow as noderedintegrationnode3 in the images folder.
 
 
Week 3
