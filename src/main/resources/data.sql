--insert into product(name , type , place , warrenty) values ("MacBook" , "Laptop" , "Chandni Chowk" , "2031");
--INSERT INTO product (name, type, place, warrenty) VALUES ('Asus', 'Laptop', 'China Town', '2028');
--INSERT INTO product (name, type, place, warrenty) VALUES ('HP', 'Laptop', 'Salt Lake', '2027');
--INSERT INTO product (name, type, place, warrenty) VALUES ('Dell', 'Desktop', 'New Market', '2026');
--INSERT INTO product (name, type, place, warrenty) VALUES ('Lenovo', 'Tablet', 'Park Street', '2029');
--INSERT INTO product (name, type, place, warrenty) VALUES ('Apple', 'Mobile', 'Sector 5', '2030');


INSERT INTO product(name, type, place, warrenty)
SELECT * FROM (SELECT 'MacBook','Laptop','Chandni Chowk','2031') AS tmp
WHERE NOT EXISTS (
    SELECT 1 FROM product WHERE name='MacBook' AND type='Laptop' AND place='Chandni Chowk'
) LIMIT 1;

INSERT INTO product(name, type, place, warrenty)
SELECT * FROM (SELECT 'Asus','Laptop','China Town','2028') AS tmp
WHERE NOT EXISTS (
    SELECT 1 FROM product WHERE name='Asus' AND type='Laptop' AND place='China Town'
) LIMIT 1;

INSERT INTO product(name, type, place, warrenty)
SELECT * FROM (SELECT 'HP','Laptop','Salt Lake','2027') AS tmp
WHERE NOT EXISTS (
    SELECT 1 FROM product WHERE name='HP' AND type='Laptop' AND place='Salt Lake'
) LIMIT 1;

INSERT INTO product(name, type, place, warrenty)
SELECT * FROM (SELECT 'Dell','Desktop','New Market','2026') AS tmp
WHERE NOT EXISTS (
    SELECT 1 FROM product WHERE name='Dell' AND type='Desktop' AND place='New Market'
) LIMIT 1;

INSERT INTO product(name, type, place, warrenty)
SELECT * FROM (SELECT 'Lenovo','Tablet','Park Street','2029') AS tmp
WHERE NOT EXISTS (
    SELECT 1 FROM product WHERE name='Lenovo' AND type='Tablet' AND place='Park Street'
) LIMIT 1;

INSERT INTO product(name, type, place, warrenty)
SELECT * FROM (SELECT 'Apple','Mobile','Sector 5','2030') AS tmp
WHERE NOT EXISTS (
    SELECT 1 FROM product WHERE name='Apple' AND type='Mobile' AND place='Sector 5'
) LIMIT 1;
