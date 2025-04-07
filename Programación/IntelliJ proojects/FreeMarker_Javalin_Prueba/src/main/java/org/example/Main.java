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


            String nombre = ctx.formParam("nombre");
            String departamento = ctx.formParam("departamento");
            String contrato = ctx.formParam("contrato");
            int sueldo = Integer.parseInt(ctx.formParam("sueldo"));

            Trabajador nuevo = new Trabajador(nombre,sueldo,departamento,contrato);

            TrabajadorDAO.guardarUsuario(nuevo);

            model.put("trabajador", nuevo);


            ctx.render("result.ftl", model);
        });
    }
}