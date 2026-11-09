package minecraft;

import io.netty.buffer.ByteBuf;

public record class07258(class07086 difficulty, boolean locked) implements class00381<class07280> {
   public static final class02362<ByteBuf, class07258> N = class02362.N(class07086.field_60664, class07258::N, class02389.y, class07258::y, class07258::new);

   public class07258(class07086 difficulty, boolean locked) {
      super();
      this.difficulty = difficulty;
      this.locked = locked;
   }

   public boolean y() {
      return this.locked;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class07086 N() {
      return this.difficulty;
   }

   @Override
   public class02897<class07258> method_65080() {
      return class04248.E;
   }
}
