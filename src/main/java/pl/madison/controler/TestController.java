package pl.madison.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.madison.domain.Slowo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    private List<String> imiona = new ArrayList<String>();

    @RequestMapping(value = "/wpisujemyImiona")
    public String wpisujemy(Map<String, Object> model){
        model.put("wpisz", new Slowo());
        return "stronaDoWpisywania";
    }

    @RequestMapping(value = "/posortowane", method = RequestMethod.POST)
    public String sortowanie(Slowo slowo, Map<String, Object> model){
        imiona.add(slowo.getImie1());
        imiona.add(slowo.getImie2());
        imiona.add(slowo.getImie3());

        Collections.sort(imiona);

        model.put("abc", imiona);
        return "posortowane";
    }
}
