drop trigger  if exists TR2;
delimiter $$
create trigger TR2
after insert on operaciones
for each row
begin 
	declare reg_control int;
	declare numreg int;
	set numreg = (select count(*) from control_ventas where nombre = new.nombre);
	set reg_control=(select count(*) from operaciones where nombre = new.nombre);

	if numreg = 0 then
		insert into control_ventas values(new.nombre, reg_control);
	else
		update control_ventas set total=reg_control where nombre = new.nombre; 
	end if;
end $$

