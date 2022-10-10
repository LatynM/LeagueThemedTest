import java.util.*;

public class Main {
    public static void main(String[] args) {

        int opc=0,opcBuild=0,clas=0,reg=0,cost=0,num=0,claseMostrar=0,regMostrar=0,indice=0,i;
        String name = null,quote=null,objetoBuild=null;

        List<Campeon> campeonesTotales = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        campeonesTotales.add(new Campeon("Rakan","Let's dance",6300,5,1));
        campeonesTotales.add(new Campeon("Ashe","All of the world, on one arrow",450,4,3));
        campeonesTotales.add(new Campeon("AurelionSol","Naturally",6300,3,10));
        campeonesTotales.add(new Campeon("TwistedFate","Lady luck's smilin'",1350,3,3));
        campeonesTotales.add(new Campeon("Talon","Live and die by the blade",4800,1,4));
        campeonesTotales.add(new Campeon("Katarina","Violence solves everything",3150,1,4));
        campeonesTotales.add(new Campeon("Sett","I'm undisputed",6300,2,1));
        campeonesTotales.add(new Campeon("Kaisa","Are you the hunter... or the prey?",6300,4,8));
        campeonesTotales.add(new Campeon("Velkoz","Knowledge through... disintegration",4800,3,8));
        campeonesTotales.add(new Campeon("Azir","Shurima! Your emperor has returned!",4800,3,9));

        do{
            menu();

            try{
                opc=s.nextInt();
            }catch (Exception e){
                System.out.println(">ERROR OPCION");
            }

            switch (opc){
                case 1:
                    System.out.println("CREAR CAMPEON:");
                    System.out.println("INGRESAR NOMBRE");
                    System.out.print("\n- ");
                    try {
                        name=s.next();
                    } catch (Exception e) {
                        System.out.println(">ERROR NOMBRE");
                    }

                    s.nextLine(); //hace que el siguiente scan funcione

                    System.out.println("INGRESAR FRASE DE PICK");
                    System.out.print("\n- ");
                    try {
                        quote=s.nextLine();
                    } catch (Exception e) {
                        System.out.println(">ERROR FRASE");
                    }

                    System.out.println("\nINGRESAR COSTO");
                    System.out.print("\n- ");
                    try {
                        cost = s.nextInt();
                    } catch (Exception e) {
                        System.out.println(">ERROR COSTO");
                    }

                    System.out.println("INDIQUE CLASE");
                    System.out.println("1-ASESINO");
                    System.out.println("2-LUCHADOR");
                    System.out.println("3-MAGO");
                    System.out.println("4-TIRADOR");
                    System.out.println("5-SOPORTE");
                    System.out.println("6-TANQUE");

                    System.out.print("\n- ");
                    try {
                        clas= s.nextInt();
                    } catch (Exception e) {
                        System.out.println(">ERROR CLASE");
                    }

                    System.out.println("INDIQUE REGION");
                    System.out.println("1-JONIA");
                    System.out.println("2-AGUAS TURBIAS");
                    System.out.println("3-FRELJORD");
                    System.out.println("4-NOXUS");
                    System.out.println("5-DEMACIA");
                    System.out.println("6-PILTOVER");
                    System.out.println("7-ZAUN");
                    System.out.println("8-VACIO");
                    System.out.println("9-SHURIMA");
                    System.out.println("10-TARGON");
                    System.out.println("11-BANDLE");
                    System.out.println("12-IXTAL");
                    System.out.println("13-RUNETERRA");

                    System.out.print("\n- ");
                    try {
                        reg = s.nextInt();
                    } catch (Exception e) {
                        System.out.println(">ERROR REGION");
                    }

                    campeonesTotales.add(new Campeon(name,quote,cost,clas,reg));
                    System.out.println("CAMPEON CREADO");

                    campeonesTotales.sort(Comparator.comparing(Campeon::getNombre));
                break;
                case 2:
                    num=0;
                    if(campeonesTotales.isEmpty()){
                        System.out.println(">NO HAY CAMPEONES PARA ELIMINAR");
                    }
                    else {
                        System.out.println("ELIMINAR CAMPEON:");
                        System.out.println("INDIQUE CAMPEON A ELIMINAR");

                        for (Campeon champ:campeonesTotales){
                            System.out.println(">"+num+"-"+champ.getNombre());
                            num++;

                        }
                        System.out.print("\n- ");
                        try {
                            indice=s.nextInt();
                        } catch (Exception e) {
                            System.out.println(">ERROR CAMPEON ELIMINAR");
                        }

                        campeonesTotales.remove(indice);

                        System.out.println("CAMPEON ELIMINADO");
                        num=0;
                    }
                    campeonesTotales.sort(Comparator.comparing(Campeon::getNombre));
                    System.out.println("\n");
                    break;
                case 3:
                    if(campeonesTotales.isEmpty()){
                        System.out.println(">NO HAY CAMPEONES");
                    }
                    else {
                        campeonesTotales.sort(Comparator.comparing(Campeon::getNombre));
                        System.out.println("LISTA TOTAL DE CAMPEONES");
                        for (Campeon champ:campeonesTotales){
                            System.out.println("- "+champ.getNombre()+" -\""+champ.getFrase()+"\"");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    campeonesTotales.sort(Comparator.comparing(Campeon::getNombre));
                    System.out.println("INDIQUE CLASE");
                    System.out.println("1-ASESINO");
                    System.out.println("2-LUCHADOR");
                    System.out.println("3-MAGO");
                    System.out.println("4-TIRADOR");
                    System.out.println("5-SOPORTE");
                    System.out.println("6-TANQUE");

                    try {
                        claseMostrar=s.nextInt();
                    } catch (Exception e) {
                        System.out.println(">ERROR MOSTRAR CAMPEONES POR CLASE");
                    }

                    System.out.println("LISTA DE CAMPEONES DE CLASE ELEGIDA");
                    for (Campeon champ: campeonesTotales) {
                        if(claseMostrar== champ.getClase()){
                            System.out.println("- "+champ.getNombre()+" -'"+champ.getFrase()+"'");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    campeonesTotales.sort(Comparator.comparing(Campeon::getNombre));
                    System.out.println("INDIQUE REGION");
                    System.out.println("1-JONIA");
                    System.out.println("2-AGUAS TURBIAS");
                    System.out.println("3-FRELJORD");
                    System.out.println("4-NOXUS");
                    System.out.println("5-DEMACIA");
                    System.out.println("6-PILTOVER");
                    System.out.println("7-ZAUN");
                    System.out.println("8-VACIO");
                    System.out.println("9-SHURIMA");
                    System.out.println("10-TARGON");
                    System.out.println("11-BANDLE");
                    System.out.println("12-IXTAL");
                    System.out.println("13-RUNETERRA");

                    try {
                        regMostrar = s.nextInt();
                    } catch (Exception e) {
                        System.out.println(">ERROR REGION");
                    }

                    System.out.println("LISTA DE CAMPEONES DE REGION ELEGIDA");
                    for (Campeon champ: campeonesTotales) {
                        if(regMostrar== champ.getRegion()){
                            System.out.println("- "+champ.getNombre()+" -'"+champ.getFrase()+"'");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    if(campeonesTotales.isEmpty())
                    {
                        System.out.println(">NO HAY CAMPEONES");
                    }
                    else{
                        System.out.println("CREAR BUILD PARA CAMPEON");


                        do{
                            System.out.println("ELIJA CAMPEON");
                            num=0;
                            for (Campeon champ:campeonesTotales){ //muestra lista de campeones
                                System.out.println(num+"- "+champ.getNombre()+" -'"+champ.getFrase()+"'");
                                num++;
                            }

                            try{ //lee seleccion
                                indice=s.nextInt();
                            }catch (Exception e) {
                                System.out.println(">ERROR BUILD");
                            }

                            System.out.println("CAMPEON SELECCIONADO = "+campeonesTotales.get(indice).getNombre());

                            System.out.println("INGRESE NOMBRE DE OBJETO");
                            try{
                                objetoBuild=s.next();
                            }catch (Exception e){
                                System.out.println(">ERROR BUILD");
                            }

                            campeonesTotales.get(indice).agregarItem(objetoBuild);

                            System.out.println("AÑADIR OTRO OBJETO?");
                            System.out.println("SI = 1 / NO = 0");

                            try {
                                opcBuild=s.nextInt();
                            }catch (Exception e){
                                System.out.println(">ERROR MENU BUILD");
                            }
                        }while(opcBuild!=0);

                    }
                    break;
                case 7:
                    num=0;
                    if(campeonesTotales.isEmpty()){
                        System.out.println(">NO HAY CAMPEONES");
                    }
                    else{
                        System.out.println("VER BUILD DE CAMPEON:");
                        System.out.println("INDIQUE CAMPEON");

                        for (Campeon champ:campeonesTotales){
                            System.out.println(">"+num+"-"+champ.getNombre());
                            num++;
                        }

                        try{
                            indice=s.nextInt();
                        }catch (Exception e){
                            System.out.println(">ERROR BUILD");
                        }

                        System.out.println("CAMPEON SELECCIONADO = "+campeonesTotales.get(indice).getNombre());
                        int tamano=campeonesTotales.get(indice).getBuild().size();

                       for (i=0;i<tamano;i++){
                           System.out.println(">"+campeonesTotales.get(indice).getBuild().get(i));
                       }

                    }
                    break;
                case 8:
                    System.out.println("MOSTRAR EN ORDEN ASCENDENTE (MAS CARO PRIMERO) = 1");
                    System.out.println("MOSTRAR EN ORDEN DESCENDIENTE (MAS BARATO PRIMERO) = 0");

                    try{
                        num=s.nextInt();
                    }catch (Exception e){
                        System.out.println("ERROR PRECIO");
                    }

                    if(num==0){
                        System.out.println("LISTA DE CAMPEONES (MENOR A MAYOR PRECIO)");
                        campeonesTotales.sort(Comparator.comparing(Campeon::getPrecio));
                        for (Campeon champ:campeonesTotales){ //muestra lista de campeones
                            System.out.println("-$"+champ.getPrecio()+" - "+champ.getNombre());
                        }
                    }
                    else{
                        System.out.println("LISTA DE CAMPEONES (MAYOR A MENOR PRECIO)");
                        campeonesTotales.sort(Comparator.comparing(Campeon::getPrecio).reversed());
                        for (Campeon champ:campeonesTotales){ //muestra lista de campeones
                            System.out.println("-$"+champ.getPrecio()+" - "+champ.getNombre());
                        }
                    }
                    System.out.println("\n");
                    break;









            }
        }while(opc!=0);



    }
    private static void menu(){
        System.out.println("\n");
        System.out.println("- - - - - - - - - MENU - - - - - - - - - -");
        System.out.println("0- SALIR");
        System.out.println("1- CREAR CAMPEON");
        System.out.println("2- ELIMINAR CAMPEON");
        System.out.println("3- VER TODOS LOS CAMPEONES");
        System.out.println("4- VER CAMPEONES POR CLASE");
        System.out.println("5- VER CAMPEONES POR REGION");
        System.out.println("6- ASIGNAR BUILD A UN CAMPEON");
        System.out.println("7- VER BUILD DE UN CAMPEON");
        System.out.println("8- ORDENAR CAMPEONES POR COSTO EN BE");
    }
}