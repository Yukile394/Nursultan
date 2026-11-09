package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08106(class01894 texture, class08973 pose) implements class00335 {
   public static final MapCodec<class08106> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("texture").forGetter(class08106::y), class08973.field_61419.fieldOf("pose").forGetter(class08106::L))
         .apply(var0, class08106::new)
   );

   public class08973 L() {
      return this.pose;
   }

   public class08106(class02774 var1, class08973 var2) {
      this(class08971.N(var1).i(), var2);
   }

   public class08106(class01894 texture, class08973 pose) {
      super();
      this.texture = texture;
      this.pose = pose;
   }

   public class01894 y() {
      return this.texture;
   }

   private static class01134 N(class08973 var0) {
      return switch (var0) {
         case field_61414 -> class04802.Nm;
         case field_61415 -> class04802.NT;
         case field_61417 -> class04802.Nb;
         case field_61416 -> class04802.Ns;
      };
   }

   @Override
   public MapCodec<class08106> N() {
      return N;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      class07914 class07914 = new class07914(var1.y().N(N(this.pose)));
      return new class08136(class07914, this.texture);
   }
}
