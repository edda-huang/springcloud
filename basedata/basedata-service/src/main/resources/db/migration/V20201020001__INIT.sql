DROP TABLE IF EXISTS user_info;

CREATE TABLE user_info
(
    id VARCHAR(32) NOT NULL,
    name VARCHAR(30) NULL DEFAULT NULL,
    age int2 NULL DEFAULT NULL,
    email VARCHAR(50) NULL DEFAULT NULL,
    version int2 DEFAULT '1',
    deleted int2 DEFAULT '0',
    create_time timestamp DEFAULT NULL,
    update_time timestamp DEFAULT NULL,
    PRIMARY KEY (id)
);

DELETE FROM user_info;

INSERT INTO user_info (id, name, age, email) VALUES
(1, 'Jone', 18, 'test1@baomidou.com'),
(2, 'Jack', 20, 'test2@baomidou.com'),
(3, 'Tom', 28, 'test3@baomidou.com'),
(4, 'Sandy', 21, 'test4@baomidou.com'),
(5, 'Billie', 24, 'test5@baomidou.com');