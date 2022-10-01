import java.time.LocalDate;
import static utils.DateUtils.getDateAsString;
import java.util.*;

public class Diet {
    LocalDate localDate;
    List<Product> productList;
    void addProduct(Product product){
        if (localDate.isEqual(LocalDate.now())){
            productList.add(product);
        }
    }

    public Diet(List<Product> productList, LocalDate localDate){
        this.localDate = localDate;
        this.productList = productList;
        System.out.println("For "+ getDateAsString(localDate, "yyyy-MM-dd") + " was eaten: ");
        for (Product pr: productList) {
            System.out.println(pr.getName() + pr.getWeight() + "gr");
        }
    }

}