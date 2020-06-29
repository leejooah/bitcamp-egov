<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
#content {
	min-height: 700px;
}

#header {
	height: 200px
}

#container {
	width: 1300px;
	margin: 0 auto;
}

#filter {
	height: 100%;
	width: 350px;
	float: left;
}

#list {
	min-height: 100px;
	width: 950px;
	float: right;
}
#count {
float : left;
}
#table tr td {

}

</style>
<div id="content">
	<div id="header">
		<h1>신용대출리스트</h1>
		금융감독원의 Open API 및 금융기관으로부터 심의받은 상품 정보를 제공하고 있습니다.
	</div>
<div id="container">
<div id="filter">
	<h3>필터 초기화</h3>
</div>

<div id="list">
<h3 id="count">검색결과 : 개</h3>
<div class="btn-group" style="width : 100px; float:right">
  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
    Action <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" role="menu" >
    <li><a href="#">Action</a></li>
    <li><a href="#">Another action</a></li>
    <li><a href="#">Something else here</a></li>
    <li class="divider"></li>
    <li><a href="#">Separated link</a></li>
  </ul>
</div>
  <div class="input-group" style="width : 300px;float : right;">
      <input type="text" class="form-control" placeholder="키워드 검색">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
      </span>
    </div><!-- /input-group -->
    <!-- Single button -->
  
    <br><br><br>
<table class="table">
  <thead>
    <tr>
      <th scope="col">logo</th>
      <th scope="col">seq</th>
      <th scope="col">finPrdtNum</th>
      <th scope="col">korCoNm</th>
       <th scope="col">finPrdtNum</th>
      <th scope="col">korCoNm</th>
    </tr>
  </thead>
 
</table>
<nav>
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
</div>
</div>
</div>
<script>

</script>
