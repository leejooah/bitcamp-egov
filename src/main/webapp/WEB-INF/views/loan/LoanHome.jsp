<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <style>
 #content {
 min-height : 700px;
 }

 </style>
<div id="content">
<h3 id="enterCreditLoanList">신용대출</h3>
</div>
<script>
$('#enterCreditLoanList').click(function(e){
	e.preventDefault()
location.href = "${context}/loan/personal_loans"
})
</script>