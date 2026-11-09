package minecraft;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08943 {
   private final Function<class01894, class08910> N;
   private final Function<class01894, class08906> y;
   private static final class01894 L;
   private int u;

   public class08943(class00183 var1) {
      super();
      this.N = var1::N;
      this.y = var1::y;
   }

   public void y(class08898 var1, class06584 var2, class03662 var3, @Nullable class07299 var4, @Nullable class08961 var5, int var6) {
      this.N(var1, var2, var3, var4, var5, var6, null);
      class02477 class02477 = class02484.E;
      class01894 class01894 = (class01894)this.N(var2, class02477);
      if (class01894 != null) {
         var1.N(this.y.apply(class01894).y());
         this.N.apply(class01894).method_65584(var1, var2, this, var3, var4 instanceof class03448 ? (class03448)var4 : null, var5, var6);
      }
   }

   public float y(class06584 var1) {
      class01894 class01894 = var1.method_58694(class02484.E);
      return class01894 == null ? 1.0F : this.y.apply(class01894).L();
   }

   private Object N(class06584 var1, class02477 var2) {
      return VisualSettings.INSTANCE.replacePetrifiedOakSlab.isEnabled() && var1.N(class06570.iY) ? L : var1.method_58694(var2);
   }

   private void N(class08898 var1, class06584 var2, class03662 var3, class07299 var4, class08961 var5, int var6, CallbackInfo var7) {
      if (var2 != null) {
         var1.setDisplayItem(var2.B(), var2.method_58694(class02484.E));
      } else {
         var1.setDisplayItem(null, null);
      }
   }

   public boolean N(class06584 var1) {
      class01894 class01894 = var1.method_58694(class02484.E);
      return class01894 == null ? true : this.y.apply(class01894).N();
   }

   public void N(class08898 var1, class06584 var2, class03662 var3, class07049 var4) {
      this.N(var1, var2, var3, var4.method_73183(), null, var4.method_5628());
   }

   public void N(class08898 var1, class06584 var2, class03662 var3, class07438 var4) {
      this.N(var1, var2, var3, var4.method_73183(), var4, var4.method_5628() + var3.ordinal());
   }

   public void N(class08898 var1, class06584 var2, class03662 var3, @Nullable class07299 var4, @Nullable class08961 var5, int var6) {
      var1.y();
      if (!var2.R()) {
         var1.N = var3;
         this.y(var1, var2, var3, var4, var5, var6);
      }
   }
}
