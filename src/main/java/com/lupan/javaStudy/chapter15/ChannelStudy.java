package com.lupan.javaStudy.chapter15;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * TODO nio学习
 *
 * @author lupan
 * @version 2016/1/21 0021
 */
public class ChannelStudy {

    public static void main(String[] args){

        FileChannel inChannel=null;
        FileChannel outChannel=null;

        try {

            File file = new File("a1.text");
            RandomAccessFile rdf = new RandomAccessFile(file,"rw");
            inChannel = rdf.getChannel();

            MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY,0,file.length());
            Charset charset = Charset.forName("UTF-8");

            outChannel = new FileOutputStream("a.text").getChannel();
            outChannel.position(file.length());
            outChannel.write(buffer);
            buffer.clear();

            CharsetDecoder decoder = charset.newDecoder();
            CharBuffer charBuffer = decoder.decode(buffer);
            System.out.print(charBuffer.toString());

        }catch (Exception e){

            e.printStackTrace();
        }finally{
            try {
                if(inChannel!=null){
                    inChannel.close();
                }
                if(outChannel!=null){
                    outChannel.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
