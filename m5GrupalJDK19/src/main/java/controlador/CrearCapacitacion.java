package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import model.DAO.ImplementacionInterfaz;
import modelo.Capacitacion;

@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        super.init();
        // Inicializar ImplementacionInterfaz en el contexto de la aplicación si no está ya inicializado
        ServletContext context = getServletContext();
        if (context.getAttribute("implementacionInterfaz") == null) {
            ImplementacionInterfaz implementacionInterfaz = new ImplementacionInterfaz();
            implementacionInterfaz.cargarCapacitacionesPredeterminadas(); // Cargar capacitaciones predeterminadas
            context.setAttribute("implementacionInterfaz", implementacionInterfaz); // Guardar en contexto de aplicación
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar la instancia de ImplementacionInterfaz desde el contexto de la aplicación
        ServletContext context = getServletContext();
        ImplementacionInterfaz implementacionInterfaz = (ImplementacionInterfaz) context.getAttribute("implementacionInterfaz");

        // Pasar la lista de capacitaciones al JSP para mostrarla
        request.setAttribute("capacitaciones", implementacionInterfaz.getListaCapacitaciones());
        getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	// Recuperar la instancia de ImplementacionInterfaz desde el contexto de la aplicación
        ServletContext context = getServletContext();
        ImplementacionInterfaz implementacionInterfaz = (ImplementacionInterfaz) context.getAttribute("implementacionInterfaz");

		/*
		 * // String idCapacitacionStr = "0"; // Recuperar los datos del formulario
		 * String idCapacitacionStr = request.getParameter("idCapacitacionStr"); int
		 * idCapacitacion = Integer.parseInt(idCapacitacionStr); // Convertir el ID a
		 * int
		 */        
        String nombreCapacitacion = request.getParameter("nombreCapacitacion");
        String detalleCapacitacion = request.getParameter("detalleCapacitacion");

        // Crear una nueva capacitación con los datos del formulario
        Capacitacion nuevaCapacitacion = new Capacitacion(123456,nombreCapacitacion, detalleCapacitacion);
        
        System.out.println(request.getParameter("nombreCapacitacion"));
        
        // Almacenar la nueva capacitación
        implementacionInterfaz.almacenarCapacitacion(nuevaCapacitacion);

        // Redirigir a doGet para mostrar la lista actualizada
        //doGet(request, response);
        
        getServletContext().getRequestDispatcher("/views/listarCapacitacion.jsp").forward(request, response);
    }
}
