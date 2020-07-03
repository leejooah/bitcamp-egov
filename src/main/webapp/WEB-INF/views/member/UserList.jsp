<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
<div id = user_list>
<h2 id="tableName">User List</h2>

<table id="userlist_table">
  <tr>
    <th>No</th>
    <th>Seq</th>
    <th>Email</th>
  </tr>



<c:forEach var="member" items="${members}" varStatus="status"> 
<tr>
    <td>${status.count}</td>
    <td>${member.memberSeq}</td>
    <td><a id="detail">${member.email}</a></td>
  </tr>
</c:forEach>
</table>
</div>
<script src="${javascript}/store/member.js"></script>
<script>
document.getElementById('detail').addEventListener('click',function(e){
	alert(document.getElementById('detail').innerHTML)
})
</script>
<style>
#userlist_table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
 margin : 50px auto;
 text-align: center;
}

#userlist_table td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

#userlist_table tr:nth-child(even) {
  background-color: #dddddd;
}

#tableName {
	padding-left : 500px;
}
#user_list {
padding-top :100px;
padding-bottom : 100px;
}
</style>