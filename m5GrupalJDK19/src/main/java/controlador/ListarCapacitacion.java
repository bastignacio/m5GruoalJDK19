package controlador;

import java.io.IOException;
//import java.util.List;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO.ImplementacionInterfaz;
import model.DAO.Interfaz;
import modelo.Capacitacion;


@WebServlet("/ListarCapacitacion")
public class ListarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Interfaz interfaz = new ImplementacionInterfaz();	
	
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	List<Capacitacion> capacitaciones = interfaz.obtenerCapacitaciones();
    	
    	request.setAttribute("capacitaciones", capacitaciones);
    	
        request.getRequestDispatcher("/views/listarCapacitacion.jsp").forward(request, response);

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	/*
	 * En conclusión, no es obligatorio desde una perspectiva de buenas prácticas,
	 * pero puede ser útil en algunos casos para proteger el código de futuros
	 * errores o para mejorar la claridad del comportamiento del servlet.
	 */

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);  // Redirigir las solicitudes POST a doGet
		
	}

}
