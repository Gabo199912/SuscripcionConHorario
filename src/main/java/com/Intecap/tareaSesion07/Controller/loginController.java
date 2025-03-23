package com.Intecap.tareaSesion07.Controller;


import com.Intecap.tareaSesion07.Modell.loginModell;
import com.Intecap.tareaSesion07.Modell.suscripcionModell;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/login")
public class loginController {
    List<loginModell> listaLogin = new ArrayList<>();
    List<suscripcionModell> listaSuscripcion = new ArrayList<>();


    @GetMapping("/usuariosCreados")
    public List<loginModell> listar() {
        return (listaLogin);
    }

    @GetMapping("/suscritos")
    public List<suscripcionModell> listarSuscritos() {
        return (listaSuscripcion);
    }


    @PostMapping("/crearUsuario")
    public ResponseEntity<String> getListaLogin(@RequestBody loginModell login) {

        if (login.getisActivo()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no se puede crear");
        }else{
            listaLogin.add(login);
            return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado");
        }


    }


    @PostMapping("/suscribir/{correo}")
    public ResponseEntity<String> suscribirUsuario(@PathVariable String correo, @RequestBody suscripcionModell suscribir) {
        for (loginModell login : listaLogin) {
            if (login.getCorreo().equals(correo)) {
                listaSuscripcion.add(suscribir);
                login.setActivo(true);
                return ResponseEntity.ok("Usuario suscrito correctamente");
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
    }
}
