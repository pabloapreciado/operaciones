package Modelo;

public abstract class Perro extends Animal 
{
//Atributos
int patas;
	
//Getters & Setters
public int getPatas() {
    return patas;
}

public void setPatas(int patas) {
    this.patas = patas;
}

//Constructor
public Perro(String nombre, int patas) {
    super(nombre);
    this.patas = patas;
}


//Metodos implementados de la clase abstracta Animal
@Override
void sonido() {
    System.out.println("Sonido natural: " + "WUAU WUAU");
}

@Override
void comer() {
    System.out.println("Sonido al comer: " + "GRRR!");
}
@Override
void tanimal() {
    System.out.println("Tipo de animal: " + "Perro");
}
}
