#!/bin/bash

#Mover archivos por extensión a carpetas.

mkdir -p txt md sh

mv *.txt txt/
mv *.md md/
mv *.sh sh/

echo "Archivos organizados por extensión"
