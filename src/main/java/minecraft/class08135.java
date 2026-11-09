package minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08135 {
   private final class01421 N = new class01421();

   public class08135() {
      super();
   }

   private void N(class01422 var1, class01434 var2, List var3, class01422 var4, CallbackInfo var5, class08108 var6) {
      var6.N().iris$set();
   }

   private void N(class01422 var1, class01434 var2, Map var3, class01422 var4, CallbackInfo var5, class08107 var6) {
      var6.iris$set();
   }

   private void N(class07937 var1, class01422 var2, class01434 var3, class01422 var4, CallbackInfo var5) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
      CapturedRenderingState.INSTANCE.setCurrentEntity(0);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
   }

   public void N(class07937 var1, class01422 var2, class01434 var3, class01422 var4) {
      class08103 class08103 = var1.E();
      this.N(var2, var3, class08103.N, var4);
      class08103.y.sort(Comparator.comparingDouble(var0 -> -var0.L().lengthSquared()));
      this.N(var2, var3, class08103.y, var4);
      this.N(var1, var2, var3, var4, null);
   }

   private void N(class01422 var1, class01434 var2, List<class08108<?>> var3, class01422 var4) {
      for (class08108 class08108 : var3) {
         this.N(var1, var2, var3, var4, null, class08108);
         this.N(class08108.N(), class08108.y(), var1.method_73477(class08108.y()), var2, var4);
      }
   }

   private void N(class01422 var1, class01434 var2, Map<class07311, List<class08107<?>>> var3, class01422 var4) {
      Object object;
      if (class07529.d) {
         ArrayList arraylist = new ArrayList(var3.entrySet());
         Collections.shuffle(arraylist);
         object = arraylist;
      } else {
         object = var3.entrySet();
      }

      for (Entry entry : object) {
         class01391 class01391 = var1.method_73477((class07311)entry.getKey());

         for (class08107 class08107 : (List)entry.getValue()) {
            this.N(var1, var2, var3, var4, null, class08107);
            this.N(class08107, (class07311)entry.getKey(), class01391, var2, var4);
         }
      }
   }

   private <S> void N(class08107<S> var1, class07311 var2, class01391 var3, class01434 var4, class01422 var5) {
      this.N.N();
      this.N.L().N(var1.N());
      class06271 class06271 = var1.y();
      class01391 class01391x = var1.M() == null ? var3 : var1.M().method_24108(var3);
      class06271.method_2819(var1.L());
      class06271.method_62100(this.N, class01391x, var1.u(), var1.i(), var1.R());
      if (var1.B() != 0 && (var2.method_23289().isPresent() || var2.method_24295())) {
         var4.N(var1.B());
         class01391 class01391x = var4.method_73477(var2);
         class06271.method_62100(this.N, var1.M() == null ? class01391x : var1.M().method_24108(class01391x), var1.u(), var1.i(), var1.R());
      }

      if (var1.Z() != null && var2.method_23037()) {
         class01390 class01390 = new class01390(var5.method_73477(class08874.m.get(var1.Z().N())), var1.Z().y(), 1.0F);
         class06271.method_62100(this.N, (class01391)(var1.M() == null ? class01390 : var1.M().method_24108(class01390)), var1.u(), var1.i(), var1.R());
      }

      this.N.y();
   }
}
