<!-- JSP comment -->
<%@page import="java.util.* %>
<%
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Pragram", "no-cache");
response.setDateHeader("Expires", -1);
%>
<html>
<body>
<h2>Hello World!</h2>
<br>
 <b>&nbsp; 0.6.0.0 Current System time:
<font color="#FF0000"> <%= new java.util.Date() %></font></b>
</body>
</html>
