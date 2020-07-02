var member = member || {}
member = (function(){
	let _ 
	let init = function(){
		_=sessionStorage.getItem('context'),
		javascript =sessionStorage.getItem('javascript') 
		session =sessionStorage.getItem('session') 
	}
	let join = function(payload){
		$.ajax({
			url : _+`/members/join`,
			type : 'POST',
			data : JSON.stringify(payload),
			dataType : 'json',
			contentType : 'application/json; charset=UTF-8',
			success : function(res){
				alert('성공')
			},
			error : function(err){
				alert('실패')
			}
			
		})
	}
	let login = function(payload){
		$.ajax({
			url : _+`/members/login`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				sessionStorage.clear();
				sessionStorage.setItem('email',res.email)
				sessionStorage.setItem('auth',res.auth)
			},
			error: function(err){
				alert('실패')
			}
		})
	}
	let logout = function(){
		$.get(_+`/members/${sessionStorage.getItem('email')}`,function(res){
			if(res==='SUCCESS'){
				sessionStorage.removeItem('email')
				sessionStorage.removeItem('auth')
			}
		
		})
	}
	return {init, join, login, logout}
})()
