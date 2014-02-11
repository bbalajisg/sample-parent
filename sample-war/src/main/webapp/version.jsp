<!-- JSP comment -->
<%@page import="java.util.*, org.springframework.web.context.support.*, org.springframework.web.context.*" %>
<%
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Pragram", "no-cache");
response.setDateHeader("Expires", -1);
%>
<html>
<body>
<h2>Hello World!</h2>
<%
Properties prop = new Properties();
WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(application);
prop.load(ctx.getServletContext().getResourceAsStream("/META-INF/MANIFEST.MF"));
%>
 <br>
 <b>&nbsp; Current System time:
<font color="#FF0000"> <%= new java.util.Date() %></font></b>
<br>
 <b>&nbsp; Build Version: 
<font color="#FF0000"><%= prop.getProperty("Implementation-Version")%></font></b>
<br>
 <b>&nbsp; Build By: 
<font color="#FF0000"><%= prop.getProperty("Built-By") %></font></b>
</body>
</html>
