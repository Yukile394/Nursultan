package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry;
import java.util.Map;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class05765<E extends class07438> implements class04142<E> {
   public static final int M = 60;
   protected Map<class05378<?>, class05367> B;
   private class05748 N;
   private long y;
   private final int L;
   private final int u;
   private long i = -1L;
   private boolean R;

   protected void L(class04782 var1, E var2, long var3) {
   }

   public class05765(Map<class05378<?>, class05367> var1, int var2, int var3) {
      super();
      this.N = class05748.field_18337;
      this.L = var2;
      this.u = var3;
      this.B = var1;
      this.N(var1, var2, var3, null);
   }

   public class05765(Map<class05378<?>, class05367> var1, int var2) {
      this(var1, var2, var2);
   }

   public class05765(Map<class05378<?>, class05367> var1) {
      this(var1, 60);
   }

   protected void u(class04782 var1, E var2, long var3) {
   }

   protected void y(class04782 var1, E var2, long var3) {
   }

   protected boolean N(class04782 var1, E var2) {
      return true;
   }

   protected boolean N(class04782 var1, E var2, long var3) {
      return false;
   }

   private void N(Map var1, int var2, int var3, CallbackInfo var4) {
      this.B = new Reference2ObjectOpenHashMap(var1);
   }

   protected boolean N(long var1) {
      return var1 > this.y;
   }

   public boolean N(class07438 var1) {
      class01289<?> class01289 = var1.method_18868();
      long ix = class01289.lithium$getModCount();
      if (this.i == ix) {
         return this.R;
      } else {
         this.i = ix;
         ObjectIterator objectiterator = ((Reference2ObjectOpenHashMap)this.B).reference2ObjectEntrySet().fastIterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            if (!class01289.N_22((class05378<?>)entry.getKey(), (class05367)entry.getValue())) {
               return this.R = false;
            }
         }

         return this.R = true;
      }
   }

   @Override
   public String method_46910() {
      return this.getClass().getSimpleName();
   }

   @Override
   public final void method_18925(class04782 var1, E var2, long var3) {
      this.N = class05748.field_18337;
      this.y(var1, (E)var2, var3);
   }

   @Override
   public final void method_18923(class04782 var1, E var2, long var3) {
      if (!this.N(var3) && this.N(var1, (E)var2, var3)) {
         this.L(var1, (E)var2, var3);
      } else {
         this.method_18925(var1, (E)var2, var3);
      }
   }

   @Override
   public class05748 method_18921() {
      return this.N;
   }

   @Override
   public final boolean method_18922(class04782 var1, E var2, long var3) {
      if (this.N(var2) && this.N(var1, (E)var2)) {
         this.N = class05748.field_18338;
         int ix = this.L + var1.method_8409().y(this.u + 1 - this.L);
         this.y = var3 + ix;
         this.u(var1, (E)var2, var3);
         return true;
      } else {
         return false;
      }
   }
}
