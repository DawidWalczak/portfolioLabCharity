package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.Reopsitory.RepCategory;
import pl.coderslab.charity.Reopsitory.RepDonation;
import pl.coderslab.charity.Reopsitory.RepInstitution;

@Controller
public class HomeController {

    private final RepCategory repCategory;
    private final RepDonation repDonation;
    private final RepInstitution repInstitution;

    public HomeController(RepCategory repCategory, RepDonation repDonation, RepInstitution repInstitution) {
        this.repCategory = repCategory;
        this.repDonation = repDonation;
        this.repInstitution = repInstitution;
    }

    @RequestMapping("/")
    public String donatedBags(Model model) {
        model.addAttribute("institutions", repInstitution.findAll());
        model.addAttribute("donationsBag", repDonation.findAllBags());
        model.addAttribute("donations", repDonation.findAll().size());
        return "index";
    }
}
