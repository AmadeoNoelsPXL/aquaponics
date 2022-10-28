<template>
    <div class="container">
      <b-button v-b-modal.modal-center class="shadow" style="background-color:#1FBE85; border-color:#1FBE85"><img src="../assets/filter-2.png" width="20"> </b-button>
      <b-modal id="modal-center" hide-header hide-footer>
        <b-container>
          <b-row>
            <h4>Filter</h4>
          </b-row>
          <b-row class="mb-2">
            <b-col>
              <div>DATA</div>
            </b-col>
            <b-col>
              <div>PERIOD</div>
            </b-col>
          </b-row>         
          <b-row class="mb-4">
            <b-col class="shadow rounded mr-2">
              <div v-for="item in items" :key="item">                          
              <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1" checked>
                <label class="form-check-label" for="defaultCheck1">
                  {{item}}
                </label>
              </div>
              </div>
            </b-col>
            <b-col class="shadow rounded">
              <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
                <option selected>Open this select menu</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
              </select>
            </b-col>            
          </b-row> 
          <b-row class="justify-content-center">
            <b-button style="background-color:#1FBE85; border-color:#1FBE85">
              Set Filter
            </b-button>
          </b-row>
        </b-container>
      </b-modal>
      <!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
  Launch demo modal
  
</button>
<button v-on:click="retrieveAllDataTypes()"></button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
  
</div>

    </div>

</template>
  
  <script>
    export default {
      data() {
        return {
          items: []          
          };
        },
      methods:{
        async retrieveAllDataTypes(){
          const response = await fetch('http://localhost:8080/data');

          const data = await response.json();
          console.log(data)
          return data
        }
      },
      created(){
        fetch('http://localhost:8080/data').then(async response => {
          const data = await response.json();

          this.items = data;
        })

      }
    }
  </script>
  <style>
  </style>