#!/bin/bash

#Cambiar permisos en lote.

for archivo in *.sh
do
    chmod +x "$archivo"
done

echo "Permisos de ejecución añadidos a los archivos .sh"
