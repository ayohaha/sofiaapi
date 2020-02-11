DROP TABLE IF EXISTS POST;

CREATE TABLE POST (ID INT PRIMARY KEY AUTO_INCREMENT, title VARCHAR, content VARCHAR, author VARCHAR);

INSERT INTO POST (title, content, author) VALUES ('모던자바인액션', 'JAVA8이상가이드', '라울');
INSERT INTO POST (title, content, author) VALUES ('리더의용기', '대다마게 일하고 냉정하게 대하하고 매순간 진심을 다하여', '브레네브라운');
