package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class08576(
   float blockDelaySeconds,
   float disableCooldownScale,
   List<class08565> damageReductions,
   class08557 itemDamage,
   Optional<class03530<class03689>> bypassedBy,
   Optional<class03556<class04891>> blockSound,
   Optional<class03556<class04891>> disableSound
) {
   public static final Codec<class08576> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(class08576::y),
            class06338.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(class08576::L),
            class08565.N.listOf().optionalFieldOf("damage_reductions", List.of(new class08565(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(class08576::u),
            class08557.N.optionalFieldOf("item_damage", class08557.L).forGetter(class08576::i),
            class03530.y(class04227.yN).optionalFieldOf("bypassed_by").forGetter(class08576::R),
            class04891.y.optionalFieldOf("block_sound").forGetter(class08576::M),
            class04891.y.optionalFieldOf("disabled_sound").forGetter(class08576::B)
         )
         .apply(var0, class08576::new)
   );
   public static final class02362<class04247, class08576> y = class02362.N(
      class02389.E,
      class08576::y,
      class02389.E,
      class08576::L,
      class08565.y.N_33(class02389.N()),
      class08576::u,
      class08557.y,
      class08576::i,
      class03530.L(class04227.yN).N_33(class02389::N),
      class08576::R,
      class04891.u.N_33(class02389::N),
      class08576::M,
      class04891.u.N_33(class02389::N),
      class08576::B,
      class08576::new
   );

   public float L() {
      return this.disableCooldownScale;
   }

   public Optional<class03556<class04891>> M() {
      return this.blockSound;
   }

   public class08576(
      float blockDelaySeconds,
      float disableCooldownScale,
      List<class08565> damageReductions,
      class08557 itemDamage,
      Optional<class03530<class03689>> bypassedBy,
      Optional<class03556<class04891>> blockSound,
      Optional<class03556<class04891>> disableSound
   ) {
      super();
      this.blockDelaySeconds = blockDelaySeconds;
      this.disableCooldownScale = disableCooldownScale;
      this.damageReductions = damageReductions;
      this.itemDamage = itemDamage;
      this.bypassedBy = bypassedBy;
      this.blockSound = blockSound;
      this.disableSound = disableSound;
   }

   public Optional<class03556<class04891>> B() {
      return this.disableSound;
   }

   public class08557 i() {
      return this.itemDamage;
   }

   public List<class08565> u() {
      return this.damageReductions;
   }

   public float y() {
      return this.blockDelaySeconds;
   }

   public float N(class07072 var1, float var2, double var3) {
      float f = 0.0F;

      for (class08565 class08565 : this.damageReductions) {
         f += class08565.N(var1, var2, var3);
      }

      return class04995.N(f, 0.0F, var2);
   }

   public int N() {
      return Math.round(this.blockDelaySeconds * 20.0F);
   }

   private int N(float var1) {
      float f = var1 * this.disableCooldownScale;
      return f > 0.0F ? Math.round(f * 20.0F) : 0;
   }

   public void N(class04782 var1, class07438 var2, float var3, class06584 var4) {
      int i = this.N(var3);
      if (i > 0) {
         if (var2 instanceof class08036) {
            ((class08036)var2).method_7357().N(var4, i);
         }

         var2.method_6021();
         this.disableSound
            .ifPresent(
               var2x -> var1.method_60511(
                  null,
                  var2.method_23317(),
                  var2.method_23318(),
                  var2.method_23321(),
                  (class03556<class04891>)var2x,
                  var2.method_5634(),
                  0.8F,
                  0.8F + var1.field_9229.z() * 0.4F
               )
            );
      }
   }

   public void N(class07299 var1, class06584 var2, class07438 var3, class07050 var4, float var5) {
      if (var3 instanceof class08036 class08036) {
         if (!var1.method_8608()) {
            class08036.method_7259(class01235.L.y(var2.B()));
         }

         int i = this.itemDamage.N(var5);
         if (i > 0) {
            var2.N(i, var3, var4.N());
         }
      }
   }

   public void N(class04782 var1, class07438 var2) {
      this.blockSound
         .ifPresent(
            var2x -> var1.method_60511(
               null,
               var2.method_23317(),
               var2.method_23318(),
               var2.method_23321(),
               (class03556<class04891>)var2x,
               var2.method_5634(),
               1.0F,
               0.8F + var1.field_9229.z() * 0.4F
            )
         );
   }

   public Optional<class03530<class03689>> R() {
      return this.bypassedBy;
   }
}
