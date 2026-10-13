#!/bin/bash

#Script que salude usando parámetro. 

nombre="$1"

if [ -z "$nombre" ]; then
	echo "Debe introducir un nombre"
	echo "Uso: $0 [nombre]"
else
	echo "Hola, $nombre bienvenido al script"
fi
