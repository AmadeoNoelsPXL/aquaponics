<template>    
    <b-form-row>
        <div class="form">
          <input type="text" id="email" class="form__input" autocomplete="off" placeholder=" ">
          <label for="email" class="form__label">Email</label>
        </div>
      </b-form-row>
</template>
<style>

*,
*::before,
*::after {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body {
  font-family: "Convergence", sans-serif;
  height: 100vh;
  display: grid;
  justify-content: center;
  align-items: center;
  font-size: 1.2rem;
  background-color: greenyellow
}

.form {
  position: relative;
  width: 20rem;
  height: 3rem;
  &__input {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    border: 2px solid $clr-gray300;
    border-radius: $radius;
    font-family: inherit;
    font-size: inherit;
    color: white;
    outline: none;
    padding: 1.25rem;
    background: none;

    &:hover {
      border-color: $clr-primary-light;
    }

    /* Change border when input focus*/

    &:focus {
      border-color: $clr-primary;
    }
  }

  &__label {
    position: absolute;
    left: 1rem;
    top: 0.8rem;
    padding: 0 0.5rem;
    color: white;
    cursor: text;
    transition: top 200ms ease-in, left 200ms ease-in, font-size 200ms ease-in;
    background-color: $clr-bg;
  }
}

/* 
1. When the input is in the focus state
reduce the size of the label and move upwards 

2. Keep label state when content is in input field 
*/

.form__input:focus ~ .form__label,
.form__input:not(:placeholder-shown).form__input:not(:focus) ~ .form__label {
  top: -0.5rem;
  font-size: 0.8rem;
  left: 0.8rem;
}

</style>