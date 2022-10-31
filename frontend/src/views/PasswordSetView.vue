<template>
    <div id="app">
      <div id="alert" v-if="alert">{{ alert }}</div>
      <form @submit.prevent="checkAndResetPassword">
        <table>
            <tr>
                        <label id="label1">
                        Password
                        <input type="password" v-model="password" id="input1"/>
                        </label>
            </tr>
            <tr>
                <label id="label2">
          Re-type password
          <input type="password" v-model="passwordVerify" id="input2"/>
        </label>
            </tr>
        </table>
        <button type="submit" variant="success">Reset password</button>
      </form>
    </div>
  </template>
  
  <script> 
  import Userfront from "@userfront/core";
    Userfront.init("demo1234");
    export default {
      data() {
        return {
          password: "",
          passwordVerify: "",
          alert: "",
        };
      },
      methods: {
        checkAndResetPassword() {
          this.alert = "";
          if (this.password !== this.passwordVerify) {
            this.alert = "Passwords must match";
            return;
          }
          Userfront.resetPassword({
            password: this.password,
          }).catch((error) => {
            this.alert = error.message;
          });
        },
      },
    };
  </script>
  
  <style scoped>
    #app {
      max-width: 400px;
      margin: 0 auto;
      padding: 20px;
    }
    label{
        display: block;
        font-weight: bold;
        margin-bottom: 10px;
        text-align: center;
    }
    #input1 {
      margin-bottom: 10px;
      margin-left: 0%;
    }
    #input2 {
      margin-bottom: 10px;
      margin-left: 0%;
    }
    button{
        background-color: #1FBE85;
        border-color: #1FBE85;
        border-radius: 20px;
    }
    #alert {
      color: red;
      margin-bottom: 10px;
    }
  </style>