insert into
	Editora (nome, email)
values ('Oreilly', 'oreilly@email.com');


insert into
	Editora (nome, email)
values ('Wrox', 'wrox@email.com');

insert into
	Editora (nome, email)
values ('Apress', 'apress@email.com');

insert into 
	Livro (titulo, preco, editora_id)
values ('Aprendendo C#', 89.90, 1);

insert into 
	Livro (titulo, preco, editora_id)
values ('Introdução ao JSF 2', 122.90, 2);

insert into 
	Livro (titulo, preco, editora_id)
values ('JSF 2 Avançado', 149.90, 3);

select * from Editora;

select * from Livro;

update Livro set preco = 92.9 where id = 1;
update Editora set nome = 'oReilly' where id = 1;
update Livro set editora_id = 1 where id = 2;

delete from Livro where id = 5;

select * from Livro as L, Editora as E
	where L.editora_id = E.id;
    
select * from Editora;
