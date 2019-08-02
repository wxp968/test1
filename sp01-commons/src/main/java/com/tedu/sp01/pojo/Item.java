package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //提供了。、get/set 与必要的构造方法，toString(),equalse(),hashCode()
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	private Integer id;
	private String name;
	private Integer number;
	
	
}