<template>
  <div>
    Coffee Squad
    <OrderIn />
    <OrderList />
  </div>
</template>

<script>
import OrderIn from '@/components/OrderIn'
import OrderList from '@/components/OrderList'
export default {
  name: 'App',
  data: function () {
    return {
    }
  },
  components: {
    OrderIn,
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