#!/bin/bash

#Script con opción -h de ayuda.

if [ "$1" = "-h" ]; then
    echo "Uso: ./ej32.sh [-h]"
    echo "-h    Mostrar esta ayuda"
    exit 0
fi

echo "El script se está ejecutando..."
