package com.team13.fantree.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CommonErrorCode implements ErrorCode {

	INVALID_PARAMETER(HttpStatus.BAD_REQUEST,
		"유효하지 않은 매개변수가 포함되었습니다"),
	RESOURCE_NOT_FOUND(HttpStatus.NOT_FOUND,
		"해당 리소스를 찾을 수 없습니다."),
	INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,
		"내부 서버 오류"),
	TOKEN_ERROR(HttpStatus.UNAUTHORIZED,
		"톤큰 에러!");

	private final HttpStatus httpStatus;
	private final String message;
}
