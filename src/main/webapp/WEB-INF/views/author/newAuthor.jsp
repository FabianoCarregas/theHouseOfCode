<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HouseOfTheBook</title>
</head>
<div>
    <h1>New Author</h1>
</div>
    <form action="/admin/new/author" method="post">
        <body>
            <div>
                <label>Author name:</label>
                <input name="name" type="text" id="author-name">
                <form:errors path="newAuthorForm.name" cssClass="alert-danger"></form:errors>
            </div>
            <div>
                <label>Author email:</label>
                <input name="email" type="text" id="author-email">
                <form:errors path="newAuthorForm.email" cssClass="alert-danger"></form:errors>
            </div>
            <div>
                <label>Author description:</label>
                <input name="description" type="text" id="author-description">
                <form:errors path="newAuthorForm.description" cssClass="alert-danger"></form:errors>
            </div>
            <div>
                <button type="submit" class="btn btn-success" >CREATE</button>
            </div>
        </body>
    </form>
</html>