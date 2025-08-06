CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS public.bank_details (
	id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
	agency int4 NULL,
	digit int4 NULL,
	account int4 NULL,
	pix_key varchar(255) NULL,
	bank_name varchar(255) NULL,
	user_id uuid NULL
);

CREATE TABLE IF NOT EXISTS public.transfer_details (
	id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
	destination varchar(255) NULL,
	origin varchar(255) NULL,
	user_type varchar(255) NULL,
	date_time timestamp(6) NULL,
	transfer_status varchar(255) NULL
);

CREATE TABLE IF NOT EXISTS public.users (
	id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
	name varchar(255) NULL,
	document_type varchar(255) NULL,
	document_number varchar(255) NULL,
	email varchar(255) NULL,
	password varchar(255) NULL
);