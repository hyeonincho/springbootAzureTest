import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{

    @RequestMapping(value= "/")
    public String indexPage()
    {
        return "hi";
    }
}