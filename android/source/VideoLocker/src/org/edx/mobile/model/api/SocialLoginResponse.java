package org.edx.mobile.model.api;

public class SocialLoginResponse {

    public String error;
    public String json;
    public String cookie;
    
    public boolean isSuccess() {
        return (error == null && cookie != null);
    }
}
