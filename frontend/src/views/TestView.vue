<template>
  <b-container>
    <b-row style="border-bottom: 4px solid green" class="m-4">
      <b-col>
        <b-row>
          <b-col>
            <b-img fluid center src="../assets/ownDesign.png" style="width:120px"></b-img>
          </b-col>
          <b-col class="pb-3 align-self-end">
            AQUAPONICS
          </b-col>
        </b-row>
      </b-col>
      <b-col cols="4" class="pb-2 align-self-end">
        <b-button variant="success">
          <b-row>
            <b-col cols="4" class="align-self-center">
              <b-img fluid center src="../assets/plus.png" style="width:20px"></b-img>           
            </b-col>
            <b-col cols="8" class="pl-0" style="color:black">
              Add user
            </b-col>
          </b-row>          
        </b-button>
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
    <b-row>
      <b-table
        id="my-table"
        :items="getAllUsers"
        :per-page="perPage"
        :current-page="currentPage"
        :fields="fields"
        small>
        <template #cell(icon)>
            <div>
                <b-avatar>A</b-avatar>
            </div>
        </template>
        <template  #cell(actions)="data">
              <b-row class="justify-content-center p-0">
                <b-col sm="2" class="mr-2">
                  <b-button @click="infoSelectedUser(data)" style="background-color:white;border:none">
                    <img src="../assets/trash.png" style="width:20px;color:gray">
                  </b-button>
                </b-col>
                <b-col sm="2">
                  <b-button @click="getAllUsers" style="background-color:white;border:none" class="ml-2">
                    <img src="../assets/edit.png" style="width:20px;color:gray">
                  </b-button>
                </b-col>
              </b-row>
        </template>
      </b-table>

      <b-pagination
        v-model="currentPage"
        :per-page="perPage"
        aria-controls="my-table"
      ></b-pagination>

    </b-row>

    <b-modal id="deleteUserModal" @ok="test('success')">
      <template #modal-title>
        Delete {{ selectedUser }}
      </template>
      Are you sure you want to delete this user?
  </b-modal>

    

  </b-container>
  </template>
  
  <script>
import axios from 'axios';

    export default {
      data() {
        return {
          messageDeletedUser: null,
          selectedUser: null,
          selectedId: null,
          perPage: 10,
          currentPage: 1,
          fields:['icon','firstName', 'lastName','phoneNumber','email','role','actions']

        }
      },
      computed: {
      },
      methods:{
        removeButton(item){
          this.items .filter(a => a.first_name == item);
          console.log(item)
        },
        async getAllUsers(){
          const data = await axios.get("http://localhost:8081/getAllUsers",
          { 
            headers: {
              'Authorization': `Bearer ${sessionStorage.getItem('TEST_BLABLA')}`
            }
          })           
          .then(resp =>resp.data);

          return data            
        },
        makeToast(variant = null) {
        this.$bvToast.toast('The user is deleted successfully', {
          title: `User action`,
          variant: variant,
          solid: true
        })
      },
      async deleteSelectedUser(){
        const response = await axios.delete("http://localhost:8081/deleteUser/"+this.selectedId,
        {
          headers: {
              'Authorization': `Bearer ${sessionStorage.getItem('TEST_BLABLA')}`
            }
        }
         ).then(resp => resp.data).catch(error => console.log(error))
         
        this.messageDeletedUser = response;
    },
      async test(color){
        await this.deleteSelectedUser();
        this.$bvToast.toast(this.messageDeletedUser, {
          title: `User action`,
          variant: color,
          solid: true
      })

      this.$root.$emit('bv::refresh::table', 'my-table')
    },
    infoSelectedUser(data){
      this.selectedUser = `${data.item.firstName} ${data.item.lastName}`
      this.$bvModal.show('deleteUserModal')
      this.selectedId = data.item.id;
      console.log(data.item.id)
      console.log("http://localhost:8081/user/"+data.item.id)

      console.log(this.selectedUser)
    }
  }
}
    
  </script>