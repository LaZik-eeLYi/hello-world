package com.lupan.javaStudy.chapter17;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

/**
 * TODO 多线程下载
 *
 * @author lupan
 * @version 2016/1/18 0018
 */
public class MitilDownload {

    public static void main(String args[]){

        //开启的线程个数
        final int DOWN_THREAD_NUM = 4;
        //保存的文件名
        String outFileName = "";
        //资源路径
        String PATH = "http://repo.spring.io/libs-release-local/org/springframework/spring/4.2.0.RELEASE/spring-framework-4.2.0.RELEASE-dist.zip";
        InputStream isArr[] = new InputStream[DOWN_THREAD_NUM];
        RandomAccessFile outArr[] = new RandomAccessFile[DOWN_THREAD_NUM];

        try {
            //创建一个url对象
            URL url= new URL(PATH);
            outFileName = URLDecoder.decode(PATH,"utf-8").substring(PATH.lastIndexOf("/")+1);
            isArr[0] = url.openStream();
            long fileLength = getFileLength(url);
            System.out.println("info:文件长度为："+fileLength+"byte");
            outArr[0] = new RandomAccessFile(outFileName,"rw");

            //创建一个与资源大小相同的文件
            for (int i = 0; i < fileLength; i++) {
                outArr[0].write(0);
            }

            //每个线程应该下载的字节数
            long downNumPerThread = fileLength / DOWN_THREAD_NUM;
            //余数
            long left = fileLength % DOWN_THREAD_NUM;
            
            //下载
            for (int i = 0; i <DOWN_THREAD_NUM ; i++) {
                if(i!=0){
                    isArr[i] = url.openStream();
                    outArr[i] = new RandomAccessFile(outFileName,"rw");
                }
                //启动多个线程来下载
                if(i== DOWN_THREAD_NUM-1){
                    //最后一个线程下载包括余下的字节
                    new DownloadThread(i*downNumPerThread,(i+1)*downNumPerThread+left,isArr[i],outArr[i]).start();
                }else{
                    //其他线程
                    new DownloadThread(i*downNumPerThread,(i+1)*downNumPerThread,isArr[i],outArr[i]).start();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取指定网络资源字节长度方法
     * @param url
     * @return
     */
    public static  long getFileLength(URL url) throws Exception{

        long length = 0;
        URLConnection con = url.openConnection();
        long size = con.getContentLength();
        length = size;
        return length;
    }
}
