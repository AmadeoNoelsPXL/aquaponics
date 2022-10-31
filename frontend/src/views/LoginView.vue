<template>
  <b-row class="vh-100" align-v="center" align-h="center" >
    <div class="w-75 h-75" style="background-color:white">
      <b-row class="w-100 h-100">
        <b-col class="w-50 row justify-content-end">
          <img src="../assets/aquaponics.jpg" alt="">
        </b-col>
        <b-col class="w-50 d-flex justify-content-center align-items-center p-0">
          <div class="w-75 h-75 p-0 d-flex justify-content-start" style="">
            <div class="d-flex flex-column w-75">
              <div class="row justify-content-start mb-4 w-25 m-0 border-bottom" style="margin: 0px 0px 0px;width:20px">Sign In</div>
              <form class="mt-4">
                  <label class="d-flex justify-content-start" for="exampleInputEmail1">Email address</label>
                  <input type="email" class="form-control mb-4" id="exampleInputEmail1" aria-describedby="emailHelp">
                
                
                  <label class="d-flex justify-content-start" for="exampleInputPassword1">Password</label>
                  <input type="password" class="form-control" id="exampleInputPassword1">
                
                  <button  type="submit" class="btn btn-primary d-flex justify-content-center w-100 mt-4">Submit</button>
              </form>
            <div>
              
            </div>

            </div>
            
          </div>
        </b-col>
      </b-row>  
    </div>
  </b-row>
</template>
<style>
body{
  background-color: lightgrey;
}

html,body {
  height: 100%;
}
</style>