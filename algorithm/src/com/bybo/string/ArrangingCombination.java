package com.bybo.string;

import java.util.ArrayList;

public class ArrangingCombination {

	public static ArrayList<String> combine(String source){
		int sourceLength = source.length();
		ArrayList<String> results = new ArrayList<String>();
		
		if(sourceLength <= 1){
			results.add(source);
			return results;
		}
		// Remove Duplicate
		for(int i = 0; i < sourceLength; i++){
			char ch = source.charAt(i);
			String subString = ArrangingCombination.StringRemoveOneChar(source, i);
			ArrayList<String> newResult = combine(subString);
			for (int j = 0; j < newResult.size(); j++) {
				String tmp = ch + newResult.get(j);
				if(!results.contains(tmp)){
					results.add(tmp);  
				}
            } 
		}
		
		return results;
	}

	public static String StringRemoveOneChar(String source, int index) {
		String result = "";
		int length = source.length();
		if(index == 0){
			result = source.substring(1, length);
		} else if(index == length - 1){
			result = source.substring(0, index);
		} else {
			result = source.substring(0, index) + source.substring(index + 1, length);
		}
		return result;
	}

}
