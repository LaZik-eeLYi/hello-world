package com.lupan.javaStudy.chapter17;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO java网络编程下载
 *
 * @author lupan
 * @version 2016/1/18 0018
 */
public class DownloadThread extends Thread {

    private final int BUFF_LEN = 32;
    private long start;
    private long end;
    private InputStream is;
    private RandomAccessFile raf;


    public DownloadThread(long start, long end, InputStream is, RandomAccessFile raf){
        //输出下载信息
        System.out.println("info:出事化读取线程，线程负责读取从"+start+"--->>"+end+"字节");
        this.start = start;
        this.end = end;
        this.is = is;
        this.raf = raf;
    }

    public void run(){
        try {
            //找到下载位置
            is.skip(start);
            //找到写入位置
            raf.seek(start);
            //定义读取输入流的缓存数组
            byte[] buff = new byte[BUFF_LEN];
            //定义循环读取次数
            long times = (end - start)/BUFF_LEN + 4;
            //定义实际读取的字节数
            int hasRead = 0;
            //开始下载
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
            Date startDate = new Date();
            System.out.println("info:" + this.toString() + "线程开始下载，开始时间:" + simpleDateFormat.format(startDate));
            for (int i=0;i<times;i++){
                //读取输入流并存到缓存
                hasRead = is.read(buff);
                //如果返回-1则读取完毕
                if(hasRead<0){
                  break;
                }
                raf.write(buff,0,hasRead);
            }
            Date endDate = new Date();
            System.out.println("info:"+this.toString()+"线程读取写入文件完毕！结束时间:"+simpleDateFormat.format(endDate));
            System.out.println("info:"+this.toString()+"线程读取总共用时:"+(endDate.getTime()-startDate.getTime())+"mm");
        }catch (Exception e){
            System.out.println("error:读取文件出错！下面试出错信息：");
            e.printStackTrace();
        }finally {
            try {
                if(is != null){
                    is.close();
                }
                if(raf != null){
                    raf.close();
                }
            }catch (Exception e){
                System.out.println("error:关闭资源出错！下面试出错信息：");
                e.printStackTrace();
            }
        }
    }
}
