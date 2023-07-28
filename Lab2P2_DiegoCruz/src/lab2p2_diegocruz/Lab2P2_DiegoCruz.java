/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_diegocruz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dfcm9
 */
public class Lab2P2_DiegoCruz {
    
    static Scanner scan = new Scanner(System.in);
    static Scanner scan_num = new Scanner(System.in);
    
    private static int nchefs, chefm, chefv, nmeseros, meserom, meserov, nbartenders, bartenderm, bartenderv, nmesas;
    private static double preciototal;
    static ArrayList<Chef> chefs = new ArrayList();
    static ArrayList<Mesero> meseros = new ArrayList();
    static ArrayList<Bartender> bartenders = new ArrayList();
    static ArrayList<Mesa> mesas = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario = "gerente", contrasenia = "g3r$nt0";
        /*System.out.println("Ingrese decimal");
        String prueba = scan.nextLine();
        while (!checkdecimal(prueba)){
                    System.out.println("Decimal malo. Ingrese decimal");
                    prueba = scan.nextLine();
        }
            
        System.out.println("Decimal bueno!!");
        */
        boolean resp = true;
        while(resp){
            System.out.println("Menu Principal");
            System.out.println("1. Iniciar Sesion");
            System.out.println("2. Salir del programa");
            System.out.println("Ingrese una opcion:");
            String op = scan.nextLine();
            while (!checknum(op)){
                    System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
                    op = scan.nextLine();
                }
            switch(Integer.parseInt(op)){
                case 1:
                {
                    System.out.println("Ingrese usuario");
                    String user_ingresado = scan.nextLine();
                    System.out.println("Ingrese contraseña");
                    String cont_ingresada = scan.nextLine();
                    if (user_ingresado.equals(usuario) && cont_ingresada.equals(contrasenia)) {
                        boolean resp_int = true;
                        while (resp_int){
                            System.out.println("Bienvenido al Sistema!");
                            System.out.println("Menu de Restaurante");
                            System.out.println("1. Chefs");
                            System.out.println("2. Meseros");
                            System.out.println("3. Bartenders");
                            System.out.println("4. Mesas");
                            System.out.println("5. Salir al Menu Principal");
                            System.out.println("Ingrese una opcion para continuar");
                            String op_int = scan.nextLine();
                            while (!checknum(op_int)){
                            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
                            op_int = scan.nextLine();
                            }
                            switch (Integer.parseInt(op_int)){
                                case 1:
                                {
                                    boolean resp_chef = true;
                                    while (resp_chef){
                                        System.out.println("Menu de Chefs");
                                        System.out.println("1. Agregar Chef");
                                        System.out.println("2. Modificar Chef");
                                        System.out.println("3. Listar Chefs");
                                        System.out.println("4. Eliminar Chef");
                                        System.out.println("5. Salir al Menu de Restaurante");
                                        String op_chef = scan.nextLine();
                                        while (!checknum(op_chef)){
                                        System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
                                        op_chef = scan.nextLine();
                                        }
                                        switch (Integer.parseInt(op_chef)){
                                            case 1:
                                            {
                                                if(nchefs>=14){
                                                    System.out.println("Ya agrego el numero maximo de chefs. Por favor elimine chefs para agregar mas.");
                                                }
                                                else{
                                                    add_chef();
                                                    nchefs++;
                                                }
                                                
                                                break;
                                            }
                                            case 2:
                                            {
                                                if (chefs.isEmpty()){
                                                    System.out.println("No hay chefs para modificar. Agregie chefs para mosrar una lista.");
                                                }
                                                else{
                                                    System.out.println("Ingrese el indice del chef que quiere modificar:");
                                                    listar_chefs(chefs);
                                                    String opcionc = scan.nextLine();
                                                    while (!checknum(opcionc) && Integer.parseInt(opcionc)>chefs.size()){
                                                    System.out.println("Ingrese un NUMERO POSITIVO, que este dentro del indice, por favor.");
                                                    opcionc = scan.nextLine();
                                                    }
                                                    modificar_chef(chefs,Integer.parseInt(opcionc)-1);
                                                }
                                                break;
                                            }
                                            case 3:
                                            {
                                                if (chefs.isEmpty()){
                                                    System.out.println("No hay chefs para listar. Agregue chefs para mosrar una lista.");
                                                }
                                                else{
                                                    listar_chefs(chefs);
                                                }
                                                break;
                                            }
                                            case 4:
                                            {
                                                if (chefs.isEmpty()){
                                                    System.out.println("No hay chefs para eliminar. Agregue chefs para mosrar una lista.");
                                                }
                                                else{
                                                    System.out.println("Ingrese el indice del chef que quiere eliminar");
                                                    listar_chefs(chefs);
                                                    String opcionc = scan.nextLine();
                                                    while (!checknum(opcionc) && Integer.parseInt(opcionc)>= chefs.size()){
                                                    System.out.println("Ingrese un NUMERO POSITIVO, que este dentro del indice, por favor.");
                                                    opcionc = scan.nextLine();
                                                    }
                                                    chefs.remove(Integer.parseInt(opcionc)-1);
                                                    System.out.println("El chef ha sido eliminado exitosamente!");
                                                }
                                                break;
                                            }
                                            case 5:
                                            {
                                                resp_chef = false;
                                                break;
                                            }
                                            default:
                                            {
                                                System.out.println("Ingrese una opcion valida.");
                                                break;
                                            }
                                            
                                        }
                                    }                                    
                                    break;
                                }
                                case 2:
                                {
                                    boolean resp_mesero = true;
                                    while (resp_mesero){
                                        System.out.println("Menu de Meseros");
                                        System.out.println("1. Agregar Mesero");
                                        System.out.println("2. Modificar Mesero");
                                        System.out.println("3. Listar Meseros");
                                        System.out.println("4. Eliminar Mesero");
                                        System.out.println("5. Salir al Menu de Restaurante");
                                        String op_mesero = scan.nextLine();
                                        while (!checknum(op_mesero)){
                                        System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
                                        op_mesero = scan.nextLine();
                                        }
                                        switch (Integer.parseInt(op_mesero)){
                                            case 1:
                                            {
                                                if(nmeseros >=8){
                                                    System.out.println("Ya agrego el numero maximo de meseros. Por favor elimine un mesero para agregar mas.");
                                                }
                                                else{
                                                    add_mesero();
                                                    nmeseros++;
                                                }
                                                break;
                                            }
                                            case 2:
                                            {
                                                if (meseros.isEmpty()){
                                                    System.out.println("No hay meseros para modificar. Agregie meseros para mosrar una lista.");
                                                }
                                                else{
                                                    System.out.println("Ingrese el indice del mesero que quiere modificar:");
                                                    listar_meseros(meseros);
                                                    String opcionc = scan.nextLine();
                                                    while (!checknum(opcionc) && Integer.parseInt(opcionc)> meseros.size()){
                                                    System.out.println("Ingrese un NUMERO POSITIVO, que este dentro del indice, por favor.");
                                                    opcionc = scan.nextLine();
                                                    }
                                                    modificar_mesero(meseros,Integer.parseInt(opcionc)-1);
                                                }
                                                break;
                                            }
                                            case 3:
                                            {
                                                if (meseros.isEmpty()){
                                                    System.out.println("No hay meseros para listar. Agregue meseros para mosrar una lista.");
                                                }
                                                else{
                                                    listar_meseros(meseros);
                                                }
                                                break;
                                            }
                                            case 4:
                                            {
                                                if (meseros.isEmpty()){
                                                    System.out.println("No hay meseros para listar. Agregue meseros para mosrar una lista.");
                                                }
                                                else{
                                                    System.out.println("Ingrese el indice del mesero que quiere eliminar");
                                                    listar_meseros(meseros);
                                                    String opcionc = scan.nextLine();
                                                    while (!checknum(opcionc) && Integer.parseInt(opcionc)>= meseros.size()){
                                                    System.out.println("Ingrese un NUMERO POSITIVO, que este dentro del indice, por favor.");
                                                    opcionc = scan.nextLine();
                                                    }
                                                    meseros.remove(Integer.parseInt(opcionc)-1);
                                                    System.out.println("El mesero ha sido eliminado exitosamente!");
                                                }
                                                break;
                                            }
                                            case 5:
                                            {
                                                resp_mesero = false;
                                                break;
                                            }
                                            default:
                                            {
                                                System.out.println("Ingrese una opcion valida.");
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case 3:
                                {
                                    boolean resp_bart = true;
                                    while (resp_bart){
                                        System.out.println("Menu de Bartenders");
                                        System.out.println("1. Agregar Bartender");
                                        System.out.println("2. Modificar Bartender");
                                        System.out.println("3. Listar Bartender");
                                        System.out.println("4. Eliminar Bartender");
                                        System.out.println("5. Salir al Menu de Restaurante");
                                        String op_bart = scan.nextLine();
                                        while (!checknum(op_bart)){
                                        System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
                                        op_bart = scan.nextLine();
                                        }
                                        switch (Integer.parseInt(op_bart)){
                                            case 1:
                                            {
                                                if (nbartenders >=4){
                                                    System.out.println("Ya agrego el numero maximo de bartenders. Por favor elimine bartenders para poder agregar mas.");
                                                }
                                                else{
                                                    add_bartender();
                                                    nbartenders++;
                                                }
                                                break;
                                            }
                                            case 2:
                                            {
                                                if (bartenders.isEmpty()){
                                                    System.out.println("No hay bartenders para modificar. Agregue bartenders para mosrar una lista.");
                                                }
                                                else{
                                                    System.out.println("Ingrese el indice del bartender que quiere modificar:");
                                                    listar_bartenders(bartenders);
                                                    String opcionc = scan.nextLine();
                                                    while (!checknum(opcionc) && Integer.parseInt(opcionc)> bartenders.size()){
                                                    System.out.println("Ingrese un NUMERO POSITIVO, que este dentro del indice, por favor.");
                                                    opcionc = scan.nextLine();
                                                    }
                                                    modificar_bartender(bartenders,Integer.parseInt(opcionc)-1);
                                                }
                                                break;
                                            }
                                            case 3:
                                            {
                                                if (bartenders.isEmpty()){
                                                    System.out.println("No hay bartenders para listar. Agregue bartenders para mosrar una lista.");
                                                }
                                                else{
                                                    listar_bartenders(bartenders);
                                                }
                                                break;
                                            }
                                            case 4:
                                            {
                                                if (bartenders.isEmpty()){
                                                    System.out.println("No hay bartenders para eliminar. Agregue bartenders para mosrar una lista.");
                                                }
                                                else{
                                                    System.out.println("Ingrese el indice del bartender que quiere eliminar.");
                                                    listar_bartenders(bartenders);
                                                    String opcionc = scan.nextLine();
                                                    while (!checknum(opcionc) && Integer.parseInt(opcionc)>= bartenders.size()){
                                                    System.out.println("Ingrese un NUMERO POSITIVO, que este dentro del indice, por favor.");
                                                    opcionc = scan.nextLine();
                                                    }
                                                    bartenders.remove(Integer.parseInt(opcionc)-1);
                                                    System.out.println("El mesero ha sido eliminado exitosamente!");
                                                }
                                                break;
                                            }
                                            case 5:
                                            {
                                                resp_bart = false;
                                                break;
                                            }
                                            default:
                                            {
                                                System.out.println("Ingrese una opcion valida.");
                                                break;
                                            }
                                            
                                        }
                                    }
                                    break;
                                }
                                case 4:
                                {
                                    boolean resp_mesa = true;
                                    while (resp_mesa){
                                        System.out.println("Menu de Mesas");
                                        System.out.println("1. Agregar Mesa");
                                        System.out.println("2. Modificar Mesa");
                                        System.out.println("3. Listar Mesas");
                                        System.out.println("4. Eliminar Mesa");
                                        System.out.println("5. Precio Total de Mesas");
                                        System.out.println("6. Salir al Menu de Restaurante");
                                        String op_mesa = scan.nextLine();
                                        while (!checknum(op_mesa)){
                                        System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
                                        op_mesa = scan.nextLine();
                                        }
                                        switch (Integer.parseInt(op_mesa)){
                                            case 1:
                                            {
                                                if(nmesas >= 10){
                                                    System.out.println("Ya agrego el numero maximo de mesas. Por favor elimine mesas para agregar mas.");
                                                }
                                                else{
                                                    add_mesa();
                                                    nmesas++;
                                                }
                                                
                                                break;
                                            }
                                            case 2:
                                            {
                                                if (mesas.isEmpty()){
                                                    System.out.println("No hay mesas para modificar. Agregue mesas para mosrar una lista.");
                                                }
                                                else{
                                                    System.out.println("Ingrese el indice de la mesa que quiere modificar:");
                                                    listar_mesas(mesas);
                                                    String opcionc = scan.nextLine();
                                                    while (!checknum(opcionc) && Integer.parseInt(opcionc)> mesas.size()){
                                                    System.out.println("Ingrese un NUMERO POSITIVO, que este dentro del indice, por favor.");
                                                    opcionc = scan.nextLine();
                                                    }
                                                    modificar_mesa(mesas,Integer.parseInt(opcionc)-1);
                                                }
                                                break;
                                            }
                                            case 3:
                                            {
                                                if (mesas.isEmpty()){
                                                    System.out.println("No hay mesas para listar. Agregue mesas para mosrar una lista.");
                                                }
                                                else{
                                                    listar_mesas(mesas);             
                                                }
                                                break;
                                            }
                                            case 4:
                                            {
                                                if (mesas.isEmpty()){
                                                    System.out.println("No hay mesas para eliminar. Agregue mesas para mosrar una lista.");
                                                }
                                                else{
                                                    System.out.println("Ingrese el indice de la mesa que quiere eliminar.");
                                                    listar_mesas(mesas);
                                                    String opcionc = scan.nextLine();
                                                    while (!checknum(opcionc) && Integer.parseInt(opcionc)>= bartenders.size()){
                                                    System.out.println("Ingrese un NUMERO POSITIVO, que este dentro del indice, por favor.");
                                                    opcionc = scan.nextLine();
                                                    }
                                                    mesas.remove(Integer.parseInt(opcionc)-1);
                                                    nmesas--;
                                                    System.out.println("La mesa ha sido eliminado exitosamente!");
                                                }
                                                break;
                                            }
                                            case 5:
                                            {
                                                System.out.println("El precio total de las mesas es "+preciototal);
                                                break;
                                            }
                                            case 6:
                                            {
                                                resp_mesa = false;
                                                break;
                                            } 
                                            default:
                                            {
                                                System.out.println("Ingrese una opcion valida.");
                                                break;
                                            }
                                        }
                                        
                                    }
                                    break;
                                }
                                case 5:
                                {
                                    resp_int = false;
                                    break;
                                }
                                default:
                                    System.out.println("Ingrese un numero con una opcion valida por favor.");
                                    break;

                            }
                        }
                    }
                    else{
                        System.out.println("El usuario o la contraseña ingresados son incorrectos. Intente de nuevo o salga del programa.");
                    }
                    break;
                }
                case 2:
                {
                    resp = false;
                    break;
                }
                default:
                    System.out.println("Opcion Invalida. Ingrese un numero que tenga una opcion.");
                    break;
                                    
            }
        }
                
        // TODO code application logic here
        
    }
    
    public static boolean checknum(String x){
        boolean bueno = true;
        for (int i = 0; i <x.length(); i++) {
            char e = x.charAt(i);
            if (e<48 || e>57){
                bueno = false;
                break;
            }
            
            
        }
        return bueno;
                
    }
    
    public static boolean checkdecimal(String x){
        boolean bueno = true;
        int countpoint = 0;
        for (int i = 0; i <x.length(); i++) {
            char e = x.charAt(i);
            if ((e<48 || e>57) && e!=46){
                bueno = false;
                break;
            }
            if (e == 46){
                countpoint++;
            } 
        }
        
        if(countpoint >1){
            bueno = false;
        }
        return bueno;
                
    }
    
    public static void add_chef(){
        String nom, turn, edad, stars, sueldo;
        System.out.println("A continuacion agregara un chef, ingrese los siguientes datos:");
        System.out.println("Ingrese nombre:");
        nom = scan.nextLine();
        System.out.println("Ingrese edad");
        edad = scan.nextLine();
        while (!checknum(edad)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            edad= scan.nextLine();
        }
        System.out.println("Ingrese turno (escriba matutino o vespertino):");
        turn = scan.nextLine();
        while (!turn.equalsIgnoreCase("matutino") && !turn.equalsIgnoreCase("vespertino")){
            System.out.println("Ingrese un turno valido, solo puede ser matutino o vespertino");
            turn = scan.nextLine();
        }
        System.out.println("Ingrese estrellas:");
        stars = scan.nextLine(); 
        while (!checknum(stars)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            stars = scan.nextLine();
        }
        System.out.println("Ingrese sueldo");
        sueldo = scan.nextLine();
        while (!checkdecimal(sueldo)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            sueldo = scan.nextLine();
        }
        if (turn.equalsIgnoreCase("matutino") && chefm >=7){
            System.out.println("El chef que ha tratado de ingresar es de turno matutino, y esos cupos estan llenos, por lo tanto el chef no se agregara.");
        }
        else if (turn.equalsIgnoreCase("vespertino") && chefv >=7){
            System.out.println("El chef que ha tratado de ingresar es de turno vespertino, y esos cupos estan llenos, por lo tanto el chef no se agregara.");
        }
        else{
            Chef x = new Chef (nom,turn,Integer.parseInt(edad),Integer.parseInt(stars),Double.parseDouble(sueldo)); 
            chefs.add(x);
            if (x.getTurno().equalsIgnoreCase("matutino")){
                chefm++;
            }
            else if(x.getTurno().equalsIgnoreCase("vespertino")){
                chefv++;
            }
            System.out.println("El chef ha sido agregado exitosamente!");
        }
        
                
    }
    
    public static void add_mesero(){
        String nom, turn, edad, sueldo, propina;
        System.out.println("A continuacion agregara un mesero, ingrese los siguientes datos:");
        System.out.println("Ingrese nombre:");
        nom = scan.nextLine();
        System.out.println("Ingrese edad");
        edad = scan.nextLine();
        while (!checknum(edad)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            edad= scan.nextLine();
        }
        System.out.println("Ingrese turno (escriba matutino o vespertino):");
        turn = scan.nextLine();
        while (!turn.equalsIgnoreCase("matutino") && !turn.equalsIgnoreCase("vespertino")){
            System.out.println("Ingrese un turno valido, solo puede ser matutino o vespertino");
            turn = scan.nextLine();
        }
        System.out.println("Ingrese sueldo");
        sueldo = scan.nextLine();
        while (!checkdecimal(sueldo)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            sueldo = scan.nextLine();
        }
        System.out.println("Ingrese propina:");
        propina = scan.nextLine();
        while (!checkdecimal(propina)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            propina = scan.nextLine();
        }
        if (turn.equalsIgnoreCase("matutino") && meserom >=4){
            System.out.println("El chef que ha tratado de ingresar es de turno matutino, y esos cupos estan llenos, por lo tanto el mesero no se agregara.");
        }
        else if (turn.equalsIgnoreCase("vespertino") && meserov >=4){
            System.out.println("El chef que ha tratado de ingresar es de turno vespertino, y esos cupos estan llenos, por lo tanto el mesero no se agregara.");
        }
        else{
            Mesero x = new Mesero (nom,turn,Integer.parseInt(edad),Double.parseDouble(sueldo),Double.parseDouble(propina)); 
            meseros.add(x);
            if (x.getTurno().equalsIgnoreCase("matutino")){
                meserom++;
            }
            else if(x.getTurno().equalsIgnoreCase("vespertino")){
                meserov++;
            }
            System.out.println("El mesero ha sido agregado exitosamente!");
        }
                
    }
    
    public static void add_bartender(){
        String nom, turn, edad, licores, sueldo;
        System.out.println("A continuacion agregara un bartender, ingrese los siguientes datos:");
        System.out.println("Ingrese nombre:");
        nom = scan.nextLine();
        System.out.println("Ingrese edad");
        edad = scan.nextLine();
        while (!checknum(edad)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            edad= scan.nextLine();
        }
        System.out.println("Ingrese turno (escriba matutino o vespertino):");
        turn = scan.nextLine();
        while (!turn.equalsIgnoreCase("matutino") && !turn.equalsIgnoreCase("vespertino")){
            System.out.println("Ingrese un turno valido, solo puede ser matutino o vespertino");
            turn = scan.nextLine();
        }
        System.out.println("Ingrese sueldo");
        sueldo = scan.nextLine();
        while (!checkdecimal(sueldo)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            sueldo = scan.nextLine();
        }
        System.out.println("Ingrese los licores disponibles:");
        licores = scan.nextLine();
        while (!checknum(licores)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            edad= scan.nextLine();
        }
        if (turn.equalsIgnoreCase("matutino") && bartenderm >=2){
            System.out.println("El bartender que ha tratado de ingresar es de turno matutino, y esos cupos estan llenos, por lo tanto el bartender no se agregara.");
        }
        else if (turn.equalsIgnoreCase("vespertino") && bartenderv >=2){
            System.out.println("El bartender que ha tratado de ingresar es de turno matutino, y esos cupos estan llenos, por lo tanto el bartender no se agregara.");
        }
        else{
            Bartender x = new Bartender (nom,turn,Integer.parseInt(edad),Integer.parseInt(licores),Double.parseDouble(sueldo)); 
            bartenders.add(x);
            if (x.getTurno().equalsIgnoreCase("matutino")){
                bartenderm++;
            }
            else if(x.getTurno().equalsIgnoreCase("vespertino")){
                bartenderv++;
            }
            System.out.println("El bartender ha sido agregado exitosamente!");
        }       
    }
    
    public static void add_mesa(){
        String platos, utensilios, precio;
        System.out.println("A continuacion agregara una mesa, ingrese los siguientes datos:");
        System.out.println("Ingrese platos:");
        platos = scan.nextLine();
        while (!checknum(platos)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            platos = scan.nextLine();
        }
        System.out.println("Ingrese utensilios:");
        utensilios = scan.nextLine();
        while (!checknum(utensilios)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            utensilios = scan.nextLine();
        }
        System.out.println("Ingrese precio");
        precio = scan.nextLine();
        while (!checkdecimal(precio)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            precio = scan.nextLine();
        }
        preciototal = preciototal + Double.parseDouble(precio);
        Mesa x = new Mesa (Integer.parseInt(platos), Integer.parseInt(utensilios), Double.parseDouble(precio)); 
        mesas.add(x);
        nmesas++;
       
        System.out.println("La mesa ha sido agregado exitosamente!");
                
    }
    
    public static void listar_chefs(ArrayList<Chef> chefs){
        for (Chef chef : chefs) {
            System.out.println("Lista de Chefs:");
            System.out.println("Chef "+(chefs.indexOf(chef)+1)+":\n "+chef);
            System.out.println("--------------------");
        }
    }
    
    public static void listar_meseros(ArrayList<Mesero> meseros){
        for (Mesero mesero : meseros) {
            System.out.println("Lista de Meseros:");
            System.out.println("Mesero "+(meseros.indexOf(mesero)+1)+":\n "+mesero);
            System.out.println("--------------------");
        }
    }
    
    public static void listar_bartenders(ArrayList<Bartender> bartenders){
        for (Bartender bartender : bartenders) {
            System.out.println("Lista de Bartender:");
            System.out.println("Bartender "+(bartenders.indexOf(bartender)+1)+":\n "+bartender);
            System.out.println("--------------------");
        }
    }
    
    public static void listar_mesas(ArrayList<Mesa> mesas){
        for (Mesa mesa : mesas) {
            System.out.println("Lista de Mesas:");
            System.out.println("Mesa "+(mesas.indexOf(mesa)+1)+":\n "+mesa);
            System.out.println("--------------------");
        }
    }
    
    public static void modificar_chef (ArrayList<Chef> chefs, int posicion){
        String nom, turn, edad, stars, sueldo;
        System.out.println("Modificara el chef reingresando los datos nuevamente.");
        System.out.println("Ingrese nombre:");
        nom = scan.nextLine();
        System.out.println("Ingrese edad");
        edad = scan.nextLine();
        while (!checknum(edad)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            edad= scan.nextLine();
        }
        System.out.println("Ingrese turno (escriba matutino o vespertino):");
        turn = scan.nextLine();
        while (!turn.equalsIgnoreCase("matutino") && !turn.equalsIgnoreCase("vespertino")){
            System.out.println("Ingrese un turno valido, solo puede ser matutino o vespertino");
            turn = scan.nextLine();
        }
        System.out.println("Ingrese estrellas:");
        stars = scan.nextLine(); 
        while (!checknum(stars)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            stars = scan.nextLine();
        }
        System.out.println("Ingrese sueldo");
        sueldo = scan.nextLine();
        while (!checkdecimal(sueldo)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            sueldo = scan.nextLine();
        }
        if (turn.equalsIgnoreCase("matutino") && chefm >=7){
            System.out.println("El chef que ha tratado de ingresar es de turno matutino, y esos cupos estan llenos, por lo tanto el chef no se modificara.");
        }
        else if (turn.equalsIgnoreCase("vespertino") && chefv >=7){
            System.out.println("El chef que ha tratado de ingresar es de turno vespertino, y esos cupos estan llenos, por lo tanto el chef no se modificara.");
        }
        else{
            if(chefs.get(posicion).getTurno().equalsIgnoreCase("matutino")){
            chefm--;
            }
            else{
            chefv--;
            }
            chefs.remove(posicion);
            Chef x = new Chef (nom,turn,Integer.parseInt(edad),Integer.parseInt(stars),Double.parseDouble(sueldo)); 
            chefs.add(posicion, x);
            if (x.getTurno().equalsIgnoreCase("matutino")){
                chefm++;
            }
            else if(x.getTurno().equalsIgnoreCase("vespertino")){
                chefv++;
            }
            System.out.println("El chef ha sido modificado exitosamente!");
        }
    }
    
    public static void modificar_mesero(ArrayList<Mesero> meseros,int posicion ){
        String nom, turn, edad, sueldo, propina;
        System.out.println("A contiuacion modificara el mesero, reingresando sus datos");
        System.out.println("A continuacion agregara un mesero, ingrese los siguientes datos:");
        System.out.println("Ingrese nombre:");
        nom = scan.nextLine();
        System.out.println("Ingrese edad");
        edad = scan.nextLine();
        while (!checknum(edad)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            edad= scan.nextLine();
        }
        System.out.println("Ingrese turno (escriba matutino o vespertino):");
        turn = scan.nextLine();
        while (!turn.equalsIgnoreCase("matutino") && !turn.equalsIgnoreCase("vespertino")){
            System.out.println("Ingrese un turno valido, solo puede ser matutino o vespertino");
            turn = scan.nextLine();
        }
        System.out.println("Ingrese sueldo");
        sueldo = scan.nextLine();
        while (!checkdecimal(sueldo)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            sueldo = scan.nextLine();
        }
        System.out.println("Ingrese propina:");
        propina = scan.nextLine();
        while (!checkdecimal(propina)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            propina = scan.nextLine();
        }
        if (turn.equalsIgnoreCase("matutino") && meserom >=4){
            System.out.println("El mesero que ha tratado de ingresar es de turno matutino, y esos cupos estan llenos, por lo tanto el mesero no se modificara.");
        }
        else if (turn.equalsIgnoreCase("vespertino") && meserov >=4){
            System.out.println("El mesero que ha tratado de ingresar es de turno vespertino, y esos cupos estan llenos, por lo tanto el mesero no se modificara.");
        }
        else{
            if(meseros.get(posicion).getTurno().equalsIgnoreCase("matutino")){
            meserom--;
            }
            else{
            meserov--;
            }
            meseros.remove(posicion);
            Mesero x = new Mesero (nom,turn,Integer.parseInt(edad),Double.parseDouble(sueldo),Double.parseDouble(propina)); 
            meseros.add(posicion, x);
            if (x.getTurno().equalsIgnoreCase("matutino")){
                meserom++;
            }
            else if(x.getTurno().equalsIgnoreCase("vespertino")){
                meserov++;
            }
            System.out.println("El mesero ha sido modificado exitosamente!");
        }
    }
    
    public static void modificar_bartender(ArrayList<Bartender> bartenders, int posicion){
        String nom, turn, edad, licores, sueldo;
        System.out.println("A continuacion modificara el bartender, reingresando sus datos");
        System.out.println("Ingrese nombre:");
        nom = scan.nextLine();
        System.out.println("Ingrese edad");
        edad = scan.nextLine();
        while (!checknum(edad)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            edad= scan.nextLine();
        }
        System.out.println("Ingrese turno (escriba matutino o vespertino):");
        turn = scan.nextLine();
        while (!turn.equalsIgnoreCase("matutino") && !turn.equalsIgnoreCase("vespertino")){
            System.out.println("Ingrese un turno valido, solo puede ser matutino o vespertino");
            turn = scan.nextLine();
        }
        System.out.println("Ingrese sueldo");
        sueldo = scan.nextLine();
        while (!checkdecimal(sueldo)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            sueldo = scan.nextLine();
        }
        System.out.println("Ingrese los licores disponibles:");
        licores = scan.nextLine();
        while (!checknum(licores)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            edad= scan.nextLine();
        }
        if (turn.equalsIgnoreCase("matutino") && meserom >=4){
            System.out.println("El bartender que ha tratado de ingresar es de turno matutino, y esos cupos estan llenos, por lo tanto el bartender no se modificara.");
        }
        else if (turn.equalsIgnoreCase("vespertino") && meserov >=4){
            System.out.println("El bartender que ha tratado de ingresar es de turno vespertino, y esos cupos estan llenos, por lo tanto el mesero no se modificara.");
        }
        else{
            if(bartenders.get(posicion).getTurno().equalsIgnoreCase("matutino")){
            bartenderm--;
            }
            else{
            bartenderv--;
            }
            bartenders.remove(posicion);
            Bartender x = new Bartender (nom,turn,Integer.parseInt(edad),Integer.parseInt(licores),Double.parseDouble(sueldo)); 
            bartenders.add(posicion,x);
            if (x.getTurno().equalsIgnoreCase("matutino")){
                bartenderm++;
            }
            else if(x.getTurno().equalsIgnoreCase("vespertino")){
                bartenderv++;
            }
            System.out.println("El bartender ha sido modificado exitosamente!");
        }
    }
    
    public static void modificar_mesa(ArrayList<Mesa> mesas, int posicion){
        String platos, utensilios, precio;
        mesas.remove(posicion);
        preciototal = preciototal - mesas.get(posicion).getPrecio();
        System.out.println("A continuacion modificara la mesa, reingresando sus datos.");
        System.out.println("Ingrese platos:");
        platos = scan.nextLine();
        while (!checknum(platos)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            platos = scan.nextLine();
        }
        System.out.println("Ingrese utensilios:");
        utensilios = scan.nextLine();
        while (!checknum(utensilios)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            utensilios = scan.nextLine();
        }
        System.out.println("Ingrese precio");
        precio = scan.nextLine();
        while (!checkdecimal(precio)){
            System.out.println("Ingrese un NUMERO POSITIVO, por favor.");
            precio = scan.nextLine();
        }
        preciototal = preciototal + Double.parseDouble(precio);
        Mesa x = new Mesa (Integer.parseInt(platos), Integer.parseInt(utensilios), Double.parseDouble(precio)); 
        mesas.add(posicion,x);
       
        System.out.println("La mesa ha sido modificada exitosamente!");
    }
    
    
}
