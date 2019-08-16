<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<a class="navbar-brand" href="<%= request.getParameter("toDo")%>">ToDo</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#collapsibleNavbar">
		<span class="navbar-toggler-icon"></span>
	</button>
	<section class="collapse navbar-collapse" id="collapsibleNavbar">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="<%= request.getParameter("addTaskLink")%>">Add Task</a></li>
			<li class="nav-item"><a class="nav-link" href="<%= request.getParameter("checkTaskLink")%>">Check
					Task</a></li>
			<li class="nav-item"><a class="nav-link" href="<%= request.getParameter("listTaskLink")%>">List
					Tasks</a></li>
			<li class="nav-item"><a class="nav-link" href="<%= request.getParameter("clearListLink")%>">Clear
					List</a></li>
		</ul>
	</section>
</nav>