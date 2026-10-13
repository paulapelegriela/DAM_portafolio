#!/bin/bash

#Simular cambio de propietario.


read -p "Introduce el archivo: " archivo
read -p "Introduce el nuevo propietario: " usuario

echo "Se ejecutaría: chown $usuario $archivo"
