#!/bin/bash

#Crear copa de seguridad con fecha.
origen="/home/paula/39_ejercicios"

destino="/home/paula/backup"

mkdir -p $destino

tar -czf $destino/backup_$(date +%Y%m%d).tar.gz .

echo "Copia de seguridad creada"
