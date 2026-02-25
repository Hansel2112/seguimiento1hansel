import java.util.Scanner;
public class Seguimiento1Hansel{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Socilitar informacion
        System.out.print("Ingrese su numero de identificacion");
        double identificacion= sc.nextDouble();
        System.out.print("Ingrese el valor total de la compra");
        double compra=sc.nextDouble();
        double descuento=calcularDescuento(compra);
        double totalFinal=compra - descuento;
        System.out.println("Su compra fue de,"+compra+"y con descuento fue de"+descuento);
        System.out.println("El total a pagar es"+totalFinal);
        
    }

    public static double calcularDescuento(double valorCompra){
    if (valorCompra >0 && valorCompra<30000){
        return 0;
    } 
    else if (valorCompra>=300000 && valorCompra<1000000){
        return valorCompra*5/100;
    }
    else if (valorCompra>=1000000){
        return valorCompra*10/100;
    }else {
        return 0;
    }
    
    }
    
}