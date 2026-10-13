#!/bin/bash

#Contar lineas de un archivo.

archivo="hola.txt"
lineas=$(wc -l < "$archivo")

echo "El archivo tiene $lineas lineas"
