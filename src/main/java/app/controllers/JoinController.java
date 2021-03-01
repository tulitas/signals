//package app.controllers;
//
//import app.dto.MeasureAndSensorsDto;
//import app.services.JoinMeasureAndSensors;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class JoinController {
//    private final JoinMeasureAndSensors joinMeasureAndSensors;
//
//    public JoinController(JoinMeasureAndSensors joinMeasureAndSensors) {
//        this.joinMeasureAndSensors = joinMeasureAndSensors;
//    }
//    @GetMapping("/right")
//    public ResponseEntity<List<MeasureAndSensorsDto>> getMeasuresAndSensorsRightJoin(){
//        return new ResponseEntity<List<MeasureAndSensorsDto>>(joinMeasureAndSensors.getMeasureAndSensorsRightJoin(),
//                HttpStatus.OK);
//    }
//}
