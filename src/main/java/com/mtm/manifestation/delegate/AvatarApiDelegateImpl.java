package com.mtm.manifestation.delegate;

import com.mtm.manifestation.api.AvatarApiDelegate;
import com.mtm.manifestation.dto.FetchAvatarResponse;
import com.mtm.manifestation.service.AvaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AvatarApiDelegateImpl implements AvatarApiDelegate {
 @Autowired
 private AvaterService AvaterService;
    public ResponseEntity<FetchAvatarResponse> avatarMSISDNGet(String MSISDN) {

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(AvaterService.getAvater());
    }


}
