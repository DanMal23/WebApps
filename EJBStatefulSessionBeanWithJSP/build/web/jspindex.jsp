<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="ejb2.MapElemSessionBean"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="ejb2.IMapElemRemote"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%!  // with exclam. mark - defines code outside of the flow of the page; (depricated)
    private static IMapElemRemote values;
    public void jspInit() {
         try {
         InitialContext initialcontext = new InitialContext();
values = (IMapElemRemote)initialcontext.lookup("java:global/EJBStatefulSessionBeanWithJSP/MapElemSessionBean");

         } catch (Exception e) { System.out.println(e); }
}
%>

<%
    if(request.getParameter("addElems")!=null) {
        String s = request.getParameter("s1");
        int i = Integer.parseInt(request.getParameter("i1"));
        values.addElement(s, i);
    }
%>

<%
    if(request.getParameter("removeElems")!=null) {
        String s = request.getParameter("s1");
        int i = Integer.parseInt(request.getParameter("i1"));
        values.removeElement(s, i);
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
input {
	padding: 3px;
}
body {
	background: #e0dfd9;
	color: #272b33;
	padding: 40px;
}
</style>
        <title>JSP Page</title>
    </head>
    <body>
        <h2 align='center'><font color=#91826e>Welcome! Please fill in the  text fields:</font></h2>
        <form name="ff" method="post">
            <h5 align='center'>progr. language <input type='text' name='s1'><br/><br/>
                                           year of release <input type='text' name='i1'><br/><br/>
             <input type='submit' value="Add" name='addElems'>                                       
          <input type='submit' value="Remove" name='removeElems'></h5> 
           
            <% 
                    if(values!=null) {
                        HashMap<String, Integer> nums = values.getElements();
                        for (Map.Entry<String, Integer> entry : nums.entrySet()) {
                            String key = entry.getKey();
                            int value = entry.getValue();
                          //  for(int i = 1; i < nums.size(); i++){
                            out.println("<br/>"+"  "+key+"___"+value);                       
                        }
                        //out.println("<br/> <h5 align='center'>Number of elements: " + nums.size()+"</h5>");
                      out.println("<br/><h5>Number of listed languages: "+nums.size()+"</h5>");                      
                    }                 
                %>
                
         </form>      
    </body>
</html>
