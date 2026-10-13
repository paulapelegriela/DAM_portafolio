#!/bin/bash

#Convertir nombres a minúsculas.

read -p "Introduce un nombre: " nombre

minusculas=$(echo "$nombre" | tr 'A-Z' 'a-z')

echo "El nombre en minúsculas: $minusculas"
