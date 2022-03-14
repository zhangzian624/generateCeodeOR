package com.zza.controller;

import com.zza.utils.QRCodeUtil;

public class GenerateCodeQR {
    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容
        String text = "张安广是马甩甩";
        // 嵌入二维码的图片路径
        String imgPath = "C:/Users/张自岸/Desktop/图片/mss.jpg";
        // 生成的二维码的路径及名称
        String destPath = "C:/Users/张自岸/Desktop/图片/jam.jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
    }
}
