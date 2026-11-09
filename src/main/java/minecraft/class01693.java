package minecraft;

import com.google.common.base.Stopwatch;
import java.io.File;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class class01693 implements class05485 {
   private final Document N;
   private final Element y;
   private final Stopwatch L;
   private final File u;

   public class01693(File var1) throws ParserConfigurationException {
      super();
      this.u = var1;
      this.N = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
      this.y = this.N.createElement("testsuite");
      Element element = this.N.createElement("testsuite");
      element.appendChild(this.y);
      this.N.appendChild(element);
      this.y.setAttribute("timestamp", DateTimeFormatter.ISO_INSTANT.format(Instant.now()));
      this.L = Stopwatch.createStarted();
   }

   @Override
   public void y(class05513 var1) {
      String s = var1.y().toString();
      this.N(var1, s);
   }

   public void N(File var1) throws TransformerException {
      Transformer transformer = TransformerFactory.newInstance().newTransformer();
      DOMSource domsource = new DOMSource(this.N);
      StreamResult streamresult = new StreamResult(var1);
      transformer.transform(domsource, streamresult);
   }

   @Override
   public void N() {
      this.L.stop();
      this.y.setAttribute("time", String.valueOf(this.L.elapsed(TimeUnit.MILLISECONDS) / 1000.0));

      try {
         this.N(this.u);
      } catch (TransformerException transformerexception) {
         throw new Error("Couldn't save test report", transformerexception);
      }
   }

   private Element N(class05513 var1, String var2) {
      Element element = this.N.createElement("testcase");
      element.setAttribute("name", var2);
      element.setAttribute("classname", var1.v().toString());
      element.setAttribute("time", String.valueOf(var1.E() / 1000.0));
      this.y.appendChild(element);
      return element;
   }

   @Override
   public void N(class05513 var1) {
      String s = var1.y().toString();
      String s1 = var1.m().getMessage();
      Element element = this.N.createElement(var1.b() ? "failure" : "skipped");
      element.setAttribute("message", "(" + var1.L().method_23854() + ") " + s1);
      this.N(var1, s).appendChild(element);
   }
}
