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
				
<!-- 					<div class="mb-3">
						<label for="idCapacitacionStr" class="form-label">ID Capacitación</label> 
						<input type="number" min="1" class="form-control" id="idCapacitacionStr" placeholder="ID de la Capacitación" required>
					</div> -->

					<div class="mb-3">
						<label for="nombreCapacitacion" class="form-label">Nombre Capacitación</label> 
						<input type="text" class="form-control" id="nombreCapacitacion" placeholder="Nombre de la Capacitación" required>
					</div>
					
					<div class="mb-3">
						<label for="detalleCapacitacion" class="form-label">Descripción de la Capacitación</label> 	
						<textarea class="form-control" id="detalleCapacitacion"	rows="4" placeholder="Descripción de la capacitación" required></textarea>
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