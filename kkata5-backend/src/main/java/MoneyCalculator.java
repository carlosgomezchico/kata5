import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MoneyCalculator {
    private  final MoneyCalculatorAdapter adapter= new MoneyCalculatorAdapter();

    @GetMapping("/calculate")
    public ResponseEntity<String> calculate(@RequestParam String data){
        String result = adapter.calculate(data);
        return  ResponseEntity.ok(result);
    }

}
