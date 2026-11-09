package minecraft;

import io.netty.buffer.ByteBuf;

public record class06287(class07086 difficulty) implements class00381<class08051> {
   public static final class02362<ByteBuf, class06287> N = class02362.N(class07086.field_60664, class06287::N, class06287::new);

   public class06287(class07086 difficulty) {
      super();
      this.difficulty = difficulty;
   }

   public void method_65081(class08051 var1) {
      var1.method_19475(this);
   }

   public class07086 N() {
      return this.difficulty;
   }

   @Override
   public class02897<class06287> method_65080() {
      return class04248.yv;
   }
}
