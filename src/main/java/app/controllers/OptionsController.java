package app.controllers;

import app.repositories.MeasuresRepository;
import app.repositories.MetricsRepository;
import app.repositories.SensorsRepository;
import app.repositories.UnitsRepository;
import app.services.JoinMeasureAndSensors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class OptionsController {

    private final MetricsRepository metricsRepository;
    private final MeasuresRepository measuresRepository;
    private final SensorsRepository sensorsRepository;
    private final UnitsRepository unitsRepository;
    private final JoinMeasureAndSensors joinMeasureAndSensors;

    public OptionsController(MetricsRepository metricsRepository,
                             MeasuresRepository measuresRepository,
                             SensorsRepository sensorsRepository,
                             UnitsRepository unitsRepository,
                             JoinMeasureAndSensors joinMeasureAndSensors) {
        this.metricsRepository = metricsRepository;
        this.measuresRepository = measuresRepository;
        this.sensorsRepository = sensorsRepository;
        this.unitsRepository = unitsRepository;
        this.joinMeasureAndSensors = joinMeasureAndSensors;
    }

    @GetMapping("/getAllMetrics")
    public String getAllMetrics() {
        System.out.println("hello metrics");
        System.out.println(metricsRepository.findAll());
        return "/";
    }

    @GetMapping("/getAllMeasures")
    public String getAllMeasures() {
        System.out.println("hello measures");
        System.out.println(measuresRepository.findAll());
        return "/";
    }
    @RequestMapping(value = "/getAllSensors", method = RequestMethod.GET)
    public String getAllSensors(Model model) {
        System.out.println("hello sensors");
        model.addAttribute("sensors", sensorsRepository.findAll());
        System.out.println(joinMeasureAndSensors.getMeasureAndSensorsRightJoin());
        return "/sensors";
    }
    @GetMapping("/getAllUnits")
    public String getAllUnits() {
        System.out.println("hello units");
        System.out.println(unitsRepository.findAll());
        return "/";
    }
}