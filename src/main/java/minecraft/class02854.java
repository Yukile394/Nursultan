package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;
import net.fabricmc.fabric.mixin.transfer.ItemContainerContentsAccessor;

public final class class02854 implements class02694, ItemContainerContentsAccessor {
   private static final int u = -1;
   private static final int i = 256;
   public static final class02854 N = new class02854(class00743.method_10211());
   public static final Codec<class02854> y = class02809.N.sizeLimitedListOf(256).xmap(class02854::y, class02854::R);
   public static final class02362<class04247, class02854> L = class06584.B.N_33(class02389.L(256)).N_10(class02854::new, var0 -> var0.R);
   private final class00743<class06584> R;
   private final int M;

   public Stream<class06584> L() {
      return this.R.stream().filter(var0 -> !var0.R()).map(class06584::t);
   }

   private static int L(List<class06584> var0) {
      for (int ix = var0.size() - 1; ix >= 0; ix--) {
         if (!((class06584)var0.get(ix)).R()) {
            return ix;
         }
      }

      return -1;
   }

   private class02854(class00743<class06584> var1) {
      super();
      if (var1.size() > 256) {
         throw new IllegalArgumentException("Got " + var1.size() + " items, but maximum is 256");
      } else {
         this.R = var1;
         this.M = class06584.N(var1);
      }
   }

   private class02854(List<class06584> var1) {
      this(var1.size());

      for (int ix = 0; ix < var1.size(); ix++) {
         this.R.set(ix, var1.get(ix));
      }
   }

   private class02854(int var1) {
      this(class00743.method_10213(var1, class06584.E));
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class02854 class02854 && class06584.N(this.R, class02854.R);
   }

   @Override
   public int hashCode() {
      return this.M;
   }

   public Iterable<class06584> i() {
      return Iterables.transform(this.u(), class06584::t);
   }

   public Iterable<class06584> u() {
      return Iterables.filter(this.R, var0 -> !var0.R());
   }

   private static class02854 y(List<class02809> var0) {
      OptionalInt optionalint = var0.stream().mapToInt(class02809::N).max();
      if (optionalint.isEmpty()) {
         return N;
      } else {
         class02854 class02854 = new class02854(optionalint.getAsInt() + 1);

         for (class02809 class02809 : var0) {
            class02854.R.set(class02809.N(), class02809.y());
         }

         return class02854;
      }
   }

   public Stream<class06584> y() {
      return this.R.stream().map(class06584::t);
   }

   public static class02854 N(List<class06584> var0) {
      int ix = L(var0);
      if (ix == -1) {
         return N;
      } else {
         class02854 class02854 = new class02854(ix + 1);

         for (int j = 0; j <= ix; j++) {
            class02854.R.set(j, ((class06584)var0.get(j)).t());
         }

         return class02854;
      }
   }

   public class06584 N() {
      return this.R.isEmpty() ? class06584.E : this.R.get(0).t();
   }

   public void N(class00743<class06584> var1) {
      for (int ix = 0; ix < var1.size(); ix++) {
         class06584 class06584 = ix < this.R.size() ? this.R.get(ix) : class06584.E;
         var1.set(ix, class06584.t());
      }
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      int ix = 0;
      int j = 0;

      for (class06584 class06584 : this.u()) {
         j++;
         if (ix <= 4) {
            ix++;
            var2.accept(class00392.N("item.container.item_count", class06584.d(), class06584.c()));
         }
      }

      if (j - ix > 0) {
         var2.accept(class00392.N("item.container.more_items", j - ix).N(class06541.field_1056));
      }
   }

   private List<class02809> R() {
      ArrayList arraylist = new ArrayList();

      for (int ix = 0; ix < this.R.size(); ix++) {
         class06584 class06584 = this.R.get(ix);
         if (!class06584.R()) {
            arraylist.add(new class02809(ix, class06584));
         }
      }

      return arraylist;
   }
}
