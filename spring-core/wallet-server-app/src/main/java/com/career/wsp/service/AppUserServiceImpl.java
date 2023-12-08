package com.career.wsp.service;

import com.career.wsp.dto.AppUserDto;
import com.career.wsp.repo.AppUserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@Slf4j
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService{

    private final AppUserRepo appUserRepo;
    @Override
    public AppUserDto registerUser(AppUserDto appUserDto) {

        Assert.notNull(appUserDto, " AppUserDto cant be null");
        Assert.notNull(appUserDto.getUsername(), " username cant be null");
        Assert.notNull(appUserDto.getPassword(), " password cant be null");
        Assert.notNull(appUserDto.getMobile(), " mobile cant be null");
        Assert.notNull(appUserDto.getEmail() , " email cant be null");

        boolean isUserExists = appUserRepo.existsByMobile(appUserDto.getMobile());
        if(isUserExists){
          throw new RuntimeException("User already exists with mobile number : " + appUserDto.getMobile());
        }
        return null;
    }
}
