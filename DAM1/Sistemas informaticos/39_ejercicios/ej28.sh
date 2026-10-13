#!/bin/bash

#Generar informe de sistemas (CPU, RAM, disco).


echo "INFORME DEL SISTEMA:"
echo
echo "CPU:"
lscpu
echo
echo "MEMORIA RAM:"
free -h
echo
echo "ESPACIO EN DISCO:"
df -h
