<template>
    <div class="bowl">
        <div class="water">

        </div>        
    </div>
</template>

<style scoped>
body{
    background-color: #35b3e7;
}

body:before{
    position:absolute;
    width: 200%;
    height: 200%;
    content: "";
    top: -50%;
    left: 50%;
    background:#fff
}

body::after{
    border-radius: 45%;
    animation: body 5s linear infinite;
}

body::before{
    border-radius: 35%;
    background: rgb(255, 255, 255,0.3);
}

@keyframes body {
    0%{
        transform: translate(-50%,-50%) rotate(0deg);
        top: -30%;
    }
    50%{
        transform: translate(-50%,-50%) rotate(0deg);
        top: -50%;
    }
    100%{
        transform: translate(-50%,-50%) rotate(360deg);
        top: -30%;
    }
    
}
</style>