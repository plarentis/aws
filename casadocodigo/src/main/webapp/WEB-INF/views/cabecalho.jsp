<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="icon"
	href="//cdn.shopify.com/s/files/1/0155/7645/t/177/assets/favicon.ico?11981592617154272979"
	type="image/ico" />
<link href="https://plus.googlecom/108540024862647200608"
	rel="publisher" />
<title>Loja Virtual</title>
<link href="/casadocodigo/resources/css/cssbase-min.css"
	rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700'
	rel='stylesheet' />
<link href="/casadocodigo/resources/css/fonts.css" rel="stylesheet"
	type="text/css" media="all" />
<link href="/casadocodigo/resources/css/fontello-ie7.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="/casadocodigo/resources/css/fontello-embedded.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="/casadocodigo/resources/css/fontello.css" rel="stylesheet"
	type="text/css" media="all" />
<link href="/casadocodigo/resources/css/style.css" rel="stylesheet"
	type="text/css" media="all" />
<link href="/casadocodigo/resources/css/layout-colors.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="/casadocodigo/resources/css/responsive-style.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="/casadocodigo/resources/css/estilos-casadocodigo.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="/casadocodigo/resources/css/produtos.css" rel="stylesheet"
	type="text/css" media="all" />
<link rel="canonical" href="http://www.casadocodigo.com.br/" />
<link href="/casadocodigo/resources/css/book-collection.css"
	rel="stylesheet" type="text/css" media="all" />

<link rel="stylesheet"
	href="/casadocodigo/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/casadocodigo/resources/css/bootstrap-theme.min.css">
</head>
<header id="layout-header">
	<div class="clearfix container">
		<a href="${s:mvcUrl('HC#index').build()}" id="logo"></a>
		<div id="header-content">
			<nav>
				<a href="${s:mvcUrl('CCC#itens').build()}" rel="nofollow">
					<s:message code="menu.carrinho"	arguments="${carrinhoCompras.quantidade }" />
				</a>
			</nav>
		</div>
	</div>
</header>
<nav class="categories-nav">
	<ul class="container">
		<li class="category"><a href="${s:mvcUrl('HC#index').build()}">
			<fmt:message key="navegacao.categoria.home" /></a>
		</li>
	</ul>
</nav>
