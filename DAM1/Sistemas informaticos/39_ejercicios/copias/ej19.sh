#!/bin/bash

#Comprobar conexión.

if ping -c 1 google.com > /dev/null
then
    echo "Conexión exitosa"
else
    echo "Sin conexión"
fi
