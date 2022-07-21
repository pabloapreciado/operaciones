package Modelo;


public class Main 
{
	public static void main(String[] args) {
        Oveja o = new Oveja("Copito",4) {
        };
        o.tanimal();
		System.out.println("Nombre : "+ o.nombre);
		System.out.println("Numero de patas: " + o.patas);
		o.comer();
		o.sonido();

        Perro p = new Perro("estiven",3) {
        };
        p.tanimal();
        System.out.println("Nombre : "+ p.nombre);
		System.out.println("Numero de patas: " + p.patas);
		p.comer();
		p.sonido();

        
	}
}    

