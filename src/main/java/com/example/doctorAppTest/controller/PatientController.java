package com.example.doctorAppTest.controller;

import com.example.doctorAppTest.entity.Patient;
import com.example.doctorAppTest.repository.PatientInfoRepository;
import com.example.doctorAppTest.service.PatientService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PatientController {

    private final PatientInfoRepository patientInfoRepository;

//    @PostMapping("/home")
//    public String addNewPatient(@RequestBody Patient patient){
//        patientInfoRepository.save(patient);
//        return "add new user";
//    }

    private final PatientService patientService;

//    @GetMapping("/")
//    public String viewHomePage(Model model, @Param("keyword") String keyword) {
//        System.out.println("home");
//        List<Patient> listPatient = patientService.listAll("test");
//        model.addAttribute("listPatient", listPatient);
//        model.addAttribute("keyword", keyword);
//        return "home";
//    }

//    @PostMapping(path="/add") // Map ONLY POST Requests
//    public @ResponseBody String addPatient (@RequestParam String name,@RequestParam Integer age
//            , @RequestParam String email) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        Patient n = new Patient();
//        n.setName(name);
//        n.setAge(age);
//        //n.setEmail(email);
//        patientInfoRepository.save(n);
//        return "Saved";
//    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Patient> getAllPatient() {
        // This returns a JSON or XML with the users
        return patientInfoRepository.findAll();
    }
    //private final PatientService patientService;

    public PatientController(PatientInfoRepository patientInfoRepository, PatientService patientService){
        super();
        this.patientInfoRepository = patientInfoRepository;
        this.patientService = patientService;

    }

    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<Patient> saveEmployee(@RequestBody Patient patient){
        return new ResponseEntity<>(patientInfoRepository.save(patient), HttpStatus.CREATED);
    }

    @RequestMapping("/test")
    //@ResponseBody
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Patient> listProducts = patientService.listAll(keyword);
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("keyword", keyword);
        return "home";
    }
}
