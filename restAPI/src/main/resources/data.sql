insert into users(id, join_date,name, password, ssn)
values(9001, now(), 'user1', 'test1', '701010-1111111');
insert into users(id, join_date,name, password, ssn)
values(9002,now(), 'user2', 'test2', '801010-1111111');
insert into users(id, join_date, name, password, ssn)
values(9003, now(), 'user3', 'test3', '901010-1111111');

insert into post(description, user_id) values('My first post', 9001);
insert into post(description, user_id) values('My second post', 9001);