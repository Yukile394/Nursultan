package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class04688 extends class00522<class04651, class04688> {
   public static final Codec<class04688> N = N(class04206.L.T(), class04651::M).stable();
   public static final int M = 9;
   public static final int B = 8;
   private boolean Z;

   public class06889 L(class07290 var1, class07209 var2) {
      return this.N().N(var1, var2, this);
   }

   public boolean M() {
      return this.N().Z();
   }

   public class04688(class04651 var1, Reference2ObjectArrayMap<class08092<?>, Comparable<?>> var2, MapCodec<class04688> var3) {
      super(var1, var2, var3);
      this.N(var1, var2, var3, null);
   }

   public class00500 B() {
      return this.N().y(this);
   }

   @Nullable
   public class07126 Z() {
      return this.N().B();
   }

   public float i() {
      return this.N().N(this);
   }

   @Nullable
   public class00734 i(class07290 var1, class07209 var2) {
      return this.N().L(this, var1, var2);
   }

   public class03556<class04651> U() {
      return this.u.U();
   }

   public float z() {
      return this.N().L();
   }

   public boolean u() {
      return this.N().L(this);
   }

   public class00494 u(class07290 var1, class07209 var2) {
      return this.N().y(this, var1, var2);
   }

   public boolean y(class07290 var1, class07209 var2) {
      for (int i = -1; i <= 1; i++) {
         for (int j = -1; j <= 1; j++) {
            class07209 class07209 = var2.method_10069(i, 0, j);
            if (!var1.method_8316(class07209).N().N(this.N()) && !var1.method_8320(class07209).t()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean y(class04651 var1) {
      return this.N() == var1;
   }

   public Stream<class03530<class04651>> E() {
      return this.u.U().L();
   }

   public void N(class07299 var1, class07209 var2, class07049 var3, class08400 var4) {
      this.N().N(var1, var2, var3, var4);
   }

   public boolean N(class07290 var1, class07209 var2, class04651 var3, class07211 var4) {
      return this.N().N(this, var1, var2, var3, var4);
   }

   public class04651 N() {
      return this.u;
   }

   public float N(class07290 var1, class07209 var2) {
      return this.N().N(this, var1, var2);
   }

   public void N(class04782 var1, class07209 var2, class06069 var3) {
      this.N().N(var1, var2, this, var3);
   }

   public void N(class07299 var1, class07209 var2, class06069 var3) {
      this.N().N(var1, var2, this, var3);
   }

   public void N(class04782 var1, class07209 var2, class00500 var3) {
      this.N().y(var1, var2, var3, this);
   }

   private void N(class04651 var1, Reference2ObjectArrayMap var2, MapCodec var3, CallbackInfo var4) {
      this.Z = this.N().y();
   }

   public boolean N(class03543<class04651> var1) {
      return var1.N(this.N().U());
   }

   public boolean N(class03530<class04651> var1) {
      return this.N().U().N(var1);
   }

   public boolean N(class04651 var1) {
      return this.u == var1 && this.u.L(this);
   }

   public boolean W() {
      return this.Z;
   }

   public int R() {
      return this.N().u(this);
   }
}
