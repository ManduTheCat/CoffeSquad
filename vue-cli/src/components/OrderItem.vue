<template>
    <div>
        {{ order.username }}
        {{ order.storeLink }}
        {{ order.endTime }}
        <button>+</button>
    </div>
</template>

<script>
export default {
    name: 'OrderItem',
  data () {
    return {
        // listOne:null,
    }
  },
  props: {
    order: Object,
  },
  components : {
  },
  methods: {
    
  },
  created() {
  },
  computed : {

  },
}
</script>

<style>

</style>