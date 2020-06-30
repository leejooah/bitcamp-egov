package com.leejua.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leejua.web.mappers.MemberMapper;

@Service
public class MemberServiceImpl {
	
@Autowired MemberMapper memberMapper;
}
