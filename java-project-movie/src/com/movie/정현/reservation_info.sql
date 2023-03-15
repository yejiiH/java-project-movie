--reservation_info

insert into reservation_info
values(to_number(to_char(sysdate, 'yymmddHH24MISS')),null,null);

-- 
select * from reservation_info;
select * from reservation_info order by cus_reservation_no;

delete from reservation_info where RESERVATION_NO=?;

select reservation_no,cus_id,payment_no from reservation_info where reservation_no=220704185055;
--
select reservation_no re_no,re_info.payment_no pay_no,cus_info.cus_id cus_id
from reservation_info re_info left outer join payment paym
on  re_info.payment_no= paym.payment_no
join customer_info cus_info
on re_info.cus_id= cus_info.cus_id;


select reservation_no re_no,payment_no,cus_info.cus_id cus_id
from reservation_info re_info 
join customer_info cus_info
on re_info.cus_id= cus_info.cus_id;

select reservation_no,cus_id,payment_no from reservation_info where reservation_no=220704185055;
