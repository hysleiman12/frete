package br.com.devh12.frete.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingServices {

    public double shipment(Order order ){

        double value;
        if(order.getBasic() <= 100){
         value   = (order.getBasic() - (order.getBasic() * (order.getDiscount() / 100))) + 20;

        } else if (order.getBasic() > 100 && order.getBasic() <= 200) {

            value = (order.getBasic() - (order.getBasic() * (order.getDiscount() / 100))) + 12;
        }else{
            value = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));

        }
        return value;

    }
}
