
import VueRouter from 'vue-router'
import axios from 'axios'
const routes = [
  {
    path: '/',
    name: 'loginView',
    component: () => import('../views/LoginView.vue')
    
  },
  {
    path: '/OverviewStatics',
    name: 'overviewStatic',
    component: () => import('../views/OverviewStaticScreen.vue'),
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
    console.log(result)
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
  const token = sessionStorage.getItem("TEST_BLABLA") == null ? null : sessionStorage.getItem("TEST_BLABLA")
  
  if(token == null){
    return false
  } else{
    const result = await axios.post("http://localhost:8081/user/checkJwtToken",{
    token : sessionStorage.getItem("TEST_BLABLA")
  }).then(res => res.data)
    return result;
  }

  

  }
  






export default router
