package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.Entity.Category;
import pl.coderslab.charity.Entity.Donation;
import pl.coderslab.charity.Entity.Institution;
import pl.coderslab.charity.Reopsitory.RepCategory;
import pl.coderslab.charity.Reopsitory.RepDonation;
import pl.coderslab.charity.Reopsitory.RepInstitution;

@Controller
public class ControllerDonation {

    private final RepCategory repCategory;
    private final RepInstitution repInstitution;
    private final RepDonation repDonation;

    public ControllerDonation(RepCategory repCategory, RepInstitution repInstitution, RepDonation repDonation) {
        this.repCategory = repCategory;
        this.repInstitution = repInstitution;
        this.repDonation = repDonation;
    }

    @RequestMapping("/form")
    public String view(Model model){
        model.addAttribute("allCategories", repCategory.findAll());
        model.addAttribute("allInstitution", repInstitution.findAll());
        return "form";
    }
}
