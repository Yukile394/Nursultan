package minecraft;

import com.mojang.serialization.Codec;

public record class06046(int y) implements class06055 {
   public static final Codec<class06046> u = Codec.intRange(class07376.i, class07376.u).fieldOf("absolute").xmap(class06046::new, class06046::L).codec();

   public int L() {
      return this.y;
   }

   public class06046(int y) {
      super();
      this.y = y;
   }

   @Override
   public String toString() {
      return this.y + " absolute";
   }

   @Override
   public int N(class06057 var1) {
      return this.y;
   }
}
