package org.example;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinFreemarker;
import freemarker.template.Configuration;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

// Configurar FreeMarker
        Configuration freemarkerConfig = new Configuration(Configuration.VERSION_2_3_31);
        freemarkerConfig.setClassForTemplateLoading(Main.class, "/templates");

        // Inicializar Javalin con FreeMarker
        Javalin app = Javalin.create(config -> {
            config.fileRenderer(new JavalinFreemarker(freemarkerConfig));
        }).start(8080);

        // Ruta para mostrar el formulario (GET)
        app.get("/", ctx -> {
            Map<String, Object> model = new HashMap<>();
            model.put("titulo", "Formulario de Ejemplo");
            ctx.render("form.ftl", model);
        });

        // Ruta para procesar el formulario (POST)
        app.post("/submit", ctx -> {
            Map<String, Object> model = new HashMap<>();

            // Obtener datos del formulario
           /*TODO
                Obtener datos del formulario
            */


            TrabajadorDAO.guardarUsuario(??????);

            // Poner los datos en el modelo para la plantilla de resultados
            model.put("??????", ??????);

            ctx.render("result.ftl", model);
        });
    }
}