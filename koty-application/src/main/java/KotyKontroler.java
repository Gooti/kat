import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KotyKontroler {
    @Autowired
    private KotDAO kotDAO;

    @RequestMapping("/kot/{imie}")
    public String szczegolyKota(@PathVariable("imie") String imieKota) {
        return "glowny";
    }
}
