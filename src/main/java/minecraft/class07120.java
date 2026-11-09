package minecraft;

import com.google.common.hash.HashCode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

class class07120 implements class04476 {
   private final String y;
   private final class07096 L;
   private final class07097 u;
   private final AtomicInteger i = new AtomicInteger();
   private volatile boolean R;

   class07120(String var1, String var2, class07096 var3) {
      super();
      this.y = var1;
      this.L = var3;
      this.u = new class07097(var2);
   }

   public class07129 N() {
      this.R = true;
      return new class07129(this.y, this.u.N(), this.i.get());
   }

   private boolean N(Path var1, HashCode var2) {
      return !Objects.equals(this.L.N(var1), var2) || !Files.exists(var1);
   }

   @Override
   public void method_43346(Path var1, byte[] var2, HashCode var3) throws IOException {
      if (this.R) {
         throw new IllegalStateException("Cannot write to cache as it has already been closed");
      } else {
         if (this.N(var1, var3)) {
            this.i.incrementAndGet();
            Files.createDirectories(var1.getParent());
            Files.write(var1, var2);
         }

         this.u.N(var1, var3);
      }
   }
}
