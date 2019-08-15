<%@ include file="components/head.jsp" %>
<%@ include file="components/header.jsp" %>
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