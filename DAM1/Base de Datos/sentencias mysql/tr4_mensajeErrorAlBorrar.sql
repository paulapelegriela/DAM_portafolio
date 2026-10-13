drop trigger  if exists TR4;
delimiter $$
create trigger TR4
before delete on log_operaciones
for each row
begin 
	if old.id = 1 then
		signal sqlstate '45000' set message_text = 'No es posible eliminar ese registro';
	end if;
end $$
