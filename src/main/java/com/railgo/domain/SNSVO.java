package com.railgo.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SNSVO {
	private String sns_code; // 숙/식/관/공/행/SNS통합코드
	private int mem_code; // 회원코드
	private String content; // 내용
	private Date regDate; // 등록날짜
}
