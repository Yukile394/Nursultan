package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;

public record class08209(
   float consumeSeconds, class06509 animation, class03556<class04891> sound, boolean hasConsumeParticles, List<class08200> onConsumeEffects
) {
   public static final float N = 1.6F;
   private static final int Z = 4;
   private static final float z = 0.21875F;
   public static final Codec<class08209> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(class08209::L),
            class06509.field_53764.optionalFieldOf("animation", class06509.field_8950).forGetter(class08209::u),
            class04891.y.optionalFieldOf("sound", class04909.EF).forGetter(class08209::i),
            Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(class08209::R),
            class08200.u.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(class08209::M)
         )
         .apply(var0, class08209::new)
   );
   public static final class02362<class04247, class08209> L = class02362.N(
      class02389.E,
      class08209::L,
      class06509.field_53765,
      class08209::u,
      class04891.u,
      class08209::i,
      class02389.y,
      class08209::R,
      class08200.i.N_33(class02389.N()),
      class08209::M,
      class08209::new
   );

   public float L() {
      return this.consumeSeconds;
   }

   public List<class08200> M() {
      return this.onConsumeEffects;
   }

   public class08209(float consumeSeconds, class06509 animation, class03556<class04891> sound, boolean hasConsumeParticles, List<class08200> onConsumeEffects) {
      super();
      this.consumeSeconds = consumeSeconds;
      this.animation = animation;
      this.sound = sound;
      this.hasConsumeParticles = hasConsumeParticles;
      this.onConsumeEffects = onConsumeEffects;
   }

   public class03556<class04891> i() {
      return this.sound;
   }

   public class06509 u() {
      return this.animation;
   }

   public static class08241 y() {
      return new class08241();
   }

   private class07041 N(class07041 var1, class06584 var2, LocalRef var3) {
      return this.N(var1, var2, (class06584)var3.get());
   }

   public class07082 N(class07438 var1, class06584 var2, class07050 var3) {
      if (!this.N(var1, var2)) {
         return class07082.u;
      } else if (this.N() > 0) {
         var1.method_6019(var3);
         return class07082.L;
      } else {
         class06584 class06584 = this.N(var1.method_73183(), var1, var2);
         class07041 class07041x = class07082.L;
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var2);
         class07041 class07041x = this.N(class07041x, class06584, localrefimpl);
         var2 = (class06584)localrefimpl.dispose();
         return class07041x;
      }
   }

   private class07041 N(class07041 var1, class06584 var2, class06584 var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5) && var3.N(class06570.jT)
         ? var1.N(var3.R() ? new class06584(class06570.jU) : var3)
         : var1.N(var2);
   }

   public void N(class06069 var1, class07438 var2, class06584 var3, int var4) {
      float f = var1.Z() ? 0.5F : 1.0F;
      float f1 = var1.N(1.0F, 0.2F);
      float f2 = 0.5F;
      float f3 = class04995.y(var1, 0.9F, 1.0F);
      float f4 = this.animation == class06509.field_8946 ? 0.5F : f;
      float f5 = this.animation == class06509.field_8946 ? f3 : f1;
      if (this.hasConsumeParticles) {
         var2.method_6037(var3, var4);
      }

      class04891 class04891 = var2 instanceof class08207 ? ((class08207)var2).N(var3) : this.sound.N();
      var2.method_5783(class04891, f4, f5);
   }

   public int N() {
      return (int)(this.consumeSeconds * 20.0F);
   }

   public class06584 N(class07299 var1, class07438 var2, class06584 var3) {
      class06069 class06069 = var2.method_59922();
      this.N(class06069, var2, var3, 16);
      if (var2 instanceof class04770 class04770) {
         class04770.method_7259(class01235.L.y(var3.B()));
         class06912.k.N(class04770, var3);
      }

      var3.N(class08237.class).forEach(var4x -> var4x.N(var1, var2, var3, this));
      if (!var1.method_8608()) {
         this.onConsumeEffects.forEach(var3x -> var3x.N(var1, var3, var2));
      }

      var2.method_32876(this.animation == class06509.field_8946 ? class01194.E : class01194.W);
      var3.N(1, var2);
      return var3;
   }

   public boolean N(class07438 var1, class06584 var2) {
      class05349 class05349 = var2.method_58694(class02484.d);
      return class05349 != null && var1 instanceof class08036 ? ((class08036)var1).method_7332(class05349.L()) : true;
   }

   public boolean N(int var1) {
      int i = this.N() - var1;
      int j = (int)(this.N() * 0.21875F);
      return i > j && var1 % 4 == 0;
   }

   public boolean R() {
      return this.hasConsumeParticles;
   }
}
