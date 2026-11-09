package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;

public class class00030 extends class00453 {
   public static final class03530<class04748> N = class04398.E;
   public static final class03556<class02195> y = class00831.Z;
   public static final byte L = 2;
   public static final int u = 50;
   public static final boolean i = true;
   public static final MapCodec<class00030> R = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class03530.N(class04227.yj).optionalFieldOf("destination", N).forGetter(var0x -> var0x.B),
               class02195.y.optionalFieldOf("decoration", y).forGetter(var0x -> var0x.Z),
               Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter(var0x -> var0x.z),
               Codec.INT.optionalFieldOf("search_radius", 50).forGetter(var0x -> var0x.U),
               Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter(var0x -> var0x.E)
            )
         )
         .apply(var0, class00030::new)
   );
   private final class03530<class04748> B;
   private final class03556<class02195> Z;
   private final byte z;
   private final int U;
   private final boolean E;

   public static class00015 L() {
      return new class00015();
   }

   class00030(List<class05957> var1, class03530<class04748> var2, class03556<class02195> var3, byte var4, int var5, boolean var6) {
      super(var1);
      this.B = var2;
      this.Z = var3;
      this.z = var4;
      this.U = var5;
      this.E = var6;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.B);
   }

   @Override
   public class05959<class00030> N() {
      return class07439.T;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (!var1.N(class06570.Gt)) {
         return var1;
      } else {
         class06889 class06889 = var2.L(class06551.B);
         if (class06889 != null) {
            class04782 class04782 = var2.u();
            class07209 class07209 = class04782.method_8487(this.B, class07209.method_49638(class06889), this.U, this.E);
            if (class07209 != null) {
               class06584 class06584 = class06548.N(class04782, class07209.method_10263(), class07209.method_10260(), this.z, true, true);
               class06548.N(class04782, class06584);
               class07769.N(class06584, class07209, "+", this.Z);
               return class06584;
            }
         }

         return var1;
      }
   }
}
