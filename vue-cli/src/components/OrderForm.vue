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
    // movie: Object,
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
          console.log(res)
          
        })

    }, 
    // goToDetail() {
    //   this.$router.push({name: 'MovieDetail', params: {movie_id: this.movie.id}})
    // },
    // changeHeaderBg() {
    //   const headerBg = document.getElementById('header-bg')
    //   const backdrop = `url(https://image.tmdb.org/t/p/original${this.movie.backdrop_path})`
    //   headerBg.style.backgroundImage = backdrop
    // },
    // likeClick () {
    //   if (this.isLogin) {
    //     const token = this.$cookies.get('jwt')
    //     console.log('좋아요 클릭 -> 로그인 됨')
    //     // movie 에 좋아요 수가 있어야 되고
    //     // 내가 좋아요 한 목록이 있어야 되고
    //     axios({
    //       method: 'post',
    //       headers: {
    //         'Authorization': `Bearer ${token}`,
    //       },
    //       url: `${API_URL}/movies/${this.movie.id}/likes/`,
    //     })
    //       .then((res) => {
    //         console.log(res)
    //       })
    //   } else {
    //     console.log('좋아요 클릭 -> 로그인 안됨')
    //     // this.$emit('change')
    //     this.$store.commit('LOGIN_MODAL_OPEN')
    //   }
    // },
    // modalGoToLogin () {
    // },
  },
  computed : {
    // isLogin () {
    //   return this.$store.state.isLogin
    // },
  }
}
</script>

<style>
</style>