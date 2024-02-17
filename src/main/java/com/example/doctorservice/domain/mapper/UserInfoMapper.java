package com.example.doctorservice.domain.mapper;

import com.example.doctorservice.data.entity.UserInfo;
import com.example.doctorservice.domain.dto.UserUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserInfoMapper {

    UserInfo updateUserInfoFromRequest(UserUpdateRequest request, @MappingTarget UserInfo userInfo);
}

