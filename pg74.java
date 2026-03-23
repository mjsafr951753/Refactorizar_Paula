// /**
//  * Mostrar la foto y luego imprime la identidade y la idade
//  * @param identidade
//  * @param idade
//  * @see SIN REFACTORIZAR
//  */
// void visualizarDatos(String identidade,int idade){
// mostrarFoto();
// System.out.println("Identidade: " + identidade);
// System.out.println("Idade: " + idade);
// }



//REDUCCIÓN LÓGICA



/**
 * Mostrar la foto y luego imprime la identidade y la idade
 * @param ident
 * @param anos
 * @see  REFACTORIZADO
 */
void visualizarDatosRef(String ident,int anos){
mostrarFoto();
mostrarDatos(ident,anos);

}

/**
 * Imprime la identidade y los anos
 * @param ident
 * @param anos
 * @see  REFACTORIZADO
 */
void mostrarDatos(String ident,int anos){
System.out.println("Ident: " + ident);
System.out.println("anos: " + anos);
}