package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.lang3.ObjectUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03289 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 254;
   static final class02300 N = new class02300();
   private final class02273 u;
   private final class04016<?>[] i;
   private boolean R;

   @Nullable
   public List<class02998<?>> L() {
      ArrayList arraylist = null;

      for (class04016<?> class04016 : this.i) {
         if (!class04016.u()) {
            if (arraylist == null) {
               arraylist = new ArrayList();
            }

            arraylist.add(class04016.i());
         }
      }

      return arraylist;
   }

   class03289(class02273 var1, class04016<?>[] var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   private <T> class04016<T> y(class02131<T> var1) {
      return (class04016<T>)this.i[var1.N()];
   }

   @Nullable
   public List<class02998<?>> y() {
      if (!this.R) {
         return null;
      } else {
         this.R = false;
         ArrayList arraylist = new ArrayList();

         for (class04016<?> class04016 : this.i) {
            if (class04016.L()) {
               class04016.N(false);
               arraylist.add(class04016.i());
            }
         }

         return arraylist;
      }
   }

   public static <T> class02131<T> N(Class<? extends class02273> var0, class04383<T> var1) {
      if (y.isDebugEnabled()) {
         try {
            Class<?> oclass = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            if (!oclass.equals(var0)) {
               y.debug("defineId called for: {} from {}", new Object[]{var0, oclass, new RuntimeException()});
            }
         } catch (ClassNotFoundException classnotfoundexception) {
         }
      }

      int ix = N.L(var0);
      if (ix > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + ix + "! (Max is 254)");
      } else {
         return var1.N(ix);
      }
   }

   public void N(List<class02998<?>> var1) {
      for (class02998 class02998 : var1) {
         class04016<?> class04016 = this.i[class02998.N()];
         this.N(class04016, class02998);
         this.u.method_5674(class04016.N());
      }

      this.u.method_48850(var1);
   }

   public boolean N() {
      return this.R;
   }

   private <T> void N(class04016<T> var1, class02998<?> var2) {
      if (!Objects.equals(var2.y(), var1.N.y())) {
         throw new IllegalStateException(
            String.format(
               Locale.ROOT,
               "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)",
               var1.N.N(),
               this.u,
               var1.y,
               var1.y.getClass(),
               var2.L(),
               var2.L().getClass()
            )
         );
      } else {
         var1.N(var2.L());
      }
   }

   public <T> T N(class02131<T> var1) {
      return this.<T>y(var1).y();
   }

   public <T> void N(class02131<T> var1, T var2, boolean var3) {
      class04016 class04016 = this.y(var1);
      if (var3 || ObjectUtils.notEqual(var2, class04016.y())) {
         class04016.N(var2);
         this.u.method_5674(var1);
         class04016.N(true);
         this.R = true;
      }
   }

   public <T> void N(class02131<T> var1, T var2) {
      this.N(var1, var2, false);
   }
}
