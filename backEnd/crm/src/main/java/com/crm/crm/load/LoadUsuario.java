package com.crm.crm.load;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.crm.crm.entity.Usuario;
import com.crm.crm.repository.UsuarioRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LoadUsuario {
    UsuarioRepository usuarioRepository;

    public void carregarUsuarios(){
        Usuario usuario1 = new Usuario();
        usuario1.setCPF("194773337");
        usuario1.setCargo("Visitante");
        usuario1.setEmail("felton_dare84@hotmail.com");
        usuario1.setName("Augusto Ventura");
        usuario1.setSenha("114774");
        usuario1.setTelefone("(11) 915243-1042");
        usuario1.setDataCriada(LocalDate.of(2022, 5, 10));
        usuarioRepository.save(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setCPF("94973355208");
        usuario2.setCargo("Visitante");
        usuario2.setEmail("garrick85@yahoo.com");
        usuario2.setName("Cristiano Nakata");
        usuario2.setSenha("729386");
        usuario2.setTelefone("(11) 931626-6204");
        usuario2.setDataCriada(LocalDate.of(2022, 5, 28));
        usuarioRepository.save(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setCPF("76729076895");
        usuario3.setCargo("Lead");
        usuario3.setEmail("jody_labadie16@hotmail.com");
        usuario3.setName("Bernardo Pacheco");
        usuario3.setSenha("611234");
        usuario3.setTelefone("(11) 973025-0049");
        usuario3.setDataCriada(LocalDate.of(2022, 5, 15));
        usuarioRepository.save(usuario3);

        Usuario usuario4 = new Usuario();
        usuario4.setCPF("765419327");
        usuario4.setCargo("Vendas");
        usuario4.setEmail("devan86@gmail.com");
        usuario4.setName("Rogério Quadros");
        usuario4.setSenha("358089");
        usuario4.setTelefone("(31) 937701-1890");
        usuario4.setDataCriada(LocalDate.of(2021, 6, 8));
        usuarioRepository.save(usuario4);

        Usuario usuario5 = new Usuario();
        usuario5.setCPF("66122813591");
        usuario5.setCargo("Lead");
        usuario5.setEmail("arianna_labadie@gmail.com");
        usuario5.setName("Túlio Braga");
        usuario5.setSenha("10467");
        usuario5.setTelefone("(86) 949333-3208");
        usuario5.setDataCriada(LocalDate.of(2021, 6, 18));
        usuarioRepository.save(usuario5);

        Usuario usuario6 = new Usuario();
        usuario6.setCPF("6631999561");
        usuario6.setCargo("Visitante");
        usuario6.setEmail("darian_jacobi43@gmail.com");
        usuario6.setName("Edson Menezes");
        usuario6.setSenha("549479");
        usuario6.setTelefone("(11) 932079-0229");
        usuario6.setDataCriada(LocalDate.of(2021, 2, 9));
        usuarioRepository.save(usuario6);

        Usuario usuario7 = new Usuario();
        usuario7.setCPF("867316101");
        usuario7.setCargo("Lead");
        usuario7.setEmail("izaaugusta.grant22@gmail.com");
        usuario7.setName("Izabel Camargo");
        usuario7.setSenha("291320");
        usuario7.setTelefone("(51) 917160-8268");
        usuario7.setDataCriada(LocalDate.of(2021, 2, 25));
        usuarioRepository.save(usuario7);

        Usuario usuario8 = new Usuario();
        usuario8.setCPF("15771822787");
        usuario8.setCargo("Visitante");
        usuario8.setEmail("pauline_west@gmail.com");
        usuario8.setName("Ágata Rodrigues");
        usuario8.setSenha("418655");
        usuario8.setTelefone("(96) 950871-6581");
        usuario8.setDataCriada(LocalDate.of(2022, 4, 10));
        usuarioRepository.save(usuario8);

        Usuario usuario9 = new Usuario();
        usuario9.setCPF("36190207014");
        usuario9.setCargo("Vendas");
        usuario9.setEmail("buford.hayes@yahoo.com");
        usuario9.setName("Lívia Sato");
        usuario9.setSenha("264603");
        usuario9.setTelefone("(51) 961172-2319");
        usuario9.setDataCriada(LocalDate.of(2022, 3, 15));
        usuarioRepository.save(usuario9);

        Usuario usuario10 = new Usuario();
        usuario10.setCPF("51082596469");
        usuario10.setCargo("Lead");
        usuario10.setEmail("margarette.torp@gmail.com");
        usuario10.setName("Maitê Menezes");
        usuario10.setSenha("803598");
        usuario10.setTelefone("(27) 939604-8250");
        usuario10.setDataCriada(LocalDate.of(2021, 6, 5));
        usuarioRepository.save(usuario10);
    }

}
