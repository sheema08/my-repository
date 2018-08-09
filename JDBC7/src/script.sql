
drop table  if exists payment;
create table payment(
id int not null auto_increment,
username varchar(30) not null,
attempts int not null,
amount double not null,
status varchar(30) not null,
primary key(id)
);




insert into payment(username,attempts,amount,status) values('Rafael',1,5000.00,'Pending');
insert into payment(username,attempts,amount,status) values('Tori',2,500.00,'Pending');
insert into payment(username,attempts,amount,status) values('Roger',0,15000.00,'Pending');
insert into payment(username,attempts,amount,status) values('Sharavan',1,10000.00,'Pending');
insert into payment(username,attempts,amount,status) values('Steffi',1,2000.00,'Pending');
insert into payment(username,attempts,amount,status) values('Jack',0,5000.00,'Pending');





