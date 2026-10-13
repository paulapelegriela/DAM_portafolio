-- crear una funcion que nos devuelva el precio más caro
drop function if exists F3;
delimiter $$
create function F3(P_marca varchar(30)) 
returns double deterministic
begin

declare wtotal double;
set wtotal = (select max(precio_unidad) from televisores where marca = P_marca);
return wtotal;

end $$

select * from televisores where precio_unidad > (select F3('sony'));