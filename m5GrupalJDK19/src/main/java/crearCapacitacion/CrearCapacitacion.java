package crearCapacitacion;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Es importante importar el paquete en donde se está almacenando la clase capacitacion (modelo);*/
import model.Capacitacion;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
	 * Este arreglo se define afuera del doGet y adentro de la clase CrearCapacitacion
	 */

	private ArrayList<Capacitacion> capacitaciones = new ArrayList<>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request,response);


	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		/* Almacenar los parámetros ingresados en el formulario de nombreCapacitación */

		String nombreCapacitacion = request.getParameter("nombreCapacitacion");
		String fechaCapacitacion = request.getParameter("fechaCapacitacion");
		String duracionCapacitacion = request.getParameter("duracionCapacitacion");
		String descripcionCapacitacion = request.getParameter("descripcionCapacitacion");

		Capacitacion nuevaCapacitacion = new Capacitacion(nombreCapacitacion, fechaCapacitacion, duracionCapacitacion, descripcionCapacitacion);

		/* Se agregan las variables al arrayList Capacitacion */

		capacitaciones.add(nuevaCapacitacion);




	}

}
