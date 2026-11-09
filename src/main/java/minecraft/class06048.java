package minecraft;

import com.mojang.serialization.Codec;

public record class06048(int offset) implements class06055 {
   public static final Codec<class06048> u = Codec.intRange(class07376.i, class07376.u).fieldOf("above_bottom").xmap(class06048::new, class06048::L).codec();

   public int L() {
      return this.offset;
   }

   public class06048(int offset) {
      super();
      this.offset = offset;
   }

   @Override
   public String toString() {
      return this.offset + " above bottom";
   }

   @Override
   public int N(class06057 var1) {
      return var1.i() + this.offset;
   }
}
