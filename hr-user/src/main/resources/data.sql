INSERT INTO tb_user (name, email, password) VALUES ( 'Nina Brown' , 'nina@gmail.com' , '$2a$10$mZcHlnyf13/UCVL09R/uBOgxb5X55eU5Jxls69owF42o5Y0V8OQjC');
INSERT INTO tb_user (name, email, password) VALUES ( 'Leia Red' , 'leia@gmail.com' , '$2a$10$mZcHlnyf13/UCVL09R/uBOgxb5X55eU5Jxls69owF42o5Y0V8OQjC');

INSERT INTO tb_role (role_name) VALUES ( 'ROLE_OPERATOR' );
INSERT INTO tb_role (role_name) VALUES ( 'ROLE_ADMIN' );

INSERT INTO tb_user_role (user_id, role_id) VALUES ( 1 , 1 );
INSERT INTO tb_user_role (user_id, role_id) VALUES ( 2 , 1 );
INSERT INTO tb_user_role (user_id, role_id) VALUES ( 2 , 2 );