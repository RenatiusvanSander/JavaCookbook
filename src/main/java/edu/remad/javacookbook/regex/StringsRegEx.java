package edu.remad.javacookbook.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsRegEx {

	public static void main(String[] args) {
		System.out.println("Street House Number");
		String streetAndHouseNo = "Remadgsgdgdgdgdgdggdgdhdhdhhdhdd{}hdjk sk-s%&$§";
		String actualStreetAndHouseNumber = getStreetAndHouseNumber(streetAndHouseNo);
		System.out.println(String.format("Straße und Hausnummer matchen: %s", actualStreetAndHouseNumber));

		String houseAndNo2 = "Van-der-Smissen-Str. 3";
		String actualHouse = matchesStreetAndHouseNumber(houseAndNo2);
		System.out.println(String.format("House 2 And Street %s", actualHouse));
	}

	private static String getStreetAndHouseNumber(String streetAndHouseNo) {
		Pattern pattern = Pattern.compile(".[1-9a-zA-Z\\s\\-\\.]");
		Matcher streetAndHouseNumberMatcher = pattern.matcher(streetAndHouseNo);

		StringBuilder sb = new StringBuilder();
		while (streetAndHouseNumberMatcher.find()) {
			sb.append(streetAndHouseNumberMatcher.group());
		}

		return sb.toString();
	}

	private static String matchesStreetAndHouseNumber(String streetAndHouseNo) {
		return Pattern.matches("[0-9a-zA-Z\\s-\\.]*", streetAndHouseNo) ? streetAndHouseNo : "";
	}
}
