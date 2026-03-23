//REDUCCIÓN LÓGICA

/**
 * Mostrar l
 * @param apellido
 * @param iban
 * @see  REFACTORIZADO
 */

public class pg74_paula{
    public static void main (String[]args){ 
        System.out.println("Reducción lógica");

 void mostrarDatos2(String apellido,int iban){
    mostrarInformacion();
    mostrarDatos2(apellido,iban);
    
}

/**
 * Imprime el apellido y el iban
 * @param apellido
 * @param iban
 * @see  REFACTORIZADO
 */

void verDatos(String apellido,int iban){
System.out.println("El apellido es : " + apellido);
System.out.println("El iban es : " + iban);
        }
    }
}