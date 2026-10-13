#!/bin/bash

#Copiar archivos modificados hoy.

read -p "Directorio destino: " destino
mkdir -p "$destino"
find . -type f -mtime 0 -exec cp {} "$destino" \;
echo "Archivos modificados hoy copiados a $destino"
