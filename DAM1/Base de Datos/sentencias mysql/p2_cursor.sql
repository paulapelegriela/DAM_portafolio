-- procedimiento con concepto de cursor
drop procedure if exists P2;
delimiter $$
create procedure P2()
begin
declare wmarca, wmodelo varchar(30);
declare wpulgadas int;
declare wfin boolean default false;
declare wtodo varchar(1000) default ''; -- la variable pasa rellenar fichero
declare cursor1 cursor for select marca, modelo, pulgadas from televisores;
declare continue handler for not found set wfin = true; -- se puede añadir boolean, un int o un string lo que queramos (el boolean es más intuitivo)

set wtodo = '          listado televisores\r          -------------------\r\r'; -- la cabecera del fichero
open cursor1;			
fetch cursor1 into wmarca, wmodelo, wpulgadas; -- lee el primer registro del cursor

while wfin = false do -- minetras el wfin sea falso se hará lo siguiente
select wmarca, wmodelo, wpulgadas;
set wtodo = concat(wtodo, wmarca, '-', wmodelo, '-', wpulgadas, '\r'); -- pasar el resultado del while en un fichero
fetch cursor1 into wmarca, wmodelo, wpulgadas; -- se vuelve a comprobar el primer registro para saber si continuar en el bucle o salir
end while;
close cursor1;
select wtodo into outfile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/resultado.txt'; -- crear el fichero y guardarlo en la ruta predeterminada de mysql
end $$

