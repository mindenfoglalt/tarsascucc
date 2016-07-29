<%-- 
    Document   : maintemplate
    Created on : Jul 27, 2016, 5:33:09 PM
    Author     : szabodaniel
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>

<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/jquery.dataTables.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/responsive.dataTables.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/js/select2/css/select2.min.css" />" rel="stylesheet">
        
        <script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.4.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/jquery.dataTables.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/dataTables.responsive.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/select2/js/select2.full.min.js"/>"></script>
        
        <meta name="_csrf" content="${_csrf.token}"/>
        <!-- default header name is X-CSRF-TOKEN -->
        <meta name="_csrf_header" content="${_csrf.headerName}"/>        
        
        
    </head>
</html>