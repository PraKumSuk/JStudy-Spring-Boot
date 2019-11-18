<!DOCTYPE html>
<html lang="en">
<head>
<title>SPK Event Registration App</title>

<link href="/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.container {
	margin-top: 80px;
}

.bg-dark {
	background-color: #3b8dbd !important;
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
		<a class="navbar-brand" href="https://github.com/PraKumSuk">SPK Event Registration App</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

	</nav>
	<div class="container">

		<h5>
			New Audience :-
		</h5>

		<form class="form-inline" method="post" action="/add">
			<input
				type="text" class="form-control mb-2 mr-sm-2 mb-sm-0"
				id="name" name="name" placeholder="Audience Name" />
				
			
			<input
				type="text"  class="form-control mb-2 mr-sm-2 mb-sm-0" id="email"
				placeholder="Email" name="email" /> 
				
				
			<input type="date"
				 class="form-control mb-2 mr-sm-2 mb-sm-0" id="birthDate"
				placeholder="Birthdate" name="birthDate" />
				
			<input
				type="text" class="form-control mb-2 mr-sm-2 mb-sm-0"
				id="mobile" name="mobile" placeholder="Mobile" />


			<button type="submit" class="btn btn-primary">Add</button>
		</form>

		<br/>
		<br/>
		<h5>
			Registered Audience :-
		</h5>
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>Audience name</th>
					<th>Email</th>
					<th>Birthdate</th>
					<th>Mobile</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<#list model["audienceList"] as audience>
					<tr>
						<th scope="row">${audience.id}</th>
						<td>${audience.name}</td>
						<td>${audience.email}</td>
						<td>${audience.birthDate}</td>
						<td>${audience.mobile}</td>
						<td><a class="btn btn-sm btn-warning" role="button"
							href="/delete/${audience.id}">Delete</a></td>
					</tr>
				</#list>
			</tbody>
		</table>

	</div>

</body>
</html>

