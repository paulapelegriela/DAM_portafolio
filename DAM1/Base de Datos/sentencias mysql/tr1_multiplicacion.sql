use televisores;
delimiter $$
create trigger TR1
before insert on operaciones 
for each row 
begin set new.importe =  new.unidades * new.precio_unidad;
end $$


