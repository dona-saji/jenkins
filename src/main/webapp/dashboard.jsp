<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="mainLayout">
    <tiles:putAttribute name="title" value="Dashboard"/>
    <tiles:putAttribute name="body" value="/dashboard_body.jsp"/>
</tiles:insertDefinition>