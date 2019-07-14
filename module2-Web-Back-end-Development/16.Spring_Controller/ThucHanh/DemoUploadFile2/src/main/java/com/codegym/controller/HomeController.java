package com.codegym.controller;

import java.io.File;

import com.codegym.model.MyFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;

@Controller
public class HomeController {

    @Autowired
    ServletContext context;
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("myFile", new MyFile());
        return "index";
    }

    @RequestMapping(value = "/uploadOneFile", method = RequestMethod.POST)
    public String uploadFile(MyFile myFile, Model model) {
        model.addAttribute("message", "upload success");
        model.addAttribute("description", myFile.getDescription());
        try {
            MultipartFile[] multipartFile = myFile.getMultipartFile();
            // Thư mục gốc upload file.
            String uploadPath = context.getRealPath("/resources/uploadfile/");

            System.out.println("uploadRootPath=" + uploadPath);


            for (int i = 0; i < multipartFile.length; i++){
                String fileName = multipartFile[i].getOriginalFilename();

                File file = new File(uploadPath, fileName);
                multipartFile[i].transferTo(file);
            }

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "upload failed");
        }
        return "result";
    }

}
