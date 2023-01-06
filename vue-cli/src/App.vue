<template>
  <div>
    Coffee Squad
    <OrderForm />
    <OrderList />
  </div>
</template>

<script>
import OrderForm from '@/components/OrderForm'
import OrderList from '@/components/OrderList'
export default {
  name: 'App',
  data: function () {
    return {
    }
  },
  components: {
    OrderForm,
    OrderList,
  },
  methods: {
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