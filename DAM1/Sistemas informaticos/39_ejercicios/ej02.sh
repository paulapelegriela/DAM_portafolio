#!/bin/bash

#comprobar si una ruta es fichero, directorio o no existe

ruta="$1"

if [ -z "$1" ]; then
	echo "Uso: $0 <ruta>"
	exit 1
fi

if [ -f "$ruta" ]; then
	echo "Es un fichero"
elif [ -d "$ruta" ]; then
	echo "Es un directorio"
else
	echo"No existe"

fi
