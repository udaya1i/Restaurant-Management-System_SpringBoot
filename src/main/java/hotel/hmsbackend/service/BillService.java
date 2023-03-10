package hotel.hmsbackend.service;

import hotel.hmsbackend.pojo.Bill;
import org.springframework.http.ResponseEntity;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

public interface BillService {
    ResponseEntity<String> generateReport(Map<String, Object> requestMap);
    ResponseEntity<List<Bill>> getAllBills();

    ResponseEntity<byte[]> getBillPdf(Map<String, Object> requestMap);
    ResponseEntity<String> deletebill(Integer id);

}
