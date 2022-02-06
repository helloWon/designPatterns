package me.designpatterns.structural.adapter.after;

import me.designpatterns.structural.adapter.after.security.UserDetails;
import me.designpatterns.structural.adapter.after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
