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
				<a class="navbar-brand" href="index.jsp">ToDo</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
					<span class="navbar-toggler-icon"></span>
				</button>
				<section class="collapse navbar-collapse" id="collapsibleNavbar">
					<ul class="navbar-nav">
						<li class="nav-item">
							<a class="nav-link" href="index.jsp">Add Task</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="checktask.jsp">Check Task</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#">List Tasks</a>
						</li>
					</ul>
				</section>
			</nav>
			<section class="row">
				<header class="col-sm-12">
					<h1>Tasks</h1>
				</header>
				<article class="col-sm-6">
					<div class="btn-group">
						<form action="ListTasks.do" method="post">
							<input type="hidden" name="operation" value="listTasks">
							<input type="submit" class="btn btn-primary" value="All">
						</form>
					</div>
				</article>
			</section>
		</section>
	</body>
</html>