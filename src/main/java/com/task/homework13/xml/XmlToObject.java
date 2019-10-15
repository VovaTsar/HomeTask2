package com.task.homework13.xml;

import com.task.homework13.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlToObject {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\dropt\\Desktop\\parseJson.json");
            JAXBContext context = JAXBContext.newInstance(User.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            User user = (User) unmarshaller.unmarshal(file);
            System.out.println(user);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}
