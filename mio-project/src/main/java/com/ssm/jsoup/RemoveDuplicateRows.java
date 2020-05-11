package com.ssm.jsoup;

import com.ssm.utils.FileUtils;


/**
 * describe: 删除文本重复行
 *
 * @author wfd
 * @date 2019/08/13
 */
public class RemoveDuplicateRows {
    public static void main(String[] args) throws Exception {
//        FileUtils.removeDuplicateRows("G:\\syncJgy\\json\\jokes\\jokesText.json", "g://jokesText.json");
        FileUtils.removeDuplicateRows("G:\\movie16.json", "G:\\old.json");
//        FileUtils.removeDuplicateRows("E:\\json\\songKey1.json", "E:\\json\\songKey1s.json");
    }
}
