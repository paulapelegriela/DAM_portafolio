#!/bin/bash

#Comprobar permisos en directo.

read -p "Introduce el nombre del archivo: " archivo

if [ -r "$archivo" ]; then
    echo "Tiene permiso de lectura"
fi

if [ -w "$archivo" ]; then
    echo "Tiene permiso de escritura"
fi

if [ -x "$archivo" ]; then
    echo "Tiene permiso de ejecución"
fi
