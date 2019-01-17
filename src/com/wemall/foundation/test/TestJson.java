package com.wemall.foundation.test;

import com.wemall.foundation.domain.virtual.TransContent;
import com.wemall.foundation.domain.virtual.TransInfo;
import java.io.PrintStream;
import org.nutz.json.Json;

public class TestJson {
    public static void main(String[] args){
        String s = "{\"message\":\"ok\",\"status\":\"1\",\"state\":\"3\",\"data\":[{\"time\":\"2012-07-07 13:35:14\",\"context\":\"�ͻ���ǩ��\"},{\"time\":\"2012-07-07 09:10:10\",\"context\":\"�뿪 [����ʯ��ɽӪҵ��] �����У�����Ա[��]���绰[]\"},{\"time\":\"2012-07-06 19:46:38\",\"context\":\"���� [����ʯ��ɽӪҵ��]\"},{\"time\":\"2012-07-06 15:22:32\",\"context\":\"�뿪 [����ʯ��ɽӪҵ��] �����У�����Ա[��]���绰[]\"},{\"time\":\"2012-07-06 15:05:00\",\"context\":\"���� [����ʯ��ɽӪҵ��]\"},{\"time\":\"2012-07-06 13:37:52\",\"context\":\"�뿪 [����_ͬ����תվ] ���� [����ʯ��ɽӪҵ��]\"},{\"time\":\"2012-07-06 12:54:41\",\"context\":\"���� [����_ͬ����תվ]\"},{\"time\":\"2012-07-06 11:11:03\",\"context\":\"�뿪 [������ת����פվ����] ���� [����_ͬ����תվ]\"},{\"time\":\"2012-07-06 10:43:21\",\"context\":\"���� [������ת����פվ����]\"},{\"time\":\"2012-07-05 21:18:53\",\"context\":\"�뿪 [����_����֧��˾] ���� [������ת����_����]\"},{\"time\":\"2012-07-05 20:07:27\",\"context\":\"��ȡ�������� [����_����֧��˾]\"}]}";
        TransInfo info = (TransInfo)Json.fromJson(TransInfo.class, s);
        System.out.println(info.getMessage());
        for (TransContent tc : info.getData())
            System.out.println(tc.getTime() + " " + tc.getContext());
    }
}




