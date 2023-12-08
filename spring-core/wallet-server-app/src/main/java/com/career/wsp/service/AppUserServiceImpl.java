package com.career.wsp.service;

import com.career.wsp.domain.AppUser;
import com.career.wsp.dto.AppUserDto;
import com.career.wsp.repo.AppUserRepo;
import com.career.wsp.service.exception.UserAlreadyExistsException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@Slf4j
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService{

    private final AppUserRepo appUserRepo;
    private final ObjectMapper objectMapper;
    @Override
    public AppUserDto registerUser(AppUserDto appUserDto) {

        Assert.notNull(appUserDto, " AppUserDto cant be null");
        Assert.notNull(appUserDto.getUsername(), " username cant be null");
        Assert.notNull(appUserDto.getPassword(), " password cant be null");
        Assert.notNull(appUserDto.getMobile(), " mobile cant be null");
        Assert.notNull(appUserDto.getEmail() , " email cant be null");

        boolean isUserExists = appUserRepo.existsByMobile(appUserDto.getMobile());
        if(isUserExists){
          throw new UserAlreadyExistsException("User already exists with mobile number : " + appUserDto.getMobile());
        }
        AppUser appUser = objectMapper.convertValue(appUserDto, AppUser.class);
        appUserRepo.save(appUser);
        appUserDto = objectMapper.convertValue(appUser,AppUserDto.class);
        log.info("User is registered with mobile number : {}",appUserDto.getMobile());
        return appUserDto;
    }
}
