package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "img")
public class ImgController {
	@RequestMapping(value = "upload", method = { RequestMethod.POST })
	@ResponseBody
	public Object headImg(@RequestParam(value = "file", required = false) MultipartFile file,
			@RequestParam(required = false) String imgName,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("传入文件名：" + imgName);
		String prefix = "";
		//String dateStr = "";
		// 保存上传
		OutputStream out = null;
		InputStream fileInput = null;
		try {
			if (file != null) {
				String originalName = file.getOriginalFilename();
				prefix = originalName.substring(originalName.lastIndexOf(".") + 1);
				//dateStr = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
				String filepath = request.getServletContext().getRealPath("/images/foodimg") + File.separator + imgName + "."
						+ prefix;
				filepath = filepath.replace("\\", "/");
				File files = new File(filepath);
				// 打印查看上传路径
				System.out.println("图片路径："+filepath);
				if (!files.getParentFile().exists()) {
					files.getParentFile().mkdirs();
				}
				file.transferTo(files);
			}
		} catch (Exception e) {
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (fileInput != null) {
					fileInput.close();
				}
			} catch (IOException e) {
			}
		}
		Map<String, Object> map = new HashMap<>();
		map.put("src", "../images/foodimg/" + imgName + "." + prefix);
		return map;
	}
}
