package org.nicepop.domain;

/*
 * #%L
 * RecipeTest.java - Nicepop Domain Plugin - Popsuite - 2013 - Test7
 * %%
 * Copyright (C) 2013 - 2014 Popsuite. All rights reserved-4.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RecipeTest {

    private static final Product PRODUCT = new Product("PEPER"); 
    private static final double PRODUCT_INITIAL_QUANTITY = 10.0; 
    private static final double PRODUCT_MODIFIED_QUANTITY = 20.0; 
    
    @Test
    public void changeProductTest() {
        Map<Product, Double> products = new HashMap<>();
        products.put(PRODUCT, PRODUCT_INITIAL_QUANTITY);
        
        Recipe r = new Recipe(1, products);
        
        Map<Product, Double> ps = r.getProducts();
        ps.put(PRODUCT, PRODUCT_MODIFIED_QUANTITY);
        
        assertTrue(r.getProducts().get(PRODUCT).equals(PRODUCT_INITIAL_QUANTITY));
        
    }

    @Test 
    public void failingTest() {
        // FIXME
        assertTrue(false);
    }
}
