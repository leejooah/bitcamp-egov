"use strict";
function Session(x){ //선언 class라서 대문자로 쓴다
	sessionStorage.setItem('context', x)
	sessionStorage.setItem('javascript', x+'/resources/js')
	sessionStorage.setItem('css', x+'/resources/css')
	sessionStorage.setItem('img', x+'/resources/img')
}