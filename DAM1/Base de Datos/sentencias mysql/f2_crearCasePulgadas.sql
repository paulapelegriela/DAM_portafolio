-- crear una funcion con un case para las pulgadas
drop function if exists F2;
delimiter $$
create function F2(P_pulgadas int) 
returns varchar(50) deterministic
begin

case P_pulgadas
when 55 then return '55';
when 65 then return '65';
when 75 then return '75'; -- esta mal visto poner tantos returns, habria que hacer una variable y luego el retun con la variable
else return P_pulgadas; -- por si hay alguna otra pulgada no puesta en el case (como un default en java)
end case;

end $$

select marca, modelo, F2(pulgadas) from televisores;