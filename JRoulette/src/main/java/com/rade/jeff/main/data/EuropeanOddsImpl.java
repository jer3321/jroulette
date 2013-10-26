package com.rade.jeff.main.data;

import java.util.HashMap;
import java.util.Map;

public class EuropeanOddsImpl implements Odds{
	
	private static Map<String, Double> oddsMap = new HashMap<String, Double>();
	
	static{/*
		oddsMap.put("BLACK", DoubleReference.);
		oddsMap.put("RED", DoubleReference.);
		oddsMap.put("GREEN", DoubleReference.);
		oddsMap.put("ODDS", DoubleReference.);
		oddsMap.put("EVENS", DoubleReference.);
		oddsMap.put("ZERO", DoubleReference.);
		oddsMap.put("DOUBLE_ZERO", DoubleReference.);
		oddsMap.put("BOTH_ZEROS", DoubleReference.);
		oddsMap.put("FIRST_18", DoubleReference.);
		oddsMap.put("LAST_18", DoubleReference.);
		oddsMap.put("FIRST_DOZEN", DoubleReference.);
		oddsMap.put("SECOND_DOZEN", DoubleReference.);
		oddsMap.put("THIRD_DOZEN", DoubleReference.);
		oddsMap.put("FIRST_COLUMN", DoubleReference.);
		oddsMap.put("SECOND_COLUMN", DoubleReference.);
		oddsMap.put("THIRD_COLUMN", DoubleReference.);
		oddsMap.put("ONE", DoubleReference.);
		oddsMap.put("TWO", DoubleReference.);
		oddsMap.put("THREE", DoubleReference.);
		oddsMap.put("FOUR", DoubleReference.);
		oddsMap.put("FIVE", DoubleReference.);
		oddsMap.put("SIX", DoubleReference.);
		oddsMap.put("SEVEN", DoubleReference.);
		oddsMap.put("EIGHT", DoubleReference.);
		oddsMap.put("NINE", DoubleReference.);
		oddsMap.put("TEN", DoubleReference.);
		oddsMap.put("ELEVEN", DoubleReference.);
		oddsMap.put("TWELVE", DoubleReference.);
		oddsMap.put("THIRTEEN", DoubleReference.);
		oddsMap.put("FOURTEEN", DoubleReference.);
		oddsMap.put("FIFTEEN", DoubleReference.);
		oddsMap.put("SIXTEEN", DoubleReference.);
		oddsMap.put("SEVENTEEN", DoubleReference.);
		oddsMap.put("EIGHTEEN", DoubleReference.);
		oddsMap.put("NINETEEN", DoubleReference.);
		oddsMap.put("TWENTY", DoubleReference.);
		oddsMap.put("TWENTY_ONE", DoubleReference.);
		oddsMap.put("TWENTY_TWO", DoubleReference.);
		oddsMap.put("TWENTY_THREE", DoubleReference.);
		oddsMap.put("TWENTY_FOUR", DoubleReference.);
		oddsMap.put("TWENTY_FIVE", DoubleReference.);
		oddsMap.put("TWENTY_SIX", DoubleReference.);
		oddsMap.put("TWENTY_SEVEN", DoubleReference.);
		oddsMap.put("TWENTY_EIGHT", DoubleReference.);
		oddsMap.put("TWENTY_NINE", DoubleReference.);
		oddsMap.put("THIRTY", DoubleReference.);
		oddsMap.put("THRITY_ONE", DoubleReference.);
		oddsMap.put("THRITY_TWO", DoubleReference.);
		oddsMap.put("THRITY_THREE", DoubleReference.);
		oddsMap.put("THRITY_FOUR", DoubleReference.);
		oddsMap.put("THRITY_FIVE", DoubleReference.);
		oddsMap.put("THRITY_SIX", DoubleReference.);
		oddsMap.put("ONE_TWO_SPLIT", DoubleReference.);
		oddsMap.put("TWO_THREE_SPLIT", DoubleReference.);
		oddsMap.put("FOUR_FIVE_SPLIT", DoubleReference.);
		oddsMap.put("FIVE_SIX_SPLIT", DoubleReference.);
		oddsMap.put("SEVEN_EIGHT_SPLIT", DoubleReference.);
		oddsMap.put("EIGHT_NINE_SPLIT", DoubleReference.);
		oddsMap.put("TEN_ELEVEN_SPLIT", DoubleReference.);
		oddsMap.put("ELEVEN_TWELVE_SPLIT", DoubleReference.);
		oddsMap.put("THIRTEEN_FOURTEEN_SPLIT", DoubleReference.);
		oddsMap.put("FOURTEEN_FIFTEEN_SPLIT", DoubleReference.);
		oddsMap.put("SIXTEEN_SEVENTEEN_SPLIT", DoubleReference.);
		oddsMap.put("SEVENTEEN_EIGHTEEN_SPLIT", DoubleReference.);
		oddsMap.put("NINTEEN_TWENTY_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_TWENTY_ONE_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_TWO_TWENTY_THREE_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_THREE_TWENTY_FOUR_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_FIVE_TWENTY_SIX_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_SIX_TWENTY_SEVEN_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_EIGHT_TWETNY_NINE_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_NINE_THIRTY_SPLIT", DoubleReference.);
		oddsMap.put("THIRTY_ONE_THIRTY_THRITY_TWO_SPLIT", DoubleReference.);
		oddsMap.put("THRITY_TWO_THIRTY_THREE_SPLIT", DoubleReference.);
		oddsMap.put("THRITY_FOUR_THIRTY_FIVE_SPLIT", DoubleReference.);
		oddsMap.put("THIRTY_FIVE_THIRTY_SIX_SPLIT", DoubleReference.);
		oddsMap.put("ONE_FOUR_SPLIT", DoubleReference.);
		oddsMap.put("TWO_FIVE_SPLIT", DoubleReference.);
		oddsMap.put("THREE_SIX_SPLIT", DoubleReference.);
		oddsMap.put("FOUR_SEVEN_SPLIT", DoubleReference.);
		oddsMap.put("FIVE_EIGHT_SPLIT", DoubleReference.);
		oddsMap.put("SIX_NINE_SPLIT", DoubleReference.);
		oddsMap.put("SEVEN_TEN_SPLIT", DoubleReference.);
		oddsMap.put("EIGHT_ELEVEN_SPLIT", DoubleReference.);
		oddsMap.put("NINE_TWELVE_SPLIT", DoubleReference.);
		oddsMap.put("TEN_THIRTEEN_SPLIT", DoubleReference.);
		oddsMap.put("ELEVEN_FOURTEEN_SPLIT", DoubleReference.);
		oddsMap.put("TWELVE_FIFTEEN_SPLIT", DoubleReference.);
		oddsMap.put("THIRTEEN_SIXTEEN_SPLIT", DoubleReference.);
		oddsMap.put("FOURTEEN_SEVENTEEN_SPLIT", DoubleReference.);
		oddsMap.put("FIFTEEN_EIGHTEEN_SPLIT", DoubleReference.);
		oddsMap.put("SIXTEEN_NINETEEN_SPLIT", DoubleReference.);
		oddsMap.put("SEVENTEEN_TWENTY_SPLIT", DoubleReference.);
		oddsMap.put("EIGHTEEN_TWENTY_ONE_SPLIT", DoubleReference.);
		oddsMap.put("NINETEEN_TWENTY_TWO_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_TWENTY_THREE_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_ONE_TWENTY_FOUR_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_TWO_TWENTY_FIVE_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_THREE_TWENTY_SIX_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_FOUR_TWENTY_SEVEN_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_FIVE_TWENTY_EIGHT_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_SIX_TWENTY_NINE_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_SEVEN_THIRTY_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_EIGHT_THIRTY_ONE_SPLIT", DoubleReference.);
		oddsMap.put("TWENTY_NINE_THRITY_TWO_SPLIT", DoubleReference.);
		oddsMap.put("THIRTY_THIRTY_THREE_SPLIT", DoubleReference.);
		oddsMap.put("THIRTY_ONE_THIRTY_FOUR_SPLIT", DoubleReference.);
		oddsMap.put("THIRTY_TWO_THIRTY_FIVE_SPLIT", DoubleReference.);
		oddsMap.put("THIRTY_THREE_THIRTY_SIX_SPLIT", DoubleReference.);
		oddsMap.put("ONE_TWO_THREE_STREET", DoubleReference.);
		oddsMap.put("FOUR_FIVE_SIX_STREET", DoubleReference.);
		oddsMap.put("SEVEN_EIGHT_NINE_STREET", DoubleReference.);
		oddsMap.put("TEN_ELEVEN_TWELVE_STREET", DoubleReference.);
		oddsMap.put("THIRTEEN_FOURTEEN_FIFTEEN_STREET", DoubleReference.);
		oddsMap.put("SIXTEEN_SEVENTEEN_EIGHTEEN_STREET", DoubleReference.);
		oddsMap.put("NINETEEN_TWENTY_TWENTY_ONE_STREET", DoubleReference.);
		oddsMap.put("TWENTY_TWO_TWENTY_THREE_TWENTY_FOUR_STREET", DoubleReference.);
		oddsMap.put("TWENTY_FIVE_TWENTY_SIX_TWENTY_SEVEN_STREET", DoubleReference.);
		oddsMap.put("TWENTY_EIGHT_TWENTY_NINE_THIRTY_STREET", DoubleReference.);
		oddsMap.put("THIRTY_ONE_THIRTY_TWO_THIRTY_THREE_STREET", DoubleReference.);
		oddsMap.put("THIRTY_FOUR_THRITY_FIVE_THIRTY_SIX_STREET", DoubleReference.);
		oddsMap.put("ONE_2_4_5_CORNER", DoubleReference.);
		oddsMap.put("TWO_3_5_6_CORNER", DoubleReference.);
		oddsMap.put("FOUR_5_7_8_CORNER", DoubleReference.);
		oddsMap.put("FIVE_6_8_9_CORNER", DoubleReference.);
		oddsMap.put("SEVEN_8_10_11_CORNER", DoubleReference.);
		oddsMap.put("EIGHT_9_11_12_CORNER", DoubleReference.);
		oddsMap.put("TEN_11_13_14_CORNER", DoubleReference.);
		oddsMap.put("ELEVEN_12_14_15_CORNER", DoubleReference.);
		oddsMap.put("THIRTEEN_14_16_17_CORNER", DoubleReference.);
		oddsMap.put("FOURTEEN_15_17_18_CORNER", DoubleReference.);
		oddsMap.put("SIXTEEN_17_19_20_CORNER", DoubleReference.);
		oddsMap.put("SEVENTEEN_18_20_21_CORNER", DoubleReference.);
		oddsMap.put("NINETEEN_20_22_23_CORNER", DoubleReference.);
		oddsMap.put("TWENTY_21_23_24_CORNER", DoubleReference.);
		oddsMap.put("TWENTY_TWO_23_25_26_CORNER", DoubleReference.);
		oddsMap.put("TWENTY_THREE_24_26_27_CORNER", DoubleReference.);
		oddsMap.put("TWENTY_FIVE_26_28_29_CORNER", DoubleReference.);
		oddsMap.put("TWENTY_SIX_27_29_30_CORNER", DoubleReference.);
		oddsMap.put("TWENT_EIGHT_29_31_32_CORNER", DoubleReference.);
		oddsMap.put("TWENTY_NINE_30_32_33_CORNER", DoubleReference.);
		oddsMap.put("THIRTY_ONE_32_34_35_CORNER", DoubleReference.);
		oddsMap.put("THIRTY_TWO_33_35_36_CORNER", DoubleReference.);
		oddsMap.put("ONE_4_SIXLINE", DoubleReference.);
		oddsMap.put("FOUR_7_SIXLINE", DoubleReference.);
		oddsMap.put("SEVEN_10_SIXLINE", DoubleReference.);
		oddsMap.put("TEN_13_SIXLINE", DoubleReference.);
		oddsMap.put("THIRTEEN_16_SIXLINE", DoubleReference.);
		oddsMap.put("SIXTEEN_19_SIXLINE", DoubleReference.);
		oddsMap.put("NINETEEN_22_SIXLINE", DoubleReference.);
		oddsMap.put("TWENTY_TWO_25_SIXLINE", DoubleReference.);
		oddsMap.put("TWENTY_FIVE_28_SIXLINE", DoubleReference.);
		oddsMap.put("TWENTY_EIGHT_31_SIXLINE", DoubleReference.);
		oddsMap.put("THIRTY_ONE_34_SIXLINE", DoubleReference.);
		oddsMap.put("ZERO_1_2_TRIO", DoubleReference.);
		oddsMap.put("ZERO_2_3_TRIO", DoubleReference.);
		oddsMap.put("ZERO_1_2_BASKET", DoubleReference.);
		oddsMap.put("ZERO_00_2_BASKET", DoubleReference.);
		oddsMap.put("DOUBLE_ZERO_2_3_BASKET", DoubleReference.);
		oddsMap.put("TOPLINE", DoubleReference.);*/
	}

	@Override
	public double getOdds(String b) {
		return oddsMap.get(b).doubleValue();
	}

}