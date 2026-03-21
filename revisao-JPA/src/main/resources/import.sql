--INSERT INTO tb_seller(name, email, phone) VALUES ('Loki Odinson', 'loki@gmail.com', '989374748');
--Long id, AuthorEntity author, String category, String title
INSERT INTO tb_author(id, name) VALUES (1, 'Machado de Assis');
INSERT INTO tb_author(id, name) VALUES(2, 'J.K.Rowling');

INSERT INTO tb_book(id, title, category, author_id) VALUES (1, 'Dom Casmurro', 'Romance', 1);
INSERT INTO tb_book(id, title, category, author_id) VALUES (2, 'Harry Potter', 'Fantasia', 2);