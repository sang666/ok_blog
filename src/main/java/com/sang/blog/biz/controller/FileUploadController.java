package com.sang.blog.biz.controller;

import com.aliyun.oss.model.OSSObjectSummary;

import com.sang.blog.biz.service.FileUploadService;
import com.sang.blog.biz.vo.FileUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author lastwhisper
 * @desc
 * @email gaojun56@163.com
 */
@RestController
@RequestMapping("/oss/file")
public class FileUploadController {
    @Autowired
    private FileUploadService fileUploadService;

    /**
     * @author lastwhisper
     * @desc 文件上传到oss
     * @return FileUploadResult
     * @Param uploadFile
     */
    @PreAuthorize("@permission.admin()")

    @PostMapping("/upload")
    public FileUploadResult upload(@RequestParam("file") MultipartFile uploadFile)
            throws Exception {
        return this.fileUploadService.upload(uploadFile);
    }

    /**
     * @return FileUploadResult
     * @desc 根据文件名删除oss上的文件
     * http://localhost:8080/file/delete?fileName=images/2019/04/28/1556429167175766.jpg
     * @author lastwhisper
     * @Param objectName
     */
    @RequestMapping("/delete")
    @PreAuthorize("@permission.admin()")
    public FileUploadResult delete(@RequestParam("fileName") String objectName)
            throws Exception {
        return this.fileUploadService.delete(objectName);
    }

    /**
     * @author lastwhisper
     * @desc 查询oss上的所有文件
     * http://localhost:8080/file/list
     * @return List<OSSObjectSummary>
     * @Param
     */
    @RequestMapping("/list")
    @PreAuthorize("@permission.admin()")
    public List<OSSObjectSummary> list()
            throws Exception {
        return this.fileUploadService.list();
    }

    /**
     * @author lastwhisper
     * @desc 根据文件名下载oss上的文件
     * @return
     * @Param objectName
     */
    @RequestMapping("/download")
    @PreAuthorize("@permission.admin()")
    public void download(@RequestParam("fileName") String objectName, HttpServletResponse response) throws IOException {
        //通知浏览器以附件形式下载
        response.setHeader("Content-Disposition",
                "attachment;filename=" + new String(objectName.getBytes(), "ISO-8859-1"));
        this.fileUploadService.exportOssFile(response.getOutputStream(),objectName);
    }
}