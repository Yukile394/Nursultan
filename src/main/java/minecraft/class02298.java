package minecraft;

import io.netty.buffer.ByteBuf;

public record class02298(String namespace, String id, String version) {
   public static final class02362<ByteBuf, class02298> N = class02362.N(
      class02389.s, class02298::y, class02389.s, class02298::L, class02389.s, class02298::u, class02298::new
   );
   public static final String y = "minecraft";

   public String L() {
      return this.id;
   }

   public class02298(String namespace, String id, String version) {
      this.namespace = namespace;
      this.id = id;
      this.version = version;
   }

   @Override
   public String toString() {
      return this.namespace + ":" + this.id + ":" + this.version;
   }

   public String u() {
      return this.version;
   }

   public String y() {
      return this.namespace;
   }

   public boolean N() {
      return this.namespace.equals("minecraft");
   }

   public static class02298 N(String var0) {
      return new class02298("minecraft", var0, class07529.y().comp_4024());
   }
}
