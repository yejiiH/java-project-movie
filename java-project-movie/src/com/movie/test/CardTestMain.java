package com.movie.test;

import com.movie.dao.CardInfoDao;
import com.movie.dto.CardInfo;

public class CardTestMain {

	public static void main(String[] args)throws Exception {
		CardInfo insertCardInfo1=new CardInfo();
		insertCardInfo1.insertinto(new CardInfo("국민"));
		CardInfo insertCardInfo2=new CardInfo();
		insertCardInfo2.insertinto(new CardInfo("신한"));
		CardInfo insertCardInfo3=new CardInfo();
		insertCardInfo3.insertinto(new CardInfo("농협"));
		CardInfo insertCardInfo4=new CardInfo();
		insertCardInfo4.insertinto(new CardInfo("롯데"));
		CardInfo insertCardInfo5=new CardInfo();
		insertCardInfo5.insertinto(new CardInfo("현대"));
		CardInfo insertCardInfo6=new CardInfo();
		insertCardInfo6.insertinto(new CardInfo("삼성"));
		CardInfo insertCardInfo7=new CardInfo();
		insertCardInfo7.insertinto(new CardInfo("기업"));

	} 

}
