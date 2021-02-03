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
package ai.certifai.basic.ex7;

import ai.certifai.util.InputParser;
import ai.certifai.util.OutputParser;

/**
 * For Loop
 *
 * @author codenamewei
 */
public class ForLoop
{
    static OutputParser out;
    static InputParser in;

    public static void main(String[] args)
    {
        in = new InputParser(ForLoop.class);
        out = new OutputParser(ForLoop.class, in);

        int totalUseCases = in.getTotalUseCases();
        //System.out.println(totalUseCases);

        //Method 1: Using a for loop
        for(int i = 0; i < totalUseCases; ++i)
        {
            int linesPerUseCase = in.getCurrentUseCaseTotalLines(); //defines how many lines per use case

            for(int j = 0; j < linesPerUseCase; j++){
                String input = in.getStringInput();
                out.evaluate(input);
            }

        }

        //Method 2: Using a while loop
//        while(totalUseCases != 0){
//            int linesPerUseCase = in.getCurrentUseCaseTotalLines();
//
//            while(linesPerUseCase != 0){
//                String input = in.getStringInput();
//                out.evaluate(input);
//
//                linesPerUseCase--;
//            }
//
//            totalUseCases--;
//        }

        out.printResult();
    }
}