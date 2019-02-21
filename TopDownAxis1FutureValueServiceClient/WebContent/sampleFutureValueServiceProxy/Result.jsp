<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleFutureValueServiceProxyid" scope="session" class="com.online.financialmaths.FutureValueService.FutureValueServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleFutureValueServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleFutureValueServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleFutureValueServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.online.financialmaths.FutureValueService.FutureValueService getFutureValueService10mtemp = sampleFutureValueServiceProxyid.getFutureValueService();
if(getFutureValueService10mtemp == null){
%>
<%=getFutureValueService10mtemp %>
<%
}else{
        if(getFutureValueService10mtemp!= null){
        String tempreturnp11 = getFutureValueService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String annualInterestRate_2id=  request.getParameter("annualInterestRate18");
        float annualInterestRate_2idTemp  = Float.parseFloat(annualInterestRate_2id);
        String years_3id=  request.getParameter("years20");
        float years_3idTemp  = Float.parseFloat(years_3id);
        String presentValue_4id=  request.getParameter("presentValue22");
        float presentValue_4idTemp  = Float.parseFloat(presentValue_4id);
        %>
        <jsp:useBean id="com1online1financialmaths1FutureValueService1Datacalc_1id" scope="session" class="com.online.financialmaths.FutureValueService.Datacalc" />
        <%
        com1online1financialmaths1FutureValueService1Datacalc_1id.setAnnualInterestRate(annualInterestRate_2idTemp);
        com1online1financialmaths1FutureValueService1Datacalc_1id.setYears(years_3idTemp);
        com1online1financialmaths1FutureValueService1Datacalc_1id.setPresentValue(presentValue_4idTemp);
        float calculateFutureValue13mtemp = sampleFutureValueServiceProxyid.calculateFutureValue(com1online1financialmaths1FutureValueService1Datacalc_1id);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(calculateFutureValue13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>