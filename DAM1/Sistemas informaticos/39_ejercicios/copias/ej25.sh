#!/bin/bash

#Matar proceso con confirmación.

read -p "Introduce el PID del proceso: " pid
read -p "¿Seguro que quieres finalizar el proceso $pid? (s/n): " resp

if [ "$resp" = "s" ]; then
    kill -15 "$pid"
    echo "Proceso $pid finalizado"
else
    echo "Operación cancelada"
fi
