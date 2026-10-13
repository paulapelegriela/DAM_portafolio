#!/bin/bash

#Mostrar 10 archivos más grandes.

echo "Los 10 archivos más grandes son: "
echo
du -ah | sort -hr | head -n 10  #du -ah: tamaño de los archivos
				#sort -hr: ordena de + a -
				# head -n 10: los 10 primeros
