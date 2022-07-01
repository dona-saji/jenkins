<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<tiles:insertDefinition name="mainLayout">
    <tiles:putAttribute name="title" value="Users"/>
    <tiles:putAttribute name="body" value="/user/users_body.jsp"/>
</tiles:insertDefinition>