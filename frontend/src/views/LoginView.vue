<template>
  <div class="layout">
    <b-container>
      <b-row class="justify-content-center mt-2">
        <h1>aquaponics</h1>
      </b-row>
        <b-row align-v="start" align-h="center">
            <b-row class="shadow-lg p-0 mb-5 bg-white rounded" style="background-color:white">
                <b-col class="p-0">
                    <img class="rounded" src="../assets/testAquaponics.png" alt="" height="500" width="500">
                </b-col>
                <b-col class="p-5">
                    <h3 class="mb-5" style="color:#1FBE85">Sign In</h3>                  
                      <b-form>
                        <b-form-row>
                        <b-col class="mb-3">
                            <b-form-input class="form__input" type="text" v-model="email"></b-form-input>
                            <label for="feedback-user">Email</label>
                            <div style="color:red;font-size: 0.875em">
                              {{constraintsEmail}}
                          </div>
                        </b-col>
                        </b-form-row>
                        <b-form-row>
                        <b-col>
                            <b-form-input type="password" v-model="password"></b-form-input>
                            <label  for="feedback-user">Password</label>                          
                            <div style="color:red;font-size: 0.875em">
                                {{constraintsPassword}}
                            </div>
                        </b-col>
                        </b-form-row>                      
                        <b-button @click="submitAction" id="registerbtn" variant="success" class="ml-1 mr-1 w-100 mt-5" style="background-color:#1FBE85; border-color:#1FBE85">Log in</b-button>                      
                    </b-form>
                </b-col>
            </b-row>         
        </b-row>
        
        <div class="bubbles">
          <div class="bubble"></div>
          <div class="bubble"></div>
          <div class="bubble"></div>
          <div class="bubble"></div>
          <div class="bubble"></div>
          <div class="bubble"></div>
          <div class="bubble"></div>
          <div class="bubble"></div>
          <div class="bubble"></div>
          <div class="bubble"></div>
        </div> 
    </b-container>
  </div>
</template>
<script>
import axios from 'axios';
export default {
  components:{
  },
data() {
  return {
      email: null,
      password: null,
      responseApi: null,
      constraintsEmail: null,
      constraintsPassword: null
  }
},
computed:{
},
methods:{
  async submitAction(){
      var passedAction = true;
      await axios.post("http://localhost:8081/user/login",{
          email: this.email,
          password: this.password
      })
      .then((res)  =>  {
        const accessToken = res.data
        this.responseApi = accessToken;
        sessionStorage.setItem('TEST_BLABLA', this.responseApi = res.data)
      }).catch((error) => {
            this.constraintsEmail = error.response.data.email
            this.constraintsPassword = error.response.data.password
            passedAction = false
        })
      

      if(passedAction){
          this.$router.push("/OverviewStatics")
      }
  },
  async test() {
    if(this.firstName && this.firstName.length == 4){
      this.firstName = this.firstName + " ";
    }

    if(this.firstName.length > 4){
      if(this.firstName.replaceAll(" ","").length % 2 == 0){
        
      this.firstName = this.firstName + " ";
      }
    }
  },
  

} 
}
</script>



<style scoped>
.layout {
  display: flex;
  flex-grow: 1;
  flex-direction: column;
  background: linear-gradient(to right, #00A4E4,#FEFEFE);
} 

label{
  display: block;
  position: absolute;
  font-size: 14px;
  line-height: 14px;
  color: #aaa;
  top: 50%;
  margin-top: -7px;
  left: 14px;
  cursor: text;
  transition: 0.3s;
  padding: 0 3px;
}

.col input:focus{
  box-shadow: none;
  border-color: #1FBE85;

}

 input:focus + label, input:not(:placeholder-shown) + label {
  top: -1px;
  background-color: white;
  color: #1FBE85;
}

h1{
  font-size: 8em;
	font-family: arial;  
  text-transform: uppercase;
  color: transparent;
  -webkit-text-stroke: 2px #167caa;
}

.bubble{
  opacity: 0.80;
  position: absolute;
  bottom: 0;
  box-shadow: 0 20px 30px rgb(0,0,0,0.5), inset 0px 10px 30px 5px rgb(60, 125, 230) ;
  border-radius: 50%;
  z-index: 5;
  animation: flying 10s infinite ease-in;
}

.bubble:nth-child(1){  
  width:50px;
  height: 50px;
  left: 10%;
  animation-duration: 4s;
}

.bubble:nth-child(2){  
  width:55px;
  height: 55px;
  left: 20%;
  animation-duration: 4.5s;
}

.bubble:nth-child(3){  
  width:60px;
  height: 60px;
  left: 35%;
  animation-duration: 4s;
}
.bubble:nth-child(4){  
  width:65px;
  height: 65px;
  left: 50%;
  animation-duration: 4.5s;
}

.bubble:nth-child(5){  
  width:70px;
  height: 70px;
  left: 55%;
  animation-duration: 5s;
}
.bubble:nth-child(6){  
  width:80px;
  height: 80px;
  left:65%;
  animation-duration: 5.5s;
}
.bubble:nth-child(7){  
  width:85px;
  height: 85px;
  left:75%;
  animation-duration: 6s;
}
.bubble:nth-child(8){  
  width:90px;
  height: 90px;
  left:80%;
  animation-duration: 5s;
}
.bubble:nth-child(9){  
  width:95px;
  height: 95px;
  left:70%;
  animation-duration: 6.5s;
}
.bubble:nth-child(10){  
  width:100px;
  height: 100px;
  left:85%;
  animation-duration: 7s;
}

@keyframes flying {
  0%{
    bottom: 0;
    transform: translateX(0);
  }
  50%{
    transform: translateX(-100px);
  }

  100%{
    bottom: 100%;
    transform: translateX(0);
  }
  
}
</style>