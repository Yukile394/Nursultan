package minecraft;

import java.net.URI;

final class class07531 extends class07533 {
   class07531(String var1, int var2, String var3) {
      super(var3);
   }

   @Override
   protected String[] y(URI var1) {
      return new String[]{"rundll32", "url.dll,FileProtocolHandler", var1.toString()};
   }
}
