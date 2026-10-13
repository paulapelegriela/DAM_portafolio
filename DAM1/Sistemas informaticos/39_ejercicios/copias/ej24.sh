#!/bin/bash

#Buscar procesos por nombre.

read -p "Introduce el nombre del proceso: " proceso

ps aux | grep "$proceso"
