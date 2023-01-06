<template>
    <div class="input-group mb-3">
        <input type="text" class="form-control" placeholder="이름" aria-label="Username" v-model="username">
        <input type="text" class="form-control" placeholder="메뉴" aria-label="Menu" v-model="menu">
        <button @click="addParticipation">입력</button>
    </div>
</template>

<script>
import axios from 'axios'
const API_URL = 'http://127.0.0.1:8081'

export default {
    methods : {
        addParticipation (){
            axios({
                method: 'post',
                url: `${API_URL}/addParticipation/`,
                data: {
                    username: this.username,
                    storeLink: this.storeLink,
                    endTime: this.endTime,
                },
            })
                .then((res) => {
                console.log(res)
                })
        },
    }
}
</script>

<style>

</style>