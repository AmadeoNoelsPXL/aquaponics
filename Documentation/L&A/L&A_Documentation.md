
 ## 8/11/2022

***Arduino IDE, drivers + Arduino Hello World (just blink on Wemos D1 Mini) <br>***
We started by installing Arduino IDE. You have to teach the Arduino IDE to handle the Wemos D1 Mini Board. So first go to File -> Preferences and click on the icon next to "Additional board manager URLs". In the window that pops up, enter the following in a separate line: https://arduino.esp8266.com/stable/package_esp8266com_index.json. Then we went to Tools -> Board -> Board Manager, searched for "esp8266" and install the package. If the board is not recognized, then  the ch340 driver for the USB-to-serial adapter is missing, which we installed. 
<br>We started by creating a simple blink led component. We did this by guiding ourselves through the program via the Files => examples => basics => blink buttons. This opened a new window where by using the upload button we could install the provided hardware on one of our ESPs.
After this we moved on to installing a server so we could have it interact with a client at a later stage. To implement this server we used the following steps: file => examples => ESP8266WebServer => HelloServer. If we click the upload button after this, our piece of self-written software will be implemented on the ESP we currently have attached to our computer.

***Wemos D1 Mini, pinout and general intro info, Breadboards and dupont cables*** <br>
The heart of our Wemos D1 Mini Board is the ESP8266EX chip. This is a powerful 32 bit microcontroller with integrated W-LAN interface. The D1 Mini is  versatile because it is inexpensive, WiFi-enabled, and fully compatible with the Arduino platform. The D1 Mini has an ESP8266 at its core, which means that it can do many of the things an Arduino board can do (analog input, digital input, I2C, etc.).

An overview about the pins: <br>
<img src="images/WemosD1Pinout.jpg" alt="drawing" width="500"/> <br>

Breadboard:
A Breadboard is simply a board for prototyping or building circuits on. It allows you to place components and connections on the board to make circuits without soldering. The holes in the breadboard take care of your connections by physically holding onto parts or wires where you put them and electrically connecting them inside the board. <br>

Dupont cables:
Jumper wires are simply wires that have connector pins at each end, allowing them to be used to connect two points to each other without soldering. Jumper wires are typically used with breadboards and other prototyping tools in order to make it easy to change a circuit as needed. <br>

***Wifi connect***<br>
The D1 Mini can handle WiFi communication. The WiFi communication enables the D1 Mini to act as a local server and so much more. We implementet the D1 Mini as a WiFi server by communicating between a device and the D1 Mini by communicating on a local host webpage. 


***Led on/off on Webserver***<br>
After we had implemented the server, we got to work on creating a client. We did this using the following steps File => examples => ESP8266WIFI => WIFI. We initialized in the setup method the input of the key pin as well as the output of the led pin. Then in the loop method we added code to check the state of the button so that the light could be adjusted depending on the current state. <br>


***Pull-ups and touch buttons***<br>

***Second ESP8266 with button as Webclient, controlling Webserver*** <br>

***Second LED***<br>

***Second button***<br>


<br>***problems we have overcome today:***
-	We encountered many problems in the beginning for setting up the arduino application. The lecturer did this quite quickly without considering the students in the process.
-	Because we often did not fully understand what was expected of us in class, we needed a lot of feedback from the teacher to redirect us here and there and help us on our way to obtaining the solutions


## 9/11/2022


***Scenario***<br>
Personnel : <br>
Owner: Mara sells fresh vegetables and fish at markets, which come from her aquaponics unit in a rural area. 
Employee: Jon is a farmer and has been taking care of Mara's aquaponics unit since 5 years. He is also a chain smoker.
Technican: Paul is a young student who is currently working as a part-time technican for Mara's aquaponics unit.

Facility IOT Devices : <br>
Soil Moisture Sensor - Detects over-saturated patches of soil
Pump - Measures how much water flows into a tank
Flame sensor - Detects flames within the facility.  
Temp Metre - detect and regulate temperature in the facility
Motion Sensors - Scattered around the facility for movement detection.
Rfid tag scanner - Placed by the entrance to the facility and within the motion sensors around the facility. 
Weight sensor - To measure the weight of the fish in the tank.

Tuesday, 10.01.2022<br>
Mara and Paul were awakened in the morning by a notification on their phone. The soil moistire sensor has detected that the plants don't have enough water. 
Paul gets to the aquaponics facility and scans his rfid tag.
The door unlocks and at the same time Mara gets a notification on her phone that Paul has arrived at the aquaponics facility.
Paul looks at his phone and sees that the pumps and the temp metre are working properly. 
Paul takes a closer look at the facility and discovers that a pipe is leaking, which means less water is getting to the plants. 
Paul repairs the pipe and adds a report on his application. 
Mara gets a notification that the problem with the soil moistire has been solved. 

Monday, 20.04.2022<br>
Jon arrives at the aquaponics facility and scans his rfid tag.
Mara gets a notification that that Jon has arrived at the aquaponics facility.
Jon monitors all the aquaponics devices from his mobile phone while smoking a cigarette.  
After that Jon starts his farmwork by harvesting lettuce and tomatoes.  
While at work, Jon continues to smoke and be careless. He throws his cigarette on a pile of hay and fire starts. 
Mara gets an notification from the flame sensor that flames has been detected at the facility. 
At the same time an emergency call is sent to the fire department.
Mara checks the application and sees that the a motion sensor has detected a lot of movement in the facility, so she knows, that the firefighters have arrived. 
In the mean time the firefighters manages to extinguish the fire.  
Jon adds a report on the application that the fire has been put out. 
He also enters a command that he is very sorry about the incident and that luckily nothing was damaged.
Jon continues his farmwork without smoking any cigarettes anymore.
In the evening Mara is lying in her bed and takes a look at the reports which has been posted on the application.
Shaking her head, she falls asleep and wonders what is in store for her tomorrow.

Friday, 02.08.2022<br>
Jon arrives at the aquaponics facility. 
Jon takes the fish out of the tank to prepare them for the market and puts in new young fish. 
Mara gets a notfication from the weight sensor, because the weight of the tank has changed drastically. 
Now she knows that Jon has prapered the fish for the market. 
At 5 o'clock Jon signs out via his rfid tag.
Mara receives a notification that Jon has left the facility.


***Node Intro***
<p>We created some injects which send strings via the mqtt out to the mqtt in which is connected with a debugger and shows the injected value in the debug messages.
It's important that the mqtt in topic is the same as the mqtt out topic.<p>

![Tux, the Linux mascot](images/introNode.png)
![Tux, the Linux mascot](images/debugIntroNode.png)
![Tux, the Linux mascot](images/payloadIntroNode.png)


***MQTT exploration with wildcards***
<p> When a client subscribes to a topic, it can subscribe to the exact topic of a published message, or it can use wildcards to subscribe to multiple topics at once.<br>
+: A single-level wildcard replaces one topic level. test/a/+/b -> test/a/ab/b, test/a/ac/b <br>
#: The multi-level wildcard covers many topic levels. The multi-level wildcard must be placed as the last character in the topic and preceded by a forward slash. test/# -> test/a, test/b <p>

***HVAC simulation/integartor***
<p>We started of with a slider connected to a mqtt out, which makes it possible for the user to choose the temperature. An mqtt in will send the choosen temperature to an gauge. 
For the AC an other mqtt in is connected to a switch which separetes the values above 20 and equal-smaller then 20 to make choose specific action depending on the temperature. 
The switch leads to two changes which change the value to On or Off. This changes are connected to an mqtt out which sends the state of the AC to an mqtt in which sends it to a text which shows the state on the user interface.<p>

***HVAC hardware***
<p>We connected the ESP8266 with a breadboard. On the breadboard the DHT11 Temperature Sensor Module is plugged in.<p>

 ***IoT Architecture:<br>***
  <img src="images/IoTArchitecture.jpg" alt="drawing" width="500"/>
 
**Server:** It is a Data Integration Controller equipped with a highly reliable industrial computer and non-programming data integration software. It is capable of collecting, processing, storing, reporting and publishing data through standard data management functions developed.<br>

**Nodes:** The main two features of an IoT node are to manage the interconnection between the hardware and the rest of the network and to recollect the information generated by itself . In other words, the IoT nodes are the elements within an IoT ecosystem that allow the connection of the physical world with the Internet.<br>
 
**Gateway:** An IoT gateway is a centralized hub that connects IoT devices and sensors to cloud-based computing and data processing. IoT gateways are designed to simplify and streamline IoT device communications and management.<br>

**Cloud:** Cloud computing is a platform where one can view a computer, storage and network infrastructure as an abstract entity. This allows us to deploy systems quickly and scale easily. Very important here is thinking of self-service. Which means that users can get started via filling out a Web form.<br>

**Things:** A thing, in the context of the Internet of things (IoT), is an entity or physical object that has a unique identifier, an embedded system and the ability to transfer data over a network.<br>

**Edge:** This is about processing, analyzing and storing data close to where it is generated to enable easy real-time analysis and response.<br>

**Swarm:** Swarm Intelligence systems are decentralized, self-organized algorithms used to resolve complex problems with dynamic properties, incomplete information, and limited computation capabilities. Swarm Intelligence can enable a collection of multiple IoT devices to work together and exchange information, thereby achieving greater utility.<br>

**Fog:** This refers to a layer located between the cloud and the edge. Fog is in the ability to capture information from the edge layer before it reaches the cloud. This aims to decide which driven information is relevant and which is not. This allows the relevant data to be stored in the cloud while the unnecessary information can be removed.<br>
 
***HVAC in hardware with MQTT - temperature reporter***
 
***HVAC in hardware with MQTT - relay switch***

 
## 11/11/2022 

***IoTempower introduction***
 
IoTempower is a framework and environment for everyone to explore and develop for the Internet of Things (IoT). It supports existing IoT deployments and brings mechanisms for over the air (OTA) updates and automatic multi-device deployment. All with a permissable license (and using only libraries with permissable licenses).
IoTempower includes a lot of small scripts to simplify a plethora of tasks supporting the deployment of a small IoT system or MQTT-based IoT environment. <br>

***Tool support***

run/iot: To enter a command in the IoTempower-environmen. You need to use the exec keyword too -> iot exec accesspoint. <br>
menu (F2): Overview over the the most important IoTempower tools via a menu. You can use it to deploy or adapt things. -> iot menu <br>
accesspoint: You can use it to turn built-in WiFi into an accesspoint. You need a root access. -> iot exec accesspoin <br>
upgrade: update the IoTempower, to install the latest version -> iot upgrade <br>
install: You can use it to reinstall the IoTempower environment -> iot install <br>
console_serial: You can use it to see in a a serial console  the debug output of a serially connected node. <br>
initialize: You can use it to flash a serially connected node and initialize it at the same time. Same as deploy serial<br>
adopt: You can use it for a flashed Wemos D1 Mini to wirelessly flash the IoTempower microcontroller without attaching it to the rpi. same as the deploy adopt. <br>
deploy: You can update your software of the IoTempower node after changes.<br>
mqtt_broker: Use it to start a local mqtt broker or mosquitto. <br>
mqtt_listen: Subscribe to a topic to get all configuration data from the environment. <br>
mqtt_send: Publish to a given topic (or the node topic of the current node directory) deriving all configuration data from the current environment.
doc_server: To see the documentation of the server. -> iot doc serve <br>

***Documentation - rfid, pwm, servo, distance, single rgb***

*rfid reader:* <br>
Can be used to create a new mfrc522 rfid/nfc tag reader device connected via SPI. It will report the data read as well as uuid and pic. Use the set topic to write a to the tag. name, how to address it in the mqtt network -> mfrc522(name); <br>
Example: mfrc522(reader); TData of a supported RFID/tag will be reported in node_topic/reader and uid in node_topic/reader/uid (works on most NFC tags) as well as picc in node_topic/reader/uid. <br>
Wiring: Wemos D1 Mini,mfrc522,NodeMCU,rfid-rc522,board - 3V3-3.3V, D8-sda, D7-MOSI, D6-MISO, D5-SCK, D0-RST, G-GND, N/C-IRQ <br>

*PWM:* <br>
Can be used to control the given pin with pulse width modulation (PWM). A different frequency (max. 5000) can be chosen for each port. <br>
-> pwm(name, pin, frequency=1000); <br>
Example: pwm(blue, ONBOARDLED, 2000);  The brightness of the onboard-led can be set to 50% sending 512 to [nodename]/blue/set. <br>

*a servo motor:* <br>
Can be used to create a new servo motor controller. The name it can be addressed via MQTT in the network. <br>
-> servo(name, pin, min_us=600, max_us=2400, turn_time_ms=700); <br>
Example: servo(m1, D4); A motor can be controlled via sending to the mqtt-broker to the topic "node_topic/m1/set" the angle to turn the motor to. <br>

*ultrasonic distance sensor (RCWL-1601):* <br>
Can be used to create a RCWL-1601 ultrasonic distance measuring device. It reads the distance in mm.<br>
-> hcsr04(name, trigger_pin, echo_pin, timeout_us=30000); <br>
Example: hcsr04(distance, D5, D6).with_precision(10); -> Meassures distance between the sensor and an object and react to changes that are bigger or equal to 10mm;<br>

*single rgb led:* <br>
Can be used to create a  rgb device object for an rgb-led connected to the pins pin_r (red pin), pin_g (green pin) and pin_b (blue pin). <br>
-> rgb_single(name, pin_r, pin_g, pin_b, invert=false); <br>
Example: rgb_single(rgb1, D3, D4, D2); The RGB LED can be switched to red via sending to the mqtt-broker to the topic living room/tvlights/rgb1/rgb/set the command red. <br>
 
 ***text receiver on display***
 <p> 
For this task, we got to work with showing an entered text on a display. It was not clear to us how to establish connection between the display and the d1. For this we consulted google to look for an example. After this we looked for the right implementations for coding the web server and the OLED display. Unfortunately, we could not get it working so we switched to NODE-RED to provide an implementation for a button that sent a message when pressed. 

We also had to program a function to send entered text from node red to an OLED display connected to the d1. At first it was difficult to get the wiring right. We even had to look for schematics of the OLED display to understand how to connect the thing to the d1 mini. Then we got libraries and coded the web server and the OLED display so it was ready to use, but to no avail: it didn't work at all. I tried to see if it had something to do with the program, we flashed to wemos but still nothing, we asked for help and still nothing. So, while my team/pair partner switched to sending a message via node red via pressing a button. We tried a few more times with the OLED because we were losing time, but finally we gave in and quit and proceeded to create the program for the push button.

We did this by implementing it a button that would cause pressing the button to send a trigger to the setup file so that when it receives this trigger it can push the message to the NODE-RED 

We did not succeed in this task either and so we consulted our colleagues from our other pair in the group. They stood by us with advice and assistance so we still managed to complete this task successfully.
</p>
 
 ***Button to sound and notification***
 
 We started declaring the button in directory /home/iot/iot-system/demo01/test01, more specific in the setup.cpp.
 
  ![Tux, the Linux mascot](images/setup.cpp.png)

 
 After this, we went to the NODE-red to implement the functionalities.
 We create a mqqt in which is connected to the audio input as well as a debugger and a text.
 Every 5 seconds the state of the button is checked. The possible display options are: "pressed" or "released".
 The Audio out will speak out the state of the button on the user interface.
 

 
 ![Tux, the Linux mascot](images/Sound.png)
 
 In the image below, you can see how the button is implemented on our breadboard.
 
 <img src="images/breadboardSound.png" alt="drawing" width="200"/>
 
  ***Text receiver***
  
 
![Tux, the Linux mascot](images/textNodeRedScheme.png)
![Tux, the Linux mascot](images/TextNodeRedGUI.png)

 
After this, we went to the NODE-red to implement the functionalities.
We inserted a text input that wich is connected to ESP8266 and by mqtt listening to the topic we recevied to the console but for some raison the text could not be displayed by the OLED, after several experimentation we found that is is faulty display. Next we started working on manuallly wiring the pins to the ESP8266.

***Send message through the internet to your phone/Internet-Push-Button***
 
<p>
We started with creating a new channel on discord and then went to the bot and 
We dowloaded the template of node-red-contrib-discord-advanced after this we inserted a discordMessagemanager where we used the token we could received from the discord chanel and the chanelId. Then we used an mqqt in which reveceid the state of our button. This is connected to a switch which filter the data so that only the pressed state will cause an action. This is connected to a change were we set the message which we want to sent to the discord chanel. As last the discordmessageManager send the value of the change to the discord chanel. 
</p>

![Tux, the Linux mascot](images/messageDiscordScheme.png)


***problems faced today***
<p> Today we had to deal with the fact that our raspberry pi could not offer us internet. On this, we asked for help from the teacher to solve this problem. This was easily done by first setting up an ssh connection to our network (ssh 192.168.12.1 -l iot) and then performing a reboot (sudo reboot).</p>

 ## 14/11/2022
 
 ***RFID reader***
<p>
We started flashing our RFID reader. Unfortunately, we had no idea on how to send the data we obtained from reader to the MQTT. We did not get it working despite suspecting our RFID reader might be broken and so we tried to do the same with another group's RFID reader. This did work.

We had the help of us other pair in the group to complete this task. Problems that came up with this task were: an RFID reader that did not work, soldering the wemos incorrectly. 
</p>



 
 
 
 
  
 ***touch sensor***
 
 We created a touch sensor by putting a wire into the analog pin of the ESP8266.
 
  <img src="images/TouchSensor.png" alt="drawing" width="200"/>
 
 
 
 
 
 We created a new folder in the home directory under /home/iot/iot-systems/demo01/TouchSensor
 We changed the setup.cpp file to the following:
 
![Tux, the Linux mascot](images/touchSensorline.png)
 
   
Like you can see in the picture above we used the analog function to get the values. Here we used the filter_binarize which turns analog values to binaries. So only the state pressed or unpressed is showed in the debug.
 
After that we deployed it to the ESP8266. We went to the Node-red where we created an mqqt in with is connected to a debug
  
![Tux, the Linux mascot](images/TouchSensorNodeRed.png) 
 
 
 We tried to follow the guid from the lecture but we faced a problem :
  - there is not enough space on the raspberry pi
  -> solution : resizing and crunching the firmware on the raspbarry pi to make it smaller  

 ***Moisture Sensor***
 <p>
 Jon helped us with the setup. Just to make sure we don't fuck it up again.
 </p>
 
 ## 15/11/2022
 
 Set up virtual machine
 
 
 
  ## 17/11/2022
  
   ***install on the raspberry pi***
   <p>
    - installeren van de dependencies met volgend commando:
    sudo apt install doxygen iwyu clang-format cmake-format libmagic-dev libbackward-cpp-dev libdw-dev libdwarf-dev binutils-dev librange-v3-dev libssl-dev     libeasyloggingpp-dev libbluetooth-dev nlohmann-json3-dev : in de iot-system folder </p>
 
   ***compiling snodec:***
   - aanmaken van een folder: iotprojs
   - daarin nieuwe map: snodec
   - installeren van git
   - clone van de repository: https://github.com/VolkerChristian/snode.c
   - aanmaken nieuwe folder: mqttbroker 
   - clone van de repository: https://github.com/VolkerChristian/mqttbroker
   - terug naar snodec
   - nieuwe folder aanmaken build 
   - commando: cmake ../snode.c/ => zoeken naar Clist <=> 
   - commando: make -j 16 (threads) => compiling snode
   - build directory
      => sudo make install
      
***installeren mqtbroker:***
<br>
***installeren mqtcreator:***

## 21/11/2022

***create an mqqtbrokerwebserver application*** <br>

create new directory => mqqtwebfrontend <br>
right click -> add new -> General -> Empty File -> chose -> name the file -> CMakeLists.txt<br>
copy existing CmakeLists.txt to the new CMakeLists.txt -> only adapt the parts that need to be adapted<br>
CMakeLists.txt<br>
--> line 51 & 53 : rename variable to mqttwebfrontend<br>
--> line 57 : rename variable to mqttwebfrontend<br>
--> line 60 : change targetname to mqqtwebfrontend<br>
--> line 65 : change name to mqqtwebfrontend <br>
--> line 73 : change broker to mqqtwebfrontend<br>
--> line 77 : change to mqttwebfrontend<br>

copy mqttbroker folder content:<br>
--> cpp && h copy (5) them to the mqqtwebfrontend<br>

binary directory /usr/local/bin <br>

--> integrate directory in the whole project <br>

--> root CMakeLists.txt file <br>
add_subdirectory mqttwebfrontend<br>

mqttbroker (main) -> set it as active project <br>

rename mqttbroker.cpp in mqttwebfrontend directory<br>
 --> right click --> Rename --> mqttwebfrontend.cpp<br>

**add webfunctionality**<br>

--> go to snode.c in the filesystem <br>
 source directory ==> src/apps/testpost.cpp<br>
split screen : right side split view<br>

**implement webfrontend**<br>

--> create unencryped <br><br>
add an include (express/legacy/in ...)<br>

copy express line and past it at the end of the line just before "return core:SNodeC::start();<br>
 --> rename legacy to mqttWebView<br>
 --> als server instance to mqttwebview<br>
 
 error thrown : during link fase <br>
  --> we didn't link the webfrontend application to a library <br>
  --> !!! needed for the webfrontendapplication<br>
 
 add library : <br>
  --> CMakeLists.txt (first one) --> find package() src/apps/CMakeLists.txt -> http-server-express<br>
 
 add it in the find package<br>
 
 mqttwebfrontend --> add library --> target_link_libraries<br>
 
 mqttwebfrontend.cpp --> add functionality -->  mqttWebView.listen() -> copy mqttlistenLegancyServer to the mqttWebView.listen()<br>
 
 test the build : directory --> ./mqttwebfrontend --> error legacyin is required --> ./mqttwebfrontend legacyin local --port 1883 tlsin  local --port 8883 legacyun local --path /tmp/mqttwebfrontend mqttwebview local --port 8080 -w<br>
 
the command : ./mqttwebfrontend can now be used because there is a config file present<br>

in the file mqttwebfrontend.cpp: <br>
 --> mqttWebView.get("/test", [] APPLICATION(req, res){<br>
 VLOG(0) << "#############" << "Here we are" << req.originalUrl;<br>
 res.send("Response FROM MQTTWebView");<br>
 });<br>
 
 mqttfrontend --> right click --> add new  --> c/c++ --> c++ Class --> specify name ('MqttModel')<br><br><br>
 line 51 --> add MqttModel.cpp<br><br>
 line 53 --> add MqttModel.h<br>
 
 **build application**
 
 file MqttModel.h<br>
 include 'iot/mqtt/packets/Connect.h'<br>
 --> private : add MqttModel()<br>
 --> public : <br>
    --> static MqttModel & instance(); --> righ click -> refacor -> add definiation MqttModel.cpp<br>
    --> void addConnectedClient(iot::mqtt::packets::Connect& connect); -> right click -> refactor<br>
 
 MqttModel&MqttModel::create(){<br>
 static MqttModel mqttModel;<br>
 --> static means only one time created  <br>
 return mqttModel;<br>
 }<br>
 
 in the file SocketContext.h:<br>
 
 add includ 'iot/mqtt/server/broker/Broker.h'<br>
 
 --> private : <br>
    --> void onConnect(iot::mqtt::packets::Connect& connect) override{<br>
      --> connectionList.push_back(connect);<br>
      }<br>
    --> void onPlublish(iot::mqtt::packets::Publish& publish) override;<br>
    
 refactor fase <br>
 
 onConnect method:<br>
    --> MqttModel::instance().addConnectedClient(connect);<br>
    
 implement method addConnectedClient<br>
 
 in the file MqttModel.h<br>
 
 add include <list><br>
 
 --> public<br>
    --> const std::list<iot::mqtt::packets::Connect>& getConnectedClients();<br>
 
 --> protected:<br>
    --> std::list<iot::mqtt::packets::Connect> connectionList;<br>
 
 in the file MqqtModel.cpp :<br>
 
 --> const std::list<iot::mqtt::packets::Connect>& MqttModel::getConnectedClients(){<br>
 return connectionList;<br>
 }<br>
 
 in the file mqttwebfrontend.cpp<br>
 
 --> mqttWebView.get("/clients", [] APPLICATION(req, res){<br>
 const std::list<iot::mqtt:packets::Connect>& connectList = MqttModel::instance().getConnectedClients();<br>
 MqttModel::instance().getConnectedClients();<br>
 std::string responseString;<br>
 
 for(const iot::mqtt:packets::Connect& connection : connectionList){<br>
  connection.getClientId();<br>
 });<br>
 
 res.send(responseString);<br>
 });<br>
 
 --> header file is missing <br>
 
 --> add an include 'MqttModel.h<br>
 
 
 <img src="images/Code_example.jpg" alt="drawing" width="500"/> <br>
 
 
 
  
 
 
 


  
 
 
 

***problems faced today***<br>

--> not possible to run the file : he cannnot find files snodec::mqqt

 
 ## 23/11/2022

## We have to stop mqtt boot to not being started during boot.<br> ##
-> have to edit the iot>lib>system_boot>raspi-boot.sh file on the rpi. <br>
delete: <br>
new-window -d -n MQTT<br>
su- $IOTEMPOWER_USER -c 'echo iot exec mqtt broker' <br>
new-window -d -n cloudcm <br>
su - $IOTEMPOWER_USER -c 'echo iot exec cloudmd_starter'<br>

command cd .local/bin <br>
command ./nodered_starter <br>
command ps -aef | grep node-red <br>
command node-red <br>
command mqttbroker
 
 ## 25/11/2022
 
 *** XEA - BSP-Connection - Server/Client***
 
 We created a new Certificated. <br>
 We used default CA template. <br>
(Extensions) In the Key identifier, we need to select the Subject Key Identifier.<br>
(Key usage) Select the CRL Sign<br>
(Subject) fill all fields and create key.<br>
 Export File Certificate (.crt)<br>

 <img src="images/Subject_Certificate.jpg" alt="Subject_Certificate" width="500"/> <br>
 
 We created a new Certificate<br>
 we used the TLS-client template.<br>
 Export File Certificate PEM chain (*pem)<br>
 
 We created a new Certificated.<br>
 We used the TLS-server template<br>
 DNS:local<br>
 Export File Certificate PEM chain (*pem) <br>
 
 After that go to Private Key<br>
 Choose Client / Server and export PEM encryped (*.pem)<br>

Terminal: <br>
cd temp/certs/new<br>
mqttbroker tlsin tls --cert-chain GM-IoT-Server.pem --cert-chain GM-IoT-Server.pem --ca-cert-file GM-IoT-Root_CA.crt<br>
mosquitto_sub -t /# --cert GM-IoT-Client.pem --key GM-IoT-Client-Key.pem
