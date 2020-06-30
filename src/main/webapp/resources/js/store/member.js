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
			url : _+`/member/join`,
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
	return {init, join}
})()
