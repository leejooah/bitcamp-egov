"use strict"
var app = app || {}
app = (()=>{
	return { init
		}
})();
function init(x){	
	$.getScript(x+'/resources/js/session.js',()=>{  //success일 때
		new Session(x) //함수가 객체 하나를 받는다.
	})
}
