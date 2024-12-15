CREATE TABLE tb_users
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    login    VARCHAR(20)  NOT NULL,
    password VARCHAR(100) NOT NULL
);
