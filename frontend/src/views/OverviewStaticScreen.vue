<template>
    <div class="layout">
        <b-container>
            <b-row align-h="between" align-v="center" style="border-bottom: 4px solid green" class="m-0 justify-between">
                <b-col class="p-0">
                    <b-img left src="../assets/ownDesign.png" style="width:120px"></b-img>                    
                </b-col>
                <b-col id="header" class="p-0 align-self-end text-left">
                    <h1>AQUAPONICS</h1>
                </b-col>
                <b-col class="p-0 align-self-end text-right">
                    <b-dropdown right  class="dropdown mb-2" xl="auto" id="profile__dropdown">
                        <template #button-content>
                            <b-row class="p-1">
                                <b-col class="align-self-center pr-2" xl="auto" style="color:black" >
                                  Admin
                                </b-col>
                                <b-col class="align-self-end p-0">
                                  <b-img right src="../assets/man-user.png" style="width:30px"></b-img>           
                                </b-col>            
                              </b-row>
                        </template>
                        <b-dropdown-item class="p-0" @click="logout">
                            <template>
                                <b-row class="p-0 justify-content-between">
                                    <b-col class="p-0" xl="auto">
                                        <b-img class="p-0" left src="../assets/logout.png" style="width:30px"></b-img>
                                    </b-col>
                                    <b-col class="align-self-center text-right p-0">
                                        Log out
                                    </b-col>
                                </b-row>                                
                            </template>
                        </b-dropdown-item>
                        <b-dropdown-item class="p-0">
                            <template>
                                <b-row class="p-0 justify-content-between" style="width:max-content">
                                    <b-col class="p-0">
                                        <b-img class="p-0" left src="../assets/manageAccount.png" style="width:30px"></b-img>
                                    </b-col>
                                    <b-col class="text-right align-self-center p-0 ml-2">
                                        Manage accounts
                                    </b-col>
                                </b-row>                                
                            </template>
                        </b-dropdown-item>
                    </b-dropdown>           
                </b-col>      
            </b-row>
            <b-container class="data mt-4" style="background-color:#F5F5F5">
                <b-row class="livedata" align-h="center">
                    <h1 class="mt-4">LIVE DATA</h1>
                </b-row>
                <b-row cols="3" class="m-0">
                    <b-row class="justify-content-center">
                        <b-col xl="auto" class="liveData 
                         m-0">
                            <b-row class="p-2 livedata">
                                <b-col cols="auto" class="p-0">
                                    <h5>TEMPERATURE</h5>
                                </b-col>                        
                            </b-row>
                            <b-row class="justify-content-center m-0">
                                <b-col cols="auto" class="p-0">
                                    <h5>20.3 °C</h5>
                                </b-col>                        
                            </b-row>               
                        </b-col>                
                    </b-row>
                    <b-row class="justify-content-center">
                        <b-col xl="auto" class="liveData m-0">
                            <b-row class="p-2">
                                <b-col cols="auto" class="p-0">
                                    <h5>TEMPERATURE</h5>
                                </b-col>                        
                            </b-row>
                            <b-row class="justify-content-center m-0">
                                <b-col cols="auto" class="p-0">
                                    <h5>20.3 °C</h5>
                                </b-col>                        
                            </b-row>               
                        </b-col>                
                    </b-row>
                    <b-row class="justify-content-center">
                        <b-col xl="auto" class="liveData m-0">
                            <b-row class="p-2">
                                <b-col cols="auto" class="p-0">
                                    <h5>TEMPERATURE</h5>
                                </b-col>                        
                            </b-row>
                            <b-row class="justify-content-center m-0">
                                <b-col cols="auto" class="p-0">
                                    <h5>20.3 °C</h5>
                                </b-col>                        
                            </b-row>               
                        </b-col>                
                    </b-row>
                </b-row>
                
                <b-row class="mt-4" align-h="center">
                    <p>last updated : 23/12/2022 17:44 </p>
                </b-row>
                <b-row align-h="center">
                    <h1 class="mt-4">STATISTICS</h1>
                </b-row>
                <b-row style="position:relative" class="line justify-content-center m-5">
                    <b-col v-on:click="test" class="dikke shadow-lg p-3 mb-5 bg-white rounded d-flex justify-content-center">
                        <chart width="500" type="line" :options="options" :series="series"></chart>
                    </b-col>
                    
                    <div v-on:click="test" class="test"><img class="m-1" src="../assets/thermometer.png" width="50px"></div>
                </b-row>
                
                <b-row style="position:relative" class="justify-content-center m-5">
                    <b-col v-on:click="test" class="dikke shadow-lg p-3 mb-5 bg-white rounded d-flex justify-content-center">
                        <chart width="500" type="line" :options="options" :series="series"></chart>
                    </b-col>
                    
                    <div v-on:click="test" class="test"><img class="m-1" src="../assets/o2.png" width="50px"></div>
                </b-row>
                
                <b-row style="position:relative" class="justify-content-center m-5">
                    <b-col v-on:click="test" class="dikke shadow-lg p-3 mb-5 bg-white rounded d-flex justify-content-center">
                        <chart width="500" type="line" :options="options" :series="series"></chart>
                    </b-col>
                    
                    <div v-on:click="test" class="test"><img class="m-1" src="../assets/ph-meter.png" width="50px"></div>
                </b-row>
    
            </b-container>
        </b-container>

    </div>
    
</template>
<script>
import chart from 'vue-apexcharts'
export default{
    components:{
        chart
    }, 
    data(){
        return{
            options:{
                chart:{
                    toolbar:{
                        show: false
                    }

                },
                title:{
                    text:"test"
                }
            },
            series: [{name: "data from the PH meter", data: [44, 55, 41, 17, 15]}],
            
        }
    },
    methods: {
        test(){
            this.$router.push("/TestView")
        },
        logout(){
            sessionStorage.clear();
            this.$router.push("/")
        }
    }
}
</script>
<style scoped>

.layout{
    background: linear-gradient(to right, #00A4E4,#FEFEFE);
}

.test{
    background-color: lightgreen;
    position: absolute;
    top: -30px;
    border-radius: 5px;
    box-shadow: 5px 10px 18px #888888;

}

.col.dikke:hover{
    background-color: yellow !important;
}

.liveData{
    box-shadow: 5px 10px 18px #888888;
    border-radius: 5px;
    background-color: lightgreen;
    border-style: solid;
    border-color: lightgreen;
}

.row{
    margin: 0px;
}

#header {
    font-size: 4em;
    font-family: arial;  
    text-transform: uppercase;
    color: transparent;
    -webkit-text-stroke: 2px #167caa;
    margin: 0px;
  }
.btn {
    padding: 0px;
}

.btn:hover {
    background-color: white;
}

.dropdown-menu{
    width:max-content
}
</style>

<style>
#profile__dropdown__BV_toggle_, #profile__dropdown__BV_toggle_:hover, #profile__dropdown__BV_toggle_:active, #profile__dropdown__BV_toggle_:focus {
    border: none !important;
    box-shadow: none;
    background-color: transparent;
    border: none;
}

#profile__dropdown__BV_toggle_::after {
    content: none;    
}

.data{
    background: rgba(255, 255, 255, 0.26) !important;
    border-radius: 16px;
    box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
    backdrop-filter: blur(3px);
    -webkit-backdrop-filter: blur(3px);
}



</style>
