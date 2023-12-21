package com.tql;

import cn.hutool.core.util.XmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XmlHu {
    public static void main(String[] args) {
        //XmlUtil.readXML("proto.xml");
        Document document = XmlUtil.parseXml("C:\\Users\\tql\\IdeaProjects\\basic-code\\xml730Study\\src\\com\\tql\\proto.xml");
        NodeList seg = document.getElementsByTagName("seg");
        for (int i = 0; i < seg.getLength(); i++) {
            System.out.println(seg.item(i).getTextContent());
        }

    }
}
