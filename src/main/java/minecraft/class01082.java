package minecraft;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Supplier;

class class01082 extends FilterInputStream {
   private final Supplier<String> N;
   private boolean y;

   public class01082(InputStream var1, class01894 var2, String var3) {
      super(var1);
      Exception exception = new Exception("Stacktrace");
      this.N = () -> {
         StringWriter stringwriter = new StringWriter();
         exception.printStackTrace(new PrintWriter(stringwriter));
         return "Leaked resource: '" + var2 + "' loaded from pack: '" + var3 + "'\n" + stringwriter;
      };
   }

   @Override
   protected void finalize() throws Throwable {
      if (!this.y) {
         class01066.N.warn("{}", this.N.get());
      }

      super.finalize();
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.y = true;
   }
}
