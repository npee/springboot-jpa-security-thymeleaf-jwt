package com.npee.controller.v1;

import com.npee.config.response.ListResult;
import com.npee.config.response.ResponseService;
import com.npee.config.response.SingleResult;
import com.npee.dto.UserDto;
import com.npee.service.UserServiceImpl;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"1. User"})
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/v1")
public class UserController {

    private final ResponseService responseService;
    private final UserServiceImpl userService;

    @ApiOperation(value = "사용자 목록 조회", notes = "모든 사용자 목록 불러오기")
    @GetMapping("/users")
    public ListResult<UserDto.Res> getUsers() {
        return null;
    }

    @ApiOperation(value = "회원 추가", notes = "내용에 따라 회원가입을 요청한다.")
    @PostMapping("/users")
    public SingleResult<UserDto.Res> postUser(@RequestBody UserDto.Req userDto) {
        return null;
    }

    @ApiOperation(value = "회원정보 수정", notes = "기존 회원정보에 수정된 내용을 반영한다.")
    @PutMapping("/users")
    public SingleResult<UserDto.Res> putUser(@RequestBody UserDto.Req userDto) {
        return null;
    }

    @ApiOperation(value = "회원 삭제", notes = "회원 정보를 삭제한다.")
    @DeleteMapping("/users/{userNo}")
    public SingleResult<UserDto.Res> deleteUser(@PathVariable Long userNo) {
        return null;
    }

}
