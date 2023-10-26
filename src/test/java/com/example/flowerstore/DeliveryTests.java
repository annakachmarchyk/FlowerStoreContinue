package com.example.flowerstore;

import com.example.flowerstore.delivery.DHLDeliveryStrategy;
import com.example.flowerstore.delivery.PostDeliveryStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTests {
    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlDelivery = new DHLDeliveryStrategy();
        String result = dhlDelivery.delivery();
        assertEquals("DHL delivery", result);
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDelivery = new PostDeliveryStrategy();
        String result = postDelivery.delivery();
        assertEquals("Post delivery", result);
    }
}
