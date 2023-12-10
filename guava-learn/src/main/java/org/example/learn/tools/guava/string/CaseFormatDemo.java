package org.example.learn.tools.guava.string;

import java.util.Arrays;

import com.google.common.base.CaseFormat;
import com.google.common.base.Joiner;

public class CaseFormatDemo {
    public static void main(String args[]){
        CaseFormatDemo tester = new CaseFormatDemo();
        tester.testCaseFormat();
    }

    private void testCaseFormat(){
        String data = "test_data";
        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));
    }//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/guava/guava_caseformat.html


}
