#!/bin/bash

#Crear 100 archivos numerados.

for i in $(seq -w 1 100)
do
    touch archivo$i.txt
done
