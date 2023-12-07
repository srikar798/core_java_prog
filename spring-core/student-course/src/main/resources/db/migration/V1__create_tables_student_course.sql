create table app_users(
id bigserial primary key,
username varchar(255) not null,
password varchar(255),
email varchar(255) unique
);


create table course(
id bigserial primary key,
name varchar(255) not null,
description varchar(255),
fee numeric(10,2)
);

create table credit_details(
id bigserial primary key,
user_id bigint not null,
amount numeric(10,2) default 0
);

create table user_course(
user_id bigint not null,
course_id bigint not null,
foreign key (user_id) references app_users(id),
foreign key (course_id) references course(id),
primary key (user_id, course_id)
);