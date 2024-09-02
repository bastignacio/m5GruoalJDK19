<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Crear Capacitación - Prevención Segura</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>

	<!-- Navbar -->
	<%@ include file='navbar.jsp'%>

	<!-- Main content -->
	<div class="container my-5">
		<div class="row">
			<div class="col-md-6">
				<h1 class="display-4">Crear Nueva Capacitación</h1>
				<p class="lead">Utiliza el formulario a continuación para
					registrar una nueva capacitación para tu equipo. Asegúrate de
					completar todos los campos requeridos.</p>
			</div>
			<div class="col-md-6">
				<form>
					<div class="mb-3">
						<label for="nombreCapacitacion" class="form-label">Nombre de la Capacitación</label> <input type="text" class="form-control"
							id="nombreCapacitacion" placeholder="Nombre de la capacitación">
					</div>
					<div class="mb-3">
						<label for="fechaCapacitacion" class="form-label">Fecha</label> <input type="date" class="form-control" id="fechaCapacitacion">
					</div>
					<div class="mb-3">
						<label for="duracionCapacitacion" class="form-label">Duración (horas)</label> <input type="number" class="form-control"
							id="duracionCapacitacion" placeholder="Duración en horas">
					</div>
					<div class="mb-3">
						<label for="descripcionCapacitacion" class="form-label">Descripción</label> 	<textarea class="form-control" id="descripcionCapacitacion"
							rows="4" placeholder="Descripción de la capacitación"></textarea>
					</div>
					<button type="submit" class="btn btn-primary">Crear Capacitación</button>
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