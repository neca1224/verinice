//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.02 at 03:58:03 PM MEZ 
//


package sernet.verinice.model.auth;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sernet.verinice.model.auth package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sernet.verinice.model.auth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Userprofiles }
     * 
     */
    public Userprofiles createUserprofiles() {
        return new Userprofiles();
    }

    /**
     * Create an instance of {@link Userprofile }
     * 
     */
    public Userprofile createUserprofile() {
        return new Userprofile();
    }

    /**
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }

    /**
     * Create an instance of {@link Profiles }
     * 
     */
    public Profiles createProfiles() {
        return new Profiles();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

}