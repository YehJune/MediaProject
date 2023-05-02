package com.yejin.mediaproject.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.yejin.mediaproject.dto.ResponseDTO;

@ControllerAdvice
@RestController
public class MediaProjectExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public ResponseDTO<String> globalExceptionHandler(Exception e) {
		return new ResponseDTO<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),
				e.getMessage());
	}
	
}
