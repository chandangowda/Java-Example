package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String reqBody = "[\r\n" +
                "    {\r\n" +
                "        \"legacyDataRefObject\": [\r\n" +
                "            {\r\n" +
                "                \"FID\": \"TN\",\r\n" +
                "                \"FID_DESC\": \"Telephone Number\",\r\n" +
                "                \"RANK\": \"10\",\r\n" +
                "                \"REQUIRED\": \"Y\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"EXK\",\r\n" +
                "                \"FID_DESC\": \"EXCHANGE KEY\",\r\n" +
                "                \"RANK\": \"20\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"TRAK\",\r\n" +
                "                \"FID_DESC\": \"Tracking Code\",\r\n" +
                "                \"RANK\": \"30\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"BCCR\",\r\n" +
                "                \"FID_DESC\": \"Bonded Circuit Cross Reference\",\r\n" +
                "                \"RANK\": \"40\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"DES\",\r\n" +
                "                \"FID_DESC\": \"Description\",\r\n" +
                "                \"RANK\": \"50\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"NII\",\r\n" +
                "                \"FID_DESC\": \"Network Infrastructure Indicator\",\r\n" +
                "                \"RANK\": \"60\",\r\n" +
                "                \"REQUIRED\": \"Y\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"POOL\",\r\n" +
                "                \"FID_DESC\": \"TN IS PART OF BLOCK ALLOCATED TO A SERVICE PROVIDER\",\r\n" +
                "                \"RANK\": \"70\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"MPSD\",\r\n" +
                "                \"FID_DESC\": \"Maximum Port Speed\",\r\n" +
                "                \"RANK\": \"80\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"IPTV\",\r\n" +
                "                \"FID_DESC\": \"ADSL2+FIBER DATA SERVICE\",\r\n" +
                "                \"RANK\": \"90\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"VDSL\",\r\n" +
                "                \"FID_DESC\": \"Very high speed Digital Subscriber Line\",\r\n" +
                "                \"RANK\": \"100\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            },\r\n" +
                "            {\r\n" +
                "                \"FID\": \"ADSL\",\r\n" +
                "                \"FID_DESC\": \"Asymmetric Digital Subscriber Line\",\r\n" +
                "                \"RANK\": \"110\",\r\n" +
                "                \"REQUIRED\": \"N\"\r\n" +
                "            }\r\n" +
                "        ],\r\n" +
                "        \"legacyDataRefObjectType\": \"HSI_line\",\r\n" +
                "        \"sourceSystem\": \"TOM\"\r\n" +
                "    }\r\n" +
                "]";
        System.out.println(reqBody);


    }
}
