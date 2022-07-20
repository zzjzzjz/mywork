package com.example.mywork.util;

/*
    @author: zzjzzjz
    @className:  URLNormalize
    @packetName: com.example.mywork.util
    @description: Normalize URL
    @date: 2022-07-20
 */
public class URLNormalize {
    /*
    @description:  Normalize URL and return its string
    @param: url
    @return: String
    @date: 2022-07-20
     */

    public static String normalize(String url){
        //Change the url space to '+'
        char[] ch=url.toCharArray();
        String finalUrl="";//target URL
        for(int j=0;j<ch.length;j++){
            if(ch[j]==' '){
                finalUrl=finalUrl+"+";
            }
            else {
                finalUrl=finalUrl+ch[j];
            }
        }
        return finalUrl;
    }
}
