package com.zl.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;
public class StringToDateConverter implements Converter<String, Date> {
	
	@Override
	public Date convert(String arg0) {
		DateFormat sdf=null;
		
			try {
				if(StringUtils.isEmpty(arg0)) {
					throw new NullPointerException("请输入要转换的日期");
				}
					sdf = new SimpleDateFormat("yyyy-MM-dd");
					Date date = sdf.parse(arg0);
					return date;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("输入日期有误");
		}
	}

}
