package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public enum class01241 implements class05033 {
   field_25427("fast", "options.graphics.fast"),
   field_25428("fancy", "options.graphics.fancy"),
   field_25429("fabulous", "options.graphics.fabulous"),
   field_63461("custom", "options.graphics.custom");

   private final String field_63463;
   private final String field_25432;
   public static final Codec<class01241> field_63462 = class05033.N(class01241::values);

   private class01241(String var3, String var4) {
      this.field_63463 = var3;
      this.field_25432 = var4;
   }

   public String N() {
      return this.field_25432;
   }

   public void N(class06202 var1) {
      class05914 class05914 = (class05096)var1.v_3 instanceof class05914 ? (class05914)((class05096)var1.v_3) : null;
      GpuDevice gpudevice = RenderSystem.getDevice();
      switch (this) {
         case field_25427:
            byte b2 = 8;
            this.N(class05914, ((class05630)var1.i_7).a(), 1);
            this.N(class05914, ((class05630)var1.i_7).i(), 8);
            this.N(class05914, ((class05630)var1.i_7).j(), class01825.field_34788);
            this.N(class05914, ((class05630)var1.i_7).R(), 6);
            this.N(class05914, ((class05630)var1.i_7).T(), false);
            this.N(class05914, ((class05630)var1.i_7).U(), class01301.field_18163);
            this.N(class05914, ((class05630)var1.i_7).NK(), class01315.field_18198);
            this.N(class05914, ((class05630)var1.i_7).V(), 2);
            this.N(class05914, ((class05630)var1.i_7).Ny(), false);
            this.N(class05914, ((class05630)var1.i_7).M(), 0.75);
            this.N(class05914, ((class05630)var1.i_7).G(), 2);
            this.N(class05914, ((class05630)var1.i_7).E(), 32);
            this.N(class05914, ((class05630)var1.i_7).m(), false);
            this.N(class05914, ((class05630)var1.i_7).s(), false);
            this.N(class05914, ((class05630)var1.i_7).W(), 5);
            this.N(class05914, ((class05630)var1.i_7).e(), 1);
            this.N(class05914, ((class05630)var1.i_7).c(), class06532.field_64663);
            break;
         case field_25428:
            byte b1 = 16;
            this.N(class05914, ((class05630)var1.i_7).a(), 2);
            this.N(class05914, ((class05630)var1.i_7).i(), 16);
            this.N(class05914, ((class05630)var1.i_7).j(), class01825.field_34789);
            this.N(class05914, ((class05630)var1.i_7).R(), 12);
            this.N(class05914, ((class05630)var1.i_7).T(), true);
            this.N(class05914, ((class05630)var1.i_7).U(), class01301.field_18164);
            this.N(class05914, ((class05630)var1.i_7).NK(), class01315.field_18197);
            this.N(class05914, ((class05630)var1.i_7).V(), 4);
            this.N(class05914, ((class05630)var1.i_7).Ny(), true);
            this.N(class05914, ((class05630)var1.i_7).M(), 1.0);
            this.N(class05914, ((class05630)var1.i_7).G(), 5);
            this.N(class05914, ((class05630)var1.i_7).E(), 64);
            this.N(class05914, ((class05630)var1.i_7).m(), true);
            this.N(class05914, ((class05630)var1.i_7).s(), false);
            this.N(class05914, ((class05630)var1.i_7).W(), 10);
            this.N(class05914, ((class05630)var1.i_7).e(), 1);
            this.N(class05914, ((class05630)var1.i_7).c(), class06532.field_64664);
            break;
         case field_25429:
            byte b0 = 32;
            this.N(class05914, ((class05630)var1.i_7).a(), 2);
            this.N(class05914, ((class05630)var1.i_7).i(), 32);
            this.N(class05914, ((class05630)var1.i_7).j(), class01825.field_34789);
            this.N(class05914, ((class05630)var1.i_7).R(), 12);
            this.N(class05914, ((class05630)var1.i_7).T(), true);
            this.N(class05914, ((class05630)var1.i_7).U(), class01301.field_18164);
            this.N(class05914, ((class05630)var1.i_7).NK(), class01315.field_18197);
            this.N(class05914, ((class05630)var1.i_7).V(), 4);
            this.N(class05914, ((class05630)var1.i_7).Ny(), true);
            this.N(class05914, ((class05630)var1.i_7).M(), 1.25);
            this.N(class05914, ((class05630)var1.i_7).G(), 5);
            this.N(class05914, ((class05630)var1.i_7).E(), 128);
            this.N(class05914, ((class05630)var1.i_7).m(), true);
            this.N(class05914, ((class05630)var1.i_7).s(), class07536.m() != class07533.field_1137);
            this.N(class05914, ((class05630)var1.i_7).W(), 10);
            this.N(class05914, ((class05630)var1.i_7).e(), 2);
            if (class08741.N(gpudevice).L()) {
               this.N(class05914, ((class05630)var1.i_7).c(), class06532.field_64664);
            } else {
               this.N(class05914, ((class05630)var1.i_7).c(), class06532.field_64665);
            }
      }
   }

   <T> void N(@Nullable class05914 var1, class04370<T> var2, T var3) {
      if (var2.method_41753() != var3) {
         var2.method_41748(var3);
         if (var1 != null) {
            var1.method_75370(var2);
         }
      }
   }

   @Override
   public String method_15434() {
      return this.field_63463;
   }
}
