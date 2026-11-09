package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class06513 {
   public static final Codec<class06513> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06584.u.fieldOf("icon").forGetter(class06513::L),
            class03748.N.fieldOf("title").forGetter(class06513::N),
            class03748.N.fieldOf("description").forGetter(class06513::y),
            class06953.N.optionalFieldOf("background").forGetter(class06513::u),
            class07296.field_47186.optionalFieldOf("frame", class07296.field_1254).forGetter(class06513::i),
            Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(class06513::B),
            Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(class06513::Z),
            Codec.BOOL.optionalFieldOf("hidden", false).forGetter(class06513::z)
         )
         .apply(var0, class06513::new)
   );
   public static final class02362<class04247, class06513> y = class02362.N_34(class06513::N, class06513::y);
   private final class00392 L;
   private final class00392 u;
   private final class06584 i;
   private final Optional<class06953> R;
   private final class07296 M;
   private final boolean B;
   private final boolean Z;
   private final boolean z;
   private float U;
   private float E;

   public class06584 L() {
      return this.i;
   }

   public float M() {
      return this.E;
   }

   public class06513(class06584 var1, class00392 var2, class00392 var3, Optional<class06953> var4, class07296 var5, boolean var6, boolean var7, boolean var8) {
      super();
      this.L = var2;
      this.u = var3;
      this.i = var1;
      this.R = var4;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = var8;
   }

   public boolean B() {
      return this.B;
   }

   public boolean Z() {
      return this.Z;
   }

   public class07296 i() {
      return this.M;
   }

   public boolean z() {
      return this.z;
   }

   public Optional<class06953> u() {
      return this.R;
   }

   private static class06513 y(class04247 var0) {
      class00392 class00392x = class03748.u.decode(var0);
      class00392 class00392x = class03748.u.decode(var0);
      class06584 class06584 = class06584.z.decode(var0);
      class07296 class07296 = var0.y(class07296.class);
      int ix = var0.readInt();
      Optional optional = (ix & 1) != 0 ? Optional.of(new class06953(var0.T())) : Optional.empty();
      boolean flag = (ix & 2) != 0;
      boolean flag1 = (ix & 4) != 0;
      class06513 class06513 = new class06513(class06584, class00392x, class00392x, optional, class07296, flag, false, flag1);
      class06513.N(var0.readFloat(), var0.readFloat());
      return class06513;
   }

   public class00392 y() {
      return this.u;
   }

   public class00392 N() {
      return this.L;
   }

   private void N(class04247 var1) {
      class03748.u.encode(var1, this.L);
      class03748.u.encode(var1, this.u);
      class06584.z.encode(var1, this.i);
      var1.N(this.M);
      byte b0 = 0;
      if (this.R.isPresent()) {
         b0 |= 1;
      }

      if (this.B) {
         b0 |= 2;
      }

      if (this.z) {
         b0 |= 4;
      }

      var1.writeInt(b0);
      this.R.map(class06957::N).ifPresent(var1::N);
      var1.writeFloat(this.U);
      var1.writeFloat(this.E);
   }

   public void N(float var1, float var2) {
      this.U = var1;
      this.E = var2;
   }

   public float R() {
      return this.U;
   }
}
