package com.task.homework13.xml;

import com.task.homework13.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class WorkWithXml {
    private  static  final String FILE ="parserXml.xml";

    public static void objectToXml(User user) {
        try {
            File file = new File(FILE);
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(user, file);
            jaxbMarshaller.marshal(user, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void xmlToObj() {
        try {
            File file = new File(FILE);
            JAXBContext context = JAXBContext.newInstance(User.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            User user = (User) unmarshaller.unmarshal(file);
            System.out.println(user);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}
