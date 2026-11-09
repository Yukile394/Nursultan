package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05073 {
   public static final Codec<class05073> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("cold").forGetter(var0x -> var0x.y),
            Codec.FLOAT.fieldOf("mossiness").forGetter(var0x -> var0x.L),
            Codec.BOOL.fieldOf("air_pocket").forGetter(var0x -> var0x.u),
            Codec.BOOL.fieldOf("overgrown").forGetter(var0x -> var0x.i),
            Codec.BOOL.fieldOf("vines").forGetter(var0x -> var0x.R),
            Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(var0x -> var0x.M)
         )
         .apply(var0, class05073::new)
   );
   public boolean y;
   public float L;
   public boolean u;
   public boolean i;
   public boolean R;
   public boolean M;

   public class05073() {
      super();
   }

   public class05073(boolean var1, float var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
   }
}
