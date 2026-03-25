package a04;

public class Main {
    public static void main(String[] args) {
        Multifuncion impresoraBuena = new ImpresoraAvanzada();
        ImpresoraBasica impresoraMala = new ImpresoraBasica();

        Imprimible[] array = {impresoraBuena, impresoraMala};

        for (Imprimible impresora : array) {
            impresora.Imprimir();
            // impresora.Escanear(); daría error porque Escanear() no está definido en Imprimible.
        }
    }

    
}
