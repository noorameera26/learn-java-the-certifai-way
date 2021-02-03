# QuickStart!

**What To Do**  
Pass string of `Hello World!` to the variable [_firstString_](https://github.com/CertifaiAI/learn-java-the-certifai-way/blob/master/java-core/src/main/java/ai/certifai/basic/ex1/HelloWorld.java#L38)
 

**Sample Output**  
`
Hello World!  
`  

**Key Takeaways**

<p align="center">
  <img src="metadata/publicClass.jpg">
</p> 

- Class name should be in the form of Noun, where each word first letter is of capital letter.  
  This naming convention is **CamelCase**.  
    - Example: 
        - HelloWorld
        - BluePrint
        - DataTypes
        - ExceptionHandling
        
- Non-static non-final name use **CamelCase** as well, with first word being small case.  

- There should be **one public class name per file**

- The class name must be same with file name for Java to recognize the entry point.  
There should be a **public** access modified before it.  
Else will throw a compile time error. (Try it :computer:)

- Contrary to Python, each line should end with semicolon.


**Quiz**  
1. Can more than 1 class appear in one .java file?  (Try it :computer:)
<br><br>Yes, you can more than one class in one .java file. However, you need to make sure that only one among
them is public.

2. What do you understand about the line [_package ai.certifai.basic.ex1;_](https://github.com/CertifaiAI/learn-java-the-certifai-way/blob/master/java-core/src/main/java/ai/certifai/basic/ex1/HelloWorld.java#L16)?
<br><br>The line simply provides the package(directory) in which the HelloWorld.java file is in.
Meanwhile, we use the "import" statement when we want to access classses that belong in certain package.
<br><br> Note that the package statement needs to be the first non-comment statement in a source file.