<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page isELIgnored="false" %>

<html>
<head>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Welcome</title>
</head>
<body>

<div id="page-content" class="page-content">
    <div class="jumbotron text-center">
        <h1>Welcome to the Main Page</h1>
        <a href="<c:url value="/logout" />" class="btn btn-outline-warning" role="button">Logout</a>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-sm-4">
                <h3>Rest Service</h3>
                <p><a href="<c:url value="/ships"  />" class="btn btn-outline-primary" role="button">Ships</a></p>
            </div>
            <div class="col-sm-4">
                <h3>Encyrption</h3>
                <p><a href="<c:url value="/encyrpt" />" class="btn btn-outline-secondary" role="button">encyrption</a>
                </p>
            </div>

            <div class="col-sm-4">
                <h3>Students</h3>
                <p><a href="<c:url value="/student" />" class="btn btn-outline-success" role="button">Go To Students
                    Page</a></p>
            </div>

            <hr/>
            <div class="row">
                <div class="col-sm-4">
            <div class="btn-group">
                <button type="button" class="btn btn-primary">Apple</button>
                <button type="button" class="btn btn-primary">Samsung</button>
                <button type="button" class="btn btn-primary">Sony</button>
            </div>
                </div>
                <div class="col-sm-4">
            <div class="form-group">
                <label for="sel1">Select list (select one):</label>
                <select class="form-control" id="sel1">
                    <option>EU</option>
                    <option>USA</option>
                    <option>UK</option>
                    <option>DE</option>
                </select>
            </div>
                </div>
                <div class="col-sm-4">
            <img src="images/atlas.png" class="img-circle" alt="hero" width="304" height="236">
            </div>
            </div>

            <div class="col-sm-12">



                    Comodo:<br/>
                        The dragon has venom glands, which are loaded with toxins that lower blood pressure, cause massive bleeding, prevent clotting and induce shock.
                        Rather than using bacteria as venom, the dragons use, well, venom as venom.


            </div>



        </div>

</body>
</html>