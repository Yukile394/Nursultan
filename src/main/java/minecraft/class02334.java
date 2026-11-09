package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record class02334(class07209 min, class07209 max) implements Iterable<class07209> {
   public static final class02362<ByteBuf, class02334> N = new class02360();

   public boolean L(class07209 var1) {
      return var1.method_10263() >= this.min.method_10263()
         && var1.method_10264() >= this.min.method_10264()
         && var1.method_10260() >= this.min.method_10260()
         && var1.method_10263() <= this.max.method_10263()
         && var1.method_10264() <= this.max.method_10264()
         && var1.method_10260() <= this.max.method_10260();
   }

   public int L() {
      return this.max.method_10263() - this.min.method_10263() + 1;
   }

   public class07209 M() {
      return this.max;
   }

   public class02334(class07209 min, class07209 max) {
      super();
      this.min = class07209.method_58249(min, max);
      this.max = class07209.method_58250(min, max);
   }

   @Override
   public Iterator<class07209> iterator() {
      return class07209.method_10097(this.min, this.max).iterator();
   }

   public int i() {
      return this.max.method_10260() - this.min.method_10260() + 1;
   }

   public int u() {
      return this.max.method_10264() - this.min.method_10264() + 1;
   }

   public class02334 y(class07211 var1, int var2) {
      return var2 == 0 ? this : new class02334(this.min.method_10079(var1, var2), this.max.method_10079(var1, var2));
   }

   public class00734 y() {
      return class00734.N(this.min, this.max);
   }

   public class02334 y(class07209 var1) {
      return new class02334(class07209.method_58249(this.min, var1), class07209.method_58250(this.max, var1));
   }

   public class02334 N(class07211 var1, int var2) {
      if (var2 == 0) {
         return this;
      } else {
         return var1.i() == class07212.field_11056
            ? N(this.min, class07209.method_58250(this.min, this.max.method_10079(var1, var2)))
            : N(class07209.method_58249(this.min.method_10079(var1, var2), this.max), this.max);
      }
   }

   public static class02334 N(class07209 var0) {
      return new class02334(var0, var0);
   }

   public boolean N() {
      return this.min.equals(this.max);
   }

   public static class02334 N(class07209 var0, class07209 var1) {
      return new class02334(var0, var1);
   }

   public class02334 N(class00753 var1) {
      return new class02334(this.min.method_10081(var1), this.max.method_10081(var1));
   }

   public class07209 R() {
      return this.min;
   }
}
