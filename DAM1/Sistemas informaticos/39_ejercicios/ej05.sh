#!/bin/bash

#Renombrar todos los .txt a .md.

for archivo in *.txt
do
	mv "$archivo" "${archivo%.txt}.md"
done
