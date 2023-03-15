--insert
--price_info insert
insert into price_info values(1, 14000, 11000); --일반
insert into price_info values(2, 10000, 8000); -- 조조
insert into price_info values(3, 12000, 9000); -- 심야

--movie_hall insert
insert into movie_hall values('1회차', 10, (select sum(seat_valid) from seat where seat_no = 1), '탑건-매버릭', '액션', 15, '07/10 08:00', '07/10 10:10', null, '감독 : 조셉 코신스키 / 배우 : 톰 크루즈 ,  마일즈 텔러 ,  제니퍼 코넬리 <p><p>한순간의 실수도 용납되지 않는 하늘 위, 
가장 압도적인 비행이 시작된다!

최고의 파일럿이자 전설적인 인물 매버릭(톰 크루즈)은 자신이 졸업한 훈련학교 교관으로 발탁된다. 
그의 명성을 모르던 팀원들은 매버릭의 지시를 무시하지만 실전을 방불케 하는 상공 훈련에서 눈으로 봐도 믿기 힘든 전설적인 조종 실력에 모두가 압도된다. 

매버릭의 지휘아래 견고한 팀워크를 쌓아가던 팀원들에게 국경을 뛰어넘는 위험한 임무가 주어지자
매버릭은 자신이 가르친 동료들과 함께 마지막이 될 지 모를 하늘 위 비행에 나서는데… ',2);
insert into movie_hall values('2회차', 10, (select sum(seat_valid) from seat where seat_no = 2), '토르-러브 앤 썬더', '액션', 12, '07/10 16:00', '07/10 17:59', null, '감독 : 타이카 와이티티 / 배우 : 크리스 헴스워스 ,  나탈리 포트만 ,  테사 톰슨 ,  크리스찬 베일 ,  타이카 와이티티 ,  크리스 프랫<p><p>"신을 죽이는 자, 신이 상대한다!" 

슈퍼 히어로 시절이여, 안녕! 
이너피스를 위해 자아 찾기 여정을 떠난 천둥의 신 토르 

그러나, 우주의 모든 신들을 몰살하려는 신 도살자 고르의 등장으로 
토르의 안식년 계획은 산산조각 나버린다. 

토르는 새로운 위협에 맞서기 위해, 
킹 발키리, 코르그, 그리고 전 여자친구 제인과 재회하게 되는데.. 
그녀가 묠니르를 휘두르는 마이티 토르가 되어 나타나 모두를 놀라게 한다. 

이제, 팀 토르는 고르의 복수에 얽힌 미스터리를 밝히고 
더 큰 전쟁을 막기 위한 전 우주적 스케일의 모험을 시작하는데...

7월 6일, 우주 최고의 ‘갓’ 매치가 시작된다! ',1);

insert into movie_hall values('3회차', 10, (select sum(seat_valid) from seat where seat_no = 3), '헤어질 결심', '로맨스', 15, '07/10 14:00', '07/10 16:18', null, '감독 : 박찬욱 / 프로듀서 : 백지선 ,  고대석 / 배우 : 탕웨이 ,  박해일 ,  이정현 ,  박용우 ,  고경표 ,  김신영 <p><p> 산 정상에서 추락한 한 남자의 변사 사건.
담당 형사 해준(박해일)은
사망자의 아내 서래(탕웨이)와 마주하게 된다.

"산에 가서 안 오면 걱정했어요, 마침내 죽을까 봐."

남편의 죽음 앞에서 특별한 동요를 보이지 않는 서래.
경찰은 보통의 유가족과는 다른 서래를 용의선상에 올린다.
해준은 사건 당일의 알리바이 탐문과 신문,
잠복수사를 통해 서래를 알아가면서
그녀에 대한 관심이 점점 커져가는 것을 느낀다.

한편, 좀처럼 속을 짐작하기 어려운 ‘서래’는
상대가 자신을 의심한다는 것을 알면서도
조금의 망설임도 없이 ‘해준’을 대하는데….

진심을 숨기는 용의자
용의자에게 의심과 관심을 동시에 느끼는 형사
그들의 <헤어질 결심>',1);

insert into movie_hall values('4회차', 10, (select sum(seat_valid) from seat where seat_no = 4), '마녀', '액션', 15, '07/10 12:00', '07/10 14:17', null, '감독 : 박훈정 / 배우 : 신시아 ,  박은빈 ,  서은수 ,  진구 ,  성유빈 ,  조민수 ,  이종석 ,  김다미 <p><p>통제불능의 존재가 세상 밖으로 나왔다!
 
‘자윤’이 사라진 뒤, 정체불명의 집단의 무차별 습격으로 마녀 프로젝트가 진행되고 있는 ‘아크’가 초토화된다.
그곳에서 홀로 살아남은 ‘소녀’는 생애 처음 세상 밖으로 발을 내딛고
우연히 만난 ‘경희’의 도움으로 농장에서 지내며 따뜻한 일상에 적응해간다.
한편, ‘소녀’가 망실되자 행방을 쫓는 책임자 ‘장’과
마녀 프로젝트의 창시자 ‘백총괄’의 지령을 받고 제거에 나선 본사 요원 ‘조현’,
‘경희’의 농장 소유권을 노리는 조직의 보스 ‘용두’와
상해에서 온 의문의 4인방까지
각기 다른 목적을 지닌 세력이 하나 둘 모여들기 시작하면서 ‘소녀’ 안에 숨겨진 본성이 깨어나는데…
 
모든 것의 시작,
더욱 거대하고 강력해진 마녀가 온다.',1);

insert into movie_hall values('5회차', 10, (select sum(seat_valid) from seat where seat_no = 5), '범죄도시2', '액션', 15, '07/10 00:00', '07/10 01:46', null, '감독 : 이상용 / 프로듀서 : 유영채 / 배우 : 마동석 ,  손석구 ,  최귀화 ,  박지환 ,  허동원 ,  하준 ,  정재광<p><p>“느낌 오지? 이 놈 잡아야 하는 거”

가리봉동 소탕작전 후 4년 뒤,
금천서 강력반은 베트남으로 도주한 용의자를 인도받아 오라는 미션을 받는다.

괴물형사 ‘마석도’(마동석)와 ‘전일만’(최귀화) 반장은 현지 용의자에게서 수상함을 느끼고,
그의 뒤에 무자비한 악행을 벌이는 ‘강해상’(손석구)이 있음을 알게 된다.

‘마석도’와 금천서 강력반은 한국과 베트남을 오가며
 역대급 범죄를 저지르는 ‘강해상’을 본격적으로 쫓기 시작하는데...

나쁜 놈들 잡는 데 국경 없다!
통쾌하고 화끈한 범죄 소탕 작전이 다시 펼쳐진다! ',3);


--seat insert
insert into seat values(seat_no_seq.nextval, 1, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '1회차', null);

insert into seat values(seat_no_seq.nextval, 1, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '2회차', null);

insert into seat values(seat_no_seq.nextval, 1, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '3회차', null);

insert into seat values(seat_no_seq.nextval, 1, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '4회차', null);

insert into seat values(seat_no_seq.nextval, 1, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '5회차', null);





--coupon_info insert
insert into coupon_info values(1,'회원가입할인',10);
insert into coupon_info values(2,'오픈기념할인',20);
insert into coupon_info values(3,'우리모두할인',30);



--customer_info insert
insert into customer_info values('seongmin', cus_no_seq.nextval, '사과성민', '정성민', '1234', to_date('19970902', 'yyyy/mm/dd'), 'M', 01012345678, 'seongmin@naver.com', 0, null);
insert into customer_info values('yeji', cus_no_seq.nextval, '포도예지', '한예지', '2345', '19951211', 'F', 01011112222, 'yeji@naver.com', 0, null);
insert into customer_info values('junyeung', cus_no_seq.nextval, '감귤준영', '박준영', '3456', '19910120', 'M', 01033335555, 'junyeung@naver.com', 0, null);
insert into customer_info values('woohuck', cus_no_seq.nextval, '참외우혁', '이우혁', '4567', '19971120', 'M', 01066667777, 'woohuck@naver.com', 0, null);
insert into customer_info values('jeonghun', cus_no_seq.nextval, '멜론정현', '이정현', '5678', '19961008', 'F', 01088889999, 'jeonghun@naver.com', 0, null);
insert into customer_info values('hejin', cus_no_seq.nextval, '키위희진', '이희진', '6789', '19930204', 'F', 01099991111, 'hejin@naver.com', 0, null);
insert into customer_info values('hunjung', cus_no_seq.nextval, '자두현정', '임현정', '7891', '19940504', 'F', 01022223333, 'hunjung@naver.com', 0, null);

commit;


insert into credit_card values('국민');
insert into credit_card values('신한');
insert into credit_card values('농협');
insert into credit_card values('우리');
insert into credit_card values('기업');
insert into credit_card values('IBK');

------------------------여기까지 기본데이터 ------------------------------------

insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,2,0, 'seongmin',1);
insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,2,0, 'seongmin',3);
insert into payment values(payment_no_seq.nextval, sysdate, '국민' ,0,1, 'yeji',2);
insert into payment values(payment_no_seq.nextval, sysdate, '농협' ,1,1, 'junyeung',5);
insert into payment values(payment_no_seq.nextval, sysdate, '농협' ,1,1, 'junyeung',6);
insert into payment values(payment_no_seq.nextval, sysdate, '우리' ,2,1, 'woohuck',11);
insert into payment values(payment_no_seq.nextval, sysdate, '우리' ,2,1, 'woohuck',12);
insert into payment values(payment_no_seq.nextval, sysdate, '우리' ,2,1, 'woohuck',15);
insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,1,2, 'jeonghun',35);
insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,1,2, 'jeonghun',37);
insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,1,2, 'jeonghun',38);

insert into reservation_info values(reservation_no_seq.nextval, 1, 'seongmin');
insert into reservation_info values(reservation_no_seq.nextval, 2, 'yeji');
insert into reservation_info values(reservation_no_seq.nextval, 3, 'junyeung');
insert into reservation_info values(reservation_no_seq.nextval, 4, 'woohuck');
insert into reservation_info values(reservation_no_seq.nextval, 5, 'jeonghun');

update seat set cus_id= 'seongmin', seat_valid =0 where hall_name = '1회차' and seat_arrange = 1;
update seat set cus_id= 'seongmin', seat_valid =0 where hall_name = '1회차' and seat_arrange = 3;

update seat set cus_id= 'yeji', seat_valid =0 where hall_name = '1회차' and seat_arrange = 2;

update seat set cus_id= 'junyeung', seat_valid =0 where hall_name = '1회차' and seat_arrange = 5;
update seat set cus_id= 'junyeung', seat_valid =0 where hall_name = '1회차' and seat_arrange = 6;

update seat set cus_id= 'woohuck', seat_valid =0 where hall_name = '2회차' and seat_arrange = 1;
update seat set cus_id= 'woohuck', seat_valid =0 where hall_name = '2회차' and seat_arrange = 2;
update seat set cus_id= 'woohuck', seat_valid =0 where hall_name = '2회차' and seat_arrange = 5;

update seat set cus_id= 'jeonghun', seat_valid =0 where hall_name = '3회차' and seat_arrange = 5;
update seat set cus_id= 'jeonghun', seat_valid =0 where hall_name = '3회차' and seat_arrange = 7;
update seat set cus_id= 'jeonghun', seat_valid =0 where hall_name = '3회차' and seat_arrange = 8;

--update movie_hall
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '1회차') where hall_name = '1회차';
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '2회차') where hall_name = '2회차';
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '3회차') where hall_name = '3회차';
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '4회차') where hall_name = '4회차';
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '5회차') where hall_name = '5회차';


commit;


