package com.Intecap.tareaSesion07.Interceptores;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.LocalTime;

@Component
public class HorarioSuscripciones implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("si se esta ejecutando");
        LocalTime hoaraioInicial = LocalTime.of(10,0);
        LocalTime hoaraioFinal = LocalTime.of(15,0);

        LocalTime horarioReal = LocalTime.now();

        if (horarioReal.isBefore(hoaraioInicial) || horarioReal.isAfter(hoaraioFinal)) {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.getWriter().write("Estas fuera del horario permitido");
            return false;
        }else {
            return true;
        }



    }

}
