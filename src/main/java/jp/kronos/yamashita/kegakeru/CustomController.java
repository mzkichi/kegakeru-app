package jp.kronos.yamashita.kegakeru;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class CustomController {

    @RequestMapping(method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("msg","テスト成功");
        return "test/test";
    }

}