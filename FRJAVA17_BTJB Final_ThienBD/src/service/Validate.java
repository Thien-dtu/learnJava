package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exception.DateInvalidException;
import exception.EmpNoInvalidException;

/**
 * The Class Validate.
 */
public class Validate {
	
	/** The Constant sc. */
	private final static Scanner sc = new Scanner(System.in);

	/**
	 * Input date.
	 *
	 * @param birthday the birthday
	 * @throws DateInvalidException the date invalid exception
	 */
	public static void inputDate(String birthday) throws DateInvalidException {
		Date ngayHienTai = new Date();
		String ngayFortmat = new SimpleDateFormat("yyyy-MM-dd").format(ngayHienTai);
		if (ngayFortmat.compareTo(birthday) <= 0) {
			throw new DateInvalidException("Ngay sinh/bat dau lam viec phai nho hon ngay hien tai !");
		}
	}
	
	/**
	 * Input date regist.
	 *
	 * @param DateRegist the date regist
	 * @throws DateInvalidException the date invalid exception
	 */
	public static void inputDateRegist(String DateRegist) throws DateInvalidException {
		Date ngayHienTai = new Date();
		String ngayFortmat = new SimpleDateFormat("yyyy-MM-dd").format(ngayHienTai);
		if (ngayFortmat.compareTo(DateRegist) <= 0) {
			throw new DateInvalidException("Ngay sinh/bat dau lam viec phai nho hon ngay hien tai !");
		}
	}
	public static void EmplNo(String EmplNo) throws EmpNoInvalidException {
		if (EmplNo != "TR" && EmplNo != "NV") {
			throw new EmpNoInvalidException("Input sai thong tin ma nhan vien!!!");
		}
	}
	public static void thangLamViec(String dateRegist, int contractTerm) {
		Date ngayHienTai = new Date();
	}
}
