package com.example.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//泛型参数，第一个参数表示输入的类型，第二个参数表示输出的类型
public class DateConverter implements Converter<String, Date> {

    //输入字符串，转换成日期类型的数据
    @Override
    public Date convert(String s) {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(s);
        } catch (ParseException e) {
            throw new IllegalArgumentException("无效的日期格式，请使用yyyy-MM-dd的格式输入日期");
        }
    }
}
