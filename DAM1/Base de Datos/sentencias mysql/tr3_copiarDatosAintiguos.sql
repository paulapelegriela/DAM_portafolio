drop trigger  if exists TR3;
delimiter $$
create trigger TR3
before update on operaciones
for each row
begin 
insert into log_operaciones (fecha_cambio, operacion, nombre, fecha, producto, unidades, precio_unidad, importe) 
values (now(), 'modificar', old.nombre, old.fecha, old.producto, old.unidades, old.precio_unidad, old.importe);
end $$
