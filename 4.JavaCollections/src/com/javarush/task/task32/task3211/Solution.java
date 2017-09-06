package com.javarush.task.task32.task3211;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/* 
Целостность информации
*/

public class Solution {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(byteArrayOutputStream.toByteArray());

        //Хеш содержит 128 бит (16 байт) поэтому мы в строке 32 указали 16 байтов,
        // в строке 34 было указанно 32 так как обычно хеш 16 байтов представляется
        // как последовательность из 32 шестнадцатеричных цифр.
        byte[] digest = messageDigest.digest();
        BigInteger tmp = new BigInteger(1, digest);
        String md5HexString = tmp.toString(16);

        while( md5HexString.length() < 32 ) //Добивка 0 до длинны в 16 байт
            md5HexString = "0" + md5HexString;

        return md5HexString.equals(md5);
    }
}
