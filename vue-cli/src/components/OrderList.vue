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

export default {
    name: 'OrderList',
  data () {
    return {
        participationForm:false,
        username:'',
        menu:'',
    }
  },
  props: {
    orderList: Object,
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
    
  },
  computed : {
    
  },
}
</script>

<style>

</style>