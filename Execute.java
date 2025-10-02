package OOP.tuan2.TH_tuan2.bai1;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Execute {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DSGiaoVien dsGiaoVien = new DSGiaoVien();
        dsGiaoVien.ReadXML();
        dsGiaoVien.xuatDS();
    }
}