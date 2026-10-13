#!/bin/bash

#Descomprimir según extensión.

read -p "Introduce el archivo a descomprimir: " archivo

case $archivo in
    *.zip)
        unzip "$archivo"
        ;;
    *.tar.gz)
        tar -xzf "$archivo"
        ;;
    *)
        echo "ERROR: no se puede descomprimir este archivo"
        ;;
esac
