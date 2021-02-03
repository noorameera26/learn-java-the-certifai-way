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
package ai.certifai.basic.ex3;

import ai.certifai.util.InputParser;
import ai.certifai.util.OutputParser;

import java.sql.SQLOutput;

/**
 * Introduction to one of the most important concept in Java - class
 *
 * @author codenamewei
 */
class PersonalProfile
{
    private String name;
    private int height;
    private int weight;

    //constructor chaining
    public PersonalProfile() {
        this("Default name", 0, 0);
    }

    public PersonalProfile(String myName) {
        this(myName, 0, 0);
    }

    public PersonalProfile(String myName, int myHeight) {
        this(myName, myHeight, 0);
    }

    public PersonalProfile(String myName, int myHeight, int myWeight) {
        this.name = myName;
        this.height = myHeight;
        this.weight = myWeight;
    }

    public String getName(){
        return this.name;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWeight(){
        return this.weight;
    }

    public void printProfile(){
        System.out.println("Name: " + this.name);
        System.out.println("Height: " + this.height + " cm");
        System.out.println("Weight: " + this.weight + " kg");
    }

}


public class BluePrint
{
    public static void main(String[] args)
    {
        InputParser in = new InputParser(BluePrint.class);
        OutputParser out = new OutputParser(BluePrint.class, in);

        PersonalProfile johnProfile = new PersonalProfile("John Doe", 165, 100);
        out.evaluate("Name: " + johnProfile.getName());
        out.evaluate("Height: " + johnProfile.getHeight());
        out.evaluate("Width: " + johnProfile.getWeight());
        out.printResult();

        PersonalProfile test1 = new PersonalProfile("Noor Ameera Anas");
        test1.printProfile();
        PersonalProfile test2 = new PersonalProfile("Noor Ameera Anas", 155);
        test2.printProfile();
        PersonalProfile test3 = new PersonalProfile("Noor Ameera Anas", 155, 48);
        test3.printProfile();
        PersonalProfile test4 = new PersonalProfile();
        test4.printProfile();
    }
}
