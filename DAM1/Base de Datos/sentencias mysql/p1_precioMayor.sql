-- primer procedimiento de prueba comparar dos marcas y ver cual de las dos es más mayor o si son iguales.
drop procedure if exists P1;
delimiter $$
create procedure P1 (in P_marca1 varchar(30), in P_marca2 varchar(30), out P_resultado varchar(200)) -- p de parametro
begin
declare vcaro1, vcaro2 double;
set vcaro1 = (select max(precio_unidad) from televisores where marca= P_marca1);
set vcaro2 = (select max(precio_unidad) from televisores where marca= P_marca2);
if vcaro1=vcaro2 then 
set P_resultado = concat('El precio de las dos marcas es el mismo: ', vcaro1);
else
	if vcaro1 > vcaro2 then
	set P_resultado = concat('El precio de: ', P_marca1, 'es mayor que: ', P_marca2);
	else
	set P_resultado = concat('El precio de: ', P_marca2, 'es mayor que: ', P_marca1);
	end if;
end if;
end $$

call P1('LG', 'samsung', @v1);