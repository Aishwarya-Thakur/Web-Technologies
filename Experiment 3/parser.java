package Parser;

import org.w3c.dom.*;

import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class parser {

public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
// TODO Auto-generated method stub



//Get Document Builder
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();

//Build Document
Document document = null;

document = builder.parse(new File("C:\\Users\\AISHWARYA THAKUR\\Desktop\\WT_Lab\\Exp_3\\WebContent\\WEB-INF\\user.xml"));
// TODO Auto-generated catch


//Normalize the XML Structure; It's just too important !!
document.getDocumentElement().normalize();

//Here comes the root node
Element root = document.getDocumentElement();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the User Id");
String id = br.readLine();
System.out.println(root.getNodeName());

//Get all employees
NodeList nList = document.getElementsByTagName("user");
System.out.println(root.getNodeName());
System.out.println("============================");

for (int temp = 0; temp < nList.getLength(); temp++)
{
Node node = nList.item(temp);
//System.out.println("");    //Just a separator
if (node.getNodeType() == Node.ELEMENT_NODE)
{
   //Print each employee's detail
   Element eElement = (Element) node;
   if(eElement.getAttribute("id").equals(id))
   {
   System.out.println("User id : "    + eElement.getAttribute("id"));
   System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
   System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
   System.out.println("address : "   + eElement.getElementsByTagName("address").item(0).getTextContent());
/*  System.out.println("Location : "    + eElement.getElementsByTagName("location").item(0).getTextContent());*/
   }
}
}
}

}
