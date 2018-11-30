package com.biz.inout.service;

import java.util.Scanner;

import com.biz.inout.vo.InoutVO;

public class InoutService {
	
	InoutVO intoutVO ;
	
	// 클래스의 생성자
	public InoutService() {
		intoutVO = new InoutVO();
	}
	
	public boolean makeInout() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("날짜 (19990101)>>");
		String strDate = scanner.nextLine();
		if(intoutVO.setStrDate(strDate) == false) {
			System.out.println("날짜형식이 잘못되었습니다.");
			return false;
		}
		
		System.out.print("구분(1:매입, 2:매출) >>");
		String strIO = scanner.nextLine();
		
		
		
		
		intoutVO.setStrIO(strIO);
		try {
			System.out.print("단가 >>");
			String strDanga = scanner.nextLine();
			intoutVO.setIntDanga(Integer.valueOf(strDanga));
			
			System.out.print("수량 >>");
			String strSu = scanner.nextLine();
			intoutVO.setIntSu(Integer.valueOf(strSu));
			
			System.out.print("부가세(1:과세, 2:면세 >>");
			String strvat = scanner.nextLine();
			intoutVO.setVat(Byte.valueOf(strvat));
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}	
		return true;
	}
}
