<template>
    <b-container fluid style="max-width:fit-content">
    <b-row>
      <b-col style="max-width:fit-content">
        <b-img fluid center src="../assets/aquaponics.jpg" style="max-height: inherit;"></b-img>
      </b-col>
      <b-col>
        <b-row>
          <div class="d-flex justify-content-start align-middle">
            <p class="mr-3" ><b>Sign In</b></p>
            <img src="../assets/ownDesign.png" width="100" height="100">
          </div>
          <div>
            <div style='border-bottom:4px solid #1FBE85'></div>
          </div>
        </b-row>
        <b-row>
          <b-form>
            <b-form-row class="mb-2">
              <b-col>
                <label for="email" class="justify-content-start" >Email</label>
                <b-form-input placeholder="johndoe@email.com" type="email" v-model="email">
                </b-form-input>
              </b-col>
            </b-form-row>
            <b-form-row class="mb-2">
              <b-col>
                <label for="password" class="justify-content-start" >Password</label>
                <b-form-input placeholder="johndoe123" type="password" v-model="password">
                </b-form-input>
              </b-col>
            </b-form-row>
            <b-form-row>
              <b-button v-on:click="loginPerson" id="loginbtn" variant="success" class="ml-1 mr-1 w-100" style="background-color:#1FBE85; border-color:#1FBE85">Login</b-button>
              <b-tooltip target="loginbtn" triggers="hover">
                  <p>Press here to log in</p>
                </b-tooltip>
            </b-form-row>
          </b-form>
        </b-row>
      </b-col>
    </b-row>
  </b-container>
</template>
<script>
import axios from 'axios'
export default {
  data() {
    return {
      password: null,
      email: null,
    }
  },
  methods:{
    async loginPerson(){
      await axios.post('http://localhost:8080/user/login', {
          email: this.email,
          password: this.password,
  }).then((response) =>{
    console.log(response)
    localStorage.setItem('token',response.data)
    this.$router.push("/HomeView")
  })
  .catch(function (error) {
    console.log(error);
  });
        
    }
  }
}
</script>