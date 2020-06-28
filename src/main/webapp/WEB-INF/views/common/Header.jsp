<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/@mdi/font@5.x/css/materialdesignicons.min.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/vuetify@2.x/dist/vuetify.min.css" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, minimal-ui">
	<style>.menu li    {float: left;
        padding-left: 50px;
        width: auto;
        list-style: none}
        </style>
	
	<div id="app">
	
<v-system-bar color="blue-grey darken-3" app="true"></v-system-bar>	
<v-app-bar app color="white" :elevation="0">
        <v-toolbar-title @click="returnHome" class = "display-1">LOAN</v-toolbar-title>
        <ul class="menu" >
            <li @click="enterMenu(menu)" v-for="menu of menus" :key="menu">{{menu}}</li></ul>
        <v-spacer></v-spacer>
        <div v-if="login">
            <div @click="enterMyPage" style="float: left">마이페이지</div><div  style="float: left; padding-left: 20px;padding-right: 20px">|</div><div  style="float: left" @click="logout">로그아웃</div></div>
        <div v-else>
            <div v-on:click="enterLoginForm" style="float: left">로그인</div><div style="float: left; padding-left: 20px;padding-right: 20px">|</div><div style="float: left" @click="enterRegisterForm">회원가입</div>
        </div>
    </v-app-bar>
	  <div>
    <v-overlay
            :absolute="absolute"
            :value="showLoginForm"
            :opacity="opacity"
    >
        <v-card  style="width: 350px; min-height: 450px; padding: 8%;" class="elevation-12" light>
            <h2 style="float: left">로그인</h2><v-icon style="float: right" large @click="escapeLoginForm">{{close}}</v-icon><br>
            <h3  style="padding-top: 50px;">이메일을 입력하세요</h3>
            <v-text-field label="test@test.com"  type="text" v-model="email"></v-text-field>
           <h3>비밀번호를 입력하세요</h3>
            <v-text-field label="4자 이상 숫자 또는 문자"  type="password" v-model="password" @keyup.enter="tryLogin"></v-text-field>
            <v-alert dense outlined type="error" v-if="fail">이메일과 비밀번호를 확인해주세요.</v-alert>
            <v-btn color="#26A69A" style="width: 100%; height: 50px; margin-top: 30px" :disabled = disabled @click="tryLogin"><h3>로그인</h3></v-btn>
        </v-card>
    </v-overlay>
        <v-overlay
                :absolute="absolute"
                :value="showRegisterForm"
                :opacity="opacity"
        >
            <v-card  style="width: 350px; min-height: 450px; padding: 8%;" class="elevation-12" light>
                <h2 style="float: left">회원가입</h2><v-icon style="float: right" large @click="escapeRegisterForm">{{close}}</v-icon><br>
                <h3  style="padding-top: 50px;">이메일을 입력하세요</h3>
                <v-text-field label="test@test.com"  type="text" v-model="joinEmail"></v-text-field>
                <h3>비밀번호를 입력하세요</h3>
                <v-text-field label="4자 이상 숫자 또는 문자"  type="password" v-model="joinPassword"></v-text-field>
                <v-alert dense outlined type="error" v-if="duplication">이미 가입된 이메일입니다.</v-alert>
                <v-btn color="#26A69A" style="width: 100%; height: 50px; margin-top: 30px" :disabled = disabled @click="register"><h3>회원가입</h3></v-btn>
            </v-card>
        </v-overlay>

    </div>
	</div>


  <script src="https://cdn.jsdelivr.net/npm/vue@2.x/dist/vue.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/vuetify@2.x/dist/vuetify.js"></script>
  <script>
    new Vue({
      el: '#app',
      vuetify: new Vuetify(),
      data : {
    	  menus : ['대출','계산기','카드','신용','보험',' 이벤트'],
    	   opacity: 0.9,
           absolute: false,
           showRegisterForm: false,
           showLoginForm:false,
      },
      methods : {
    	  enterLoginForm:function(){
    		  alert('method 들어옴')
    		  this.showLoginForm=true
    	  }
      }
    
    
    })
  </script>

