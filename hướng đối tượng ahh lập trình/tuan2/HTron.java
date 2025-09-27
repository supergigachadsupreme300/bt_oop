public class HTron { 
    int r; 
    public int getR() { 
    return r; 
} 
public void setR(int r) { 
    this.r = r; 
} 
    public HTron() { 
    this.r = 0; 
} 
    public HTron(int r) { 
    this.r = r; 
} 
public HTron(HTron a) { 
    super(); 
    this.r = a.r; 
} 
public double tinhCV() { 
    return Math.PI*r*2; 
} 
public double tinhDT() { 
    return Math.PI*r*r;
} 
public void xuat() { 
    System.out.println("Hinh tron co CV: " + tinhCV() + " va  DT: " + tinhDT()); 
} 
} 
