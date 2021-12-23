package com.springboot.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

public class InfoBrowser {
    private String nowTime;
    private String userAgent;

    public void  setAgentInfo(HttpServletRequest request) {
        userAgent = request.getHeader("User-Agent");
        nowTime = new Date().toString();


    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }
}
