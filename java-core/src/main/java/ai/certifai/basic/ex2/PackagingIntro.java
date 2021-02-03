/*
 * Copyright (c) 2020 CertifAI Sdn. Bhd.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package ai.certifai.basic.ex2;

import ai.certifai.util.OutputParser;
/**
 * A thorough definition about the idea of Package in java
 *
 * @author codenamewei
 */

public class PackagingIntro
{
    static OutputParser out; //instantiate an object of OutputParser

    public static void main(String[] args)
    {
        out = new OutputParser(PackagingIntro.class); //call the constructor

        PackagingIntro test = new PackagingIntro(); //instantiate an object of PackagingIntro
        String packageName = test.getClass().getCanonicalName();
        //String packageName = test.getClass().getName(); - An alternative, gives you the same output.

        /* Method functions:
         * getClass() : returns the runtime class of an object,
                       and automatically calls the toString() method when appended with a String
         * getCanonicalName(): returns the canonical name of the class into String
         */

        System.out.println("1. getCanonicalName: " + packageName);
        System.out.println("2. getClass only: " + test.getClass().toString());
        System.out.println("2. getClass only: " + test.getClass()); //bcus it overrides the toString() method
        System.out.println("2. getClass only: " + String.valueOf(test.getClass()));
        System.out.println("3. getName: " + test.getClass().getName());
        System.out.println("4. getSimpleName: " + test.getClass().getSimpleName());

        //output validation for results
        String output = "Package Name = " + packageName;
        out.evaluate(output);
        out.printResult();
    }
}
