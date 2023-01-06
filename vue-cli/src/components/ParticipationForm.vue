<template>
    <div class="input-group mb-3">
        <input type="text" class="form-control" placeholder="이름" aria-label="Username" v-model="username">
        <input type="text" class="form-control" placeholder="메뉴" aria-label="Menu" v-model="menu">
        <button @click="addParticipation">입력</button>
    </div>
</template>

<script>
export default {

}
</script>

<style>

</style>