package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class05265 {
   public static final class03372 N = class03372.N;
   public static final Codec<class05265> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class05261.L.fieldOf("input_predicate").forGetter(var0x -> var0x.L),
            class05261.L.fieldOf("location_predicate").forGetter(var0x -> var0x.u),
            class05318.L.lenientOptionalFieldOf("position_predicate", class05329.y).forGetter(var0x -> var0x.i),
            class00500.N.fieldOf("output_state").forGetter(var0x -> var0x.R),
            class03336.L.lenientOptionalFieldOf("block_entity_modifier", N).forGetter(var0x -> var0x.M)
         )
         .apply(var0, class05265::new)
   );
   private final class05261 L;
   private final class05261 u;
   private final class05318 i;
   private final class00500 R;
   private final class03336 M;

   public class05265(class05261 var1, class05261 var2, class05318 var3, class00500 var4, class03336 var5) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
   }

   public class05265(class05261 var1, class05261 var2, class05318 var3, class00500 var4) {
      this(var1, var2, var3, var4, N);
   }

   public class05265(class05261 var1, class05261 var2, class00500 var3) {
      this(var1, var2, class05329.y, var3);
   }

   public boolean N(class00500 var1, class00500 var2, class07209 var3, class07209 var4, class07209 var5, class06069 var6) {
      return this.L.N(var1, var6) && this.u.N(var2, var6) && this.i.N(var3, var4, var5, var6);
   }

   public class00500 N() {
      return this.R;
   }

   @Nullable
   public class07001 N(class06069 var1, @Nullable class07001 var2) {
      return this.M.N(var1, var2);
   }
}
