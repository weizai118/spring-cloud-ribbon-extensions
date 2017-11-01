/**
 * Copyright (c) 2017 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.enadim.spring.cloud.ribbon.support;

import com.github.enadim.spring.cloud.ribbon.support.FavoriteZoneConfig.FavoriteZoneProperties;
import org.junit.Test;

import static org.junit.Assert.*;

public class FavoriteZonePropertiesTest {
    FavoriteZoneProperties properties = new FavoriteZoneProperties();

    @Test
    public void name() throws Exception {
        assertNull(properties.getName());
        properties.setName("name");
        assertEquals("name", properties.getName());
    }

    @Test
    public void enabled() throws Exception {
        assertTrue(properties.isEnabled());
        properties.setEnabled(false);
        assertFalse(properties.isEnabled());
    }

}