package com.stschool.ecommerce.springsecurity;

import com.stschool.ecommerce.springsecurity.dto.request.SignupRequestDto;
import com.stschool.ecommerce.springsecurity.dto.response.UserResponseDto;
import com.stschool.ecommerce.springsecurity.exception.UserExistsException;
import com.stschool.ecommerce.springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class controller {
    private final UserService  userService;

    @PostMapping
    public ResponseEntity<UserResponseDto> save(@RequestBody SignupRequestDto signupRequestDto) throws UserExistsException {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(signupRequestDto));
    }
}
