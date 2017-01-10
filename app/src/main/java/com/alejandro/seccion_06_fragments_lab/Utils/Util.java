package com.alejandro.seccion_06_fragments_lab.Utils;

import com.alejandro.seccion_06_fragments_lab.Models.Mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alejandro on 8/1/17.
 */

public class Util {

    public static String[] colors = new String[]
            {"F44336", "E91E63", "9C27B0", "673AB7", "3F51B5",
                    "03A9F4", "009688", "4CAF50", "CDDC39", "FFC107",
                    "FF5722", "795548", "9E9E9E", "455A64", "FF5722"};

    public static List<Mail> getDummyData() {
        return new ArrayList<Mail>() {{
            add(new Mail("Presupuesto 2017", "Hola Alejandro, este es el presupuesto para el año 2017 del que mencionaste en la reunión de ayer. Está en formato PDF, ya me dices que te parece. Un Saludo", "antonio@gmail.com"));
            add(new Mail("Cena Empresa", "Queridos amigos, la cena de empresa de este año será en el mismo restaurante que los años pasados, sin embargo la hora será distinta, empieza sobre las 8 de la tarde. Espero verte allí, Saludos.", "empresa@gmail.com"));
            add(new Mail("Partida Tenis", "ey Alex, ¿Cuándo dijiste que íbamos a ir a jugar ese torneo de tenis? Deberíamos entrenar antes del primero partido, ya me dices.", "maria@gmail.com"));
            add(new Mail("Oferta de empleo: Android developer", "Hola, estamos buscando desarrolladores Android sin experiencia, en un ambiente dinámico donde se valora el compañerismo, el esfuerzo y las ganas por aprender. Si sientes que eres el candidato perfecto para ello, mándame tu CV a éste mismo correo y consideramos tu perfil en el proceso de entrevistas. Gracias.", "monica@gmail.com"));
            add(new Mail("Quedada amigos", "woooooo, hace semanas que no quedamos todos juntos, como te viene este finde?", "luis@gmail.com"));
            add(new Mail("Compra conjunta de shishas", "Bueno, al final somos 10, vamos a pedir las shishas que ya habíamos acordado. El pedido empezará al final del mes de Febrero, para entonces, si no has hecho la transferencia, no se procederá a pedir la tuya. Si necesitas los datos bancarios, avísame ;)", "carlos@gmail.com"));
            add(new Mail("Cursos 2017", "Cuñado, he visto unos cursos muy interesantes sobre programación. Pásate por mi casa hoy y le echamos un vistazo!", "rafael@gmail.com"));
            add(new Mail("Conferencia de lectores", "El lugar elegido para la conferencia de lectores internacional celebrada el día 29 de Febrero será en Sevilla. Visita nuestra página web para tener más detalles del evento.", "osvaldo@gmail.com"));
            add(new Mail("Adopta a un perro, será tu amigo", "Recuerda que los animales no son juguetes, que tienen sentimientos y debes cuidar de ellos. Muchos son abandonados, pásate por nuestras instalaciones y acoge a uno de estos necesitados animalitos que tanto añoran un hogar. Son encantadores!!", "jose@gmail.com"));
            add(new Mail("Repara tus piezas, 50% dto", "Aprovecha las nuevas ofertas del 50% descuento que tenemos en todos nuestros artículos", "reparaciones@gmail.com"));
            add(new Mail("Propósitos año nuevo??", "Participa en nuestra dinámica encuesta para propuestas de año nuevo!!!", "estefania@gmail.com"));
            add(new Mail("Valora este formulario", "Valora este formulario que te he adjuntado, bro.", "lucas@gmail.com"));
        }};
    }

    public static String getRandomColor() {
        // Número aleatorio entre [0] y [14];
        int randonNumber = new Random().nextInt(colors.length) + 0;
        // Devolvemos el color
        return colors[randonNumber];
    }


}
