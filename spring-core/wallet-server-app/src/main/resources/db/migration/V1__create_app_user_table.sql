create table app_user(
    id UUID primary key,
    username varchar(255) not null,
    password varchar(255) not null,
    email varchar(255) not null,
    mobile varchar(255) not null,
    created_date timestamp not null,
    modified_date timestamp not null,
    created_by varchar(255) not null,
    modified_by varchar(255) not null,
    deleted boolean not null default false
 );