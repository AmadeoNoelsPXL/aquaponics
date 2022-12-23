<template>
    <b-container>
        <b-row style="border-bottom: 4px solid green" class="m-0">
            <b-col>
                <b-img class="m-0" center src="../assets/ownDesign.png" alt="Left image" style="width:120px"></b-img>
                <h2>AQUAPONICS</h2>
            </b-col>
            <b-col cols="4" class="pb-2 align-self-end">
              <b-button style="background-color:white; border:none">
                <b-row>
                  <b-col cols="8" class="pl-0 pr-0" style="color:black">
                    Admin
                  </b-col>
                  <b-col cols="4" class="align-self-center pl-0">
                    <b-img fluid center src="../assets/man-user.png" style="width:40px"></b-img>           
                  </b-col>            
                </b-row>
              </b-button>
            </b-col>      
          </b-row>
        <b-container class="mt-4" style="background-color:#F5F5F5">
            <b-row align-h="center">
                <h1 class="mt-4">LIVE DATA</h1>
            </b-row>
            <b-row cols="3">
                <b-col class="border 2px solid">
                    <div class="border 4px solid">
                        <h5>TEMPERATURE</h5>
                    <b-row class="justify-content:center">
                        <b-col offset="3" class="p-0">
                            <h3 class="m-0">20.3 °C</h3>
                        </b-col>
                        <b-col class="p-0" style="w-auto">
                            <div align="left">
                                <img src="../assets/thermometer.png" alt="Left image" style="width:40px"/>
                            </div>
                        </b-col>
                    </b-row>
                    </div>                    
                </b-col>
                <b-col class="border 2px solid">
                    <div class="border 4px solid">
                        <h5>DIOXIGEN</h5>
                    <b-row class="justify-content:center">
                        <b-col offset="3" class="p-0">
                            <h3 class="m-0">20.3 O2</h3>
                        </b-col>
                        <b-col class="p-0" style="w-auto">
                            <div align="left">
                                <img src="../assets/o2.png" alt="Left image" style="width:40px"/>
                            </div>
                        </b-col>
                    </b-row>
                    </div>                    
                </b-col>
                <b-col class="border 2px solid">
                    <div class="border 4px solid">
                        <h5>POTENTIAL OF HYDROGEN</h5>
                    <b-row class="justify-content:center">
                        <b-col offset="3" class="p-0">
                            <h3 class="m-0">20.3 PH</h3>
                        </b-col>
                        <b-col class="p-0" style="w-auto">
                            <div align="left">
                                <img src="../assets/ph-meter.png" alt="Left image" style="width:40px"/>
                            </div>
                        </b-col>
                    </b-row>
                    </div>                    
                </b-col> 
            </b-row>
            <b-row class="mt-4" align-h="center">
                <p>last updated : 23/12/2022 17:44 </p>
            </b-row>
            <b-row align-h="center">
                <h1 class="mt-4">STATISTICS</h1>
            </b-row>
            <b-row class="justify-content-center">
                <b-col class="shadow-lg p-3 mb-5 bg-white rounded">
                    test
                </b-col>
            </b-row>

        </b-container>
    </b-container>
</template>