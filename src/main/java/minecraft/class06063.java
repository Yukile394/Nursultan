package minecraft;

import com.mojang.serialization.Codec;

public record class06063(int offset) implements class06055 {
   public static final Codec<class06063> u = Codec.intRange(class07376.i, class07376.u).fieldOf("below_top").xmap(class06063::new, class06063::L).codec();

   public int L() {
      return this.offset;
   }

   public class06063(int offset) {
      this.offset = offset;
   }

   @Override
   public String toString() {
      return this.offset + " below top";
   }

   @Override
   public int N(class06057 var1) {
      return var1.R() - 1 + var1.i() - this.offset;
   }
}
