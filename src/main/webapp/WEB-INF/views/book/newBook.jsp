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
        <h1 class="title-wrapper">New Book</h1>
    </div>

    <form action="/new/book" method="post" class="form-post">
        <div class="wrapper-row">
            <label class="form-title-label">Name</label>
            <form:errors path="newBookForm.name" cssClass="error-msg"/>
            <input name="name" class="form-input" type="text" >
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Code</label>
            <form:errors path="newBookForm.code" cssClass="error-msg"/>
            <input name="code" class="form-input" type="text">
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
            <label class="form-title-label">Author</label>
            <select name="author" class="form-input" type="text">
            <c:forEach var="author" items="${authors}">
                <option value="${author.id}">${author.name}</option>
            </c:forEach>
            </select>
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Hard Cover</label>
            <input name="hardcover" class="form-input-ckeck-box" type="checkbox">
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">On-Sale</label>
            <input name="onSale" class="form-input-ckeck-box" type="checkbox">
        </div>
        <div class="wrapper-row">
            <label class="form-title-label">Pages</label>
            <input name="pages" class="form-input-ckeck-box" type="number">
        </div>
        <div class="wrapper-row">
            <button type="submit" class="btn-success">SALVAR</button>
        </div>
    </form>

    </head>
</div>

</body>
</html>