package com.test.distributionservice.enums;

import java.util.HashMap;
import java.util.Map;

public enum CryptoEnum {

	CRYPTO_ENTRY1("KEY", "Bar12345Bar12345"), 
	CRYPTO_ENTRY2("INITVECTOR","xEtRp$.!#$-+1mwQ");

	private String code;
	private String value;

	private static final Map<String, String> MAP = new HashMap<>();
	
	static {
        for (CryptoEnum s : CryptoEnum.values()) {
            MAP.put(s.code, s.value);
        }
    }

	CryptoEnum(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public static String getValueByKey(String key) {
		return MAP.get(key);
	}
}