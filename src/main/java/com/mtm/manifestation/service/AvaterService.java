package com.mtm.manifestation.service;

import com.mtm.manifestation.dto.FetchAvatarResponse;
import org.springframework.stereotype.Service;

@Service
public class AvaterService {
    public static FetchAvatarResponse CreateFetchAvatarResponse(){
        FetchAvatarResponse fetchAvatarResponse=new FetchAvatarResponse();
        fetchAvatarResponse.setStatus("yes");
        fetchAvatarResponse.setStatusCode(10);
        fetchAvatarResponse.setStatusMessage("hello");
    return fetchAvatarResponse;
    }
    public FetchAvatarResponse getAvater(){
        return CreateFetchAvatarResponse();
    }
}
