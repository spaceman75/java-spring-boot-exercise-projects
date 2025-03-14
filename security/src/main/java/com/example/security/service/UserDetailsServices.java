package com.example.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.security.constant.ErrorMessages;
import com.example.security.repository.UserRepository;

@Service
public class UserDetailsServices implements UserDetailsService {

	// Dependencies

	@Autowired
	private UserRepository userRepository;

	// Methods

	@Override
	public UserDetails loadUserByUsername(String username) {
		return userRepository
			.findByUsername(username)
			.orElseThrow(() -> new UsernameNotFoundException(ErrorMessages.BAD_CREDENTIALS))
		;
	}
	
}
