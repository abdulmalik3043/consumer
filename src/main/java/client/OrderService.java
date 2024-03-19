package client;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

import model.Order;

public interface OrderService {
    @GET("orders")
    Call<List<Order>> getOrders();
}
