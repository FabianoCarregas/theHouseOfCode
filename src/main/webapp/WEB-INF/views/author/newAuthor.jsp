<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HouseOfTheBook</title>
    <link rel="stylesheet" href="/assets/css/authors/newItem.css">
</head>
    <h1 class="title">New Author</h1>
    <form action="/admin/new/author" method="post" class="form-new-author">
        <body>
            <div class="create-new-author">
                <label>name:</label>
                <form:errors path="newAuthorForm.name" cssClass="error-msg"></form:errors>
                <input name="name" type="text" id="author-name" placeholder="Author name here ....">

                <label>email:</label>
                <form:errors path="newAuthorForm.email" cssClass="error-msg"></form:errors>
                <input name="email" type="text" id="author-email" placeholder="Author email here ....">

                <label>description:</label>
                <form:errors path="newAuthorForm.description" cssClass="error-msg"></form:errors>
                <input name="description" type="text" id="author-description" placeholder="Author description here ....">

                <button class="bt-submit" type="submit">Create</button>
            </div>
        </body>
    </form>
</html>