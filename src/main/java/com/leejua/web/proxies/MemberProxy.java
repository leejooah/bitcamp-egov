package com.leejua.web.proxies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leejua.web.mappers.TxMapper;


@Component("manager")
public class MemberProxy extends Proxy {
	@Autowired TxMapper txMapper;
	public String makeBirthday() {
		String birthday ="";
		return birthday;
	}
	public String makeGender() {
		List<String> genderText = Arrays.asList("M","F");
		Collections.shuffle(genderText);
		return genderText.get(0);
	}
	public String makeUserid() {
		List<String> useridText = Arrays.asList("a","b");
		Collections.shuffle(useridText);
		return useridText.get(0);
	}
	public String makeName() {
		return null;
	}
}
