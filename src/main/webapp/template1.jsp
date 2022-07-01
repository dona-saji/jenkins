<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx"%>
<tilesx:useAttribute ignore="true" id="pageStyles" name="pageStyles" classname="java.util.List"/>
<tilesx:useAttribute ignore="true" id="pageTopScripts" name="pageTopScripts" classname="java.util.List"/>
<tilesx:useAttribute ignore="true" id="pageBottomScripts" name="pageBottomScripts" classname="java.util.List"/>
<!doctype html>
<html lang="en">
<head>
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta name="description" content="<tiles:insertAttribute name="metaDescription" ignore="true"/>">
    <meta name="keyword" content="<tiles:insertAttribute name="metaKeyword" ignore="true"/>">
    <link href="/assets/img/favicon.png" rel="shortcut icon" type="image/x-icon">
    <%-- VENDOR CSS --%>
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
</head>
<body class="theme-blue">
<div id="wrapper">

    <div id="main-content">
        <div class="container-fluid">
            <div class="block-header p-l-25">
                <div class="row">
                </div>
            </div>
            <div id="js-body-container">
            <tiles:insertAttribute name="body"/>
            </div>
        </div>
    </div>
</div>
<%-- Javascript --%>
<script src="https://cdn.rawgit.com/nnattawat/flip/master/dist/jquery.flip.min.js"></script>
<script src="https://code.jquery.com/ui/1.11.3/jquery-ui.min.js"></script>

<tiles:insertAttribute name="script" ignore="true" />

</body>
</html>