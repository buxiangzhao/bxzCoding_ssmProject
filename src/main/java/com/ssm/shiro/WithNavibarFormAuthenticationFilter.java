package com.ssm.shiro;

import com.ssm.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用于登录后获取用户导航栏，并将其存入session范围
 */
public class WithNavibarFormAuthenticationFilter extends FormAuthenticationFilter {

    @Autowired
	private LoginService userService;

    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
                                     ServletResponse response) throws Exception {
        HttpServletRequest httpReq=(HttpServletRequest)request;

        String userName=(String) SecurityUtils.getSubject().getPrincipal();
//        List navigationBar=userService.getNavigationBar(userName);
//        httpReq.getSession().setAttribute("navibar", navigationBar);
        return super.onLoginSuccess(token, subject, request, response);
    }

}