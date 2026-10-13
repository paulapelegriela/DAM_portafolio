#!/bin/bash

#Validar número entero.

read -p "Introduce un número: " num

if [[ $num =~ ^[0-9]+$ ]]; then
    echo "Es un número entero"
else
    echo "No es un número entero"
fi


