/*
 * 源文件名：FileUtil.java
 * 文件版本：1.0.0
 * 创建作者：黄为
 * 创建日期：2012-09-16
 * 修改作者：黄为
 * 修改日期：2012-09-16
 * 文件描述：文件操作工具类
 * 版权所有：Copyright 2012 绍兴怡和, Inc. All Rights Reserved.
 */
package com.team4.base.core.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileUtil {
	
	public static final Log log = LogFactory.getLog(FileUtil.class);
	
//	public static File getFile(String path) {
//		return new File(Constants.APP_ROOT_DIR + path);
//	}
//	
//	public static String fetchResource(String path) {
//		String content;
//		BufferedReader reader;
//		String line;
//		StringBuilder builder;
//		
//		builder = new StringBuilder();
//		try {
//			reader = new BufferedReader(new FileReader(Constants.APP_ROOT_DIR + path));
//			while ((line = reader.readLine()) != null) {
//				builder.append(line);
//			}
//			content = builder.toString();
//		} catch (Exception e) {
//			log.error("FileUtil", e);
//			content = "";
//		}
//		
//		return content;
//	}

}
