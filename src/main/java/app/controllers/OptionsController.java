package app.controllers;

import app.repositories.MeasuresRepository;
import app.repositories.MetricsRepository;
import app.repositories.SensorsRepository;
import app.repositories.UnitsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OptionsController {

    private final MetricsRepository metricsRepository;
    private final MeasuresRepository measuresRepository;
    private final SensorsRepository sensorsRepository;
    private final UnitsRepository unitsRepository;

    public OptionsController(MetricsRepository metricsRepository, MeasuresRepository measuresRepository, SensorsRepository sensorsRepository, UnitsRepository unitsRepository) {
        this.metricsRepository = metricsRepository;
        this.measuresRepository = measuresRepository;
        this.sensorsRepository = sensorsRepository;
        this.unitsRepository = unitsRepository;
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
    @GetMapping("/getAllSensors")
    public String getAllSensors() {
        System.out.println("hello sensors");
        System.out.println(sensorsRepository.findAll());
        return "/";
    }
    @GetMapping("/getAllUnits")
    public String getAllUnits() {
        System.out.println("hello units");
        System.out.println(unitsRepository.findAll());
        return "/";
    }
}