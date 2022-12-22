import Vue from 'vue'
import './plugins/bootstrap-vue'
import App from './App.vue'
import router from './router'
import VueRouter from 'vue-router'

Vue.config.productionTip = 

Vue.use(VueRouter)

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')