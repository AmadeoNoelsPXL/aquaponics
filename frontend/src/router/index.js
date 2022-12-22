import VueRouter from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'loginView',
    component: () => import('../views/RegisterTestView.vue')
  },
  {
    path: '/user/setPassword',
    name: 'setPassword',
    component: () => import('../views/PasswordSetView.vue')
  },
  {
    path: '/registerView',
    name: 'registerView',
    component: () => import('../views/RegisterView.vue'),
    /*meta:{
      requiresAuth:true,
    }*/
  },
  {
    path: '/AccountView',
    name: 'accountView',
    component: () => import('../views/AccountView.vue'),
    /*meta:{
      requiresAuth:true,
    }*/
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

/*router.beforeEach( (to, from, next) => {
  if(to.matched.some((record) => record.meta.requiresAuth)){
    if(localStorage.getItem('token') == null){
      next({
        path: "/"
      });
    }
  }
  next()
})*/

export default router
