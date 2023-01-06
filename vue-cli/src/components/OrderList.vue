<template>
    <div>
        <div v-for="order in orderList" :key=order.id>
            <OrderItem :order=order />
        </div>
        <button @click="goParticipation">+</button>
        <div v-if="participationForm">
            <div class="input-group mb-3">
                <input type="text" class="form-control" placeholder="이름" aria-label="Username" v-model="username">
                <input type="text" class="form-control" placeholder="메뉴" aria-label="Menu" v-model="menu">
                <button @click="addParticipation">입력</button>
            </div>
        </div>
    </div>
</template>

<script>
import OrderItem from '@/components/OrderItem'
import axios from 'axios'
const API_URL = 'http://127.0.0.1:8081'
export default {
    name: 'OrderList',
  data () {
    return {
        orderList:null,
        participationForm:false,
        username:'',
        menu:'',
    }
  },
  props: {
    // movie: Object,
  },
  components : {
    OrderItem,
  },
  methods: {
    goParticipation (){
        this.participationForm = true;
    },
    addParticipation (){
        axios({
            method: 'post',
            url: `${API_URL}/addParticipation/`,
            data: {
                username: this.username,
                storeLink: this.storeLink,
                endTime: this.endTime,
            },
        })
            .then((res) => {
            console.log(res)
            })
    },
  },
  created() {
    console.log(this.participationForm);

    axios({
        method: 'get',
        url: `${API_URL}/orderList`,
    })
    .then(res => {
        this.orderList = res.data
    })
    .catch(err => {
        console.log(err)
    })
  },
  computed : {
    
  },
}
</script>

<style>

</style>