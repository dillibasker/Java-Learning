package demo.helloworld;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class API_controller {
    //pathvariable
    @GetMapping("/{id}")
    String Crateuserid(@PathVariable long id){
        return "pathvariable id is"+id;
    }
    //requestparamtodo?todoid=123
    @GetMapping
    String userid(@RequestParam("todoid") long id){
        return "Requestparam id is "+id;
    }

    //requestparam
    @GetMapping("/create")
    String useid(@RequestParam String userId , @RequestParam String password){
        return "Requestparam name is "+ userId +" " + "passord is " + password;
    }

    //requestparam
    @GetMapping("/create")
    String usid(@RequestParam String userId , @RequestParam String password){
        return "Requestparam name is "+ userId +" " + "passord is " + password;
    }

    @PostMapping("/create")
    String reuestbody(@RequestBody String body){
        return body;
    }
}
