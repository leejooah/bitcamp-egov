<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri ="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!doctype html>
<html>
<head>
<tiles:insertAttribute name = "header"/>

</head>
<body>
<tiles:insertAttribute name = "content"/>
<tiles:insertAttribute name = "footer"/>
</body>

</html>	
