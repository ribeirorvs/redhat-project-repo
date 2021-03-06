<%@ page language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-sacle=1">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/style.css">
		<title>Red Hat Project - To Do List in EAP 7.1</title>
	</head>
	<body>
		<section class="container-fluid">
			<header class="row text-center">
				<section class="col-sm-12">
					<img src="img/redhat_banner.png" id="banner">
				</section>
				<section class="col-sm-6">
					<img src="img/javaee_logo.png" class="product-logo">
				</section>
				<section class="col-sm-6">
					<img src="img/eap_logo.png" class="product-logo">
				</section>
				<!-- <section class="col-sm-3">
					<img src="img/datagrid_logo.png" class="product-logo">
				</section>  -->
			</header>
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<a class="navbar-brand" href="#">ToDo</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
					<span class="navbar-toggler-icon"></span>
				</button>
				<section class="collapse navbar-collapse" id="collapsibleNavbar">
					<ul class="navbar-nav">
						<li class="nav-item">
							<a class="nav-link" href="#">Add Task</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="checktask.jsp">Check Task</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="listtasks.jsp">List Tasks</a>
						</li>
					</ul>
				</section>
			</nav>
			<section class="row">
				<header class="col-sm-12">
					<h1>Add a new Task</h1>
				</header>
				<article class="col-sm-6">
					<form action="AddTask.do" method="post">
						<input type="hidden" name="operation" value="addTask"/>
						<fieldset class="form-group">
							<legend>Task:</legend>
							<label for="title">Title: </label>
							<input type="text" class="form-control" placeholder="Task Title" name="task-title" id="title">
							<br>
							<label for="desc">Description:</label>
							<br>
							<textarea rows="5" placeholder="Task description" class="form-control" name="task-desc" id="desc"></textarea>
						</fieldset>
						<fieldset class="form-inline">
							<legend>From:</legend>
							<label for="starDay">Date: </label> 
							<input type="date" name="task-startDay" id="startDay">
							<br>
							<label for="startTime">Time: </label>
							<input type="time" name="task-startTime" id="startTime">
						</fieldset>
						<fieldset class="form-inline">
							<legend>To:</legend>
							<label for="lastDay">Date: </label>
							<input type="date" name="task-lastDay" id="lastDay">
							<br>
							<label for="lastTime">Time: </label>
							<input type="time" name="task-finalTime" id="lastTime">
						</fieldset>
						<input type="submit" class="btn btn-primary" value="Submit">
					</form>
				</article>
			</section>
		</section>
	</body>
</html>