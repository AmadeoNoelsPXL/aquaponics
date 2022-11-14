
###Lena Aschauer
What type of programming experience?
Basic skills in Java, C, Python

What have you done with micro controllers, which ones have you used? (Like Arduino, ESP8266, Particle/Photon)
I haven’t used any micro controllers. 

Which single board computers do you know/have you used (Raspberry Pi, Orange Pi, Beaglebone, Labrador)?
I haven’t used any board computers. 

Who is a maker or part of a maker community? What do you like, would you like about it? How could it relate to this class?
I had crafts in junior high school, which I enjoyed. It's nice to be able to work with your own hands. IoT represents the interface between hard and software, so I assume that we need it to connect hardware components.

What do you already know about IoT? 
I have to say, I didn’t really know anything about it. I know that objects like Alexa and smart cars belong to it but not more. 

What are your expectations from this class?
That we learn here how we can optimally connect and optimize the hardware components in our project with the software.

Lecture 1 – 07.11.2022

small personal summary + likes/dislikes strange things, quirks, help given and received

What does the Internet of Things entail?

A simple Internet of Things definition is that it is a huge worldwide network of connected objects. These 'things' are embedded with sensors, processors and software to collect and share data about the way they are used and about the environment around them. An Internet of Things platform integrates data from the different devices and applies analytics to share the most valuable information with applications built to address specific needs.
https://www.nanowerk.com/smart/internet-of-things-explained.php

Domains:

Industrial - IIoT monitors the quality of any product at each stage, from procurement to the final delivery. Moreover, it corrects and prevents risks in the product lifecycle.

Medical - tracking how many patients are in a hospital, receiving the correct medicine for a patient, and monitoring their health at a distance, also known as Telemedicine

Building and House Automation - users can manage wireless instruments from anywhere. 

Protocols:
The benefit and value of IoT comes from enabling the components to communicate.
This communication happens via IoT protocols, which ensure that data sent from endpoint devices, such as sensors, is received and understood by the next and subsequent steps in the connected environment, whether the next step for that data is to another endpoint device or a gateway or an application.

1. AMQP Short for Advanced Message Queuing Protocol, AMQP is an open standard protocol used for more message-oriented middleware. 

2. Bluetooth is a short-range wireless technology that uses short-wavelength, ultrahigh-frequency radio waves. 

3. Cellular provides high bandwidth and reliable communication. It's capable of sending high quantities of data, which is an important capability for many IoT deployments. 

Typical Devices:
Home Security  - The key driver behind smart and secure homes is IoT. A variety of sensors, lights, alarms and cameras (all of which can be controlled from a smartphone) are connected via IoT to provide 24x7 security. 

Activity Trackers - Smart home security cameras provide alerts and peace of mind. Activity trackers are sensor devices that can monitor and transmit key health indicators in real-time. You can track and manage your blood pressure, appetite, physical movement and oxygen levels.




#LikeABosch

Wearables – Smartphone connected with fridge
Smart Cities – autonomous cars 

Benefits of IoT:
Better use of resources and assets
Cost-effective operation
Improved work safety
Efficiency and productivity
Improved experience

Challenges IoT:
Security flaws
Power supply dependence
Network dependence
Associated costs

ESP8266

Why esp8266?
Has changed his live. You can easily program this network and attach LEDs sensors etc. to it. Everything is affordable.  It’s the bridge from software to hardware. 

What is personally inspiring for you?
It makes it possible for everyone to create new things, no matter how much money you have. 

What is the connection to coffee?
Espresso Light was the first version – changed how we design and build things because it’s so cheap. It’s the same price as the price of a coffee.  

The Kit
Take a look at our table.

Gateway setup log

We started of by downloading the image for the raspberry pi which our professors provide for us. After some problems we were able to flash the image via the flashing software balena etcher to the rpi. Then we were able to connect the rpi with the wifi and so we had our own local network.

It was also very exciting to set up our own IoTempower gateway. This will certainly help us in our project, since we want to work with a Raspberry Pi. However, we also had problems, because the flashing of the pi image to the SD card crashed every time. In the end it turned out that our wifi card was unfortunately broken. 

Gateway service offered

After that we took a look at the provided services. We have now access to IoTempower via a web browser. Via ioTempower we are able to use Node-RED and the Node-RED UI as well as the file-system of IoTempower and a documentation about everything. 


Reflection: 
Today I got my first insight into working with IoT. I had nothing to do with it before. It was exciting to see the different components of a network and to learn about them. I didn't know there were so many different sensors and I'm impressed with what's possible. My teammates Josh, Kyle and Luthando were very helpful because they could explain some things to me and Amadeo in more detail since they have already worked with it. We worked together on the list and created a good overview of everything through it. The video about the Espresso Light and esp8266 was also very interesting. The video brought everything important to the point and you can take a lot from it.



Lecture 2 – 08.11.2022

Arduino IDE, drivers + Arduino Hello World (just blink on Wemos D1 Mini)

Wemos D1 Mini, pinout and general intro info, Breadboards and dupont cables

Wifi connect

Led on/off on Webserver

Pull-ups and touch buttons

Second ESP8266 with button as Webclient, controlling Webserver

Second LED

Second button

Reflection
Our first day was not exactly optimal. We got acquainted with the hardware and the programs, which took quite a long time and still not everything was clear to us. But we got through it and when we put our hands on everything it got a lot better. The professor was also very supportive. It was especially difficult for us to understand the professor's assignment correctly. Therefore, it often happened that we did something wrong or did something completely different than we should have done. But the professor always brought us back on the right track and also supported us with our "extra tasks". But also our colleagues Josh and Malu supported us well and always came to our aid when we were stuck. at the end of the day we definitely knew our way around a lot better. [...]  We learned how to make a light on an ESP8266 shine, how to set up a web client and server, and how to (almost) break an ESP8266. Be careful with the 5 Volt.

