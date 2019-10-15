package com.task.homework13.xml;

import com.task.homework13.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

public class ObjectToXml {
    public static void main(String[] args) {
        User user = new User("Vova", "Ts", 20, Arrays.asList("OOP", "Collections", "MySQL", "Spring"));
        jaxbObjectToXML(user);
    }

    private static void jaxbObjectToXML(User user) {
        try {
            File file = new File("C:\\Users\\dropt\\Desktop\\parseJson.json");
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(user, file);
            jaxbMarshaller.marshal(user, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
