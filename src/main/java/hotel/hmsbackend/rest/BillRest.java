package hotel.hmsbackend.rest;

import hotel.hmsbackend.pojo.Bill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/bill")
public interface BillRest {
    @PostMapping(path = "/generateReport")
    ResponseEntity<String> generateReport(@RequestBody Map<String, Object> requestMap);

    @GetMapping(path = "/getbills")
    ResponseEntity<List<Bill>> getAllBills();

    @GetMapping("/getpdf")
    ResponseEntity<byte[]> getPDF(@RequestBody Map<String, Object> reqeustMap);

    @DeleteMapping(path = "/delete/{id}")
    ResponseEntity<String> deletebill(@PathVariable Integer id);


}
