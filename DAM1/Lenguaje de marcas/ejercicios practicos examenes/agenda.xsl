<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
<xsl:output method="html" indent="yes"/>
<xsl:template match="/">

<html>
<head>
    <title>Agenda de Contactos</title>
</head>
<body>
<h1>Agenda de Contactos</h1>
<table border="1">
<tr>
    <th>Nombre</th>
    <th>Apellidos</th>
    <th>Teléfonos</th>
    <th>Email</th>
    <th>Ciudad</th>
    <th>Etiqueta</th>
    <th>Fecha</th>
</tr>

<xsl:for-each select="agenda/contacto">

    <xsl:sort select="apellidos"/>

    <tr>
        <xsl:if test="etiqueta='profesional'">
            <xsl:attribute name="style">background-color: yellow;</xsl:attribute>
        </xsl:if>

        <td><xsl:value-of select="nombre"/></td>
        <td><xsl:value-of select="apellidos"/></td>

        <td>
            <xsl:for-each select="telefono">
                <xsl:value-of select="."/>
                <br/>
            </xsl:for-each>
        </td>

        <td><xsl:value-of select="email"/></td>
        <td><xsl:value-of select="direccion/ciudad"/></td>
        <td><xsl:value-of select="etiqueta"/></td>
        <td><xsl:value-of select="fechaNacimiento"/></td>

    </tr>

</xsl:for-each>

</table>

</body>
</html>
</xsl:template>
</xsl:stylesheet>