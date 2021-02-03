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
package ai.certifai.basic.ex6;

import ai.certifai.util.InputParser;
import ai.certifai.util.OutputParser;
import java.util.*;

/**
 * Data Types
 *
 * @author codenamewei
 */
public class DataTypes
{
    static OutputParser out;
    static InputParser in;

    public static void main(String[] args)
    {
        in = new InputParser(DataTypes.class);
        out = new OutputParser(DataTypes.class, in);

        //Method 1: define manually
        /*String data1 = "Nasi Lemak!";
        int data2 = 20;
        float data3 = 100.054f;
        boolean data4 = true;

        out.evaluate(data1);
        out.evaluate(data2);
        out.evaluate(data3);
        out.evaluate(data4);
        out.printResult();*/

        //Method 2: Using an arrayList
        ArrayList test = new ArrayList();
        test.add("Nasi Lemak!");
        test.add(20);
        test.add(100.054f);
        test.add(true);
        //2.1: Traversing using a for loop
        for(int i = 0; i <test.size(); i++){
            out.evaluate(test.get(i));
        }
        //2.2: Traversing using an iterator
        Iterator iterator = test.iterator();
        while(iterator.hasNext()){
            out.evaluate(iterator.next());
        }
        //2.3: Traversing using a list iterator
        ListIterator iterator1 = test.listIterator();
        while(iterator1.hasNext()){
            out.evaluate(iterator1.next());
        }

        out.printResult();
    }
}
