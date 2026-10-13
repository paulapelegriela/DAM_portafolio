<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/"> 
<html>
<table>
<tr>
<th>producto</th>
<th>¿Es caro?</th>
</tr>
<tr>
<td><xsl:value-of select="producto"></td>
</tr>
</xsl:value-of>
<tr>
<td> <xsl:when producto="precio > 20">Si</xsl:when></td>
<td> <xsl:otherwise>No</xsl:otherwise></td>
</tr>

</table>
</html>