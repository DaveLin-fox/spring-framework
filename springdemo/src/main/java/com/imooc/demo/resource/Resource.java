package com.imooc.demo.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.*;

/**
 * TODO
 *
 * @author lzq
 */
public class Resource {
	public static void main(String[] args) throws IOException {
		FileSystemResource fileSystemResource = new FileSystemResource("/Users/dave/projects/git-project/spring-framework/springdemo/src/main/java/com/imooc/demo/resource/test.txt");

		File file = fileSystemResource.getFile();
		System.out.println(file.length());

		OutputStream outputStream = fileSystemResource.getOutputStream();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		bufferedWriter.write("Hello World");
		bufferedWriter.flush();
		outputStream.close();
		bufferedWriter.close();
	}
}
