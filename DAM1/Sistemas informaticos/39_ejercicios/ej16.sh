#!/bin/bash

#Comprimir directorio en tar.gz.

read -p "Introduce el nombre del directorio a comprimir: " dir

tar -czf "$dir.tar.gz" "$dir"

echo "Directorio comprimido en $dir.tar.gz"
