import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)
Vue.use(axios)

export default new Vuex.Store({
  state: {
    users: []
  },
  getters: {
  },
  mutations: {
    SET_USERS(state,items){
      state.users = items
    }
  },
  actions: {
    
  },
  modules: {
  }
})
