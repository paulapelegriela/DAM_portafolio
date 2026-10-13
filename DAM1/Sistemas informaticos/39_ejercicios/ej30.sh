#/bin/bash

#Detectar duplicados por nombre (case sensitive).

duplicados=$(stat --format="%n" * | tr 'A-Z' 'a-z' | sort | uniq -d)

for archivo in $duplicados
do
echo "Archivo duplicado: $archivo"
done
