package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/data")
public class data1 extends HttpServlet {
	private static final long serialVersionUID = 0;
       
    
    public data1() {
        super();
       
    }

	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	      Date dataNascimento = null;
		try {
			dataNascimento = sdf.parse(request.getParameter("num"));
		} catch (ParseException e) {
			
			e.printStackTrace();
		} 
	      int idade = calculaIdade(dataNascimento);
	      //A idade é:
	      
	      PrintWriter out = response.getWriter();
	      out.println("Voce tem "+idade+" anos");
	   }

	public static int calculaIdade(java.util.Date dataNasc) {

	    Calendar dataNascimento = Calendar.getInstance();  
	    dataNascimento.setTime(dataNasc); 
	    Calendar hoje = Calendar.getInstance();  

	    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

	    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
	      idade--;  
	    } 
	    else 
	    { 
	        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
	            idade--; 
	        }
	    }

	    return idade;
	}
}

