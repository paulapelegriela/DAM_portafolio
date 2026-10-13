#!/bin/bash

#Contar archivos por extensión.

read -p "Introduce la extensión: " ext

cantidad=$(find . -name "*.$ext" | wc -l) #wc -l: cuenta los resultados

echo "Hay $cantidad archivos con extensión .$ext"
