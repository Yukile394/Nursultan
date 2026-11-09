package minecraft;

import com.viaversion.viafabricplus.features.mouse_sensitivity.MouseSensitivity1_13_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Arrays;
import java.util.stream.Stream;

public class class05709 extends class05914 {
   private static final class00392 N = class00392.L("options.mouse_settings.title");

   public class05709(class05096 var1, class05630 var2) {
      super(var1, var2, N);
   }

   private static class04370<?>[] N(class05630 var0) {
      return new class04370[]{var0.u(), var0.Nm(), var0.p(), var0.NM(), var0.Ni(), var0.NR(), var0.A()};
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) && this.field_51824.y(this.field_21336.u()).method_49606()) {
         var1.N(
            this.field_22793,
            class00392.N(
               "<=1.13.2 Sensitivity: " + MouseSensitivity1_13_2.get1_13SliderValue(this.field_21336.u().method_41753().floatValue()).valueInt() + "%"
            ),
            var2,
            var3
         );
      }
   }

   @Override
   protected void method_60325() {
      if (class04655.N()) {
         this.field_51824.N(Stream.concat(Arrays.stream(N(this.field_21336)), Stream.of(this.field_21336.F())).toArray(class04370[]::new));
      } else {
         this.field_51824.N(N(this.field_21336));
      }
   }
}
