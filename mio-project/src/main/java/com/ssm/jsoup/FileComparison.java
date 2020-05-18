package com.ssm.jsoup;

import com.ssm.utils.DateUtil;
import com.ssm.utils.FileUtils;

import java.util.Date;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/22
 */
public class FileComparison {

    public static void main(String[] args) {
//        FileUtils.removeDuplicateData(
//                "G:\\new.json",
//                "G:\\old.json",
//                "G:\\getNew" + DateUtil.getDay(new Date()) + ".json"
//        );

        FileUtils.removeDuplicateData(
                "G:\\movie" + (DateUtil.getDay(new Date()) - 1) + ".json",
                "G:\\movie" + DateUtil.getDay(new Date()) + ".json",
                "G:\\getNew" + DateUtil.getDay(new Date()) + ".json"
        );
    }
}
