package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public record class08174(
   int contactCooldownTicks,
   int delayTicks,
   Optional<class08169> dismountConditions,
   Optional<class08169> knockbackConditions,
   Optional<class08169> damageConditions,
   float forwardMovement,
   float damageMultiplier,
   Optional<class03556<class04891>> sound,
   Optional<class03556<class04891>> hitSound
) {
   public static final int N = 10;
   public static final Codec<class08174> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.T.optionalFieldOf("contact_cooldown_ticks", 10).forGetter(class08174::y),
            class06338.T.optionalFieldOf("delay_ticks", 0).forGetter(class08174::L),
            class08169.N.optionalFieldOf("dismount_conditions").forGetter(class08174::u),
            class08169.N.optionalFieldOf("knockback_conditions").forGetter(class08174::i),
            class08169.N.optionalFieldOf("damage_conditions").forGetter(class08174::R),
            Codec.FLOAT.optionalFieldOf("forward_movement", 0.0F).forGetter(class08174::M),
            Codec.FLOAT.optionalFieldOf("damage_multiplier", 1.0F).forGetter(class08174::B),
            class04891.y.optionalFieldOf("sound").forGetter(class08174::Z),
            class04891.y.optionalFieldOf("hit_sound").forGetter(class08174::z)
         )
         .apply(var0, class08174::new)
   );
   public static final class02362<class04247, class08174> L = class02362.N(
      class02389.B,
      class08174::y,
      class02389.B,
      class08174::L,
      class08169.y.N_33(class02389::N),
      class08174::u,
      class08169.y.N_33(class02389::N),
      class08174::i,
      class08169.y.N_33(class02389::N),
      class08174::R,
      class02389.E,
      class08174::M,
      class02389.E,
      class08174::B,
      class04891.u.N_33(class02389::N),
      class08174::Z,
      class04891.u.N_33(class02389::N),
      class08174::z,
      class08174::new
   );

   public int L() {
      return this.delayTicks;
   }

   public void L(class07049 var1) {
      this.hitSound.ifPresent(var1x -> var1.method_73183().method_55116(var1, var1x.N(), var1.method_5634(), 1.0F, 1.0F));
   }

   public float M() {
      return this.forwardMovement;
   }

   public class08174(
      int contactCooldownTicks,
      int delayTicks,
      Optional<class08169> dismountConditions,
      Optional<class08169> knockbackConditions,
      Optional<class08169> damageConditions,
      float forwardMovement,
      float damageMultiplier,
      Optional<class03556<class04891>> sound,
      Optional<class03556<class04891>> hitSound
   ) {
      this.contactCooldownTicks = contactCooldownTicks;
      this.delayTicks = delayTicks;
      this.dismountConditions = dismountConditions;
      this.knockbackConditions = knockbackConditions;
      this.damageConditions = damageConditions;
      this.forwardMovement = forwardMovement;
      this.damageMultiplier = damageMultiplier;
      this.sound = sound;
      this.hitSound = hitSound;
   }

   public float B() {
      return this.damageMultiplier;
   }

   public Optional<class03556<class04891>> Z() {
      return this.sound;
   }

   public Optional<class08169> i() {
      return this.knockbackConditions;
   }

   public Optional<class03556<class04891>> z() {
      return this.hitSound;
   }

   public Optional<class08169> u() {
      return this.dismountConditions;
   }

   public int y() {
      return this.contactCooldownTicks;
   }

   public void y(class07049 var1) {
      this.sound
         .ifPresent(
            var1x -> var1.method_73183()
               .method_60511(var1, var1.method_23317(), var1.method_23318(), var1.method_23321(), (class03556<class04891>)var1x, var1.method_5634(), 1.0F, 1.0F)
         );
   }

   public int N() {
      return this.delayTicks + this.damageConditions.<Integer>map(class08169::N).orElse(0);
   }

   public static class06889 N(class07049 var0) {
      if (!(var0 instanceof class08036) && var0.method_5765()) {
         var0 = var0.method_5668();
      }

      return var0.method_76333().L(20.0);
   }

   public void N(class06584 var1, int var2, class07438 var3, class07085 var4) {
      int i = var1.N(var3) - var2;
      if (i >= this.delayTicks) {
         i -= this.delayTicks;
         class06889 class06889 = var3.method_5720();
         double d0 = class06889.y(N(var3));
         float f = var3 instanceof class08036 ? 1.0F : 0.2F;
         class06543 class06543 = var3.method_76693();
         double d1 = var3.method_45326(class05298.u);
         boolean flag = false;
         Iterator iterator = ((Collection)class08038.N(var3, class06543, var1x -> class08172.N(var3, var1x), class05849.field_17558)
               .map(var0 -> List.of(), var0 -> var0))
            .iterator();

         while (iterator.hasNext()) {
            Object object = ((class06145)iterator.next()).L();
            if (object instanceof class00695 class00695) {
               object = class00695.N;
            }

            boolean flag4 = var3.method_75118((class07049)object, this.contactCooldownTicks);
            if (!flag4) {
               var3.method_75119((class07049)object);
               double d2 = class06889.y(N((class07049)object));
               double d3 = Math.max(0.0, d0 - d2);
               boolean flag1 = this.dismountConditions.isPresent() && this.dismountConditions.get().N(i, d0, d3, f);
               boolean flag2 = this.knockbackConditions.isPresent() && this.knockbackConditions.get().N(i, d0, d3, f);
               boolean flag3 = this.damageConditions.isPresent() && this.damageConditions.get().N(i, d0, d3, f);
               if (flag1 || flag2 || flag3) {
                  float f1 = (float)d1 + class04995.N(d3 * this.damageMultiplier);
                  flag |= var3.method_75123(var4, (class07049)object, f1, flag3, flag2, flag1);
               }
            }
         }

         if (flag) {
            var3.method_73183().method_8421(var3, (byte)2);
            if (var3 instanceof class04770 class04770) {
               class06912.o.N(class04770, var3.method_76444(var0 -> var0 instanceof class07438));
            }
         }
      }
   }

   public Optional<class08169> R() {
      return this.damageConditions;
   }
}
