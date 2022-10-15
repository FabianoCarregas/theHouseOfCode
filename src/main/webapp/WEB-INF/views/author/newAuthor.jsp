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
        <h1 class="title-wrapper">New author</h1>
    </div>

    <form action="/new/author" method="post" class="form-post">
        <div class="wrapper-row">
            <label class="form-title-label">Name</label>
            <form:errors path="newAuthorForm.name" cssClass="error-msg"/>
            <input name="name" class="form-input" type="text" >
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Email</label>
            <form:errors path="newAuthorForm.email" cssClass="error-msg"/>
            <input name="email" class="form-input" type="text">
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Description</label>
            <form:errors path="newAuthorForm.description" cssClass="error-msg"/>
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

    </head>
</div>

</body>
</html>