<template>
    <div>
        <div v-for="participation in participationList" :key=participation.id>
            <ParticipationItem :participation=participation />
        </div>
    </div>
</template>

<script>
import ParticipationItem from '@/components/ParticipationItem'
import axios from 'axios'
const API_URL = 'http://127.0.0.1:8081'

export default {
    name: 'ParticipationList',
  data () {
    return {
        participationList:null,
        
    }
  },
  props: {
    // movie: Object,
  },
  components : {
    ParticipationItem,
  },
  methods: {
    
  },
  created() {

    axios({
        method: 'get',
        url: `${API_URL}/participationList`,
    })
    .then(res => {
        this.participationList = res.data
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