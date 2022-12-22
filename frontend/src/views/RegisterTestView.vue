<template>
    <b-container>
        <b-row class="vh-100" align-v="center" align-h="center">
            <b-row class="shadow-lg p-0 mb-5 bg-white rounded" style="background-color:white">
                <b-col class="p-0">
                    <img class="rounded" src="../assets/aquaponics.jpg" alt="" height="500" width="500">
                </b-col>
                <b-col class="p-5">
                    <h3 class="mb-5" style="color:#1FBE85">Create Account</h3>
                    <b-form>
                        <b-form-row class="mb-2">
                        <b-col class="mb-3">
                            <b-form-input id="input-firstName" style="background-color:#F5F5F5" placeholder="Firstname" type="text" v-model="firstName">
                            </b-form-input>
                            <div style="color:red;font-size: 0.875em">
                                {{constraintsFirstnameRemarks}}
                            </div>
                        </b-col>
                        <b-col>
                            <b-form-input placeholder="Surname" type="text" v-model="lastName">
                            </b-form-input>
                            <div style="color:red;font-size: 0.875em">
                                {{constraintsLastnameRemarks}}
                            </div>
                        </b-col>
                        </b-form-row>
                        <b-form-row class="mb-2">
                        <b-col>
                            <b-form-input placeholder="Phone number" type="tel" v-model="phoneNumber">
                            </b-form-input>
                            <div style="color:red;font-size: 0.875em">
                                {{constraintsPhoneNumberRemarks}}
                            </div>
                        </b-col>
                        <b-col>
                            <b-form-input placeholder="Email" type="email" v-model="email">
                            </b-form-input>
                            <div style="color:red;font-size: 0.875em">
                                {{constraintsEmailRemarks}}
                            </div>
                        </b-col>
                        </b-form-row>
                        <b-form-row>
                        <b-button @click="submitAction" id="registerbtn" variant="success" class="ml-1 mr-1 w-100 mt-5" style="background-color:#1FBE85; border-color:#1FBE85">Sign Up</b-button>
                        <div>
                            {{ this.constraintsFirstname }}
                        </div>
                        </b-form-row>
                    </b-form>
                </b-col>
            </b-row>            
        </b-row>
    </b-container>
</template>
<script>
import axios from 'axios';
export default {
  data() {
    return {
        firstName: null,
        lastName: null,
        phoneNumber: null,
        email: null,
        constraintsFirstnameRemarks : null,
        constraintsLastnameRemarks: null,
        constraintsPhoneNumberRemarks: null,
        constraintsEmailRemarks: null,
        responseApi : null
    }
  },
  computed:{
  },
  methods:{
    async submitAction(){
         var passedAction = true;
        await axios.post("http://localhost:8081/user/newUser",{
            firstName: this.firstName,
            lastName: this.lastName,
            phoneNumber: this.phoneNumber,
            email: this.email
        })
        .then((res)  => this.responseApi = res.data)
        .catch((error) => {
            console.log(error)
            console.log(error.response.data.firstName)
            this.constraintsFirstnameRemarks = error.response.data.firstName
            this.constraintsLastnameRemarks = error.response.data.lastName
            this.constraintsPhoneNumberRemarks = error.response.data.phoneNumber
            this.constraintsEmailRemarks = error.response.data.email
            passedAction = false
        })

        if(passedAction){
            this.$router.push("/TestView")
        }
    }

        
    }   
  }
</script>



<style scoped>
body{
    background-color: #ededed;
}
</style>