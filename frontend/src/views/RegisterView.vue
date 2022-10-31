<template>
    <b-container fluid style="max-width:fit-content">
        <b-row>
        <b-col style="max-width:fit-content">
            <b-img fluid center src="../assets/aquaponics.jpg"></b-img>
        </b-col>
        <b-col>
            <b-row>
            <div class="d-flex justify-content-start align-middle">
                <p class="mr-3"><b>Register</b></p>
                <img src="../assets/ownDesign.png" width="35" height="25">
            </div>
            <div>
                <div style='border-bottom:4px solid #1FBE85'></div>
            </div>
            </b-row>
            <b-row>
            <b-form>
                <b-form-row class="mb-2">
                <b-col>
                    <label for="firstname" class="justify-content-start" >Firstname</label>
                    <b-form-input placeholder="John" type="text">
                    </b-form-input>
                </b-col>
                <b-col>
                    <label for="Surname" class="justify-content-start" >Surname</label>
                    <b-form-input placeholder="Doe" type="text">
                    </b-form-input>
                </b-col>
                </b-form-row>
                <b-form-row class="mb-2">
                <b-col>
                    <label for="number" class="justify-content-start" >Phone Number</label>
                    <b-form-input placeholder="+31 111 111 111" type="tel">
                    </b-form-input>
                </b-col>
                <b-col>
                    <label for="email" class="justify-content-start" >Email</label>
                    <b-form-input placeholder="johndoe@email.com" type="email">
                    </b-form-input>
                </b-col>
                </b-form-row>
                <b-form-row>
                <b-button id="registerbtn" variant="success" class="ml-1 mr-1 w-100" style="background-color:#1FBE85; border-color:#1FBE85">Register</b-button>
                <b-tooltip target="registerbtn" triggers="hover">
                    <p>Press here to register</p>
                    </b-tooltip>
                </b-form-row>
            </b-form>
            </b-row>
        </b-col>
        </b-row>
    </b-container>
</template>

