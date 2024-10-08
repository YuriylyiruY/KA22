package web.service;

import java.util.List;

public interface ServiceAndDaoTogether {
    List<String> checkQuantity(Integer quantity, List<String> listCars1);
    List<String> getListCars1();

}
