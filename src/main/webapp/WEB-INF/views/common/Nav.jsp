<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
#overlayForLogin {
  position: fixed; /* Sit on top of the page content */
  display: none; /* Hidden by default */
  width: 100%; /* Full width (cover the whole page) */
  height: 100%; /* Full height (cover the whole page) */
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: rgba(0,0,0,0.5); /* Black background with opacity */
  z-index: 2; /* Specify a stack order in case you're using a different order for other elements */
  cursor: pointer; /* Add a pointer on hover */
}
#overlayForRegister {
  position: fixed; /* Sit on top of the page content */
  display: none; /* Hidden by default */
  width: 100%; /* Full width (cover the whole page) */
  height: 100%; /* Full height (cover the whole page) */
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: rgba(0,0,0,0.5); /* Black background with opacity */
  z-index: 2; /* Specify a stack order in case you're using a different order for other elements */
  cursor: pointer; /* Add a pointer on hover */
}

#loginForm{
  position: absolute;
  top: 50%;
  left: 50%;
  width: 350px;
  min-height : 500px;
   background-color: white;
  transform: translate(-50%,-50%);
  -ms-transform: translate(-50%,-50%);
  padding : 3%
}
.form-group{
padding-top : 20px;
}

</style>

<nav class="navbar navbar-default" >
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <a class="navbar-brand" id="enterHome">LOAN</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a id="enterLoanHome">대출 </a></li>
        <li><a>계산기</a></li>
      </ul>
 
    
      <ul class="nav navbar-nav navbar-right">
        <li><a id="enterLoginForm">로그인</a></li>
            <li><a id="enterRegisterForm">회원가입</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div id="overlayForLogin">
  <div id="loginForm">
   <form>
   <h1 style="float:left">로그인</h1>
   <button  id="escapeLoginForm" style="float:right" type="button" class="close" aria-label="Close">
  <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
</button>
<br>
<br><br>

  <div class="form-group">
    <label for="exampleInputEmail1">이메일을 입력하세요.</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">비밀번호를 입력하세요.</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <button type="submit" class="btn btn-primary" style="width : 100%; height: 50px;margin-top:30px">로그인</button>
</form>
</div>
</div>

<div id="overlayForRegister">
  <div id="loginForm">
   <form>
   <h1 style="float:left">회원가입</h1>
   <button id="escapeRegisterForm" style="float:right" type="button" class="close" aria-label="Close">
  <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
</button>
<br>
<br><br>

  <div class="form-group">
    <label for="exampleInputEmail1">이메일을 입력하세요.</label>
    <input type="email" class="form-control" id="inputEmailForRegister" aria-describedby="emailHelp">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">비밀번호를 입력하세요.</label>
    <input type="password" class="form-control" id="inputPasswordForRegister">
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">비밀번호를 다시 입력하세요</label>
    <input type="password" class="form-control" id="inputPasswordForRegisterForCheck">
  </div>
  <button type="submit" class="btn btn-primary" id="tryRegister" style="width : 100%; height: 50px;margin-top:30px">회원가입</button>
</form>
</div>
</div>
<script>
$('#enterLoginForm').click(function(e){
	 $("#overlayForLogin").css('display' , 'block')
})
$('#escapeLoginForm').click(function(e){
	$("#overlayForLogin").css('display' , 'none')	
})
$('#enterRegisterForm').click(function(e){
	 $("#overlayForRegister").css('display' , 'block')
})
$('#escapeRegisterForm').click(function(e){
	$("#overlayForRegister").css('display' , 'none')	
})
$('#enterLoanHome').click(function(e){
location.href = "${context}/loan/home"
})
$('#enterHome').click(function(e){
location.href = "${context}"
})
$('#tryRegister').click(function(e){
	 $.ajax({
    	   url : 'admins',
    	   type : 'post',
    	   data : JSON.stringify({
    		 email : $('#inputEmailForRegister').val(),
			 position : $('#inputPasswordForRegister').val(),
			 email : $('#inputPasswordForRegisterForCheck').val()
    	   }),
    	   dataType : 'json',
    	   contentType : 'application/json',
    	   success : d=>{
    		 if (d ==='SUCCESS') {
				alert('성공')
    		 }else{
				alert('실패')
			}
    	   },
    	   error : (r,x,e) =>{alert(r.status)}
       })
})
</script>
