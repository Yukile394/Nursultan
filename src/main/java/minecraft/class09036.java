package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class09036(class01894 id, Optional<class07709> payload) implements class00381<class01652> {
   private static final class02362<ByteBuf, Optional<class07709>> u = class02389.N_35(() -> new class07726(32768L, 16)).N_33(class02389.u(65536));
   public static final class02362<ByteBuf, class09036> N = class02362.N(class01894.y, class09036::N, u, class09036::y, class09036::new);

   public class09036(class01894 id, Optional<class07709> payload) {
      this.id = id;
      this.payload = payload;
   }

   public Optional<class07709> y() {
      return this.payload;
   }

   public void method_65081(class01652 var1) {
      var1.method_71953(this);
   }

   public class01894 N() {
      return this.id;
   }

   @Override
   public class02897<class09036> method_65080() {
      return class02885.j;
   }
}
