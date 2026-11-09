package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.caffeinemc.mods.lithium.mixin.util.accessors.TransientEntitySectionManagerAccessor;
import org.slf4j.Logger;

public class class01115<T extends class01135> implements TransientEntitySectionManagerAccessor {
   static final Logger N = LogUtils.getLogger();
   final class01109<T> y;
   final class01131<T> L;
   final class01129<T> u;
   private final LongSet i = new LongOpenHashSet();
   private final class01124<T> R;

   public String L() {
      return this.L.y() + "," + this.u.y() + "," + this.i.size();
   }

   public class01115(Class<T> var1, class01109<T> var2) {
      super();
      this.L = new class01131<>();
      this.u = new class01129<>(var1, var1x -> this.i.contains(var1x) ? class01102.field_27291 : class01102.field_27290);
      this.y = var2;
      this.R = new class01103<>(this.L, this.u);
   }

   public void y(class07321 var1) {
      long ix = var1.y();
      this.i.remove(ix);
      this.u.y(ix).forEach(var1x -> {
         if (var1x.N(class01102.field_27290).N()) {
            var1x.y().filter(var0 -> !var0.method_31747()).forEach(this.y::u);
         }
      });
   }

   public int y() {
      return this.L.y();
   }

   public class01124<T> N() {
      return this.R;
   }

   public void N(T var1) {
      this.L.N((T)var1);
      long ix = class01296.L(var1.method_24515());
      class01101 class01101 = this.u.L(ix);
      class01101.N(var1);
      var1.method_31744(new class01122<>(this, (long)var1, ix, class01101));
      this.y.M((T)var1);
      this.y.L((T)var1);
      if (var1.method_31747() || class01101.L().N()) {
         this.y.i((T)var1);
      }
   }

   public void N(class07321 var1) {
      long ix = var1.y();
      this.i.add(ix);
      this.u.y(ix).forEach(var1x -> {
         if (!var1x.N(class01102.field_27291).N()) {
            var1x.y().filter(var0 -> !var0.method_31747()).forEach(this.y::i);
         }
      });
   }

   void N(long var1, class01101<T> var3) {
      if (var3.N()) {
         this.u.i(var1);
      }
   }
}
