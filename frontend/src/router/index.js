import axios from 'axios'
import VueRouter from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'loginView',
    component: () => import('../views/LoginView.vue')
    
  },
  {
    path: '/user/setPassword',
    name: 'setPassword',
    component: () => import('../views/PasswordSetView.vue'),
    meta: {correctToken: true}
  },
  {
    path: '/registerView',
    name: 'registerView',
    component: () => import('../views/RegisterTestView'),
    /*meta:{
      requiresAuth:true,
    }*/
  },
  {
    path: '/TestView',
    name: 'accountView',
    component: () => import('../views/TestView.vue'),
    
  }
]




const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

router.beforeEach(async (to, from,next) => {
  if (to.matched.some(record => record.meta.correctToken)) {
    const result = await verifyToken()
    if(result){
      next()
    }else{
      next({
        path: '/'
      })
    }
  }
  next()
  

})

async function verifyToken(){
  if(!sessionStorage.getItem("token")){
    return false
  } else{
    const result = await axios.post("http://localhost:8081/user/checkJwtToken",{
    token : sessionStorage.getItem("token")
  }).then(res => res.data)
    return result;
  }

  }
  






export default router
