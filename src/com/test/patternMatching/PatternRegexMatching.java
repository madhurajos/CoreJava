package com.test.patternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegexMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Today is Saturday.Saturday is a holiday";
		Pattern pattern = Pattern.compile("\\bSaturday\\b");
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			String group = matcher.group(); // Saturday
			int start = matcher.start(); // 9
			int end = matcher.end();//17
			System.out.println("Group :: "+group+" Start :: "+start+" End :: "+end);
		}

	}

}
