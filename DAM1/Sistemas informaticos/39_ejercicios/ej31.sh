#/bin/bash

#Comprobar si un comando existe.

read -p "Introduce el comando: " comando

if command -v "$comando" 
then
    echo "El comando existe"
else
    echo "El comando no existe"
fi
