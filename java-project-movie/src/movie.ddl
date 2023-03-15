DROP TABLE reservation_info CASCADE CONSTRAINTS;
DROP TABLE payment CASCADE CONSTRAINTS;
DROP TABLE seat CASCADE CONSTRAINTS;
DROP TABLE movie_hall CASCADE CONSTRAINTS;
DROP TABLE price_info CASCADE CONSTRAINTS;
DROP TABLE credit_card CASCADE CONSTRAINTS;
DROP TABLE customer_info CASCADE CONSTRAINTS;
DROP TABLE coupon_info CASCADE CONSTRAINTS;

CREATE TABLE coupon_info(
		coupon_no                     		NUMBER(10)		 NULL ,
		coupon_name                   		VARCHAR2(20)		 NULL ,
		coupon_effect                 		NUMBER(3)		 NULL 
);


CREATE TABLE customer_info(
		cus_id                        		VARCHAR2(12)		 NULL ,
		cus_no                        		NUMBER(5)		 NULL ,
		cus_nickname                  		VARCHAR2(15)		 NULL ,
		cus_name                      		VARCHAR2(15)		 NULL ,
		cus_password                  		VARCHAR2(12)		 NULL ,
		cus_birthday                  		DATE		 NULL ,
		cus_gender                    		CHAR(1)		 NULL ,
		cus_phone                     		VARCHAR2(13)		 NULL ,
		cus_email                     		VARCHAR2(30)		 NULL ,
		cus_point                     		NUMBER(10)		 NULL ,
		coupon_no                     		NUMBER(10)		 NULL 
);

DROP SEQUENCE cus_no_SEQ;

CREATE SEQUENCE cus_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE credit_card(
		card_name                     		VARCHAR2(10)		 NULL 
);


CREATE TABLE price_info(
		price_no                      		NUMBER(10)		 NULL ,
		adult_price                   		NUMBER(10)		 NULL ,
		child_price                   		NUMBER(10)		 NULL 
);


CREATE TABLE movie_hall(
		hall_name                     		VARCHAR2(10)		 NULL ,
		total_seat_count              		NUMBER(10)		 NULL ,
		remain_seat                   		NUMBER(10)		 NULL ,
		m_name                        		VARCHAR2(50)		 NULL ,
		m_genre                       		VARCHAR2(30)		 NULL ,
		m_positive_age                		NUMBER(10)		 NULL ,
		m_start_time                  		VARCHAR2(30)		 NULL ,
		m_end_time                    		VARCHAR2(30)		 NULL ,
		m_image                       		VARCHAR2(50)		 NULL ,
		m_introduce                   		VARCHAR2(2000)		 NULL ,
		price_no                      		NUMBER(10)		 NULL 
);


CREATE TABLE seat(
		seat_no                       		NUMBER(2)		 NULL ,
		seat_arrange                  		NUMBER(2)		 NULL ,
		seat_valid                    		NUMBER(1)		 NULL ,
		hall_name                     		VARCHAR2(10)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL 
);

DROP SEQUENCE seat_no_SEQ;

CREATE SEQUENCE seat_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE payment(
		payment_no                    		NUMBER(10)		 NULL ,
		payment_date                  		DATE		 DEFAULT sysdate		 NULL ,
		card_name                     		VARCHAR2(10)		 NULL ,
		adult_member_count            		NUMBER(5)		 NULL ,
		child_member_count            		NUMBER(5)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL ,
		seat_no                       		NUMBER(2)		 NULL 
);

DROP SEQUENCE payment_no_SEQ;

CREATE SEQUENCE payment_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE reservation_info(
		reservation_no                		NUMBER(12)		 NULL ,
		payment_no                    		NUMBER(10)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL 
);

DROP SEQUENCE reservation_no_SEQ;

CREATE SEQUENCE reservation_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



ALTER TABLE coupon_info ADD CONSTRAINT IDX_coupon_info_PK PRIMARY KEY (coupon_no);

ALTER TABLE customer_info ADD CONSTRAINT IDX_customer_info_PK PRIMARY KEY (cus_id);
ALTER TABLE customer_info ADD CONSTRAINT IDX_customer_info_FK0 FOREIGN KEY (coupon_no) REFERENCES coupon_info (coupon_no);

ALTER TABLE credit_card ADD CONSTRAINT IDX_credit_card_PK PRIMARY KEY (card_name);

ALTER TABLE price_info ADD CONSTRAINT IDX_price_info_PK PRIMARY KEY (price_no);

ALTER TABLE movie_hall ADD CONSTRAINT IDX_movie_hall_PK PRIMARY KEY (hall_name);
ALTER TABLE movie_hall ADD CONSTRAINT IDX_movie_hall_FK0 FOREIGN KEY (price_no) REFERENCES price_info (price_no);

ALTER TABLE seat ADD CONSTRAINT IDX_seat_PK PRIMARY KEY (seat_no);
ALTER TABLE seat ADD CONSTRAINT IDX_seat_FK0 FOREIGN KEY (hall_name) REFERENCES movie_hall (hall_name);
ALTER TABLE seat ADD CONSTRAINT IDX_seat_FK1 FOREIGN KEY (cus_id) REFERENCES customer_info (cus_id);

ALTER TABLE payment ADD CONSTRAINT IDX_payment_PK PRIMARY KEY (payment_no);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK0 FOREIGN KEY (card_name) REFERENCES credit_card (card_name);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK1 FOREIGN KEY (cus_id) REFERENCES customer_info (cus_id);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK2 FOREIGN KEY (seat_no) REFERENCES seat (seat_no);

ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_PK PRIMARY KEY (reservation_no);
ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_FK0 FOREIGN KEY (cus_id) REFERENCES customer_info (cus_id);
ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_FK1 FOREIGN KEY (payment_no) REFERENCES payment (payment_no);

