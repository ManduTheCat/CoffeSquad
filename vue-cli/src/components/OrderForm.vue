<template>
  <div>
    <div class="input-group mb-3">
      <input type="text" class="form-control" placeholder="이름" aria-label="SquadOwner" v-model="squadOwner">
      <input type="text" class="form-control" placeholder="가게링크" aria-label="StoreLink" v-model="storeLink">
      <input type="text" class="form-control" placeholder="마감시간 ex)13:00" aria-label="EndTime" v-model="endTime">
      <button @click="addOrder">입력</button>
    </div>
    * 가게링크 입력 : 배달의 민족 -> 공유하기 -> 복사 후 붙여넣기
  </div>

</template>

<script>
import axios from 'axios'
const API_URL = 'http://127.0.0.1:8081'
export default {
  name: 'CoffeeItem',
  data () {
    return {
      squadOwner:'',
      storeLink:'',
      endTime:'',
    }
  },
  props: {
  },
  components : {
  },
  methods: {
    addOrder(){
      var regExp_time = /^([01][0-9]|2[0-3]):([0-5][0-9])$/;
      if (regExp_time.test(this.endTime) == false){
        alert("마감시간 입력 폼을 지켜주세요.");
        return false;
      }

      axios({
        method: 'post',
        url: `${API_URL}/addOrder/`,
        data: {
          squadOwner: this.squadOwner,
          storeLink: this.storeLink,
          endTime: this.endTime,
        },
      })
        .then((res) => {
          console.log(res) // 입력이 성공적으로 끝나면 data에 orderlist를 return 해주세요.
          this.$emit('successOrderIn', res.data)
        })

    }, 
  },
  computed : {
  }
}
</script>

<style>
</style>