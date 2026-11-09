package minecraft;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class class05118 extends class05134<class05118> {
   private final String L;

   public class05118(String var1, String var2, int var3, int var4) {
      super(var1, var3, var4);
      this.L = var2;
   }

   public class05118 i() {
      try {
         if (this.L != null) {
            this.N.setRequestProperty("Content-Type", "application/json; charset=utf-8");
         }

         this.N.setDoInput(true);
         this.N.setDoOutput(true);
         this.N.setUseCaches(false);
         this.N.setRequestMethod("POST");
         OutputStream outputstream = this.N.getOutputStream();
         OutputStreamWriter outputstreamwriter = new OutputStreamWriter(outputstream, StandardCharsets.UTF_8);
         outputstreamwriter.write(this.L);
         outputstreamwriter.close();
         outputstream.flush();
         return this;
      } catch (Exception exception) {
         throw new class05121(exception.getMessage(), exception);
      }
   }
}
