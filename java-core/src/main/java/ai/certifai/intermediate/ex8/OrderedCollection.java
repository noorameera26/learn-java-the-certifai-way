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
package ai.certifai.intermediate.ex8;

import ai.certifai.util.Conversion;
import ai.certifai.util.InputParser;
import ai.certifai.util.OutputParser;

import java.util.*;
import java.lang.*;
//import java.util.Iterator;
//import java.util.List;

/**
 * List ArrayList
 *
 * @author codenamewei
 */
public class OrderedCollection
{
    static OutputParser out;
    static InputParser in;

    public static void main(String[] args)
    {
        in = new InputParser(OrderedCollection.class);
        out = new OutputParser(OrderedCollection.class, in);

        int totalUseCases = in.getTotalUseCases();

        for(int i = 0; i < totalUseCases; ++i) //for one line of input
        {
            String line = in.getStringInput();

            List<Integer> arrayInput = Conversion.StringToListInteger(line);

            iterate(arrayInput); //passes a copy of the reference of array arrayInput
        }

        out.printResult();
    }

    public static void iterate(List<Integer> array)
    {
        //A1: copying elements one by one
        ArrayList<Integer> array2 = new ArrayList<Integer>();
//        for(int elem: array){
//            array2.add(elem);
//        }
        //A2:
//        ArrayList<Integer> array2 = new ArrayList<Integer>(array);
//        array2 = array

        //Method 1: using a for loop
//        for(int i = 0; i < array.size(); i++){
//            out.evaluate(array.get(i));
//        }

        //Method 2: using a for each loop
//        for(int elem: array){
//            out.evaluate(elem);
//        }

        //Method 3: using an iterator
        Iterator<Integer> iterator = array.iterator();
        while(iterator.hasNext()){
            int elem = iterator.next();
            System.out.println(elem);
            out.evaluate(elem);
        }

        //Method 4: using a list iterator
        ListIterator<Integer> listIterator = array2.listIterator();
        System.out.println("Printing the list in array in reverse order:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
