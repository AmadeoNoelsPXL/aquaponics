<template>
    <div>        
    <b-container>
        <b-row class="mb-4" align-v="center">
            <b-col cols="6" class="p-0">
                <div class="d-flex justify-content-middle">
                    <h2><b>Users</b></h2>
                    <img src="../assets/ownDesign.png" width="120" height="80">
                </div>
            </b-col>
            <b-col cols="6" class="p-0">
                <div class="d-flex justify-content-end"> <b-button v-b-modal.modal-NewUser style="background-color:#1FBE85; border-color:#1FBE85" >Add User</b-button></div>               
            </b-col>
        </b-row>
        <b-row class="mb-5"> 
            <b-col cols="12" class="p-0">                          
                <div>
                    <div style='border-bottom:4px; solid #1FBE85;'></div>
                </div>
            </b-col>
        </b-row> 
        <div>
            <b-row>            
                <table class="table">  
                    <thead>
                        <tr>
                        <th scope="col" width="5%"></th>
                        <th scope="col" width="25%">NAME</th>
                        <th scope="col" width="25%">EMAIL</th>
                        <th scope="col" width="20%" >STATUS</th>
                        <th scope="col" width="20%" >ACTIONS</th>
                        </tr>
                    </thead>
                </table>
            </b-row>
            <div v-for="item in items" :key="item">
                <b-row class="shadow p-2 p-4 mt-4 bg-white rounded text-center" >
                    <b-col md="auto">
                        <div class="d-flex flex-row">                    
                            <b-avatar variant="primary" text="A"></b-avatar>
                        </div>
                    </b-col>
                    <b-col align-self="center" md="3">
                        {{item.name}}
                    </b-col>
                    <b-col align-self="center" md="3">
                        {{item.email}}
                    </b-col>
                    <b-col align-self="center" md="3">
                        {{item.role}}
                    </b-col>            
                    <b-col md="2">
                        <b-button style="background-color:#1FBE85; border-color:#1FBE85" class="mr-3">Edit</b-button>
                        <b-button variant="danger">Delete</b-button>  
                    </b-col>            
                </b-row> 
            </div>

        </div>         
        
               
    </b-container> 
    <b-modal id="modal-NewUser" hide-footer hide-header class="m-0 p-0" size="xl">
        <b-container fluid>
            <b-row>
                <b-col style="padding=0em"></b-col>
                <b-col align-self-center>
                    <b-row>                        
                    <div class="d-flex justify-content-start align-middle">
                        <p class="mr-3">Users</p>
                        <img src="../assets/logo.png" width="20" height="20">
                    </div>                    
                    <div>
                        <div style='border-bottom:4px solid #1FBE85'></div>
                    </div>
                    </b-row>
                    <b-row>
                        <b-form>
                            <b-form-row class="mb-2">
                                <b-col>                                    
                                    <label for="firstName" class="justify-content-start" >FIRSTNAME</label>                                    
                                    <b-form-input placeholder="Type your Firstname"></b-form-input>
                                    <i class="fa-solid fa-user"></i>                     
                                    
                                </b-col>
                                <b-col>                                    
                                    <label for="firstName" class="justify-content-start" >SURNAME</label>
                                    <b-form-input placeholder="Type your Surname">                                
                                    </b-form-input>
                                </b-col>
                            </b-form-row>
                            <b-form-row class="mb-2">
                                <b-col>                                    
                                    <label for="firstName" class="justify-content-start" >PHONE NUMBER</label>
                                    <b-form-input placeholder="Enter your firstName">                                
                                    </b-form-input>
                                </b-col>
                                <b-col>                                    
                                    <label for="firstName" class="justify-content-start" >EMAIL</label>
                                    <b-form-input placeholder="Type your Email">                                
                                    </b-form-input>
                                </b-col>
                            </b-form-row>
                            <b-form-row>
                                <b-button variant="success" class="ml-1 mr-1 w-100">Register</b-button>
                            </b-form-row>
                        </b-form>
                    </b-row>
                </b-col>
            </b-row>
        </b-container>        
    </b-modal>
    <div v-for="item in users" :key="item.id"></div>
    </div>
        
  </template>
  
  <script>
  import { mapState } from 'vuex';
    export default {
        data() {
            return {
            items: [
                { name:  'Amadeo Noels', email: '11702320@student.pxl.be', role: "admin"},
                { name: 'Josh Hofmann', email: 'Josh.hoffman@gmail.com', role: "President"},
            
            ]
            }
        },
        mounted(){
            this.$store.dispatch('loadUsers')
        },
        computed: mapState(['users'])
    }
  </script>
  <style>
    .h2{
        margin: 26px 0px 8px;
    }

  </style>