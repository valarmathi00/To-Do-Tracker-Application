package com.niit.TodoService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "user not found")
public class UserNotFoundException extends Exception {
}
