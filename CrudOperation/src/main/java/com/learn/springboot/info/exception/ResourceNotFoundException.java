package com.learn.springboot.info.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resounceName;
	private String fieldName;
	private String fieldValue;
	public ResourceNotFoundException(String resounceName, String fieldName, String fieldValue) {
		super(String.format("%s not found with %s : '%s'",resounceName,fieldName,fieldValue));
		this.resounceName = resounceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public String getResounceName() {
		return resounceName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public String getFieldValue() {
		return fieldValue;
	}
	
	
	
	

}
