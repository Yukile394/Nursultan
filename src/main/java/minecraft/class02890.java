package minecraft;

import io.netty.buffer.ByteBuf;

public class class02890<B extends ByteBuf, L extends class00638> {
   private final class02396<B, class00381<? super L>, class02897<? extends class00381<? super L>>> N = class02381.N(class00381::method_65080);
   private final class00423 y;

   public class02890(class00423 var1) {
      super();
      this.y = var1;
   }

   public <T extends class00381<? super L>> class02890<B, L> N(class02897<T> var1, class02362<? super B, T> var2) {
      if (var1.N() != this.y) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + var1 + ", expected " + this.y.name());
      } else {
         this.N.N(var1, var2);
         return this;
      }
   }

   public class02362<B, class00381<? super L>> N() {
      return this.N.N();
   }
}
