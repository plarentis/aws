<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<tags:pageTemplate titulo="Livros de Java, Android, iOS, Mobile, e muito mais...">

  <section id="index-section" class="container middle"  style="margin-top: 3em">

    <ul class="clearfix book-collection">
      <c:forEach items="${produtos}" var="produto">
        <li>
          <a href="${s:mvcUrl('PC#detalhe').arg(0, produto.id).build() }" class="block clearfix">
            <h2 class="product-title">${produto.titulo }</h2>
            <img width="143" height="202" src="${produto.sumarioPath}" >
            <small class="buy-button">Compre</small>
          </a>
        </li>
      </c:forEach>
    </ul>
  </section>

</tags:pageTemplate>



















