package minecraft;

import io.netty.buffer.ByteBuf;

public record class00285(int id, boolean includeData) implements class00381<class08051> {
   public static final class02362<ByteBuf, class00285> N = class02362.N(class02389.B, class00285::N, class02389.y, class00285::y, class00285::new);

   public class00285(int id, boolean includeData) {
      super();
      this.id = id;
      this.includeData = includeData;
   }

   public boolean y() {
      return this.includeData;
   }

   public void method_65081(class08051 var1) {
      var1.method_12084(this);
   }

   public int N() {
      return this.id;
   }

   @Override
   public class02897<class00285> method_65080() {
      return class04248.yx;
   }
}
