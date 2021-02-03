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
package ai.certifai.intermediate.ex13;

import ai.certifai.util.InputParser;
import ai.certifai.util.OutputParser;

/**
 * SubString
 *
 * @author codenamewei
 */
public class SubString
{
    static OutputParser out;
    static InputParser in;

    static final String FAIL_MESSAGE = "It's not a file!";

    public static void main(String[] args)
    {
        in = new InputParser(SubString.class);
        out = new OutputParser(SubString.class, in);

        int totalUseCases = in.getTotalUseCases();

        for(int i = 0; i < totalUseCases; ++i)
        {
            String input = in.getStringInput();

            out.evaluate(getExtensionIfExist(input));
        }

        out.printResult();
    }

    private static String getExtensionIfExist(String input) {
        /*ASSUMPTIONS:
        * 1) There must be at least five characters in a filename i.e. "a.jpg".
        * 2) Even if the last 4th character is a ".", it may still not be a filename.
        * */
        int len = input.length(); //length of input string

        if(len < 5)
            return "It's not a file!";
        else {
            if(input.substring(len-4 , len-3).equals(".")) {
                //check if the remaining 3 characters in the input string are letters
                String subCheck = input.substring(len-3);
                boolean check = true;

                for(int i = 0; i < subCheck.length(); i++) {
                    if(!Character.isLetter(subCheck.charAt(i)))
                        check = false;
                }

                if(check)
                    return subCheck;
                else
                    return "It's not a file!";
            }
            else
                return "It's not a file!";
        }
    }

}
