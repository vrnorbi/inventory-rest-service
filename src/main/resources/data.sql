
insert into supplier VALUES(1, 11885069219, 'ContinentalcCargo Kft' , 3 , 'https://www.continentalcargo.hu');
insert into supplier VALUES(2, 11892766392, 'ExportHungary Kft' , 4 , 'https://www.exporthungary.hu');
insert into supplier VALUES(3, 20672315141, 'Török-Export-Import' , 2 , 'https://www.torokorszag-import-export.hu');
insert into supplier VALUES(4, 10713033202, 'Kontakt-Elektro Kft' , 4 , 'https://www.kontakt-elektro.hu');
insert into supplier VALUES(5, 22614546241, 'Bormental Doktor Kft' , 5 , 'https://www.bormental.hu');



insert into manufacturer VALUES(1,'China','Samsung Electonics',5 ,'https://www.samsung.com/');
insert into manufacturer VALUES (2,'USA','Acer America Corporation',4,'https://www.acer.com/ac/hu/HU/content/home');
insert into manufacturer VALUES (3,'USA','GeForce',5,'https://www.nvidia.com/en-eu/geforce/');
insert into manufacturer VALUES (4,'Russian','ASUSTeK Computer Incorporated ',5,'https://www.asus.com/hu/');
insert into manufacturer VALUES (5,'Romania','Serioux ',2,'https://www.serioux.ro/');
insert into manufacturer VALUES (6,'USA','Hewlett-Packard Company ',2,'https://www8.hp.com/hu');
insert into manufacturer VALUES (7,'Japan','IT Store ',1,'https://google.com');
insert into manufacturer VALUES (8,'Danish','IT Factory',1,'https://www.the-itfactory.com/');
insert into manufacturer VALUES (9,'Romania','SmartPc',1,'https://smartpctools.com/');
insert into manufacturer VALUES (10,'USA','Dell Incorporated',3,'https://www.dell.com/support/home/hu-hu');
insert into manufacturer VALUES (11,'Korea','LG Electronics Inc',4,'https://www.lg.com/hu');
insert into manufacturer VALUES (12,'Japan','Sony Corporation',5,'https://www.sony.com/');
insert into manufacturer VALUES (13,'Netherlands','Philips ',5,'https://www.philips.com/global');
insert into manufacturer VALUES (14,'Germany','Bosch ',5,'https://www.bosch.com/');
insert into manufacturer VALUES (15,'England','Whirlpool Corporation',2,'https://www.whirlpool.com/');



insert into brand VALUES(1, 'Acer');
INSERT INTO brand VALUES(2,'GeForce');
insert into brand VALUES(3, 'Asus');
insert into brand VALUES(4, 'Serioux');
insert into brand VALUES(5, 'HP');
insert into brand VALUES(6, 'IT_Store');
insert into brand VALUES(7, 'IT_Factory');
insert into brand VALUES(8, 'SmartPc');
insert into brand VALUES(9, 'Dell');
insert into brand VALUES(10, 'Lenovo');
INSERT INTO brand VALUES(11,'Samsung');
INSERT INTO brand VALUES(12,'LG');
INSERT INTO brand VALUES(13,'Sony');
INSERT INTO brand VALUES(14,'Philips');
INSERT INTO brand VALUES(15,'Bosch');
INSERT INTO brand VALUES(16,'Whirpool');



insert into category VALUES(1, 'Asztali_számítógép');
insert into category VALUES(2, 'Monitorok');
insert into category VALUES(3, 'Gamer_Pc');
insert into category VALUES(4, 'Gamer_laptopok');
insert into category VALUES(5, 'Gamer_monitorok');
insert into category VALUES(6, 'Gamer_billentyűzetek');
insert into category VALUES(7, 'Gamer_egér');
insert into category VALUES(8, 'Szoftverek');
insert into category VALUES(9, 'Pc_alkatrészek');
insert into category VALUES(10, 'SSD_meghajtók');
INSERT INTO category VALUES (11,'Tv');
INSERT INTO category VALUES (12,'Washing machine');
INSERT INTO category VALUES (13,'Telephones');


INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (1, 'Acer Nitro 50 Gamer asztali számítógép', 1000, 435, 1, 1, 2, 1);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (2, 'Acer VZ4860G All-in-One Asztali számítógép', 100, 434, 1, 1, 2, 1);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (3, 'GeForce Office i7 Asztali PC', 100, 155, 2, 1, 3, 4);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (4, 'ASUS ROG Strix G15DH-HU009D Asztali számítógép', 100, 380, 3, 3, 4, 5);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (5, 'Serioux Gaming asztali számítógép', 100, 183, 3, 4, 5, 1);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (6, 'ASUS Cerberus gaming egér, Fekete', 100, 13, 3, 7, 4, 4);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (7, 'ASUS ROG STRIX SCOPE TKL RGB mechanikus gamer billentyűzet, magyar kiosztás', 100, 55, 3, 6, 4, 4);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (8, 'HP S700 Solid-State Drive (SSD meghajtó)', 100, 17, 5, 9, 6, 3);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (9, 'Dell Alienware Ívelt Gaming monitor', 370, 100, 9, 5, 10, 2);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (10, 'Acer Predator Gaming LED Monitor, 27', 302, 200, 5, 2, 1, 4);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (11, 'Samsung Smart LED Televízió, 108 cm, 4K Ultra HD', 130, 300, 11, 11, 1, 5);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (12, 'Samsung QLED Smart LED Televízió, 138 cm, 4K Ultra HD', 159, 323, 11, 11, 1, 5);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (13, 'Samsung Smart LED Televízió, 138 cm, 4K Ultra HD', 150, 555, 11, 11, 1, 5);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (14, 'Samsung Smart LED Televízió, 163 cm, 4K Ultra HD', 255, 999, 11, 11, 1, 5);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (15, 'Samsung Smart LED Televízió, 80 cm, Full HD', 90, 11, 11, 11, 1, 5);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (16, 'Samsung Smart LED Televízió, 125 cm, 4K Ultra HD', 140, 50, 11, 11, 1, 5);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (17, 'LG Smart LED Televízió, 124 cm, 4K Ultra', 113, 25, 12, 11, 11, 4);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (18, 'LG Smart LED Televízió, 139 cm, 4K Ultra', 152, 99, 12, 11, 11, 4);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (19, 'LG NanoCell Smart LED Televízió, 124 cm, 4K Ultra HD', 179, 178, 12, 11, 11, 4);
INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `brand_id`, `category_id`, `manufacturer_id`, `supplier_id`) VALUES (20, 'LG Smart LED Televízió, 127 cm, 4K Ultra', 124, 832, 12, 11, 11, 4);


INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1001, '2020-11-09-12-38', 1000, 435, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1002, '2020-11-08-23-59', 100, 444, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1003, '2020-11-07-11-04', 210, 111, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1004, '2020-11-06-11-03', 300, 222, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1005, '2020-11-05-22-32', 450, 333, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1006, '2020-11-04-11-50', 210, 444, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1007, '2020-11-03-22-46', 222, 555, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1008, '2020-11-02-01-22', 111, 666, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1009, '2020-11-01-12-42', 101, 777, 1);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (1010, '2020-10-31-10-10', 432, 100, 1);


INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2001, '2020-11-09 03:12:00.000000', 100, 434, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2002, '2020-11-08 04:11:00.000000', 400, 900, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2003, '2020-11-07 05:01:00.000000', 350, 950, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2004, '2020-11-06 11:20:00.000000', 500, 1200, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2005, '2020-11-05 12:31:00.000000', 333, 1500, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2006, '2020-11-04 14:40:00.000000', 555, 0, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2007, '2020-11-03 14:59:00.000000', 403, 100, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2008, '2020-11-02 17:23:00.000000', 430, 0, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2009, '2020-11-01 20:20:00.000000', 403, 100, 2);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (2010, '2020-10-31 23:54:00.000000', 450, 1000, 2);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3001, '2020-11-09-11-01', 100, 155, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3002, '2020-11-08-22-22', 200, 300, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3003, '2020-11-07-14-44', 165, 200, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3004, '2020-11-06-23-22', 170, 320, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3005, '2020-11-05-20-02', 177, 330, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3006, '2020-11-04-04-04', 300, 340, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3007, '2020-11-03-03-03', 200, 190, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3008, '2020-11-02-02-02', 230, 199, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3009, '2020-11-01-02-02', 200, 190, 3);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (3010, '2020-10-31-13-31', 155, 200, 3);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4001, '2020-11-09-10-10', 100, 380, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4002, '2020-11-08-11-11', 400, 200, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4003, '2020-11-07-12-12', 410, 300, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4004, '2020-11-06-13-13', 420, 320, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4005, '2020-11-02-12-12', 430, 310, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4006, '2020-11-01-11-11', 440, 305, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4007, '2020-10-31-10-10', 445, 306, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4008, '2020-10-31-11-11', 447, 307, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4009, '2020-10-30-12-12', 445, 310, 4);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (4010, '2020-10-29-13-13', 380, 100, 4);


INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5001, '2020-11-09-10-10', 100, 183, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5002, '2020-11-08-10-20', 400, 200, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5003, '2020-11-07-20-10', 410, 300, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5004, '2020-11-06.12-10', 420, 320, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5005, '2020-11-02-20-03', 430, 310, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5006, '2020-11-01-12-12', 440, 305, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5007, '2020-10-31-10-10', 445, 306, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5008, '2020-10-31-18-19', 447, 307, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5009, '2020-10-30-17-13', 445, 310, 5);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (5010, '2020-10-29-10-01', 380, 100, 5);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6001, '2020-11-06-20-20', 100, 13, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6002, '2020-11-05-20-20', 130, 80, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6003, '2020-11-04-20-20', 150, 67, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6004, '2020-11-03-20-20', 200, 77, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6005, '2020-11-02-20-20', 225, 99, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6006, '2020-11-01-20-20', 260, 100, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6007, '2020-10-31-20-20', 230, 110, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6008, '2020-10-30-20-20', 199, 130, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6009, '2020-10-29-20-20', 222, 150, 6);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (6010, '2020-10-28-20-20', 100, 130, 6);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7001, '2020-11-06-10-11', 100, 55, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7002, '2020-11-05-11-11', 89, 120, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7003, '2020-11-04-22-22', 80, 130, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7004, '2020-11-03-23-23', 72, 140, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7005, '2020-11-02-12-12', 60, 150, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7006, '2020-11-01-12-12', 50, 160, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7007, '2020-10-31-12-33', 40, 170, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7008, '2020-10-30-13-33', 30, 180, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7009, '2020-10-29-14-44', 20, 190, 7);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (7010, '2020-10-28-15-55', 10, 200, 7);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8001, '2020-11-06-14-55', 100, 17, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8002, '2020-11-05-13-13', 180, 150, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8003, '2020-11-04-13-33', 150, 150, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8004, '2020-11-03-15-55', 220, 150, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8005, '2020-11-02-16-55', 210, 150, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8006, '2020-11-01-17-55', 290, 150, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8007, '2020-10-31-18-55', 990, 150, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8008, '2020-10-30-19-55', 100, 150, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8009, '2020-10-29-16-10', 999, 150, 8);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (8010, '2020-10-28-10-10', 100, 150, 8);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9001, '2020-11-06-23-33', 370, 100, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9002, '2020-11-05-13-13', 370, 150, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9003, '2020-11-04-14-44', 470, 150, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9004, '2020-11-03-15-44', 360, 150, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9005, '2020-11-02-16-44', 100, 150, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9006, '2020-11-01-17-44', 370, 150, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9007, '2020-10-31-18-44', 200, 150, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9008, '2020-10-30-19-44', 300, 150, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9009, '2020-10-29-20-44', 370, 150, 9);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (9010, '2020-10-28-21-44', 100, 150, 9);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10001, '2020-11-06-10-30', 302, 200, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10002, '2020-11-05-11-11', 330, 10, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10003, '2020-11-04-13-31', 370, 11, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10004, '2020-11-03-12-12', 390, 120, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10005, '2020-11-02-23-56', 410, 130, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10006, '2020-11-01-12-33', 400, 140, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10007, '2020-10-31-17-55', 70, 150, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10008, '2020-10-30-18-30', 170, 123, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10009, '2020-10-29-02-12', 200, 10, 10);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (10010, '2020-10-28-12-55', 1000, 300, 10);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11001, '2020-11-06-16-56', 130, 300, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11002, '2020-11-05-17-57', 250, 640, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11003, '2020-11-04-18-10', 250, 620, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11004, '2020-11-03-13-13', 240, 600, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11005, '2020-11-02-12-12', 210, 520, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11006, '2020-11-01-11-11', 170, 480, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11007, '2020-10-31-10-10', 160, 370, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11008, '2020-10-30-11-11', 150, 360, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11009, '2020-10-29-12-12', 140, 310, 11);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (11010, '2020-10-28-13-13', 100, 200, 11);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12001, '2020-11-06-11-11', 159, 323, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12002, '2020-11-05-12-12', 170, 330, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12003, '2020-11-04-13-13', 190, 360, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12004, '2020-11-03-14-14', 240, 400, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12005, '2020-11-02-13-13', 210, 425, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12006, '2020-11-01-12-12', 210, 460, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12007, '2020-10-31-11-11', 200, 470, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12008, '2020-10-30-10-10', 190, 500, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12009, '2020-10-29-11-11', 160, 510, 12);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (12010, '2020-10-28-12-12', 159, 520, 12);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13001, '2020-11-06-10-10', 150, 555, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13002, '2020-11-05-11-11', 210, 580, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13003, '2020-11-04-12-12', 260, 600, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13004, '2020-11-03-13-13', 224, 610, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13005, '2020-11-02-14-14', 220, 630, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13006, '2020-11-01-13-13', 210, 670, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13007, '2020-10-31-12-12', 280, 600, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13008, '2020-10-30-11-11', 190, 590, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13009, '2020-10-29-10-10', 160, 550, 13);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (13010, '2020-10-28-11-11', 190, 520, 13);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14001, '2020-11-06-10-10', 255, 999, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14002, '2020-11-05-11-11', 260, 1111, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14003, '2020-11-04-12-12', 260, 1222, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14004, '2020-11-03-13-13', 234, 1300, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14005, '2020-11-02-14-14', 300, 900, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14006, '2020-11-01-13-13', 290, 890, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14007, '2020-10-31-12-12', 270, 790, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14008, '2020-10-30-11-11', 280, 100, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14009, '2020-10-29-10-10', 290, 100, 14);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (14010, '2020-10-28-11-11', 300, 520, 14);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15001, '2020-11-06-10-10', 90, 11, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15002, '2020-11-05-11-11', 110, 11, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15003, '2020-11-04-12-12', 120, 12, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15004, '2020-11-03-13-13', 115, 30, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15005, '2020-11-02-14-14', 110, 50, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15006, '2020-11-01-13-13', 108, 60, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15007, '2020-10-31-12-12', 107, 79, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15008, '2020-10-30-11-11', 105, 100, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15009, '2020-10-29-10-10', 100, 108, 15);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (15010, '2020-10-28-11-11', 90, 140, 15);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16001, '2020-11-06-10-10', 140, 50, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16002, '2020-11-05-11-11', 110, 60, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16003, '2020-11-04-12-12', 90, 80, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16004, '2020-11-03-13-13', 85, 90, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16005, '2020-11-02-14-14', 80, 49, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16006, '2020-11-01-13-13', 78, 37, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16007, '2020-10-31-12-12', 67, 79, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16008, '2020-10-30-11-11', 55, 100, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16009, '2020-10-29-10-10', 50, 118, 16);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (16010, '2020-10-28-11-11', 40, 150, 16);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17001, '2020-11-06-10-10', 113, 25, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17002, '2020-11-05-11-11', 120, 40, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17003, '2020-11-04-12-12', 130, 50, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17004, '2020-11-03-13-13', 140, 60, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17005, '2020-11-02-14-14', 150, 70, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17006, '2020-11-01-13-13', 200, 80, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17007, '2020-10-31-12-12', 300, 90, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17008, '2020-10-30-11-11', 250, 100, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17009, '2020-10-29-10-10', 300, 120, 17);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (17010, '2020-10-28-11-11', 40000, 15000, 17);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18001, '2020-11-06-10-10', 152, 99, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18002, '2020-11-05-11-11', 120, 100, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18003, '2020-11-04-12-12', 170, 98, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18004, '2020-11-03-13-13', 169, 100, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18005, '2020-11-02-14-14', 159, 97, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18006, '2020-11-01-13-13', 149, 100, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18007, '2020-10-31-12-12', 151, 99, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18008, '2020-10-30-11-11', 153, 100, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18009, '2020-10-29-10-10', 154, 101, 18);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (18010, '2020-10-28-11-11', 155, 100, 18);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19001, '2020-11-06-10-10', 179, 178, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19002, '2020-11-05-11-11', 180, 1000, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19003, '2020-11-04-12-12', 190, 980, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19004, '2020-11-03-13-13', 200, 1000, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19005, '2020-11-02-14-14', 210, 970, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19006, '2020-11-01-13-13', 209, 1000, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19007, '2020-10-31-12-12', 199, 990, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19008, '2020-10-30-11-11', 189, 1000, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19009, '2020-10-29-10-10', 170, 1010, 19);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (19010, '2020-10-28-11-11', 200, 1000, 19);

INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20001, '2020-11-06-10-10', 124, 832, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20002, '2020-11-05-11-11', 130, 1000, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20003, '2020-11-04-12-12', 140, 790, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20004, '2020-11-03-13-13', 160, 1200, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20005, '2020-11-02-14-14', 210, 990, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20006, '2020-11-01-13-13', 230, 1300, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20007, '2020-10-31-12-12', 240, 1400, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20008, '2020-10-30-11-11', 260, 1000, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20009, '2020-10-29-10-10', 270, 1010, 20);
INSERT INTO `product_history` (`id`, `date`, `price`, `quantity`, `product_id`) VALUES (20010, '2020-10-28-11-11', 300, 1000, 20);
