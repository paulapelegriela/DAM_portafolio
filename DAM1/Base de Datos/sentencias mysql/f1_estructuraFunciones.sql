-- crear una funcion
drop function if exists F1;
delimiter $$
create function F1(P_importe double) -- p de parametro
returns double deterministic
begin
return (P_importe * 2);
end $$

select marca,modelo,pulgadas,F1(precio_unidad) from televisores;