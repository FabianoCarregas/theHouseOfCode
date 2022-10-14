<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<link rel="stylesheet" href="/assets/css/newBase.css">

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>House of code</title>
<body>
<div class="container">
    <div class="row">
        <h1>New author</h1>
    </div>

    <form action="/new/author" method="post" class="form-post">
        <div class="wrapper-row">
            <label class="form-title-label">Name</label>
            <input name="name" class="form-input" type="text" >
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Email</label>
            <input name="email" class="form-input" type="text">
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Description</label>
            <input name="description" class="form-input" type="text">
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Genre</label>
            <select name="genre" class="form-input" type="text">
                <c:forEach var="genre" items="${genres}">
                    <option value="${genre}">${genre}</option>
                </c:forEach>
            </select>
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Country</label>
            <select name="country" class="form-input" type="text">
            <c:forEach var="country" items="${countries}">
                <option value="${country}">${country}</option>
            </c:forEach>
            </select>
        </div>
        <div class="wrapper-row">
            <button type="submit" class="btn-success">SALVAR</button>
        </div>
    </form>

    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/style.css">
    </head>
</div>

</body>
</html>