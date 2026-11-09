package minecraft;

import com.google.common.collect.ImmutableMap;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06600 extends class07438 {
   public static final class07070 field_62509 = class07070.field_6183;
   public static final int field_62510 = 0;
   public static final float field_62511 = 1.62F;
   public static final class06889 field_62512 = new class06889(0.0, 0.6, 0.0);
   private static final float field_63007 = 1.5F;
   private static final float field_63008 = 0.6F;
   public static final float field_63009 = 0.6F;
   protected static final class01325 field_63010 = class01325.y(0.6F, 1.8F).y(1.62F).N(class03810.N().N(class03831.field_47744, field_62512));
   protected static final Map<class01312, class01325> field_63011 = ImmutableMap.builder()
      .put(class01312.field_18076, field_63010)
      .put(class01312.field_18078, staticFields_7212a028292fd3c078969e3ee4c71d9e8_1)
      .put(class01312.field_18077, class01325.y(0.6F, 0.6F).y(0.4F))
      .put(class01312.field_18079, class01325.y(0.6F, 0.6F).y(0.4F))
      .put(class01312.field_18080, class01325.y(0.6F, 0.6F).y(0.4F))
      .put(class01312.field_18081, class01325.y(0.6F, 1.5F).y(1.27F).N(class03810.N().N(class03831.field_47744, field_62512)))
      .put(class01312.field_18082, class01325.L(0.2F, 0.2F).y(1.62F))
      .build();
   protected static final class02131<class07070> field_62513 = class03289.N(class06600.class, class02154.H);
   protected static final class02131<Byte> field_62514 = class03289.N(class06600.class, class02154.N);
   private static final class01325 viaFabricPlus$sneaking_dimensions_v1_13_2 = class01325.y(0.6F, 1.65F)
      .y(1.54F)
      .N(class03810.N().N(class03831.field_47744, field_62512));
   private static final class01325 viaFabricPlus$sneaking_dimensions_v1_8 = class01325.y(0.6F, 1.8F)
      .y(1.54F)
      .N(class03810.N().N(class03831.field_47744, field_62512));

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(field_62513, field_62509);
      var1.N(field_62514, (byte)0);
   }

   @Override
   public class07070 method_6068() {
      return this.field_6011.N(field_62513);
   }

   public class06600(class07078<? extends class07438> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dmi000$viafabricplus$modifyDimensions(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class01325)callbackinforeturnable.getReturnValue() : field_63011.getOrDefault(var1, field_63010);
   }

   private void handler$dmi000$viafabricplus$modifyDimensions(class01312 var1, CallbackInfoReturnable var2) {
      if (var1 == class01312.field_18081) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            var2.setReturnValue(viaFabricPlus$sneaking_dimensions_v1_8);
         } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            var2.setReturnValue(viaFabricPlus$sneaking_dimensions_v1_13_2);
         }
      }
   }

   public boolean method_74091(class08030 var1) {
      return (this.method_5841().N(field_62514) & var1.N()) == var1.N();
   }

   public void method_74090(class07070 var1) {
      this.field_6011.N(field_62513, var1);
   }
}
