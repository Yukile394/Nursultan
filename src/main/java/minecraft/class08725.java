package minecraft;

import Nursultan.class11647;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public record class08725(
   class07085 slot,
   class03556<class04891> equipSound,
   Optional<class05946<class11647>> assetId,
   Optional<class01894> cameraOverlay,
   Optional<class03543<class07078<?>>> allowedEntities,
   boolean dispensable,
   boolean swappable,
   boolean damageOnHurt,
   boolean equipOnInteract,
   boolean canBeSheared,
   class03556<class04891> shearingSound
) {
   public static final Codec<class08725> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07085.field_45739.fieldOf("slot").forGetter(class08725::y),
            class04891.y.optionalFieldOf("equip_sound", class04909.Nj).forGetter(class08725::L),
            class05946.N(class08699.N).optionalFieldOf("asset_id").forGetter(class08725::u),
            class01894.N.optionalFieldOf("camera_overlay").forGetter(class08725::i),
            class03541.N(class04227.I).optionalFieldOf("allowed_entities").forGetter(class08725::R),
            Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(class08725::M),
            Codec.BOOL.optionalFieldOf("swappable", true).forGetter(class08725::B),
            Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(class08725::Z),
            Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(class08725::z),
            Codec.BOOL.optionalFieldOf("can_be_sheared", false).forGetter(class08725::U),
            class04891.y.optionalFieldOf("shearing_sound", class04206.y.i(class04909.wd)).forGetter(class08725::E)
         )
         .apply(var0, class08725::new)
   );
   public static final class02362<class04247, class08725> y = class02362.N(
      class07085.field_54088,
      class08725::y,
      class04891.u,
      class08725::L,
      class05946.y(class08699.N).N_33(class02389::N),
      class08725::u,
      class01894.y.N_33(class02389::N),
      class08725::i,
      class02389.L(class04227.I).N_33(class02389::N),
      class08725::R,
      class02389.y,
      class08725::M,
      class02389.y,
      class08725::B,
      class02389.y,
      class08725::Z,
      class02389.y,
      class08725::z,
      class02389.y,
      class08725::U,
      class04891.u,
      class08725::E,
      class08725::new
   );

   public class03556<class04891> L() {
      return this.equipSound;
   }

   public boolean M() {
      return this.dispensable;
   }

   public class08725(
      class07085 slot,
      class03556<class04891> equipSound,
      Optional<class05946<class11647>> assetId,
      Optional<class01894> cameraOverlay,
      Optional<class03543<class07078<?>>> allowedEntities,
      boolean dispensable,
      boolean swappable,
      boolean damageOnHurt,
      boolean equipOnInteract,
      boolean canBeSheared,
      class03556<class04891> shearingSound
   ) {
      this.slot = slot;
      this.equipSound = equipSound;
      this.assetId = assetId;
      this.cameraOverlay = cameraOverlay;
      this.allowedEntities = allowedEntities;
      this.dispensable = dispensable;
      this.swappable = swappable;
      this.damageOnHurt = damageOnHurt;
      this.equipOnInteract = equipOnInteract;
      this.canBeSheared = canBeSheared;
      this.shearingSound = shearingSound;
   }

   public boolean B() {
      return this.swappable;
   }

   public boolean Z() {
      return this.damageOnHurt;
   }

   public Optional<class01894> i() {
      return this.cameraOverlay;
   }

   public boolean U() {
      return this.canBeSheared;
   }

   public boolean z() {
      return this.equipOnInteract;
   }

   public Optional<class05946<class11647>> u() {
      return this.assetId;
   }

   public static class08725 y(class06563 var0) {
      class02055 class02055 = class04206.N(class04206.M);
      return N(class07085.field_48824)
         .N(class04909.PB)
         .N(class08699.P.get(var0))
         .N(class02055.y(class01217.e))
         .u(true)
         .i(true)
         .y(class04206.y.i(class04909.PZ))
         .N();
   }

   public class07085 y() {
      return this.slot;
   }

   public class03556<class04891> E() {
      return this.shearingSound;
   }

   public static class08725 N() {
      class02055 class02055 = class04206.N(class04206.M);
      return N(class07085.field_55946).N(class04909.Pa).N(class08699.E).N(class02055.y(class01217.V)).u(true).i(true).y(class04909.ot).N();
   }

   public static class08725 N(class06563 var0) {
      return N(class07085.field_48824).N(class04909.TT).N(class08699.W.get(var0)).N(class07078.NQ, class07078.yJ).i(true).y(class04909.Tb).N();
   }

   private boolean N(class08036 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20) && var1.method_68878();
   }

   private void N(class06584 var1, class08036 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3) && !var2.method_6118(this.slot).R()) {
         var3.setReturnValue(class07082.u);
      }

      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) {
         var3.setReturnValue(class07082.u);
      }
   }

   public boolean N(class07078<?> var1) {
      return this.allowedEntities.isEmpty() || this.allowedEntities.get().N(var1.T());
   }

   public class07082 N(class08036 var1, class07438 var2, class06584 var3) {
      if (var2.method_63623(var3, this.slot) && !var2.method_6084(this.slot) && var2.method_5805()) {
         if (!var1.method_73183().method_8608()) {
            var2.method_5673(this.slot, var3.N(1));
            if (var2 instanceof class07079) {
               ((class07079)var2).N(this.slot);
            }
         }

         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   public class07082 N(class06584 var1, class08036 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else if (var2.method_56991(this.slot) && this.N(var2.method_5864())) {
         class06584 class06584xxxx = var2.method_6118(this.slot);
         if ((!class07323.N(class06584xxxx, class02523.I) || this.N(var2)) && !class06584.L(var1, class06584xxxx)) {
            if (!var2.method_73183().method_8608()) {
               var2.method_7259(class01235.L.y(var1.B()));
            }

            if (var1.c() <= 1) {
               class06584 class06584x = class06584xxxx.R() ? var1 : class06584xxxx.M();
               class06584 class06584xx = this.N(var2) ? var1.t() : var1.M();
               var2.method_5673(this.slot, class06584xx);
               return class07082.N.N(class06584x);
            } else {
               class06584 class06584x = class06584xxxx.M();
               class06584 class06584xx = var1.y(1, var2);
               var2.method_5673(this.slot, class06584xx);
               if (!var2.method_31548().M(class06584x)) {
                  var2.method_7328(class06584x, false);
               }

               return class07082.N.N(var1);
            }
         } else {
            return class07082.u;
         }
      } else {
         return class07082.i;
      }
   }

   public static class08703 N(class07085 var0) {
      return new class08703(var0);
   }

   public Optional<class03543<class07078<?>>> R() {
      return this.allowedEntities;
   }
}
