DROP TABLE IF EXISTS log_record;

CREATE TABLE log_record
(
    id varchar(32) NOT NULL,
    record json NULL DEFAULT NULL,
    create_time timestamp DEFAULT NULL,
    update_time timestamp DEFAULT NULL,
    PRIMARY KEY (id)
);
