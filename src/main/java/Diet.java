import java.time.LocalDate;
import static utils.DateUtils.getDateAsString;
import java.util.*;

public class Diet {
    private LocalDate localDate;
    private List<Product> productList;
    public void addProduct(Product product){
        if (localDate.isEqual(LocalDate.now())){
            productList.add(product);

        }
        else {
            System.out.println("Entered date is wrong. Please, select today's date.");
        }
    }

    public Diet(List<Product> productList, LocalDate localDate){
        this.localDate = localDate;
        this.productList = productList;
    }
}
