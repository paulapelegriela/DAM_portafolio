#!/bin/bash

#Borrar .tmp con confirmación.

for archivo in *.tmp
do
    read -p "¿Quieres borrar $archivo? (s/n): " resp
    
    if [ "$resp" = "s" ]; then
        rm "$archivo"
        echo "$archivo borrado"
    else
        echo "$archivo no se borró"
    fi
done
