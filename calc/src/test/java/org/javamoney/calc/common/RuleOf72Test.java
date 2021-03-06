/*
 * Copyright (c) 2012, 2018, Werner Keil, Anatole Tresch and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Contributors: @atsticks, @keilw
 */
package org.javamoney.calc.common;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by atsticks on 27.05.16.
 *
 * @link http ://www.financeformulas.net/Rule_of_72.html
 */
public class RuleOf72Test {

    /**
     * Calculate positive.
     *
     * @throws Exception the exception
     */
    @Test
    public void calculate_POSITIVE() throws Exception {
        assertEquals(BigDecimal.valueOf(9.411764705882353), RuleOf72.calculate(Rate.of(0.0765)));
    }

    /**
     * Calculate negative.
     *
     * @throws Exception the exception
     */
    @Test
    public void calculate_NEGATIVE() throws Exception {
        assertEquals(BigDecimal.valueOf(-9.411764705882353), RuleOf72.calculate(Rate.of(-0.0765)));
    }
}