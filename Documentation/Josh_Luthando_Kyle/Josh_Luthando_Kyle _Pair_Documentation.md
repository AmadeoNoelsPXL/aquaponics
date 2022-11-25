Extra note : All for the pair documenetation are in the images folder if the taask has been completed. Also with in the specific tasks I will refer to them by mention.

Week 1

Day 1

07/11

Introduction to IOT Module:
Entered the IOT Classroom and introduced each other to the Lecturer.
Learnt some concepts about IOT such as edge computing, swarm and the basic definition of Internet of Things. Also, we had a look at some hardware such as the wemos d1 mini as well as a raspberry pi 400. Also, we looked at some sensors we had provide such as temperature sensors, distance sensors and so on. Lastly for the end of the day we flashed the pi 400 in other to make a Wi-Fi server/ gateway in order to connect to it like a regular router but also establish a network based on what the pi is connected to. 


Day 2

08/11

Arduino IDE and Hello World:
Got the led to work with the wemos d1 mini. We wrote logic to the board to switch the built in led on and off. Webserver also to be configured to be able to turn on light of the other wemos d1 mini.

Wemos D1 Mini, pinout and general info:
We did look into the architecture of the Wemos d1 mini and the representation of the different pins. Please refer to the relevant image with the task name in the image 

Wifi Connect and Led on/off on Webserver:
Struggling to get the webserver. Webserver working but light not blinking yet. Looked at documentation for any guidance. I did receive help in that regard, and we managed to get the program up and running entirely.

IOT Story Secnario
Also, we had to make a story driven IOT scenario for our aquaponics project and not just one but two as for the project we were split into two for the purposes of paired programming. The story had to be really developed and detailed.
 
Pull-ups and touch buttons:
We could not complete thos task due to the lack of an understanding of the requirements of the task.

Second ESP8266 with button as Webclient, Second LED , Second button
We could not complete the any objectives to do with the second node and th relevant webserver and client taks because as shown in the Arduino ide screen we can send any requests to our server and do not understand why.  

Day 3 

09/11

1 IOT Scenario per pair:
Presented the aquaponics scenario and received feedback for it. 

IoTempower Intoduction:
Then we continued to fumble around with IOT hardware as we began to embark on complete specific tasks such as having to configure node red via a given platform IOTempower what is remotely hosted and whereby we could collaborate on node red projects. 

Arduino IDE Reconfiguraton:
Also, we configured and got the Arduino IDE platform to also function so the we could the flash the wemos d1 mini with specific instructions that we have coded and it will perform those instructions. However, the IDE was configured barely on Day 2.

HVAC simulators , integrator , hardware with MQTT , Hardware Reporters: 
A major task we had to perform in pairs was to make Air Conditioner like simulator digitally via node red and using a MQTT broker to relay messages over a network which I did manage and even did some javascript functions to perform certain decion making.
 
However, at a certain point we were instructed to swap out some of the digital elements such as the input (temperature sensor data) with the actual sensor itself which was a major challenge as this requires knowledge of MQTT (PubSub) but also the specific sensor you are trying to read data from.  We did require help in understanding how to actual use certain libraries to have the wemos d1 mini interact with the sensor and node red via mqtt and got the program working to satisfactory level. 

MQTT exploration:
Also, we had to make use of mqtt wildcards within node red which is the # and the + which allows dynamic publishing and subscriptions to various topics.Please find a visual example for reference.
 
 
 IOT Architecture:
 As a group we were tasked in creating a pseudo architecture for what our IOT system could look like , however it is not detailed as we did not really have a crystal clear picture of what we wanted  but we had a relative idea.
 
 
Day 4

11/11

First Node(Manual Flash) and Second Node -button, led, connect in Noded-Red: 
We did not embark on this task but we embark on some of the other tasks as we were failing behind.

Button to sound and notification:
We did move on and looked to working with the other sensors such as doing a simple push button exercise for the wemos d1, though there were a couple of crashes with the program. So, the thing is with the button exercise, its “sounds” simple but it was quite the challenge due to having to output a sound after the button was pressed. The thing is this had to be done via MQTT as well as we had a couple of bugs and crashes and asking for help sessions but finally on a teammate laptop, we got the program to function. 
 
Text receiver on display:
Also, we had to program a function to send input text from node red to an OLED display connected to the d1. The initial struggle was just getting the wiring done correctly. We had to even search up for schematics of the OLED display just to understand how to have the thing wired to the d1 mini. After that we got libraries and coded the webserver as well as the OLED display portion as that it was ready for use but no avail it did not work at all. We tried to see if it had something to do with the program, we flashed to the wemos but still nothing, we asked for help and still nothing. So, while my team/pair partner moved on to sending a message via node red via pushing a button. We tried a few more times with the OLED as we were losing time but eventually, We caved in and stopped and moved on to help my pair partner create the program for the button push notification.

 
Before further discussion of the next task of the day, this was supposed  be where we give input for our oled to display.


Push Notification task/ Internet Push button:
 For the push notification task we used simple push; Luthando downloaded a simple push node and setup the node red/ MQTT side, and my partner helped me with flashing the program on the hardware to send a ping via MQTT to node red. Also, there are a few images below just to illustrate some of the explained content. The first image shows a local implementation of the task. The second and third image shows how we tackled the task as intended we had a button that we pressed and that would send a signal as indicated in the setup file so that when received by node red it can then send a push notification.
 
Moisture Sensor + Voltage Divider:
....Ask Team 3

Ultrasonic + Node RED filter + Voltage Divider: 
....Ask Team 3

RFID reader:
We did do the RFID reader task but we intergrated into with in the integration task as it came of better importance there. As there weill be a repeat reference image of how the hardware looks as well as the setup.cpp file. Some of the tags work and some do not work.

Week 2 

Day 1

14/11
Integration Task (all devices +Integration + Dash-Board):
iot upgrade to be able to flash and upgrade the firmware of the pi 400. We are now partaking on completing the integration task whereby we have to build a security system with a bunch of sensors. We got assistance with upgrade the pi 400 since we were getting access denied errors. We tried completing the RFID and Distance senor task in our pairs and we had to resize the memory of the pi 400 for we had around 3.7 GB of space left, so with the space resize we have around 11 GB more of space. The resize is taking a bit of time. The resize finally worked and we got the wemos for the Distance sensor exercise. We are getting the RFID Reader wemos d1 flashed. The Wemos d1 that will be used for the RFID scanner is flashed however I am trying to research on how to send data of what the RFID reader is receiving via MQTT.  Still didn’t work but because our RFID reader is actual damaged in a matter we do not understand, and we tested with another teams RFID reader and the program actual works. The lecturer tried to re soldered er the RFID reader, but it failed, and the RFID reader does not work. We are now trying to connect the relay to a female wemos but the wemos was incorrectly soldered so we are using a different one. We are now getting the relay and lock to work.  We have configured the relay to function with the lock so that we could send mqtt messages from node red and receive them on the programmed wemos d1 mini with the topic Relay_Shield/Lock/set as shown in the screen shot with the node red flow.

We are building the rest of the integration with the traffic light and the rfid senor works and are able to send data via MQTT and be able to build logic to have the lights of the traffic light switch on based on certain conditions such as turning the light red for access denied and turning green for having the right key card.  Luthando wired the traffic light incorrectly by putting the red into ground instead of D2. However regardless the red light constantly remained on  but we are rewiring the traffic light hardware to a female wemos. We plugged the wire meant for green into the yellow pin. We got the traffic light working and there will be images to display how the works. We are now re integrating the lock and relay and we are testing using previous complied logic. We used the wrong pin output for the logic and now it works. Our topic now was incorrect. So, we had to use D1 instead of D2 since the data line in the relay is connected to D1.  
 
We now trying to now integrate the buzzer and we have to use another wemos and are flashing using the PI for the initial. We are looking into the documentation. When access is granted, the buzzer does make a sound. So Lastly we have the flow that made the program function as best as it.

There will be reference images of the Node Red flow as will as the Hardware implemenatation.
 
Day 2

15/11

We installed the windows subsystem for Linux which is a Debian installation and installed the libraries we were assigned to install. I also had to introduce my self as well as participate in an introductory presentation in presenting a scenario about our supposed future IOT system.  After having Debian installed, I did a few exercises whereby I had to install the snode.c framework by cloning it and installing it in a local installation using Qt Creator. However, to make use of Qt Creator We had to configure the compiler to use GCC or Clang in order to build the framwork. After the build was correctly completed successfully. There will be an folder with the build components alongside the original snode.c folder. After that I did an exercise where by we had to run an http client but had to run a legacy server first before I could run the client. After getting the build to work with the help of the lecturer since I was new to the snode.c framework. After that we went Qt Creator and deploy the snode.c project which install the entire framework globally , meaning on the entire sub system (root folder) so that the framework is not constrained to an interior folder.  Lastly for the day after deploying the framework we had to clone another repository which is the mqtt broker repository. After that we had to build like with the snode.c framework and after the build was complete. I had to then dig with the folders of the build to find and configure the mqtt broker before we could run the broker before any messages could be sent to the broker.

Day 3 

17/11

-..What happened pair wise... 

Week 3

Day 1

21/11

One of our pair partners (Josias Hoffman) has received help from another team to install the updated clones of the two repos onto our raspberry pi. However, we are having troubles installing stuff system wide such as the snod.c framework but so we as a team cannot continue further but I hope to catchup later. I am learning about the mqtt broker architecture and how this links with snode.c framework but since our pi is not properly configured, I cannot continue on the actual pi.
 
But at the end of the day Wehad to get help from the lecture and he sent us his configured mqtt broker program and pushed it to git hub. So, I clone that updated file.

Day 2

23/11

We are going to disable the mosquitto broker from running automatically on the raspberry pi. So we are going to use our mqtt broker that was coded the day before. Such as by going into the system files. Also we are trying to have node red run but we are running into issues , the starter does not function as intended, it seems it was already in use. To see how we can see what is running , we used a command , “ps -aef | grep node -red”.  To make sure the snode.c and the mqttbroker files install system wide on the pi we run the command sudo “filename” make install. We had to compile the files beforehand. We focused on some project work wereby we had to implement some of the IOT concepts we learnt into our overarching project.

Day 3 

24/11
.....

Day 4

25/11
.....
