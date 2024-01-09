package com.omrfth.blogapplication.exception;

import org.springframework.http.HttpStatus;

public class BlogApiException extends RuntimeException{

        public BlogApiException(HttpStatus badRequest, String message) {
            super(message);
        }
}
