package com.cerecero.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;
    private Environment environment;

    @Autowired
    public  void  setMyFirstClass(@Qualifier("mySecondClass") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }
    public String tellAStory(){
        return  "The dependency is saying : " + myFirstClass.sayHello();
    }
    public String getJavaVersion(){
        return  environment.getProperty("java.version");
    }
    public String readProp(){
        return  environment.getProperty("my.custom.property");
    }
    public String getOSName(){
        return  environment.getProperty("os.name");
    }
    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
