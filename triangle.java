public class triangle {
    
private double sideLength;
    
private double perimeter;
    
private double area;
    
    

public triangle(double length){
        
this.sideLength = length;
    
}
    

public triangle(){
        
this.sideLength = 0;
    
}
   
 
public void setSideLength(double length){
        
this.sideLength = length;
    
}
    

public double getSideLength(){
        
return this.sideLength;
    
}
 
   
public String GetPerimeter(double a,double b,double c){
        

        
return ("Your Triangle's perimeter is " + a+b+c);
    
}
    

public String GetArea(double a,double b){
        
this.area = a*b/2;
  
return ("Your Triangle's area is " + this.area);
        
    
}
    

public void printOutput(){
        
System.out.println("Your triangle's side length is " + this.sideLength + ".\n"
               
 + "Your triangle's perimeter is " + this.perimeter + ".\n"
                
+ "Your triangle's area is " + this.area + ".");
    
}

}  

