/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm_monthly_report;

/**
 *
 * @author paulemg
 */
//Computation Method
class Computation{
    double totalCapital, totalSales, netIncome;
    
    public double TotalCapital(double tC, int Stocks){
        this.totalCapital = tC * Stocks;
        
        return totalCapital;
    
    }
    
        public double getTotalCapital(){
            return totalCapital;
         }
   

    public double TotalSales(double marketprice, int quantitysold){
        this.totalSales = marketprice * quantitysold;
        return totalSales;
    }
    
        public double getTotalSales(){
            return totalSales;
         }
    
    
    public double NetIncome(double totalSales, double totalCapital){
        this.netIncome = totalSales - totalCapital;
//        System.out.println("Net Income: " + netIncome + "\n");
        return netIncome;
    }
    
        public double getNetIncome(){
        return netIncome;
        }

}

class Materials extends Computation{
    private String name, unit;
    private int stocks, Qsold;
    private double CapPrice, MarkPrice;
    
    Materials(){}
    Materials(String name, int stocks, String unit, double cp, double mp, int Qsold){
        this.name = name;
        this.stocks = stocks;
        this.unit = unit;
        
        this.CapPrice = cp;
        this.MarkPrice = mp;
        this.Qsold = Qsold;
    
    }
    
    //Setters and Getters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getStocks(){
        return stocks;
    }
    public void setStocks(int Stocks){
        this.stocks = Stocks;
    }

    public String getUnit(){
        return unit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    
    public double getCapPrice(){
        return CapPrice;
    }
    public void setCapPrice(double cp){
        this.CapPrice = cp;
    }
    
    public double getMarkPrice(){
        return MarkPrice;
    }
    public void setMarkPrice(double mp){
        this.MarkPrice = mp;
    }
    
    public int getQs(){
        return Qsold;
    }
    public void setQs(int qs){
        this.Qsold = qs;
    }
    
}

public class paule_Interim2 {
    public static void main(String[] args){
        Materials[] mat = new Materials[5];
        mat[0] = new Materials();
            mat[0].setName("Paint Tinting Color");
            mat[0].setStocks(100);
            mat[0].setUnit("Ltr");
            mat[0].setCapPrice(100);
            mat[0].setMarkPrice(190);
            mat[0].setQs(50);
               
        mat[1] = new Materials();
            mat[1].setName("Paint Enamel");
            mat[1].setStocks(50);
            mat[1].setUnit("Gal");
            mat[1].setCapPrice(500);
            mat[1].setMarkPrice(650);
            mat[1].setQs(30);
            
        mat[2] = new Materials();
            mat[2].setName("Brush Steel(101mm)");
            mat[2].setStocks(80);
            mat[2].setUnit("pieces");
            mat[2].setCapPrice(20);
            mat[2].setMarkPrice(40);
            mat[2].setQs(45);
            
        mat[3] = new Materials();
            mat[3].setName("Paint Thinner");
            mat[3].setStocks(90);
            mat[3].setUnit("Gal");
            mat[3].setCapPrice(200);
            mat[3].setMarkPrice(350);
            mat[3].setQs(70);
            
        mat[4] = new Materials();
            mat[4].setName("Oil Paint");
            mat[4].setStocks(200);
            mat[4].setUnit("Ltr");
            mat[4].setCapPrice(120);
            mat[4].setMarkPrice(200);
            mat[4].setQs(100);
                
        for(Materials each: mat){
            System.out.println("Material Name: " + each.getName() +"  Stocks: "+ each.getStocks() +" \nUnit: "+ each.getUnit() +"\t Capital Price: " + each.getCapPrice() + " \nMarket Price: "+ each.getMarkPrice() + "\t Quantity Sold: " + each.getQs());
            System.out.println("_______________________________________________");
        }
        System.out.println("");
        
        //Prints Results
        for (int x = 0; x < mat.length; x++){
            System.out.println("_____________________________________");
            System.out.println((x +1 )+". "+ mat[x].getName());
            System.out.println("=====================================");
            
        mat[x].TotalCapital(mat[x].getCapPrice(), mat[x].getStocks());
        System.out.print("Total Capital: ");
            System.out.println(mat[x].getTotalCapital());
            
        mat[x].TotalSales(mat[x].getMarkPrice(), mat[x].getQs());
        System.out.print("Total Sales: ");
            System.out.println(mat[x].getTotalSales());
            
        mat[x].NetIncome(mat[x].getTotalSales(), mat[x].getTotalCapital());
            System.out.print("Net Income: ");
            System.out.println(mat[x].getNetIncome());
            
                if(mat[x].getTotalSales() > mat[x].getTotalCapital()){
                    System.out.println(mat[x].getName() +" is Profitable ");
                
                }
                else if(mat[x].getTotalSales() < mat[x].totalCapital){
                    System.out.println(mat[x].getName() +" is Not Earning ");
                
                }
                
                System.out.println("=====================================");
                
        }
    }
}
