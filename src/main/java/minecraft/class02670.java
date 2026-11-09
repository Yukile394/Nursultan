package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class02670 implements class06386 {
   public static final Codec<class02670> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01894.N.listOf().fieldOf("fossil_structures").forGetter(var0x -> var0x.y),
            class01894.N.listOf().fieldOf("overlay_structures").forGetter(var0x -> var0x.L),
            class05235.u.fieldOf("fossil_processors").forGetter(var0x -> var0x.u),
            class05235.u.fieldOf("overlay_processors").forGetter(var0x -> var0x.i),
            Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter(var0x -> var0x.M)
         )
         .apply(var0, class02670::new)
   );
   public final List<class01894> y;
   public final List<class01894> L;
   public final class03556<class05483> u;
   public final class03556<class05483> i;
   public final int M;

   public class02670(List<class01894> var1, List<class01894> var2, class03556<class05483> var3, class03556<class05483> var4, int var5) {
      super();
      if (var1.isEmpty()) {
         throw new IllegalArgumentException("Fossil structure lists need at least one entry");
      } else if (var1.size() != var2.size()) {
         throw new IllegalArgumentException("Fossil structure lists must be equal lengths");
      } else {
         this.y = var1;
         this.L = var2;
         this.u = var3;
         this.i = var4;
         this.M = var5;
      }
   }
}
