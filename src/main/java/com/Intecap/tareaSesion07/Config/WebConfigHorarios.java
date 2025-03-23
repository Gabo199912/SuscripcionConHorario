package com.Intecap.tareaSesion07.Config;


import com.Intecap.tareaSesion07.Interceptores.HorarioSuscripciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigHorarios implements WebMvcConfigurer {


    @Autowired
    private HorarioSuscripciones horarioSuscripciones;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(horarioSuscripciones).addPathPatterns("/login/suscribir/*");
    }
}
