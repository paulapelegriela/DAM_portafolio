#!/bin/bash

#buscar palabra en archivos .log.

palabra="hola"

grep -n "$palabra" *.log
