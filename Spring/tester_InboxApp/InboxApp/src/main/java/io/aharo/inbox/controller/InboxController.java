package io.aharo.inbox.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InboxController 
{
    @GetMapping (value = "/")
    public String homePage(@AuthenticationPrincipal OAuth2User principal)
    {
        /*
         * BASE CASE: if user fails to authenticate they will be return to default_main_page;
         */
        if (principal == null || !StringUtils.hasText(principal.getAttribute("name")))
        {
        return "index" ;                                                                              // InboxApp/src/main/resources/templates/index.html
        }
        
        return "inbox-page" ;                                                                  // InboxApp/src/main/resources/templates/inbox-page.html
    }
    
}

	// @RequestMapping("/user")
	// public String user(@AuthenticationPrincipal OAuth2User principal) {
	// 	System.out.println(principal);
	// 	return principal.getAttribute("name");
	// }