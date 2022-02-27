package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*@author Asus
*
*/
public class FormatDate {
	public static String formatDate(String inputDate) {
		try {
			Date date = new SimpleDateFormat("dd-MM-yyyy").parse(inputDate);
			inputDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return inputDate;
	}

}
