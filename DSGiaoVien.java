package OOP.tuan2.TH_tuan2.bai1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;

public class DSGiaoVien {
    ArrayList<GiaoVien> dsGiaoVien = new ArrayList<>();

    public ArrayList<GiaoVien> getDsGiaoVien() { return dsGiaoVien; }
    public void setDsGiaoVien(ArrayList<GiaoVien> dsGiaoVien) { this.dsGiaoVien = dsGiaoVien; }

    public DSGiaoVien() {
        super();
        this.dsGiaoVien = new ArrayList<>();
    }

    public void ReadXML() throws ParserConfigurationException, SAXException, IOException {
        File xmlFile = new File("C:\\study\\OOP\\tuan2\\TH_tuan2\\bai1\\dsGiaoVien.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();

        System.out.println("Root: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("teacher");
        System.out.println("--------------");

        for (int i = 0; i < nodeList.getLength(); i++) {
            GiaoVien t = new GiaoVien();
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                t.setName(element.getElementsByTagName("name").item(0).getTextContent());
                t.setNhom(Integer.parseInt(element.getElementsByTagName("groups").item(0).getTextContent()));
            }
            dsGiaoVien.add(t);
        }
    }

    public void xuatDS() {
        for (GiaoVien t : dsGiaoVien) {
            System.out.println("Tên: " + t.getName());
            System.out.println("Nhóm: " + t.getNhom());
            System.out.println("----------");
        }
    }

    public int totalGroups() {
        int total = 0;
        for (GiaoVien t : dsGiaoVien) {
            total += t.getNhom();
        }
        return total;
    }

    public void sapxepTheoTen() {
        Collections.sort(dsGiaoVien, GiaoVien.Ten);
        xuatDS();
    }

    public void sapxepTheoNhom() {
        Collections.sort(dsGiaoVien, GiaoVien.Nhom);
        xuatDS();
    }

    public ArrayList<GiaoVien> filterGroupsGreaterThan1() {
        ArrayList<GiaoVien> filtered = new ArrayList<>();
        for (GiaoVien t : dsGiaoVien) {
            if (t.getNhom() > 1) {
                filtered.add(t);
            }
        }
        return filtered;
    }
}