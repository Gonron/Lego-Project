package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int length = Integer.parseInt(request.getParameter("length"));
        
        // Gør noget med dem:
        // 1. gem i database
        // 2. Beregn resultat
        // 3. Send resultat til orderpage.jsp
        
        
        Order order = new Order(123,3321,999,false);
        request.setAttribute("order", order);
        
        return "orderlistpage";
    }
    
}
