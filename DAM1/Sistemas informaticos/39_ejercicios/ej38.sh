#!/bin/bash

#Buscar archivos mayores de 50MB.

echo "Archivos mayores de 50MB:"
find . -type f -size +50M
