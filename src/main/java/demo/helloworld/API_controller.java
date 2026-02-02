package demo.helloworld;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class API_controller {
    @GetMapping("/{id}")
    String Crateuserid(@PathVariable long id){
        return "id"+id;
    }
}
