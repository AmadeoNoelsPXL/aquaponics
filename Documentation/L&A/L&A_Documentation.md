
 ## 8/11/2022
To get started, we started by creating a simple blink led component. We did this by guiding ourselves through the program via the Files => examples => basics => blink buttons. This opened a new window where by using the upload button we could install the provided hardware on one of our ESPs.
After this we moved on to installing a server so we could have it interact with a client at a later stage. To implement this server we used the following steps: file => examples => ESP8266WebServer => HelloServer. If we click the upload button after this, our piece of self-written software will be implemented on the ESP we currently have attached to our computer.
After we had implemented the server, we got to work on creating a client. We did this using the following steps File => examples => ESP8266WIFI => WIFI. We initialized in the setup method the input of the key pin as well as the output of the led pin. Then in the loop method we added code to check the state of the button so that the light could be adjusted depending on the current state.
problems we have overcome today:
-	We encountered many problems in the beginning for setting up the arduino application. The lecturer did this quite quickly without considering the students in the process.
-	Because we often did not fully understand what was expected of us in class, we needed a lot of feedback from the teacher to redirect us here and there and help us on our way to obtaining the solutions

## 9/11/2022

***Node Intro***
<p>We created some injects which send strings via the mqtt out to the mqtt in which is connected with a debugger and shows the injected value in the debug messages.
It's important that the mqtt in topic is the same as the mqtt out topic.<p>

***MQTT exploration with wildcards***
When a client subscribes to a topic, it can subscribe to the exact topic of a published message, or it can use wildcards to subscribe to multiple topics at once.
+: A single-level wildcard replaces one topic level. test/a/+/b -> test/a/ab/b, test/a/ac/b
#: The multi-level wildcard covers many topic levels. The multi-level wildcard must be placed as the last character in the topic and preceded by a forward slash. test/# -> test/a, test/b

***HVAC simulation/integartor***
We started of with a slider connected to a mqtt out, which makes it possible for the user to choose the temperature. An mqtt in will send the choosen temperature to an gauge. 
For the AC an other mqtt in is connected to a switch which separetes the values above 20 and equal-smaller then 20 to make choose specific action depending on the temperature. 
The switch leads to two changes which change the value to On or Off. This changes are connected to an mqtt out which sends the state of the AC to an mqtt in which sends it to a text which shows the state on the user interface. 

***HVAC hardware***
We connected the ESP8266 with a breadboard. On the breadboard the DHT11 Temperature Sensor Module is plugged in. 

