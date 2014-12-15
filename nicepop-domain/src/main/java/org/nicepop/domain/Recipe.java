package org.nicepop.domain;

/*
 * #%L
 * Recipe.java - Nicepop Domain Plugin - Popsuite - 2013 - Test7
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

import java.util.HashMap;
import java.util.Map;

public class Recipe {
    
    private int version;
    private Map<Product, Double> products;

    public Recipe(int version, Map<Product, Double> products) {
        super();
        this.version = version;
        this.products = products;
    }

    public Map<Product, Double> getProducts() {
        return new HashMap<Product, Double>(products);
    }

    protected void setProducts(Map<Product, Double> products) {
        this.products = products;
    }

    public int getVersion() {
        return version;
    }

    protected void setVersion(int version) {
        this.version = version;
    }

}
