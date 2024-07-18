package desafio;


public class Main {

    public static void main(String[] args) {
        Archivo objeto= new Archivo();
        System.out.println(objeto.getLista());


        objeto.crearArchivo("datos","texto.txt");
        objeto.buscarTexto("src/datos/texto.txt","Gato");
    }



}