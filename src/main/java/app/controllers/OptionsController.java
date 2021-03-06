package app.controllers;

import app.repositories.MeasuresRepository;
import app.repositories.MetricsRepository;
import app.repositories.SensorsRepository;
import app.repositories.UnitsRepository;
import app.services.JoinMeasureAndMetric;
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
    private final JoinMeasureAndMetric joinMeasureAndMetric;

    public OptionsController(MetricsRepository metricsRepository,
                             MeasuresRepository measuresRepository,
                             SensorsRepository sensorsRepository,
                             UnitsRepository unitsRepository,
                             JoinMeasureAndSensors joinMeasureAndSensors,
                             JoinMeasureAndMetric joinMeasureAndMetric) {
        this.metricsRepository = metricsRepository;
        this.measuresRepository = measuresRepository;
        this.sensorsRepository = sensorsRepository;
        this.unitsRepository = unitsRepository;
        this.joinMeasureAndSensors = joinMeasureAndSensors;
        this.joinMeasureAndMetric = joinMeasureAndMetric;
    }

    @GetMapping("/getAllMetrics")
    public String getAllMetrics() {
        System.out.println(metricsRepository.findAll());
        return "/";
    }

    @GetMapping("/getAllMeasures")
    public String getAllMeasures() {
        System.out.println(measuresRepository.findAll());
        return "/";
    }

    @RequestMapping(value = "/getAllSensors", method = RequestMethod.GET)
    public String getAllSensors(Model model) {
        model.addAttribute("sensors", sensorsRepository.findAll());
        model.addAttribute("findSensors", joinMeasureAndSensors.getMeasureAndSensorsRightJoin());
        model.addAttribute("findMetrics", joinMeasureAndMetric.getMeasureAndMetricsLeftJoin());
        return "sensors";
    }

    @GetMapping("/getAllUnits")
    public String getAllUnits() {
        System.out.println(unitsRepository.findAll());
        return "/";
    }

    @GetMapping("/findByDate")
    public String getByDate(Model model, String metricData) {
        model.addAttribute("findSensors", joinMeasureAndSensors.getMeasureAndSensorsRightJoinByDate(metricData));
        model.addAttribute("findMetrics", joinMeasureAndMetric.getMeasureAndMetricsLeftJoinByDate(metricData));
        return "sensors";

    }

    @GetMapping("/findByParameter")
    public String getByParameter(Model model, Integer parameter1, String metricData, Integer parameter2) {
        model.addAttribute("findSensors", joinMeasureAndSensors.getMeasureAndSensorsRightJoinByParameterMin(parameter1, parameter2, metricData));
        model.addAttribute("findMetrics", joinMeasureAndMetric.getMeasureAndMetricsLeftJoinByParameterMin(parameter1, parameter2, metricData));

        model.addAttribute("findSensorsM", joinMeasureAndSensors.getMeasureAndSensorsRightJoinByParameterMax(parameter1, parameter2, metricData));
        model.addAttribute("findMetricsM", joinMeasureAndMetric.getMeasureAndMetricsLeftJoinByParameterMax(parameter1, parameter2, metricData));


        return "sensors";
    }
}