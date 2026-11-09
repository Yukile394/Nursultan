package minecraft;

import java.io.PrintWriter;
import java.io.StringWriter;

class class03438 {
   private final Throwable N;

   class03438(Throwable var1) {
      super();
      this.N = var1;
   }

   public void N(class07074 var1) {
      var1.N("Recovery", "Yes");
      var1.N("Recovery reason", () -> {
         StringWriter stringwriter = new StringWriter();
         this.N.printStackTrace(new PrintWriter(stringwriter));
         return stringwriter.toString();
      });
   }
}
