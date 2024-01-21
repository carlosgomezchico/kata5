import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyCalculatorController {

    private final MoneyCalculatorAdapter adapter = new MoneyCalculatorAdapter();

    @GetMapping("/calculate")
    public ResponseEntity<String> calculate(@RequestParam String data) {
        String result = adapter.adaptarYCalcular(data);
        return ResponseEntity.ok(result);
    }
}
