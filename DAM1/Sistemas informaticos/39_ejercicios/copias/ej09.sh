#!/bin/bash

#Verificar permiso de ejecución.

archivo=$1

if [ -x "$archivo" ]; then
	
	echo "El archivo tiene permiso de ejecución"

else

	echo "El archivo no tiene permiso de ejecución"

fi
