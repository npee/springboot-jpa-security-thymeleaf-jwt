package com.npee.dto;

import com.npee.entity.user.User;
import lombok.*;

public class UserDto {

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Req {
        private Long id;
        private String loginId;
        private String name;
        private String password;
        private String phone;

        public User toEntity(Long id) {
            return User.builder()
                    .id(id)
                    .loginId(this.loginId)
                    .name(this.name)
                    .password(this.password)
                    .phone(this.phone)
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    public static class Res {
        protected Long id;
        protected String loginId;
        protected String name;
        protected String phone;

        public Res(User user) {
            this.id = user.getId();
            this.loginId = user.getLoginId();
            this.name = user.getName();
            this.phone = user.getPhone();
        }
    }

    @Getter
    public static class Type1Res extends Res {
        private boolean approval;

        public Type1Res(User user) {
            super(user);
        }
    }

}
