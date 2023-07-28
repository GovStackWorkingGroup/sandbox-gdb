create table BENEFIT_PACKAGE
(
    ID          INTEGER AUTO_INCREMENT,
    NAME        CHARACTER VARYING(255),
    DESCRIPTION CHARACTER VARYING(255),
    AMOUNT      FLOAT,
    CURRENCY    CHARACTER VARYING(255),
    constraint PK
        primary key (ID)
);

create table PERSON
(
    ID                      INTEGER AUTO_INCREMENT,
    FOUNDATIONAL_ID         CHARACTER VARYING(255),
    FIRST_NAME              CHARACTER VARYING(255),
    LAST_NAME               CHARACTER VARYING(255),
    EMAIL                   CHARACTER VARYING(255),
    DATE_OF_BIRTH           CHARACTER VARYING(255),
    constraint ID
        primary key (ID),
    UNIQUE(FOUNDATIONAL_ID)
);