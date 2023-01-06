<template>
    <div>
        <div v-for="order in orderList" :key=order.id>
            <OrderItem :order=order />
        </div>
        <button @click="goParticipation">+</button>
        <ParticipationForm v-if="participationForm"/>
        <ParticipationList />
    </div>
</template>

<script>
import OrderItem from '@/components/OrderItem'
import ParticipationList from '@/components/ParticipationList'
import ParticipationForm from '@/components/ParticipationForm'
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
    ParticipationForm,
    ParticipationList,
  },
  methods: {
    goParticipation (){
        this.participationForm = true;
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