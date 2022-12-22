<template>
    <div id="app">
      <label for="password"></label>
      <input type="password" v-model="password" id="input1"/>

      <button v-on:click="addPassword" type="submit" variant="success">Reset password</button>      
    </div>
  </template>
  
  <script> 
  import axios from 'axios'
    export default {
      data() {
        return {
          password: "",
          passwordVerify: "",
          
        };
      },
      methods: {
        async addPassword(){
          console.log(this.$route.query.token)

          axios.put('http://localhost:8080/user/setPassword?token='+this.$route.query.token, { password: this.password });
        }
      },
      computed:{
        token(){
          console.log(this.$route.query.token)
          return this.$route.query.token
        }
      }
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