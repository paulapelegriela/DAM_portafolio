#/bin/bash

#Calculadora simple con + - * /.

read -p "Introduce el primer número: " num1
read -p "Introduce la operación (+ - * /): " op
read -p "Introduce el segundo número: " num2

case $op in
	+)	
	echo "Resultado: $(($num1 + $num2))"
	;;
	
	-)
	echo "Resultado: $(($num1 - $num2))"	
	;;
	
	\*)
	echo "Resultado: $(($num1 * $num2))"
	;;
    
	/)
	echo "Resultado: $(($num1 / $num2))"
	;;
	
	*)	
	echo "Operación no válida"
	;;
esac
