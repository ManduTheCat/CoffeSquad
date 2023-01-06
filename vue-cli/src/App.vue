<template>
  <div>
    Coffee Squad
    <OrderForm @successOrderIn="successOrderIn"/>
    <OrderList :orderList=orderList />
  </div>
</template>

<script>
import OrderForm from '@/components/OrderForm'
import OrderList from '@/components/OrderList'
import axios from 'axios'
const API_URL = 'http://127.0.0.1:8081'

export default {
  name: 'App',
  data: function () {
    return {
      orderList : null,
    }
  },
  components: {
    OrderForm,
    OrderList,
  },
  methods: {
    successOrderIn (data) {
      this.orderList = data
    }
  },
  created () {
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
  mounted () {
  }
}
</script>


<style lang="scss">
	
$color: #f0f0f0;
.list {
  background: $color;
 
  &__text {
    font-weight: bold;
  }
}
</style>