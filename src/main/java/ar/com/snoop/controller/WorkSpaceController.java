package ar.com.snoop.controller;

/**
 * Created by root on 18/07/15.
 */
import ar.com.snoop.model.WorkSpace;
import ar.com.snoop.repository.WorkSpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.ModelMap;
        import org.springframework.validation.BindingResult;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WorkSpaceController {
    @Autowired
    private WorkSpaceRepository workSpaceRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listWorkSpaces(ModelMap model) {
        model.addAttribute("workSpace", new WorkSpace());
        model.addAttribute("workSpaces", workSpaceRepository.findAll());
        return "workSpaces";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addWorkSpace(@ModelAttribute("workSpace") WorkSpace workSpace, BindingResult result) {

        workSpaceRepository.save(workSpace);

        return "redirect:/";
    }

    @RequestMapping("/delete/{workSpaceId}")
    public String deleteWorkSpace(@PathVariable("workSpaceId") Long workSpaceId) {

        workSpaceRepository.delete(workSpaceRepository.findOne(workSpaceId));

        return "redirect:/";
    }
}