CREATE TABLE IF NOT EXISTS public.propertytax
(
    id SERIAL UNIQUE NOT NULL ,
    fullname character varying(50) COLLATE pg_catalog."default",
    propertyAddress character varying(1000) COLLATE pg_catalog."default",
    mobile character varying(12) COLLATE pg_catalog."default",
    dateOfBirth Date,
    CONSTRAINT pk_constraint_name PRIMARY KEY (empid));   

  

