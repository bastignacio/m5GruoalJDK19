<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Crear Usuario - Prevención Segura</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>

	<!-- Navbar -->
	<%@ include file='navbar.jsp'%>

	<!-- Main content -->
	<div class="container my-5">
		<div class="row">
			<div class="col-md-6">
				<h1 class="display-4">Crear Nuevo Usuario</h1>
				<p class="lead">Utiliza el formulario a continuación para
					registrar un nuevo usuario para tu equipo. Asegúrate de completar
					todos los campos requeridos.</p>
			</div>
			<div class="col-md-6">
				<form>
					<div class="mb-3">
						<label for="nombreUsuario" class="form-label">Nombre del
							Usuario</label> <input type="text" class="form-control"
							id="nombreUsuario" placeholder="Nombre del usuario">
					</div>
					<select class="form-select" aria-label="Default select example">
						<option value="" selected disabled>Seleccione una opción</option>
						<option value="1">Administrativo</option>
						<option value="2">Cliente</option>
						<option value="3">Profesional</option>
					</select>
					<br>
					<button type="submit" class="btn btn-primary">Crear
						Usuario</button>
				</form>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<%@ include file='footer.jsp'%>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>