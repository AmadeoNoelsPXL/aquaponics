import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'AccountOverview',
    component: ()=> import('../views/RegisterView.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
