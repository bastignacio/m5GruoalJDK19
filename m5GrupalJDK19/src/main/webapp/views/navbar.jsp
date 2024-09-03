<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<br>
	<div class="container-fluid">
		<a class="navbar-brand" href="Index">Prevención Segura</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ms-auto">

				<li class="nav-item"><a class="nav-link" aria-current="page" href="Index">Inicio</a></li>

				<% if (session.getAttribute("username") != null) { %>
				<li class="nav-item"><a class="nav-link" href="Contacto">Contacto</a></li>
				<li class="nav-item"><a class="nav-link" href="CrearCapacitacion">Crear Capacitación</a></li>
				<li class="nav-item"><a class="nav-link" href="ListarCapacitacion">Listar Capacitaciones</a></li>
				<li class="nav-item"><a class="nav-link" href="CrearUsuario">Crear Usuario</a></li>
				<li class="nav-item"><a class="nav-link" href="ListarUsuario">Listar Usuarios</a></li>
				<!-- Botón de Logout -->
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a></li>
				<% } else { %>
				<li class="nav-item"><a class="nav-link" href="Login">Login</a></li>
				<% } %>


			</ul>
		</div>
	</div>
</nav>

</html>