create table wallet(
        id UUID primary key,
        user_id UUID not null,
        balance decimal(19,2) not null,
        created_date timestamp not null,
        modified_date timestamp not null,
        created_by varchar(255) not null,
        modified_by varchar(255) not null,
        deleted boolean not null default false,
        constraint fk_user_id foreign key (user_id) references app_user(id)
);

create table transaction(
        id UUID primary key,
        from_wallet_id UUID not null,
        to_wallet_id UUID not null,
        amount decimal(19,2) not null,
        created_date timestamp not null,
        modified_date timestamp not null,
        created_by varchar(255) not null,
        modified_by varchar(255) not null,
        deleted boolean not null default false,
        constraint fk_from_wallet_id foreign key (from_wallet_id) references wallet(id),
        constraint fk_to_wallet_id foreign key (to_wallet_id) references wallet(id)
);