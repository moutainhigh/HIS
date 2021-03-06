package com.common.util;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class OAMSUtils {

	public static final String IS_ENABLE="0";//有效
	public static final String NOT_ENABLE="1";//无效
	
	public static final String READY_OPERATION="03";//术前，准备就绪
	public static final String START_OPERATION="04";//术中
	public static final String END_OPERATION="05";//术后
	
    public static final String DATETIME_PATTERN_LINE = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME_PATTERN_SLASH = "yyyy/MM/dd HH:mm:ss";
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String TIME_PATTERN = "HH:mm:ss";
    public static final String MINUTE_PATTERN = "HH:mm";
    public static final String FORMAT01 = "yyyyMMddhhmmss";
    
    public static final long ND = 1000 * 24 * 60 * 60;
    public static final long NH = 1000 * 60 * 60;
    public static final long NM = 1000 * 60;
    public static final long NS = 1000;
    
    public static final int ROW_SPACE = 15;//列间距  像素值
    public static final double FROM_TOP_POINT = 300D;//描点页面下坐标
    public static final double VALUE_VS_POINT = 1.5D;//描点页面下坐标
    
    
    public static final String BP_SYS = "BP_SYS";         //收缩压
    public static final String BP_DIAS = "BP_DIAS";       //舒张压
    public static final String BP_MEAN = "BP_MEAN";       //平均压
    public static final String TEMP = "TEMP";             //体温
    public static final String HEARTRATE = "HEARTRATE";   //心率   HR
    public static final String PULSERATE = "PULSERATE";   //脉搏  PR
    public static final String RESPRATE = "RESPRATE";     //呼吸频率  RR
    public static final String SPO2 = "SPO2";             //血氧饱和度
    public static final String PETCO2 = "PETCO2";         //呼气末二氧化碳分压
    public static final String VTIDALVOL = "VTIDALVOL";   //潮气量
    
    
    public static final String NEWSCODE = "OBX||NM";  
    
	
    
    
    
    
    

	/**
     * @方法名称: getRandom
     * @功能描述: 按照指定范围生成随机数
     * @作者:崔连瑞
     * @创建时间:2016-06-15 下午4:16:58
     * @param max , min
     * @return int
     */
	public static int getRandom(int max,int min){
	        Random random = new Random();
	        return random.nextInt(max)%(max-min+1) + min;
	} 
	
	/**
     * @方法名称: minuteToMillisecond
     * @功能描述: 分钟转毫秒
     * @作者:崔连瑞
     * @创建时间:2016-06-15 下午4:16:58
     * @param minute
     * @return int
     */
	public static int minuteToMillisecond(int minute){
		return minute*60*1000;
	} 
	
	/**
     * @方法名称: millisecondToDate
     * @功能描述: 毫秒转时间
     * @作者:崔连瑞
     * @创建时间:2016-06-15 下午4:16:58
     * @param millisecond
     * @param mode
     * @return int
     */
	public static Date millisecondToDate (Long millisecond,String format){
		Date result = null;
		try {
			SimpleDateFormat formats =  new SimpleDateFormat(format);  
			String ds = formats.format(millisecond);  
			result=formats.parse(ds); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * @方法名称: getStringToDate
	 * @功能描述: 字符串转Date
	 * @作者:崔连瑞
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param millisecond
	 * @param mode
	 * @return int
	 */
	public static Date getStringToDate(String date,String format){
		Date result =null;
		   try {
			   SimpleDateFormat sdf = new SimpleDateFormat(format);  
			   result = sdf.parse(date); 
		       } catch (Exception e) {
			         e.printStackTrace();
		            }
		 return result;
	}
	
	/**
	 * @方法名称: getDateFormatString
	 * @功能描述: Date转字符串
	 * @作者:
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param millisecond
	 * @param mode
	 * @return int
	 */
	public static String getDateFormatString(Date date,String format){
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
    
    
	/**
     * @方法名称: stringDateToMillisecond
     * @功能描述: 字符串时间转毫秒
     * @作者:崔连瑞
     * @创建时间:2016-06-15 下午4:16:58
     * @param str
     * @param mode
     * @return long
     */
	public static long stringDateToMillisecond(String str,String format) {  
		Date date=null;
		SimpleDateFormat formatter = new SimpleDateFormat(format);		
		try {
			 date=formatter.parse(str);    
		} catch (Exception e) {					
			e.printStackTrace();
		}
	   return date.getTime();
	}
	
	/**
	 * @方法名称: dateToMillisecond
	 * @功能描述: 时间转毫秒
	 * @作者:崔连瑞
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param date
	 * @return long
	 */
	public static long dateToMillisecond(Date date) {  
		return date.getTime();
	}
    
	/**
	 * @方法名称: dateToPointX
	 * @功能描述: Date 转坐标
	 * @作者:崔连瑞
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param date
	 * @return long
	 */
	public static Double dateToPointX(Date startTime,Date startRecordTime,Integer interval){
		long time = startTime.getTime();
		long recordTime = startRecordTime.getTime();
		long l =(recordTime - time)/(1000*60);
		return (Math.floor((double)l/interval)*ROW_SPACE)+ROW_SPACE;

	}
	
	
	 /**
	 * @方法名称: vitalSignValueToYPoint
	 * @功能描述: 
	 * @作者:崔连瑞
	 * @创建时间:2016-6-17 下午4:17:09
	 * @param itemCode
	 * @param value
	 * @return Double   
	 */ 
	public static Double vitalSignValueToYPoint(String itemCode, Double value) {
			// 收缩压
			if (BP_SYS.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 舒张压
			if (BP_DIAS.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 平均压
			if (BP_MEAN.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 体温
			if (TEMP.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 心率 HR
			if (HEARTRATE.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 脉搏 PR
			if (PULSERATE.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 呼吸频率 RR
			if (RESPRATE.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 血氧饱和度
			if (SPO2.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 呼气末二氧化碳分压
			if (PETCO2.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
			// 潮气量
			if (VTIDALVOL.equals(itemCode)) {
				Double pointY = (FROM_TOP_POINT - value) * VALUE_VS_POINT;
				return pointY;
			}
		return 0d;
	}

	/**
	 * @方法名称: daysOfBetweenTwoDates
	 * @功能描述: 获取两个时间之间相差的天数
	 * @作者:崔连瑞
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param date
	 * @return int
	 */
	public static int daysOfBetweenTwoDates(Date endDate, Date nowDate){
	    long milliseconds = endDate.getTime() - nowDate.getTime();
	    long day = milliseconds / ND;
	    return new Long(day).intValue(); 
	}
	
	
	/**
	 * @方法名称: hoursOfBetweenTwoDates
	 * @功能描述: 获取两个时间之间相差的小时
	 * @作者:崔连瑞
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param date
	 * @return int
	 */
	public static int hoursOfBetweenTwoDates(Date endDate, Date nowDate){
		long milliseconds = endDate.getTime() - nowDate.getTime();
		long hour = milliseconds % ND / NH;
		return new Long(hour).intValue(); 
	}
	
	/**
	 * @方法名称: minutesOfBetweenTwoDates
	 * @功能描述: 获取两个时间之间相差的分钟数
	 * @作者:崔连瑞
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param date
	 * @return int
	 */
	public static int minutesOfBetweenTwoDates(Date endDate, Date nowDate){
		long milliseconds = endDate.getTime() - nowDate.getTime();
		long min = milliseconds % ND % NH / NM;
		return new Long(min).intValue(); 
	}
	
	/**
	 * @方法名称: secondsOfBetweenTwoDates
	 * @功能描述: 获取两个时间之间相差的秒数
	 * @作者:崔连瑞
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param date
	 * @return int
	 */
	public static int secondsOfBetweenTwoDates(Date endDate, Date nowDate){
		long milliseconds = endDate.getTime() - nowDate.getTime();
		long seconds = milliseconds % ND % NH % NM / NS;
		return new Long(seconds).intValue(); 
	}
    
	/**
	 * @方法名称: getDateByDateGroups
	 * @功能描述: 获取Date 集合中最接近当前时间的Date
	 * @作者:崔连瑞
	 * @创建时间:2016-06-15 下午4:16:58
	 * @param List<Date> list
	 * @param Date date
	 * @return date
	 */
	public static Date getDateByDateGroups(List<Date> list , Date date){
		long[] ll = new long[list.size()];
		Map<Long, Date> map = new HashMap<Long, Date>();
		for (int i = 0; i < list.size(); i++) {
			Date d = (Date) list.get(i);
			long l = date.getTime() - d.getTime();
			ll[i] = Math.abs(l - 0);
			map.put(Math.abs(l - 0), d);
		}
		Arrays.sort(ll);
		return map.get(ll[0]);
	}
    
	/**
	 * @方法名称: getDatePlusMinute
	 * @功能描述: Date 加分钟 获得新Date
	 * @作者:崔连瑞
	 * @创建时间:2016-06-16 下午4:16:58
	 * @param Date date
	 * @param Integer minute
	 * @return date
	 */
	public static Date getDatePlusMinute(Date date,Integer minute){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, minute);
		return calendar.getTime();
	}
	
	
	
	
	
	/**
	 * @方法名称: toStringHex
	 * @功能描述: 十六进制转字符串
	 * @返回值: String
	 * @参数:
	 */
	public static String toStringHex(String s) {
		byte[] baKeyword = new byte[s.length() / 2];
		for (int i = 0; i < baKeyword.length; i++) {
			try {
				baKeyword[i] = (byte) (0xff & Integer.parseInt(
						s.substring(i * 2, i * 2 + 2), 16));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			s = new String(baKeyword, "utf-8");// UTF-16le:Not
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return s;
	}

	
	
	
	/**
	 * @方法名称: getStrToDouble
	 * @功能描述: 字符串转Double
	 * @返回值: Double
	 * @参数:
	 */
	public static double getStrToDouble(String s){
		double d = 0d;
		try {
			d = Double.valueOf(s).doubleValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	} 
	
	

	/**
	 * @方法名称: getMax
	 * @功能描述: 求最大值
	 * @返回值: int
	 * @参数: arr
	 */
	public static int getMax(List<Integer> arr) {
		int max = arr.get(0);                
		for(int x=1;x<arr.size();x++){
			if(arr.get(x)>max) {
				max = arr.get(x);	
			}   
		}
		return max;
	}
	/**
	 * @方法名称: getMin
	 * @功能描述: 求最小值
	 * @返回值: int
	 * @参数: arr
	 */
    public static int getMin(List<Integer> arr) {  
        int min = Integer.MAX_VALUE;  
        for(int i = 0; i < arr.size(); i++) {  
            if(arr.get(i) < min) {
            	min = arr.get(i);              	
            } 
        }  
        return min;  
    }  
	
	
	
	
	
	
}
