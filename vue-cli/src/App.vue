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
// import HomeHeader from '@/components/HomeHeader'
// import InputValidModal from '@/components/InputValidModal'
// import SurveyCompleteModal from '@/components/SurveyCompleteModal'
// import KakaoLogin from 'vue-kakao-login'
// import axios from 'axios'
// const API_URL = 'http://127.0.0.1:8000'
export default {
  name: 'App',
  data: function () {
    return {
      // isLogin : false,
      // username : '',
      // imgUrl : '',
      // showBanner : true,
      // survey : false,
    }
  },
  components: {
    OrderIn,
    OrderList,
    // HomeHeader,
    // LoginModal,
    // SurveyCompleteModal,
    // InputValidModal,
  },
  methods: {
  //   modalClose(){
  //     this.$store.commit('LOGIN_MODAL_CLOSE')
  //   },
  //   surveyCompletedModalClose () {
  //     this.$store.commit('SURVEY_COMPLETED_MODAL_CLOSE')
  //   },
  //   inputValidModalClose () {
  //     this.$store.commit('INPUT_VALID_MODAL_CLOSE')
  //   },
  //   goRecommend(){
  //     this.$store.commit('SURVEY_COMPLETED_MODAL_CLOSE')
  //     this.$router.push({ path: 'RecommendedMovieList' })
  //   },
  //   modalLogin(){
  //     this.modalClose()
  //     // sss = document.querySelectorAll('.loginDiv')
  //     // console.log(sss)
  //     console.log(this.$refs.loginDiv)
  //     this.$refs.loginDiv.$el.click()
  //   },
  //   change () {
  //     console.log('에밋 쓰리 됨')
  //     this.$store.commit('LOGIN_MODAL_OPEN')
  //     // this.modalShow = true
  //     console.log(this.modalShow)
  //   },
  //   onSuccess (res) {
  //     console.log("success")
  //     axios({
  //       method: 'post',
  //       url: `${API_URL}/accounts/login/`,
  //       data: {
  //         res : res,
  //       }
  //     })
  //       .then((response)=>{
  //         console.log('로그인 성공띠')
  //         if (response.status == 201){
  //           this.survey = true
  //         }
  //         this.loginToken(response)
  //       })
    // },
    // onFailure (data) {
    //   console.log(data)
    //   console.log("failure")
    // },
    // loginToken: function (res) {
    //   axios({
    //     method: 'post',
    //     headers: {
    //       'Content-Type': 'application/json',
    //     },
    //     url: `${API_URL}/api/token/`,
    //     data: {
    //       username: res.data.serializer.username,
    //       password: res.data.serializer.id,
    //     }
    //   })
    //     .then((res) => {
    //       console.log('쿠키끗')
    //       const token = res.data.access 
    //       this.$cookies.set("jwt", token)
    //       this.$store.commit('ISLOGIN_CHANGE')
    //       window.Kakao.API.request({
    //         url: '/v2/user/me',
    //         data: {
    //           property_keys: ['kakao_account.email', 'kakao_account.gender', 'kakao_account.profile'],
    //         },
    //       })
    //       .then((response) => {
    //         console.log(response)
    //         this.$cookies.set("userId",  response.id)
    //         this.$cookies.set("username",  response.kakao_account.profile.nickname)
    //         this.$cookies.set("email",  response.kakao_account.email)
    //         this.$cookies.set("imgUrl",  response.kakao_account.profile.profile_image_url)
    //         this.$cookies.set("gender",  response.kakao_account.gender)
    //         // this.$store.commit('LOGINDATA_IN', response)
    //         this.isLogin = true
    //         this.username = response.kakao_account.profile.nickname
    //         this.imgUrl = response.kakao_account.profile.profile_image_url
    //         if (this.survey == true){
    //           this.$router.push({ name: 'SurveyWelcome' })
    //           this.survey = false
    //         }
            
    //       })
    //       .catch(function(error) {
    //         console.log(error)
    //       })
    //     })
    // },
    // logout (){
    //   this.$cookies.set("jwt", '')
    //   this.$cookies.set("username", '')
    //   this.$cookies.set("email", '')
    //   this.$cookies.set("imgUrl", '')
    //   this.$cookies.set("gender", '')
    //   this.isLogin = false
    //   this.username = ''
    //   this.imgUrl = ''
    //   // this.$store.commit('ISLOGIN_CHANGE')
    // }
  },
  mounted () {
    this.isLogin = this.$cookies.get("jwt") ? true : false
    this.username = this.$cookies.get("username")
    this.imgUrl = this.$cookies.get("imgUrl")
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