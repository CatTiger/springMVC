<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>HomePage</title>
	<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="resources/scripts/jquery-1.11.1.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" style="padding: 100px 50px 10px;" >
   <button type="button" class="btn btn-default" title="Popover title"  
      data-container="body" data-toggle="popover" data-placement="left" 
      data-content="左侧的 Popover 中的一些内容">
      左侧的 Popover
   </button>
   <button type="button" class="btn btn-primary" title="Popover title"  
      data-container="body" data-toggle="popover" data-placement="top" 
      data-content="顶部的 Popover 中的一些内容">
      顶部的 Popover
   </button>
   <button type="button" class="btn btn-success" title="Popover title"  
      data-container="body" data-toggle="popover" data-placement="bottom" 
      data-content="底部的 Popover 中的一些内容">
      底部的 Popover
   </button>
   <button type="button" class="btn btn-warning" title="Popover title"  
      data-container="body" data-toggle="popover" data-placement="right" 
      data-content="右侧的 Popover 中的一些内容">
      右侧的 Popover
   </button>
   </div>

   <script>
	   $(function () { 
		   //$("[data-toggle='popover']").popover();
	   });
   </script>
</div>
</body>
</html>